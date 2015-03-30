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

import scala.collection.mutable.HashSet
import scala.collection.mutable.MutableList
import scala.collection.mutable.ListBuffer

class Job(val arrivalTime: Int, val categoryName: String, val net: QueuingNet) {

  def this(arrivalTime: Int, net: QueuingNet) = this(arrivalTime, "", net)

  net.jobs += this

  protected[simpleqn] var currentArrivalTime = arrivalTime

  val requests = new ListBuffer[Request]

  def jobId() = {
    "J" + hashCode + "(" + arrivalTime + ")"
  }

  def request(service: Service): Request = {
    request(service, service.serviceTime)
  }

  def request(service: Service, serviceTime: Int) = {
    requestAfter(service, serviceTime, null)
  }

  protected[simpleqn] def requestAfter(service: Service, serviceTime: Int, request: Request) = {
    val newRequest = new Request(this, service, serviceTime)
    if (request == null || request == requests.last)
      requests += newRequest
    else
      requests.insert(requests.indexOf(request) + 1, newRequest)
    newRequest
  }

  def waitingAt(time: Int) = {
    requests.exists { _.waitingAt(time) }
  }

  def processingAt(time: Int) = {
    requests.exists { _.processingAt(time) }
  }

  private def totalValueOfRequests(value: Request => Int) = {
    (0 /: requests) { _ + value(_) }
  }

  private def maxValueOfRequests(value: Request => Int) = {
    (0 /: requests) { (maxValue, request) => Math.max(maxValue, value(request)) }
  }

  private def minValueOfRequests(value: Request => Int) = {
    (0 /: requests) { (maxValue, request) => Math.min(maxValue, value(request)) }
  }

  def overallServiceTime: Int = {
    totalValueOfRequests { _.serviceTime }
  }

  def averageServiceTime = {
    overallServiceTime / requests.size.toDouble
  }

  def maxServiceTime = {
    maxValueOfRequests { _.serviceTime }
  }

  def minServiceTime = {
    minValueOfRequests { _.serviceTime }
  }

  def overallResidenceTime = {
    overallServiceTime + overallWaitingTime
  }

  def averageResidenceTime = {
    overallResidenceTime / requests.size.toDouble
  }

  def maxResidenceTime = {
    maxValueOfRequests { _.residenceTime }
  }

  def minResidenceTime = {
    minValueOfRequests { _.residenceTime }
  }

  def overallWaitingTime = {
    totalValueOfRequests { _.waitingTime }
  }

  def averageWaitingTime = {
    overallWaitingTime / requests.size.toDouble
  }

  def maxWaitingTime = {
    maxValueOfRequests { _.waitingTime }
  }

  def minWaitingTime = {
    minValueOfRequests { _.waitingTime }
  }

  def arrivedBefore(time: Int) = {
    arrivalTime <= time
  }

  def latestLeavingRequest = {
    (requests.head /: requests) { (latestRequest, currentRequest) =>
      if (latestRequest.leavingServiceTime >= currentRequest.leavingServiceTime)
        latestRequest
      else
        currentRequest
    }
  }

  def completionTime = {
    latestLeavingRequest leavingServiceTime
  }

  def serviceAt(time: Int): Option[Service] = {
    val request = activeRequestAt(time)
    if (request.isDefined) {
      val service = request.get.service
      Option(service)
    } else {
      None
    }
  }

  def activeRequestAt(time: Int) = {
    requests.find {
      request => request.waitingAt(time) || request.processingAt(time)
    }
  }

}
