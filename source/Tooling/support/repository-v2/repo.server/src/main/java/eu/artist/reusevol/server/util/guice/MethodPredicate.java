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

import static com.google.common.base.Predicates.and;
import static java.lang.reflect.Modifier.isPublic;

import java.lang.reflect.Method;

import javax.annotation.PostConstruct;

import com.google.common.base.Predicate;
import com.google.common.eventbus.Subscribe;

/**
 * Trick adapted from https://www.holisticon.de/2012/08/postconstruct-mit-guice/
 */
public enum MethodPredicate implements Predicate<Method> {

	ANNOTATED_WITH_SUBSCRIBE {
		@Override
		public boolean apply(final Method method) {
			return method.isAnnotationPresent(Subscribe.class);
		}
	},
	ANNOTATED_WITH_POSTCONSTRUCT {
		@Override
		public boolean apply(final Method method) {
			return method.isAnnotationPresent(PostConstruct.class);
		}
	},
	VOID {
		@Override
		public boolean apply(final Method method) {
			return Void.TYPE.equals(method.getReturnType());
		}
	},
	PARAMETER_ONE {
		@Override
		public boolean apply(final Method method) {
			return method.getParameterTypes().length == 1;
		}
	},
	IS_PARAMETERLESS {
		@Override
		public boolean apply(final Method method) {
			return method.getParameterTypes().length == 0;
		}
	},

	PUBLIC {
		@Override
		public boolean apply(final Method method) {
			return isPublic(method.getModifiers());
		}
	},
	VALID_SUBSCRIBE {
		@Override
		@SuppressWarnings("unchecked")
		public boolean apply(final Method method) {
			return and(ANNOTATED_WITH_SUBSCRIBE, VOID, PARAMETER_ONE, PUBLIC)
					.apply(method);
		}
	},
	VALID_POSTCONSTRUCT {
		@Override
		@SuppressWarnings("unchecked")
		public boolean apply(final Method method) {
			return and(ANNOTATED_WITH_POSTCONSTRUCT, VOID, IS_PARAMETERLESS,
					PUBLIC).apply(method);
		}
	};

}
