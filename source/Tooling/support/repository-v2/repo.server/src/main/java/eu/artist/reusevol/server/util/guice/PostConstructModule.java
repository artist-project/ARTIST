/*******************************************************************************
 * Copyright (c) 2015 Fraunhofer IAO.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Oliver Strauß (Fraunhofer IAO) - initial API and implementation
 *
 * Initially developed in the context of the ARTIST EU project http://www.artist-project.eu
 *******************************************************************************/

package eu.artist.reusevol.server.util.guice;

import java.lang.reflect.Method;
import java.util.List;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matchers;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;

/**
 * A Guice module that make Guice call methods annotated with @PostConstruct
 * after instance creation.
 * 
 * Trick adapted from https://www.holisticon.de/2012/08/postconstruct-mit-guice/
 */
public enum PostConstructModule implements Module, TypeListener {

	INSTANCE;

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.inject.Module#configure(com.google.inject.Binder)
	 */
	@Override
	public void configure(final Binder binder) {
		// an alle Klassen diesen Listener binden
		binder.bindListener(Matchers.any(), this);
	}

	/**
	 * Ruft nach der Injection die Postconstruct Methode(n) auf, wenn sie
	 * existieren.
	 * 
	 * <p>
	 * {@inheritDoc}
	 * 
	 * @see com.google.inject.spi.TypeListener#hear(com.google.inject.TypeLiteral,
	 *      com.google.inject.spi.TypeEncounter)
	 */
	@Override
	public <I> void hear(final TypeLiteral<I> type,
			final TypeEncounter<I> encounter) {
		encounter.register(new InjectionListener<I>() {

			@Override
			public void afterInjection(final I injectee) {
				// alle postconstruct Methoden (nie null) ausführen.
				Method[] candidates = injectee.getClass().getMethods();
				List<Method> methods = Lists.newArrayList(candidates);
				for (final Method postConstructMethod : Collections2.filter(
						methods, MethodPredicate.VALID_POSTCONSTRUCT)) {
					try {
						postConstructMethod.invoke(injectee);
					} catch (final Exception e) {
						throw new RuntimeException(String.format(
								"@PostConstruct %s", postConstructMethod), e);
					}
				}
			}
		});
	}
}