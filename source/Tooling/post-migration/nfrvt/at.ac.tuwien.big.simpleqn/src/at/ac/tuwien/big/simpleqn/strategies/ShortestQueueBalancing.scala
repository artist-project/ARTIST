/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package at.ac.tuwien.big.simpleqn.strategies

import at.ac.tuwien.big.simpleqn.Request
import scala.collection.immutable.List
import at.ac.tuwien.big.simpleqn.Service

class ShortestQueueBalancing(subServiceTime: Int) extends BalancingStrategy(subServiceTime) {

  def selectService(request: Request, services: List[Service]) = {
    val time = request.leavingQueueTime
    var bestService = services.head
    var shortestQueueLength = bestService.requestQueueLengthAt(time)
    for (currentService <- services) {
      if (shortestQueueLength > currentService.requestQueueLengthAt(time))
        bestService = currentService
    }
    bestService
  }

}