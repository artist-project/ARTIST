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

class Request(val job: Job, var service: Service, var serviceTime: Int) {

  def this(job: Job, service: Service) = this(job, service, service.serviceTime)

  protected[simpleqn] var myArrivalTime = -1
  protected[simpleqn] var myLeavingQueueTime = -1

  def net = job.net
  def jobRequests = job.requests
  def indexInJob = job.requests.indexOf(this)

  override def toString = {
    requestId
  }

  def requestId() = {
    job.jobId + "R[" + indexInJob + "]@" + service.name + "-" + this.hashCode()
  }

  def previousRequestsInJob = {
    jobRequests.slice(0, indexInJob)
  }

  def previousRequestInJob = {
    if (indexInJob != 0)
      Option(jobRequests(indexInJob - 1))
    else
      None
  }

  def nextRequestInJob = {
    if (jobRequests.size - 1 > indexInJob)
      Option(jobRequests(indexInJob + 1))
    else
      None
  }

  def previousRequestInServiceQueue = {
    val indexInQueue = service.requests.indexOf(this)
    if (indexInQueue > 0)
      Option(service.requests(indexInQueue - 1))
    else
      None
  }

  def nextRequestInServiceQueue = {
    val indexInQueue = service.requests.indexOf(this)
    if (service.requests.size - 1 > indexInQueue)
      Option(service.requests(indexInQueue + 1))
    else
      None
  }

  protected[simpleqn] def computeLeavingQueueTime {
    myLeavingQueueTime = computeLeavingQueueTime(previousRequestInServiceQueue)
  }

  protected[simpleqn] def computeLeavingQueueTime(previousRequest: Option[Request]) = {
    if (previousRequest.isDefined)
      Math.max(previousRequest.get.leavingServiceTime, arrivalTime)
    else
      arrivalTime
  }

  def leavingQueueTime = {
    myLeavingQueueTime
  }

  def residenceTime = {
    waitingTime + serviceTime
  }

  def arrivalTime = {
    myArrivalTime
  }

  def leavingServiceTime = {
    arrivalTime + residenceTime
  }

  def waitingTime = {
    leavingQueueTime - arrivalTime
  }

  def processingAt(time: Int) = {
    time >= leavingQueueTime && time < leavingServiceTime
  }

  def waitingAt(time: Int) = {
    time >= arrivalTime && time < leavingQueueTime
  }

}
