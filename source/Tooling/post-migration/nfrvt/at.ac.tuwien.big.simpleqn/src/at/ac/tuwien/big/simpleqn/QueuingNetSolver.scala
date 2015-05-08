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

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

protected class QueuingNetSolver(val jobs: List[Job]) {

  var currentArrivalTime = (Int.MaxValue /: jobs) { (curMin, job) => Math.min(curMin, job.arrivalTime) }
  var prevArrivalTime = 0

  var requestStack = mutable.ListBuffer[Request]()
  var computedRequests = mutable.ListBuffer[Request]()

  def solve = {
    initializeRequestStack
    initializeArrivalTimes
    computeRequests
  }

  private def initializeArrivalTimes {
    jobs foreach { j => j.requests.head.myArrivalTime = j.arrivalTime }
  }

  private def computeRequests {
    while (haveRequestsToProcess) {
      for (request <- requestsOfCurrentArrivalTime)
        computeRequest(request)
      for (request <- requestsBeingProcessedSinceLastArrivalTime)
        notifyRequestProcessing(request)
      updateCurrentArrivalTime
    }
    notifyEndOfSimulation
  }

  private def computeRequest(request: Request) {
    request.service.addToQueue(request)
    updateArrivalOfNextRequest(request)
    updateCurrentArrivalTimeInJob(request)
    updateRequestStack(request)
  }

  private def notifyRequestProcessing(request: Request) {
    request.service.notifyProcessing(request)
  }

  private def notifyEndOfSimulation {
    allServices.foreach { _.notifyEndOfSimulation }
  }

  private def allServices = {
    val serviceList = ListBuffer[Service]()
    computedRequests.foreach { (request) =>
      if (!serviceList.contains(request.service)) {
        serviceList.append(request.service)
      }
    }
    serviceList.toList.distinct
  }

  private def haveRequestsToProcess = {
    !requestStack.isEmpty
  }

  private def requestsOfCurrentArrivalTime = {
    (ListBuffer[Request]() /: jobsWithCurrentArrivalTime) { (list, job) =>
      list ++ job.requests.filter { currentArrivalTime == _.arrivalTime }
    }
  }

  private def requestsBeingProcessedSinceLastArrivalTime = {
    computedRequests.filter { request =>
      (request.leavingQueueTime > prevArrivalTime ||
        prevArrivalTime == currentArrivalTime) &&
        request.leavingQueueTime <= currentArrivalTime
    }
  }

  private def initializeRequestStack: mutable.ListBuffer[Request] = {
    requestStack ++= allRequests
  }

  private def allRequests = {
    (ListBuffer[Request]() /: jobs) {
      _ ++ _.requests
    }
  }

  private def jobsWithCurrentArrivalTime = {
    jobs filter { _.currentArrivalTime == currentArrivalTime }
  }

  private def updateArrivalOfNextRequest(request: Request) = {
    val nextRequest = request.nextRequestInJob
    if (nextRequest.isDefined)
      nextRequest.get.myArrivalTime = request.leavingServiceTime
  }

  private def updateCurrentArrivalTimeInJob(request: Request) {
    request.job.currentArrivalTime = request.leavingServiceTime
  }

  private def updateRequestStack(request: Request) {
    setProcessed(request)
    addNextRequestInJobIfNew(request)
  }

  private def setProcessed(request: Request) {
    requestStack -= request
    computedRequests += request
  }

  private def addNextRequestInJobIfNew(request: Request) {
    val diff = allRequests.diff(requestStack.union(computedRequests))
    requestStack ++= diff
  }

  private def updateCurrentArrivalTime {
    prevArrivalTime = currentArrivalTime
    currentArrivalTime = minCurrentArrivalTimeOfIncompleteJob
  }

  private def minCurrentArrivalTimeOfIncompleteJob = {
    minValueOfIncompleteJob { _.currentArrivalTime }
  }

  private def minValueOfIncompleteJob(value: Job => Int) = {
    (Int.MaxValue /: jobs) { (currentMin, job) =>
      if (isCompleted(job))
        Math.min(currentMin, value(job))
      else
        currentMin
    }
  }

  private def isCompleted(job: Job): Boolean = {
    requestStack.contains(job.requests.last)
  }

}