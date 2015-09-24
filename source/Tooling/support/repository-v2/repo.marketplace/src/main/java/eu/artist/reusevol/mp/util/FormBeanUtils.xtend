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
 
package eu.artist.reusevol.mp.util

import com.sun.jersey.api.representation.Form
import java.beans.IntrospectionException
import java.beans.Introspector
import java.beans.PropertyDescriptor
import java.lang.reflect.InvocationTargetException
import org.slf4j.LoggerFactory
import java.util.HashSet

class FormBeanUtils {
    private static val logger = LoggerFactory.getLogger(FormBeanUtils)
    
    private static def boolean isAcceptableTargetDescriptor(Form source, PropertyDescriptor targetDescriptor) {
        // Skip class property
        if (targetDescriptor.displayName.equals("class")) return false
        
        // Only copy writable properties
        if (targetDescriptor.writeMethod == null) return false

        // Only copy properties sent in by the form
        if (!source.containsKey(targetDescriptor.displayName)) return false
        
        return true
    } 
        
    public static def <T> T copyPropertiesFromForm(Form source, T target) {
        val targetClass = target.class
        val unprocessedKeys = new HashSet(source.keySet)

        try {
            val targetBean = Introspector.getBeanInfo(targetClass)
            val targetDescriptors = targetBean.propertyDescriptors
            
            targetDescriptors.filter[ isAcceptableTargetDescriptor(source, it) ].forEach[
                val readValue = source.getFirst(displayName)
                try {
                    logger.debug('''Copying field «displayName» with value «readValue»''')
                    writeMethod.invoke(target, readValue)
                    unprocessedKeys.remove(displayName)
                } catch(Exception ex) {
                    logger.debug("Error processing field " + displayName, ex)
                }
            ]
            if (!unprocessedKeys.empty)
                logger.debug("The following form field have not been copied: " + unprocessedKeys)
            
            target
        } catch (IntrospectionException e) {
            e.printStackTrace();
            target
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            target
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            target
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            target
        }
    }
}