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

import at.ac.tuwien.big.simpleqn.Service
import at.ac.tuwien.big.simpleqn.Request

class AvgQueueLengthScaling(numberOfServices: Range, startUpTime: Int, val scaleOutThreshold: Double, val scaleInThreshold: Double)
  extends ScalingStrategy(numberOfServices, startUpTime) {

  override def shouldScaleOut(currentTime: Int, request: Request, services: List[Service]) = {
    scaleOutThreshold < avgQueueLength(currentTime, services)
  }

  override def shouldScaleIn(currentTime: Int, request: Request, services: List[Service]) = {
    scaleInThreshold > avgQueueLength(currentTime, services)
  }

  private def avgQueueLength(currentTime: Int, services: List[Service]) = {
    (0 /: services) {
      _ + _.requestQueueLengthAt(currentTime)
    } / services.length.toDouble
  }

}