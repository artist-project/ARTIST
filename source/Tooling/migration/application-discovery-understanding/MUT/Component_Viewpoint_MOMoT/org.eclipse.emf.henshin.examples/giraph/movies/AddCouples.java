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
 * Generated implementation of the Henshin unit "AddCouples".
 */
@Algorithm(
    name = "AddCouples"
)
public class AddCouples extends
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
   * Type constant for "NamedElement".
   */
  public static final byte TYPE_NAMED_ELEMENT = 0;

  /**
   * Type constant for "Movie".
   */
  public static final byte TYPE_MOVIE = 1;

  /**
   * Type constant for "playBack".
   */
  public static final byte TYPE_MOVIE_PLAY_BACK = 2;

  /**
   * Type constant for "Person".
   */
  public static final byte TYPE_PERSON = 3;

  /**
   * Type constant for "playsIn".
   */
  public static final byte TYPE_PERSON_PLAYS_IN = 4;

  /**
   * Type constant for "Actor".
   */
  public static final byte TYPE_ACTOR = 5;

  /**
   * Type constant for "Actress".
   */
  public static final byte TYPE_ACTRESS = 6;

  /**
   * Type constant for "Couple".
   */
  public static final byte TYPE_COUPLE = 7;

  /**
   * Type constant for "p1".
   */
  public static final byte TYPE_COUPLE_P1 = 8;

  /**
   * Type constant for "p2".
   */
  public static final byte TYPE_COUPLE_P2 = 9;

  /**
   * Type constant for "occursIn".
   */
  public static final byte TYPE_COUPLE_OCCURS_IN = 10;

  /**
   * Unit constant for "AddCouples".
   */
  public static final int UNIT_ADD_COUPLES = 0;

  /**
   * Rule constant for "CreateCouple".
   */
  public static final int RULE_CREATE_COUPLE = 1;

  /**
   * Rule constant for "CreateOccurrence".
   */
  public static final int RULE_CREATE_OCCURRENCE = 2;

  /**
   * Logging support.
   */
  protected static final Logger LOG = Logger.getLogger(AddCouples.class);

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
    case RULE_CREATE_COUPLE:
      matchCreateCouple(
        vertex, matches, segment, microstep);
      break;
    case RULE_CREATE_OCCURRENCE:
      matchCreateOccurrence(
        vertex, matches, segment, microstep);
      break;
    default:
      break;
    }
  }

  /**
   * Match (and apply) the rule "CreateCouple".
   * This takes 10 microsteps.
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   */
  protected void matchCreateCouple(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Iterable<Match> matches, int segment, int microstep)
    throws IOException {

    Set<Match> finalMatches = new HashSet<Match>();
    matches = filterCreateCouple(
      vertex, matches, segment, microstep, finalMatches);
    long matchCount = 0;
    long appCount = 0;
    if (microstep == 0) {
      // Matching node 0:
      boolean ok = vertex.getValue().get() == TYPE_PERSON ||
        vertex.getValue().get() == TYPE_ACTOR ||
        vertex.getValue().get() == TYPE_ACTRESS;
      ok = ok && vertex.getNumEdges() >= 3;
      ok = ok && (SEGMENT_COUNT == 1 || getSegment(vertex.getId()) == segment);
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 1) {
      // Matching node 2:
      boolean ok = vertex.getValue().get() == TYPE_MOVIE;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          sendMessage(match.getVertexId(0), match);
        }
      }
    } else if (microstep == 2) {
      for (Match match : matches) {
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 3) {
      // Matching node 3:
      boolean ok = vertex.getValue().get() == TYPE_MOVIE;
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
          sendMessage(match.getVertexId(0), match);
        }
      }
    } else if (microstep == 4) {
      for (Match match : matches) {
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 5) {
      // Matching node 4:
      boolean ok = vertex.getValue().get() == TYPE_MOVIE;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          if (vertex.getId().compareTo(match.getVertexId(2)) < 0) {
            continue;
          }
          matchCount++;
          sendMessage(match.getVertexId(1), match);
        }
      }
    } else if (microstep == 6) {
      // Matching node 1:
      boolean ok = vertex.getValue().get() == TYPE_PERSON ||
        vertex.getValue().get() == TYPE_ACTOR ||
        vertex.getValue().get() == TYPE_ACTRESS;
      ok = ok && vertex.getNumEdges() >= 3;
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
      for (Match match : matches) {
        VertexId id = match.getVertexId(1);
        if (vertex.getId().equals(id)) {
          matchCount++;
          sendMessage(id, match);
        }
      }
    } else if (microstep == 7) {
      // Joining matches at node 2:
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
      for (Match m1 : matches1) {
        for (Match m2 : matches2) {
          Match match = m1.append(m2);
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          sendMessage(match.getVertexId(4), match);
        }
      }
    } else if (microstep == 8) {
      for (Match match : matches) {
        // Node 1: check for edge to match of 4 of type "playsIn":
        VertexId targetId = match.getVertexId(3);
        for (Edge<VertexId, ByteWritable> edge :
          vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            edge.getTargetVertexId().equals(targetId)) {
            matchCount++;
            sendMessage(match.getVertexId(4), match);
            break;
          }
        }
      }
    } else if (microstep == 9) {
      for (Match match : matches) {
        // Node 1: check for edge to match of 3 of type "playsIn":
        VertexId targetId = match.getVertexId(2);
        for (Edge<VertexId, ByteWritable> edge :
          vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_PERSON_PLAYS_IN &&
            edge.getTargetVertexId().equals(targetId)) {
            match = match.remove(3);
            match = match.remove(2);
            match = match.remove(1);
            if (finalMatches.add(match)) {
              matchCount++;
              if (segment == SEGMENT_COUNT - 1) {
                applyCreateCouple(
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
        "CreateCouple: " + microstep);
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
   * Filter matches per segment for the rule "CreateCouple".
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   * @param finalMatches Set of final matches.
   * @return The filtered matches.
   */
  protected Iterable<Match> filterCreateCouple(
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
          if (segment == SEGMENT_COUNT - 1 && microstep == 9) {
            applyCreateCouple(
              vertex, match, appCount++);
          } else {
            sendMessage(vertex.getId(), match);
          }
        } else if (matchSegment > segment) {
          throw new RuntimeException("Received match " + match +
            " of rule CreateCouple of segment " +
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
   * Apply the rule "CreateCouple" to a given match.
   * @param vertex The base vertex.
   * @param match The match object.
   * @param matchIndex Match index.
   * @return true if the rule was applied.
   * @throws IOException On I/O errors.
   */
  protected boolean applyCreateCouple(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Match match, long matchIndex) throws IOException {
    VertexId cur0 = match.getVertexId(0);
    VertexId cur1 = match.getVertexId(1);
    VertexId new0 =
      VertexId.randomVertexId();
    addVertexRequest(new0,
      new ByteWritable(TYPE_COUPLE));
    VertexId src0 = new0;
    VertexId trg0 = cur0;
    Edge<VertexId, ByteWritable> edge0 =
      EdgeFactory.create(trg0,
        new ByteWritable(TYPE_COUPLE_P1));
    addEdgeRequest(src0, edge0);
    VertexId src1 = new0;
    VertexId trg1 = cur1;
    Edge<VertexId, ByteWritable> edge1 =
      EdgeFactory.create(trg1,
        new ByteWritable(TYPE_COUPLE_P2));
    addEdgeRequest(src1, edge1);
    return true;
  }

  /**
   * Match (and apply) the rule "CreateOccurrence".
   * This takes 6 microsteps.
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   */
  protected void matchCreateOccurrence(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Iterable<Match> matches, int segment, int microstep)
    throws IOException {

    Set<Match> finalMatches = new HashSet<Match>();
    matches = filterCreateOccurrence(
      vertex, matches, segment, microstep, finalMatches);
    long matchCount = 0;
    long appCount = 0;
    if (microstep == 0) {
      // Matching node 1:
      boolean ok = vertex.getValue().get() == TYPE_COUPLE;
      ok = ok && vertex.getNumEdges() >= 2;
      ok = ok && (SEGMENT_COUNT == 1 || getSegment(vertex.getId()) == segment);
      if (ok) {
        Match match = new Match(segment).append(vertex.getId());
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_COUPLE_P1 &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 1) {
      // Matching node 2:
      boolean ok = vertex.getValue().get() == TYPE_PERSON ||
        vertex.getValue().get() == TYPE_ACTOR ||
        vertex.getValue().get() == TYPE_ACTRESS;
      ok = ok && vertex.getNumEdges() >= 1;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          Set<VertexId> targets = new HashSet<VertexId>();
          for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
            if (edge.getValue().get() ==
              TYPE_PERSON_PLAYS_IN &&
              targets.add(edge.getTargetVertexId())) {
              sendMessage(edge.getTargetVertexId(), match);
            }
          }
        }
      }
    } else if (microstep == 2) {
      // Matching node 0:
      boolean ok = vertex.getValue().get() == TYPE_MOVIE;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          matchCount++;
          sendMessage(match.getVertexId(0), match);
        }
      }
    } else if (microstep == 3) {
      for (Match match : matches) {
        matchCount++;
        Set<VertexId> targets = new HashSet<VertexId>();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          if (edge.getValue().get() ==
            TYPE_COUPLE_P2 &&
            targets.add(edge.getTargetVertexId())) {
            sendMessage(edge.getTargetVertexId(), match);
          }
        }
      }
    } else if (microstep == 4) {
      // Matching node 3:
      boolean ok = vertex.getValue().get() == TYPE_PERSON ||
        vertex.getValue().get() == TYPE_ACTOR ||
        vertex.getValue().get() == TYPE_ACTRESS;
      ok = ok && vertex.getNumEdges() >= 1;
      if (ok) {
        for (Match match : matches) {
          match = match.append(vertex.getId());
          if (!match.isInjective()) {
            continue;
          }
          // Node 3: check for edge to match of 0 of type "playsIn":
          VertexId targetId = match.getVertexId(2);
          for (Edge<VertexId, ByteWritable> edge :
            vertex.getEdges()) {
            if (edge.getValue().get() ==
              TYPE_PERSON_PLAYS_IN &&
              edge.getTargetVertexId().equals(targetId)) {
              matchCount++;
              sendMessage(match.getVertexId(0), match);
              break;
            }
          }
        }
      }
    } else if (microstep == 5) {
      for (Match match : matches) {
        match = match.remove(3);
        match = match.remove(1);
        if (finalMatches.add(match)) {
          matchCount++;
          if (segment == SEGMENT_COUNT - 1) {
            applyCreateOccurrence(
              vertex, match, appCount++);
          } else {
            sendMessage(vertex.getId(), match);
          }
        }
      }
    } else {
      throw new RuntimeException("Illegal microstep for rule " +
        "CreateOccurrence: " + microstep);
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
   * Filter matches per segment for the rule "CreateOccurrence".
   * @param vertex The current vertex.
   * @param matches The current matches.
   * @param segment The current segment.
   * @param microstep The current microstep.
   * @param finalMatches Set of final matches.
   * @return The filtered matches.
   */
  protected Iterable<Match> filterCreateOccurrence(
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
          if (segment == SEGMENT_COUNT - 1 && microstep == 5) {
            applyCreateOccurrence(
              vertex, match, appCount++);
          } else {
            sendMessage(vertex.getId(), match);
          }
        } else if (matchSegment > segment) {
          throw new RuntimeException("Received match " + match +
            " of rule CreateOccurrence of segment " +
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
   * Apply the rule "CreateOccurrence" to a given match.
   * @param vertex The base vertex.
   * @param match The match object.
   * @param matchIndex Match index.
   * @return true if the rule was applied.
   * @throws IOException On I/O errors.
   */
  protected boolean applyCreateOccurrence(
    Vertex<VertexId, ByteWritable, ByteWritable> vertex,
    Match match, long matchIndex) throws IOException {
    VertexId cur0 = match.getVertexId(0);
    VertexId cur1 = match.getVertexId(1);
    VertexId src0 = cur0;
    VertexId trg0 = cur1;
    Edge<VertexId, ByteWritable> edge0 =
      EdgeFactory.create(trg0,
        new ByteWritable(TYPE_COUPLE_OCCURS_IN));
    addEdgeRequest(src0, edge0);
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
        stack = stack.append(UNIT_ADD_COUPLES, 0, 0);
        stack = nextRuleStep(stack, ruleApps);
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
        case UNIT_ADD_COUPLES:
          stack = processAddCouples(
            stack, microstep);
          break;
        case RULE_CREATE_COUPLE:
          stack = processCreateCouple(
            stack, segment, microstep, ruleApps);
          break;
        case RULE_CREATE_OCCURRENCE:
          stack = processCreateOccurrence(
            stack, segment, microstep, ruleApps);
          break;
        default:
          throw new RuntimeException("Unknown unit " + unit);
        }
        if (stack.getStackSize() > 0) {
          unit = stack.getLastUnit();
          if (unit == RULE_CREATE_COUPLE ||
            unit == RULE_CREATE_OCCURRENCE) {
            break;
          }
        }
      }
      return stack;
    }

   /**
     * Process SequentialUnit "AddCouples".
     * @param stack The current application stack.
     * @param microstep The current microstep.
     * @return The new application stack.
     */
    private ApplicationStack processAddCouples(
      ApplicationStack stack, int microstep) {
      if (microstep > 0 && !unitSuccesses.pop()) {
        unitSuccesses.push(false);
      } else if (microstep == 2) {
        unitSuccesses.push(true);
      } else {
        switch (microstep) {
        case 0:
          stack = stack.append(UNIT_ADD_COUPLES, 0, 1);
          stack = stack.append(RULE_CREATE_COUPLE, 0, 0);
          break;
        case 1:
          stack = stack.append(UNIT_ADD_COUPLES, 0, 2);
          stack = stack.append(RULE_CREATE_OCCURRENCE, 0, 0);
          break;
        default:
          break;
        }
      }
      return stack;
    }

   /**
     * Process Rule "CreateCouple".
     * @param stack The current application stack.
     * @param segment The current segment.
     * @param microstep The current microstep.
     * @param ruleApps Number of rule applications in last superstep.
     * @return The new application stack.
     */
    private ApplicationStack processCreateCouple(
      ApplicationStack stack, int segment, int microstep, long ruleApps) {
      if (microstep < 9) {
        stack = stack.append(RULE_CREATE_COUPLE, segment, microstep + 1);
      } else if (segment < SEGMENT_COUNT - 1) {
        stack = stack.append(RULE_CREATE_COUPLE, segment + 1, 0);
      } else {
        unitSuccesses.push(ruleApps > 0);
      }
      return stack;
    }

   /**
     * Process Rule "CreateOccurrence".
     * @param stack The current application stack.
     * @param segment The current segment.
     * @param microstep The current microstep.
     * @param ruleApps Number of rule applications in last superstep.
     * @return The new application stack.
     */
    private ApplicationStack processCreateOccurrence(
      ApplicationStack stack, int segment, int microstep, long ruleApps) {
      if (microstep < 5) {
        stack = stack.append(RULE_CREATE_OCCURRENCE, segment, microstep + 1);
      } else if (segment < SEGMENT_COUNT - 1) {
        stack = stack.append(RULE_CREATE_OCCURRENCE, segment + 1, 0);
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
