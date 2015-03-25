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
 * Generated implementation of the Henshin unit "ParallelEdges".
 */
@Algorithm(
    name = "ParallelEdges"
)
public class ParallelEdges extends
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
   * Rule constant for "ParallelEdges".
   */
  public static final int RULE_PARALLEL_EDGES = 0;

  /**
   * Logging support.
   */
  protected static final Logger LOG = Logger.getLogger(ParallelEdges.class);

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
    case RULE_PARALLEL_EDGES:
      matchParallelEdges(
        vertex, matches, segment, microstep);
      break;
    default:
      break;
    }
  }

  /**
   * Match (and apply) the rule "ParallelEdges".
   * This takes 2 microsteps.
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   */
  protected void matchParallelEdges(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Iterable<Match> matches, int segment, int microstep)
    throws IOException {

    LOG.info("Vertex " + vertex.getId() + " in superstep " + getSuperstep() +
      " matching rule ParallelEdges on segment " + segment +
      " in microstep " + microstep);
    for (Match match : matches) {
      LOG.info("Vertex " + vertex.getId() +
        " in superstep " + getSuperstep() +
        " received (partial) match " + match);
    }
    Set<Match> finalMatches = new HashSet<Match>();
    matches = filterParallelEdges(
      vertex, matches, segment, microstep, finalMatches);
    long matchCount = 0;
    long appCount = 0;
    if (microstep == 0) {
      // Matching node "a":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX_CONTAINER;
      ok = ok && vertex.getNumEdges() >= 1;
      ok = ok && (SEGMENT_COUNT == 1 || getSegment(vertex.getId()) == segment);
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_VERTEX_CONTAINER_VERTICES &&
            targets.add(edge.getTargetVertexId())) {
            LOG.info("Vertex " + vertex.getId() +
              " sending (partial) match " + match +
              " forward to vertex " + edge.getTargetVertexId());
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 1) {
      // Matching node "b":
      boolean ok = vertex.getValue().get() == TYPE_VERTEX;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          if (finalMatches.add(match)) {
            matchCount++;
            if (segment == SEGMENT_COUNT - 1) {
              applyParallelEdges(
                vertex, match, appCount++);
            } else {
              sendMessage(vertex.getId(), match);
            }
          }
        }
      }
    } else {
      throw new RuntimeException("Illegal microstep for rule " +
        "ParallelEdges: " + microstep);
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
   * Filter matches per segment for the rule "ParallelEdges".
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   * @param finalMatches Set of final matches.
   * @return The filtered matches.
   */
  protected Iterable<Match> filterParallelEdges(
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
          if (segment == SEGMENT_COUNT - 1 && microstep == 1) {
            applyParallelEdges(
              vertex, match, appCount++);
          } else {
            sendMessage(vertex.getId(), match);
          }
        } else if (matchSegment > segment) {
          throw new RuntimeException("Received match " + match +
            " of rule ParallelEdges of segment " +
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
   * Apply the rule "ParallelEdges" to a given match.
   * @param vertex The base vertex.
   * @param match The match object.
   * @param matchIndex Match index.
   * @return true if the rule was applied.
   * @throws IOException On I/O errors.
   */
  protected boolean applyParallelEdges(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Match match, long matchIndex) throws IOException {
    VertexId cur0 = match.getVertexId(0);
    VertexId cur1 = match.getVertexId(1);
    LOG.info("Vertex " + vertex.getId() +
      " applying rule ParallelEdges with match " + match);
    removeEdgesRequest(cur0, cur1);
    removeVertexRequest(cur1);
    removeVertexRequest(cur0);
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
        stack = stack.append(RULE_PARALLEL_EDGES, 0, 0);
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
        case RULE_PARALLEL_EDGES:
          stack = processParallelEdges(
            stack, segment, microstep, ruleApps);
          break;
        default:
          throw new RuntimeException("Unknown unit " + unit);
        }
        if (stack.getStackSize() > 0) {
          unit = stack.getLastUnit();
          if (unit == RULE_PARALLEL_EDGES) {
            break;
          }
        }
      }
      return stack;
    }

   /**
     * Process Rule "ParallelEdges".
     * @param stack The current application stack.
     * @param segment The current segment.
     * @param microstep The current microstep.
     * @param ruleApps Number of rule applications in last superstep.
     * @return The new application stack.
     */
    private ApplicationStack processParallelEdges(
      ApplicationStack stack, int segment, int microstep, long ruleApps) {
      if (microstep < 1) {
        stack = stack.append(RULE_PARALLEL_EDGES, segment, microstep + 1);
      } else if (segment < SEGMENT_COUNT - 1) {
        stack = stack.append(RULE_PARALLEL_EDGES, segment + 1, 0);
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
