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

import scala.reflect.internal.util.Collections
import scala.Immutable
import scala.collection.mutable

class Service(val name: String, val serviceTime: Int) {

  private val queue = mutable.ListBuffer[Request]()

  private def countIf(bool: Boolean) = {
    if (bool) 1 else 0
  }

  private def completionTime = {
    if (!requests.isEmpty) requests(0).net.completionTime else 0
  }

  private def startingTime = {
    0
  }

  def addToQueue(request: Request) {
    queue += request
    request.computeLeavingQueueTime
  }

  def notifyProcessing(request: Request) {}
  
  def notifyEndOfSimulation {}

  def requests = {
    queue toList
  }

  def requestsOf(job: Job) = {
    queue filter (job == _.job)
  }

  def jobQueueAt(time: Int) = {
    requestQueueAt(time) collect { case request => request.job }
  }

  def requestQueueAt(time: Int): List[Request] = {
    queue filter { request =>
      time >= request.arrivalTime && time < request.leavingQueueTime
    } toList
  }

  def requestQueueLengthAt(time: Int) = {
    requestQueueAt(time).length
  }

  def avgQueueLength: Double = {
    avgQueueLength(startingTime to completionTime)
  }

  def avgQueueLength(range: Range) = {
    (0 /: range) { _ + requestQueueLengthAt(_) } / range.length.toDouble
  }

  def maxQueueLength: Int = {
    maxQueueLength(startingTime until completionTime)
  }

  def maxQueueLength(range: Range) = {
    (0 /: range) { (max, time) => Math.max(max, requestQueueLengthAt(time)) }
  }

  def busyAt(time: Int) = {
    queue exists { _.processingAt(time) }
  }

  def busyTime: Int = {
    busyTime(startingTime to completionTime)
  }

  def busyTime(range: Range) = {
    (0 /: range) { (busyTime, time) => busyTime + countIf(busyAt(time)) }
  }

  def idleTime: Int = {
    idleTime(startingTime until completionTime)
  }

  def idleTime(range: Range) = {
    range.length - busyTime(range)
  }

  def utilization: Double = {
    utilization(startingTime to completionTime)
  }

  def utilization(range: Range): Double = {
    busyTime(range) / range.length.toDouble
  }
  
  def throughput(range: Range): Double = {
    // alternative: utilization(range) / avgServiceRequirementPerRequest(range)
    requestsCompletedWithin(range).length.toDouble / range.length
  }
  
  def avgServiceRequirementPerRequest(range: Range): Double = {
    (busyTime(range) / requestsCompletedWithin(range).length.toDouble)
  }
  
  private def requestsCompletedWithin(range: Range) = {
    queue.filter(r => r.arrivalTime >= range.start && r.leavingServiceTime <=range.end)
  }

}
