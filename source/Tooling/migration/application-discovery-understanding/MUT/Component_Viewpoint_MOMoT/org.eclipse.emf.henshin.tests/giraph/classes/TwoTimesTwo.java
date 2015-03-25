/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.giraph.examples;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.giraph.aggregators.LongSumAggregator;
import org.apache.giraph.edge.Edge;
import org.apache.giraph.edge.EdgeFactory;
import org.apache.giraph.graph.BasicComputation;
import org.apache.giraph.graph.Vertex;
import org.apache.giraph.master.DefaultMasterCompute;
import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.log4j.Logger;
import static org.apache.giraph.examples.HenshinUtil
  .ApplicationStack;
import static org.apache.giraph.examples.HenshinUtil
  .ApplicationStackAggregator;
import static org.apache.giraph.examples.HenshinUtil
  .Match;
import static org.apache.giraph.examples.HenshinUtil
  .VertexId;

/**
 * Generated implementation of the Henshin unit "TwoTimesTwo".
 */
@Algorithm(
    name = "TwoTimesTwo"
)
public class TwoTimesTwo extends
  BasicComputation<VertexId, ByteWritable, ByteWritable, Match> {

  /**
   * Name of the match count aggregator.
   */
  public static final String AGGREGATOR_MATCHES = "matches";

  /**
   * Name of the rule application count aggregator.
   */
  public static final String AGGREGATOR_RULE_APPLICATIONS = "ruleApps";

  /**
   * Name of the node generation aggregator.
   */
  public static final String AGGREGATOR_NODE_GENERATION = "nodeGen";

  /**
   * Name of the application stack aggregator.
   */
  public static final String AGGREGATOR_APPLICATION_STACK = "appStack";

  /**
   * Type constant for "Vertex".
   */
  public static final byte TYPE_VERTEX = 0;

  /**
   * Type constant for "left".
   */
  public static final byte TYPE_VERTEX_LEFT = 1;

  /**
   * Type constant for "conn".
   */
  public static final byte TYPE_VERTEX_CONN = 2;

  /**
   * Type constant for "right".
   */
  public static final byte TYPE_VERTEX_RIGHT = 3;

  /**
   * Type constant for "VertexContainer".
   */
  public static final byte TYPE_VERTEX_CONTAINER = 4;

  /**
   * Type constant for "vertices".
   */
  public static final byte TYPE_VERTEX_CONTAINER_VERTICES = 5;

  /**
   * Rule constant for "TwoTimesTwo".
   */
  public static final int RULE_TWO_TIMES_TWO = 0;

  /**
   * Logging support.
   */
  protected static final Logger LOG = Logger.getLogger(TwoTimesTwo.class);

  /**
   * Default segment count.
   */
  private static int SEGMENT_COUNT = 1;

  /**
   * Currently active rule.
   */
  private int rule;

  /**
   * Current segment.
   */
  private int segment;

  /**
   * Current microstep.
   */
  private int microstep;

  /**
   * Finished flag.
   */
  private boolean finished;

  /*
   * (non-Javadoc)
   * @see org.apache.giraph.graph.Computation#preSuperstep()
   */
  @Override
  public void preSuperstep() {
    ApplicationStack stack =
      getAggregatedValue(AGGREGATOR_APPLICATION_STACK);
    if (stack.getStackSize() == 0) {
      long ruleApps = ((LongWritable)
        getAggregatedValue(AGGREGATOR_RULE_APPLICATIONS)).get();
      finished = ruleApps == 0;
      rule = -1;
    } else {
      finished = false;
      rule = stack.getLastUnit();
      segment = stack.getLastSegment();
      microstep = stack.getLastMicrostep();
    }
  }

  /*
   * (non-Javadoc)
   * @see org.apache.giraph.graph.Computation#compute(
   *        org.apache.giraph.graph.Vertex, java.lang.Iterable)
   */
  @Override
  public void compute(
      Vertex<VertexId, ByteWritable, ByteWritable> vertex,
      Iterable<Match> matches) throws IOException {
    if (finished) {
      vertex.voteToHalt();
      return;
    }
    switch (rule) {
    case RULE_TWO_TIMES_TWO:
      matchTwoTimesTwo(
        vertex, matches, segment, microstep);
      break;
    default:
      break;
    }
  }

  /**
   * Match (and apply) the rule "TwoTimesTwo".
   * This takes 7 microsteps.
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   */
  protected void matchTwoTimesTwo(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Iterable<Match> matches, int segment, int microstep)
    throws IOException {

    LOG.info("Vertex " + vertex.getId() + " in superstep " + getSuperstep() +
      " matching rule TwoTimesTwo on segment " + segment +
      " in microstep " + microstep);
    for (Match match : matches) {
      LOG.info("Vertex " + vertex.getId() +
        " in superstep " + getSuperstep() +
        " received (partial) match " + match);
    }
    Set<Match> finalMatches = new HashSet<Match>();
    matches = filterTwoTimesTwo(
      vertex, matches, segment, microstep, finalMatches);
    long matchCount = 0;
    long appCount = 0;
    if (microstep == 0) {
      // Matching node "a":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX;
      ok = ok && vertex.getNumEdges() >= 2;
      ok = ok && (SEGMENT_COUNT == 1 || getSegment(vertex.getId()) == segment);
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_VERTEX_CONN &&
            targets.add(edge.getTargetVertexId())) {
            LOG.info("Vertex " + vertex.getId() +
              " sending (partial) match " + match +
              " forward to vertex " + edge.getTargetVertexId());
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 1) {
      // Matching node "x":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          LOG.info("Vertex " + vertex.getId() +
            " sending (partial) match " + match +
            " back to vertex " + match.getVertexId(0));
          sendMessage(match.getVertexId(0), match);
        }
      }
    } else if (microstep == 2) {
      for (Match match : matches) {
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_VERTEX_CONN &&
            targets.add(edge.getTargetVertexId())) {
            LOG.info("Vertex " + vertex.getId() +
              " sending (partial) match " + match +
              " forward to vertex " + edge.getTargetVertexId());
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 3) {
      // Matching node "y":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          if (vertex.getId().compareTo(match.getVertexId(1)) < 0) {
            continue;
          }
          matchCount++;
          LOG.info("Vertex " + vertex.getId() +
            " sending (partial) match " + match +
            " back to vertex " + match.getVertexId(1));
          sendMessage(match.getVertexId(1), match);
        }
      }
    } else if (microstep == 4) {
      // Matching node "b":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX;
      ok = ok && vertex.getNumEdges() >= 2;
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_VERTEX_CONN &&
            targets.add(edge.getTargetVertexId())) {
            LOG.info("Vertex " + vertex.getId() +
              " sending (partial) match " + match +
              " forward to vertex " + edge.getTargetVertexId());
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
      for (Match match : matches) {
        VertexId id = match.getVertexId(1);
        if (vertex.getId().equals(id)) {
          matchCount++;
          LOG.info("Vertex " + id + " in superstep " + getSuperstep() +
            " sending (partial) match " + match + " to myself");
          sendMessage(id, match);
        }
      }
    } else if (microstep == 5) {
      // Joining matches at node "x":
      List<Match> matches1 = new ArrayList<Match>();
      List<Match> matches2 = new ArrayList<Match>();
      VertexId id = vertex.getId();
      for (Match match : matches) {
        if (id.equals(match.getVertexId(1))) {
          matches1.add(match.copy());
        } else {
          matches2.add(match.copy());
        }
      }
      LOG.info("Vertex " + id + " in superstep " + getSuperstep() +
        " joining " + matches1.size() + " x " + matches2.size() +
        " partial matches of rule TwoTimesTwo");
      for (Match m1 : matches1) {
        for (Match m2 : matches2) {
          Match match = m1.append(m2);
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          LOG.info("Vertex " + vertex.getId() +
            " sending (partial) match " + match +
            " back to vertex " + match.getVertexId(3));
          sendMessage(match.getVertexId(3), match);
        }
      }
    } else if (microstep == 6) {
      for (Match match : matches) {
        // Node "b": check for edge to match of "y" of type "conn":
        VertexId targetId = match.getVertexId(2);
        for (Edge<VertexId, ByteWritable> edge :
          vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_VERTEX_CONN &&
            edge.getTargetVertexId().equals(targetId)) {
            match = match.remove(2);
            match = match.remove(1);
            if (finalMatches.add(match)) {
              matchCount++;
              if (segment == SEGMENT_COUNT - 1) {
                applyTwoTimesTwo(
                  vertex, match, appCount++);
              } else {
                sendMessage(vertex.getId(), match);
              }
            }
            break;
          }
        }
      }
    } else {
      throw new RuntimeException("Illegal microstep for rule " +
        "TwoTimesTwo: " + microstep);
    }
    if (matchCount > 0) {
      aggregate(AGGREGATOR_MATCHES,
        new LongWritable(matchCount));
    }
    if (appCount > 0) {
      aggregate(AGGREGATOR_RULE_APPLICATIONS,
        new LongWritable(appCount));
    }
  }

  /**
   * Filter matches per segment for the rule "TwoTimesTwo".
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   * @param finalMatches Set of final matches.
   * @return The filtered matches.
   */
  protected Iterable<Match> filterTwoTimesTwo(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Iterable<Match> matches, int segment, int microstep,
    Set<Match> finalMatches)
    throws IOException {
    if (segment > 0) {
      List<Match> filtered = new ArrayList<Match>();
      long matchCount = 0;
      long appCount = 0;
      for (Match match : matches) {
        int matchSegment = match.getSegment();
        if (matchSegment < segment) {
          if (!finalMatches.add(match)) {
            continue;
          }
          matchCount++;
          if (segment == SEGMENT_COUNT - 1 && microstep == 6) {
            applyTwoTimesTwo(
              vertex, match, appCount++);
          } else {
            sendMessage(vertex.getId(), match);
          }
        } else if (matchSegment > segment) {
          throw new RuntimeException("Received match " + match +
            " of rule TwoTimesTwo of segment " +
            matchSegment + ", but current segment is only " + segment);
        } else {
          filtered.add(match.copy());
        }
      }
      if (matchCount > 0) {
        aggregate(AGGREGATOR_MATCHES,
          new LongWritable(matchCount));
      }
      if (appCount > 0) {
        aggregate(AGGREGATOR_RULE_APPLICATIONS,
          new LongWritable(appCount));
      }
      return filtered;
    }
    return matches;
  }

  /**
   * Apply the rule "TwoTimesTwo" to a given match.
   * @param vertex The base vertex.
   * @param match The match object.
   * @param matchIndex Match index.
   * @return true if the rule was applied.
   * @throws IOException On I/O errors.
   */
  protected boolean applyTwoTimesTwo(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Match match, long matchIndex) throws IOException {
    VertexId cur0 = match.getVertexId(0);
    VertexId cur1 = match.getVertexId(1);
    LOG.info("Vertex " + vertex.getId() +
      " applying rule TwoTimesTwo with match " + match);
    VertexId new0 =
      VertexId.randomVertexId();
    addVertexRequest(new0,
      new ByteWritable(TYPE_VERTEX_CONTAINER));
    VertexId src0 = new0;
    VertexId trg0 = cur0;
    Edge<VertexId, ByteWritable> edge0 =
      EdgeFactory.create(trg0,
        new ByteWritable(TYPE_VERTEX_CONTAINER_VERTICES));
    addEdgeRequest(src0, edge0);
    VertexId src1 = new0;
    VertexId trg1 = cur1;
    Edge<VertexId, ByteWritable> edge1 =
      EdgeFactory.create(trg1,
        new ByteWritable(TYPE_VERTEX_CONTAINER_VERTICES));
    addEdgeRequest(src1, edge1);
    return true;
  }

  /**
   * Get the segment that a vertex belongs to.
   * @param vertexId The ID of the vertex.
   * @return The segment of the vertex.
   */
  private int getSegment(VertexId vertexId) {
    return Math.abs(vertexId.hashCode()) % SEGMENT_COUNT;
  }

  /**
   * Master compute which registers and updates the required aggregators.
   */
  public static class MasterCompute extends DefaultMasterCompute {

    /**
     * Stack for storing unit success flags.
     */
    private final Deque<Boolean> unitSuccesses =
      new ArrayDeque<Boolean>();

    /**
     * Stack for storing the execution orders of independent units.
     */
    private final Deque<List<Integer>> unitOrders =
      new ArrayDeque<List<Integer>>();

    /*
     * (non-Javadoc)
     * @see org.apache.giraph.master.DefaultMasterCompute#compute()
     */
    @Override
    public void compute() {
      long ruleApps = ((LongWritable)
        getAggregatedValue(AGGREGATOR_RULE_APPLICATIONS)).get();
      long matches = ((LongWritable)
        getAggregatedValue(AGGREGATOR_MATCHES)).get();
      if (getSuperstep() > 0) {
        LOG.info(matches + " (partial) matches computed and " +
          ruleApps + " rule applications conducted in superstep " +
          (getSuperstep() - 1));
      }
      if (ruleApps > 0) {
        long nodeGen = ((LongWritable)
          getAggregatedValue(AGGREGATOR_NODE_GENERATION)).get();
        setAggregatedValue(AGGREGATOR_NODE_GENERATION,
          new LongWritable(nodeGen + 1));
      }
      ApplicationStack stack;
      if (getSuperstep() == 0) {
        stack = new ApplicationStack();
        stack = stack.append(RULE_TWO_TIMES_TWO, 0, 0);
      } else {
        stack = getAggregatedValue(AGGREGATOR_APPLICATION_STACK);
        stack = nextRuleStep(stack, ruleApps);
      }
      setAggregatedValue(AGGREGATOR_APPLICATION_STACK, stack);
    }

    /**
     * Compute the next rule application stack.
     * @param stack The current application stack.
     * @param ruleApps Number of rule applications in last superstep.
     * @return The new application stack.
     */
    private ApplicationStack nextRuleStep(
      ApplicationStack stack, long ruleApps) {
      while (stack.getStackSize() > 0) {
        int unit = stack.getLastUnit();
        int segment = stack.getLastSegment();
        int microstep = stack.getLastMicrostep();
        stack = stack.removeLast();
        switch (unit) {
        case RULE_TWO_TIMES_TWO:
          stack = processTwoTimesTwo(
            stack, segment, microstep, ruleApps);
          break;
        default:
          throw new RuntimeException("Unknown unit " + unit);
        }
        if (stack.getStackSize() > 0) {
          unit = stack.getLastUnit();
          if (unit == RULE_TWO_TIMES_TWO) {
            break;
          }
        }
      }
      return stack;
    }

   /**
     * Process Rule "TwoTimesTwo".
     * @param stack The current application stack.
     * @param segment The current segment.
     * @param microstep The current microstep.
     * @param ruleApps Number of rule applications in last superstep.
     * @return The new application stack.
     */
    private ApplicationStack processTwoTimesTwo(
      ApplicationStack stack, int segment, int microstep, long ruleApps) {
      if (microstep < 6) {
        stack = stack.append(RULE_TWO_TIMES_TWO, segment, microstep + 1);
      } else if (segment < SEGMENT_COUNT - 1) {
        stack = stack.append(RULE_TWO_TIMES_TWO, segment + 1, 0);
      } else {
        unitSuccesses.push(ruleApps > 0);
      }
      return stack;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.giraph.master.DefaultMasterCompute#initialize()
     */
    @Override
    public void initialize() throws InstantiationException,
        IllegalAccessException {
      registerAggregator(AGGREGATOR_MATCHES,
        LongSumAggregator.class);
      registerAggregator(AGGREGATOR_RULE_APPLICATIONS,
        LongSumAggregator.class);
      registerPersistentAggregator(AGGREGATOR_NODE_GENERATION,
        LongSumAggregator.class);
      registerPersistentAggregator(AGGREGATOR_APPLICATION_STACK,
        ApplicationStackAggregator.class);
    }

  }
}
