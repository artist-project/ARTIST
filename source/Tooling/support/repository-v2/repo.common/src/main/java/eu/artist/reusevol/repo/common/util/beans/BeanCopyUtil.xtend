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
 
package eu.artist.reusevol.repo.common.util.beans

import java.beans.IntrospectionException
import java.beans.Introspector
import java.lang.reflect.InvocationTargetException
import java.util.Arrays
import java.beans.PropertyDescriptor
import java.util.List

class BeanCopyUtil {
	private static def boolean isAcceptableSourceDescriptor(List<PropertyDescriptor> source, PropertyDescriptor targetDescriptor) {
		val fromPdIndex = source.indexOf(targetDescriptor)
		if (fromPdIndex < 0) return false

		val sourceDescriptor = source.get(fromPdIndex)
		if (!sourceDescriptor.displayName.equals(
				targetDescriptor.displayName))
			return false

		// Skip class property
		if (sourceDescriptor.displayName.equals("class")) return false
		
		// Only copy writable properties
		if (targetDescriptor.writeMethod == null) return false
		
		return true
	} 
	
	public static def void copyProperties(Object fromObj, Object toObj) {
		val fromClass = fromObj.class
		val toClass = toObj.class

		try {
			val fromBean = Introspector.getBeanInfo(fromClass)
			val toBean = Introspector.getBeanInfo(toClass)

			val targetDescriptors = toBean.propertyDescriptors
			val sourceDescriptors = Arrays.asList(fromBean.propertyDescriptors)

			targetDescriptors.filter[ isAcceptableSourceDescriptor(sourceDescriptors, it) ].forEach[
				val sourceDescriptor = sourceDescriptors.get(sourceDescriptors.indexOf(it))
				val readValue = sourceDescriptor.readMethod.invoke(fromObj, null as Object[])
				writeMethod.invoke(toObj, readValue)
			]
		} catch (IntrospectionException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}