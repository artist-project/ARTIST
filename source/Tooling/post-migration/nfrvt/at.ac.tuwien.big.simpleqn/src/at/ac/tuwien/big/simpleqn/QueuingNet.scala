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
import scala.collection.JavaConversions

class QueuingNet(val services: List[Service]) {

  private var _isComputationDone = false

  protected[simpleqn] val jobs = new mutable.HashSet[Job]

  def sortedJobs = {
    jobs.toList.sortBy(_.arrivalTime)
  }

  def close() {
    new QueuingNetSolver(sortedJobs).solve
    _isComputationDone = true
  }

  def isClosed = _isComputationDone

  def open() {
    _isComputationDone = false
  }

  def this(serviceList: java.util.List[Service]) = {
    this(JavaConversions.asScalaBuffer(serviceList).toList)
  }

  def firstStartingJob = {
    jobs.foldLeft(jobs.head) { (firstJob, currentJob) =>
      if (firstJob.arrivalTime < currentJob.arrivalTime)
        firstJob
      else
        currentJob
    }
  }

  def latestCompletingJob = {
    jobs.foldLeft(jobs.head) { (latestJob, currentJob) =>
      if (latestJob.completionTime >= currentJob.completionTime)
        latestJob
      else
        currentJob
    }
  }

  def completionTime = {
    latestCompletingJob.completionTime
  }

  def busyTime(range: Range) = {
    (0 /: range) { (busyTime, time) =>
      busyTime + countIf(services.exists(_.busyAt(time)))
    }
  }

  private def countIf(bool: Boolean) = {
    if (bool) 1 else 0
  }

  def completedJobs: List[Job] = {
    completedJobs(completeRange)
  }

  def completedJobs(toTime: Int): List[Job] = {
    completedJobs(0 to toTime)
  }

  def completedJobs(range: Range): List[Job] = {
    jobs filter { job =>
      job.arrivalTime >= range.start && job.completionTime <= range.end
    } toList
  }

  def utilization(range: Range): Double = {
    busyTime(range) / range.length.toDouble
  }

  def utilization: Double = {
    utilization(completeRange)
  }

  def throughput(range: Range): Double = {
    completedJobs(range).length / range.length.toDouble
  }

  def throughput: Double = {
    throughput(completeRange)
  }

  def jobCategories = {
    jobsByCategory.keySet
  }

  private def jobsByCategory = {
    jobs.groupBy { _.categoryName }
  }

  def estimatedLongRunRange = {
    val firstJobArrivalTime = firstStartingJob.arrivalTime
    val lastJob = latestCompletingJob
    if (firstJobArrivalTime < lastJob.arrivalTime)
      (firstJobArrivalTime to lastJob.arrivalTime)
    else
      (firstJobArrivalTime to lastJob.completionTime)
  }

  def completeRange = {
    (0 to completionTime)
  }

  def minWaitingTimeOfJobCategory(categoryName: String) = {
    minOfJobCategoryValue(categoryName) { _.averageWaitingTime }
  }

  def maxWaitingTimeOfJobCategory(categoryName: String) = {
    maxOfJobCategoryValue(categoryName) { _.averageWaitingTime }
  }

  def averageWaitingTimeOfJobCategory(categoryName: String) = {
    averageOfJobCategoryValue(categoryName) { _.averageWaitingTime }
  }

  def averageResidenceTimeOfJobCategory(categoryName: String) = {
    averageOfJobCategoryValue(categoryName) { _.averageResidenceTime }
  }

  def minResidenceTimeOfJobCategory(categoryName: String) = {
    minOfJobCategoryValue(categoryName) { _.averageResidenceTime }
  }

  def maxResidenceTimeOfJobCategory(categoryName: String) = {
    maxOfJobCategoryValue(categoryName) { _.averageResidenceTime }
  }

  def averageServiceTimeOfJobCategory(categoryName: String) = {
    averageOfJobCategoryValue(categoryName) { _.averageServiceTime }
  }

  def minServiceTimeOfJobCategory(categoryName: String) = {
    minOfJobCategoryValue(categoryName) { _.averageServiceTime }
  }

  def maxServiceTimeOfJobCategory(categoryName: String) = {
    maxOfJobCategoryValue(categoryName) { _.averageServiceTime }
  }

  private def maxOfJobCategoryValue(categoryName: String)(value: Job => Double) = {
    foldOverJobCategoryValue(categoryName, Double.MinValue) { (curMax, job) =>
      Math.max(curMax, value(job))
    }
  }

  private def minOfJobCategoryValue(categoryName: String)(value: Job => Double) = {
    foldOverJobCategoryValue(categoryName, Double.MaxValue) { (curMin, job) =>
      Math.min(curMin, value(job))
    }
  }

  private def foldOverJobCategoryValue(categoryName: String, foldStart: Double)(fold: (Double, Job) => Double) = {
    val jobsOfCategory = jobsByCategory.get(categoryName).getOrElse(Set[Job]())
    (foldStart /: jobsOfCategory) { (foldValue, job) =>
      fold(foldValue, job)
    }
  }

  private def averageOfJobCategoryValue(categoryName: String)(value: Job => Double) = {
    val jobsOfCategory = jobsByCategory.get(categoryName).getOrElse(Set[Job]())
    val sum = (0.0 /: jobsOfCategory) { (avg, job) =>
      avg + value(job)
    }
    if (sum > 0) sum / jobsOfCategory.size.toDouble else 0
  }

  def debugPrint {
    debugPrintScale
    for (j <- sortedJobs) { debugPrint(j) }
  }

  private def debugPrintScale {
    (0 to completionTime) foreach { i => print("|     " + i + "     ") }
    println("|")
  }

  private def debugPrint(job: Job) {
    (0 until job.arrivalTime) foreach { i =>
      val fill = i.toString.replaceAll(".", " ")
      print("|" + ".." + fill + "      ..")
    }

    (job.arrivalTime to completionTime) foreach { i =>

      val fill = i.toString.replaceAll(".", " ")
      val fillAll = fill + "        "
      val service = job.serviceAt(i)
      var serviceName = if (service.isDefined) { service.get.name } else { fillAll }
      if (serviceName.length > fillAll.length) {
        serviceName = serviceName.subSequence(serviceName.length - fillAll.length, serviceName.length).toString()
      } else {
        serviceName = serviceName + fillAll.substring(serviceName.length)
      }

      if (i >= job.completionTime) print("|.." + fillAll)
      else if (job.waitingAt(i)) print("|w@" + serviceName)
      else if (job.processingAt(i)) print("|b@" + serviceName)

    }
    println("|")
  }

}
