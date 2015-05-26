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
 
package eu.artist.reusevol.mp.providers

import com.sun.jersey.api.core.HttpContext
import com.sun.jersey.api.model.Parameter
import com.sun.jersey.core.spi.component.ComponentContext
import com.sun.jersey.core.spi.component.ComponentScope
import com.sun.jersey.spi.inject.Injectable
import com.sun.jersey.spi.inject.InjectableProvider
import javax.ws.rs.core.Context
import javax.ws.rs.ext.Provider

@Provider
public final class ParameterBeanProvider implements InjectableProvider<FormBean, Parameter> {

    val HttpContext hc

    new(@Context HttpContext hc) {
        this.hc = hc
    }

    override ComponentScope getScope() {
        return ComponentScope.PerRequest
    }

    override Injectable<FormInjectable> getInjectable(ComponentContext context, FormBean annotation, Parameter param) {
        /*
    if (param.parameterClass. instanceof FormInjectable) {
      return null
    }

    return new Injectable<ParameterBean>() {

      def ParameterBean getValue() {
        val parameterBean = new ParameterBean()
        val params = hc.uriInfo.queryParameters

        // Populate the parameter bean properties
        for (param : params.entrySet()) {
          val String key = param.getKey()
          val value = param.value.iterator.next

          // set the property
          BeanUtils.setProperty(parameterBean, key, value);
        }
        return parameterBean;
      }
    };
    * 
    */
    }
}
