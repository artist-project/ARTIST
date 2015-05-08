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

class ScaledServiceNode(name: String, serviceTime: Int, val balancer: Balancer, val availableFrom: Int)
  extends Service(name, serviceTime) {

  var availableTo = Integer.MAX_VALUE

  def this(name: String, serviceTime: Int, balancer: Balancer) {
    this(name, serviceTime, balancer, 0)
  }

  def isActive(time: Int) = {
    availableFrom <= time && time < availableTo
  }

  def existenceRange = {
    availableFrom to availableTo
  }

  private def limitRange(range: Range) = {
    Math.max(range.start, availableFrom) to Math.min(range.end, availableTo)
  }

  override def avgQueueLength(range: Range) = {
    super.avgQueueLength(limitRange(range))
  }

  override def maxQueueLength(range: Range) = {
    super.maxQueueLength(limitRange(range))
  }

  override def busyTime(range: Range) = {
    super.busyTime(limitRange(range))
  }

  override def idleTime(range: Range) = {
    super.idleTime(limitRange(range))
  }

  override def utilization(range: Range) = {
    super.utilization(limitRange(range))
  }

}