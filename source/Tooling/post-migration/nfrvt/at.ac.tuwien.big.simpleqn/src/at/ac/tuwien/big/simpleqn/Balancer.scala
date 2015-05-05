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

import at.ac.tuwien.big.simpleqn.strategies.BalancingStrategy

class Balancer(override val name: String, override val serviceTime: Int, val strategy: BalancingStrategy)
  extends Service(name, serviceTime) {

  private val placeHolder = new Service(name + "place", serviceTime)

  private val _services = new ListBuffer[Service]

  def addService(service: Service) {
    _services += service
  }

  def addServices(services: List[Service]) {
    services.foreach(addService(_))
  }

  def services = {
    _services toList
  }

  protected def availableServices(time: Int) = {
    services
  }

  override def addToQueue(request: Request) {
    super.addToQueue(request)
    forwardRequestToPlaceHolder(request)
  }

  protected def forwardRequestToPlaceHolder(request: Request) = {
    request.job.requestAfter(placeHolder, request.serviceTime, request)
    request.serviceTime = strategy.balancingServiceTime
  }

  override def notifyProcessing(request: Request) {
    moveToSelectedService(request)
  }

  protected def moveToSelectedService(request: Request) = {
    if (request.nextRequestInJob.isDefined) {
      request.nextRequestInJob.get.service = selectedService(request)
    }
  }

  private def selectedService(request: Request) = {
    val availServices = availableServices(request.leavingQueueTime)
    val service = strategy.selectService(request, availServices)
    assert(availServices contains service)
    service
  }

  private def unsetArrivalTimeOfNextRequest(request: Request) {
    val nextRequest = request.nextRequestInJob
    if (nextRequest.isDefined) nextRequest.get.myArrivalTime = -1
  }

  def avgUtilizationOfContainedServices(range: Range) = {
    (0.0 /: services) { _ + _.utilization(range) } / _services.length.toDouble
  }

}