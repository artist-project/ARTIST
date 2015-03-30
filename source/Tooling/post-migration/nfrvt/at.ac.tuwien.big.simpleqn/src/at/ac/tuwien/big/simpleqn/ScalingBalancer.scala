/*
 * Copyright (c) 2013 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0 which accompanies 
 * this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Philip Langer - initial API and implementation
 */
package at.ac.tuwien.big.simpleqn

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.HashMap
import scala.util.Random
import at.ac.tuwien.big.simpleqn.strategies.BalancingStrategy
import at.ac.tuwien.big.simpleqn.strategies.ScalingStrategy

class ScalingBalancer(override val name: String, override val serviceTime: Int, val balancingStrategy: BalancingStrategy, val scalingStrategy: ScalingStrategy)
  extends Balancer(name, serviceTime, balancingStrategy) {

  scalingStrategy.balancer = this
  for (i <- 1 to scalingStrategy.numberOfServices.start) { addService(0) }

  override def availableServices(time: Int) = {
    super.availableServices(time).filter {
      _ match {
        case node: ScaledServiceNode => node.isActive(time)
        case _ => false
      }
    }
  }

  override def notifyProcessing(request: Request) {
    checkScaling(request.leavingQueueTime, request)
    super.notifyProcessing(request)
  }

  override def notifyEndOfSimulation {

  }

  private def shouldScaleOut(currentTime: Int, request: Request, availServices: List[Service]) = {
    scalingStrategy.shouldScaleOut(currentTime, request, availServices) && availServices.size + 1 < scalingStrategy.numberOfServices.end
  }

  private def shouldScaleIn(currentTime: Int, request: Request, availServices: List[Service]) = {
    scalingStrategy.shouldScaleIn(currentTime, request, availServices) && availServices.size > scalingStrategy.numberOfServices.start
  }

  def serviceToScaleIn(services: List[Service]) = {
    services(Random.nextInt(services.length))
  }

  private def scaleIn(currentTime: Int, service: Service) {
    println("Scale in " + service.name + " at " + currentTime)
    service match {
      case node: ScaledServiceNode => node.availableTo = currentTime
    }
  }

  private def scaleOut(currentTime: Int) {
    println("Scale out " + name + " at " + currentTime)
    addService(currentTime + scalingStrategy.startUpTime)
  }

  private def addService(availableFrom: Int) {
    val newService = new ScaledServiceNode(nextServiceId, serviceTime, this, availableFrom)
    addService(newService)
  }

  private def nextServiceId = {
    name + "_" + (services.length + 1).toString
  }

  private def checkScaling(currentTime: Int, request: Request) {
    val availServices = availableServices(currentTime)
    checkScaleIn(currentTime, request, availServices)
    checkScaleOut(currentTime, request, availServices)
  }

  private def checkScaleIn(currentTime: Int, request: Request, availServices: List[Service]) {
    if (shouldScaleIn(currentTime, request, availServices))
      scaleIn(currentTime, serviceToScaleIn(availServices))
  }

  private def checkScaleOut(currentTime: Int, request: Request, availServices: List[Service]) {
    if (shouldScaleOut(currentTime, request, availServices))
      scaleOut(currentTime)
  }

}