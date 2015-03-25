package org.eclipse.emf.henshin.interpreter.giraph;

import java.util.*;
import org.eclipse.emf.henshin.model.*;
import org.eclipse.emf.henshin.model.staticanalysis.*;
import org.eclipse.emf.henshin.interpreter.info.*;
import org.eclipse.emf.ecore.*;

public class GiraphRuleTemplate
{
  protected static String nl;
  public static synchronized GiraphRuleTemplate create(String lineSeparator)
  {
    nl = lineSeparator;
    GiraphRuleTemplate result = new GiraphRuleTemplate();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "/*" + NL + " * Licensed to the Apache Software Foundation (ASF) under one" + NL + " * or more contributor license agreements.  See the NOTICE file" + NL + " * distributed with this work for additional information" + NL + " * regarding copyright ownership.  The ASF licenses this file" + NL + " * to you under the Apache License, Version 2.0 (the" + NL + " * \"License\"); you may not use this file except in compliance" + NL + " * with the License.  You may obtain a copy of the License at" + NL + " *" + NL + " *     http://www.apache.org/licenses/LICENSE-2.0" + NL + " *" + NL + " * Unless required by applicable law or agreed to in writing, software" + NL + " * distributed under the License is distributed on an \"AS IS\" BASIS," + NL + " * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied." + NL + " * See the License for the specific language governing permissions and" + NL + " * limitations under the License." + NL + " */" + NL + "package ";
  protected final String TEXT_2 = ";" + NL + "" + NL + "import java.io.IOException;" + NL + "import java.util.ArrayDeque;" + NL + "import java.util.ArrayList;";
  protected final String TEXT_3 = NL + "import java.util.Collections;";
  protected final String TEXT_4 = NL + "import java.util.Deque;" + NL + "import java.util.HashSet;" + NL + "import java.util.List;" + NL + "import java.util.Set;" + NL + "" + NL + "import org.apache.giraph.aggregators.LongSumAggregator;";
  protected final String TEXT_5 = NL + "import org.apache.giraph.edge.Edge;";
  protected final String TEXT_6 = NL + "import org.apache.giraph.edge.EdgeFactory;";
  protected final String TEXT_7 = NL + "import org.apache.giraph.graph.BasicComputation;" + NL + "import org.apache.giraph.graph.Vertex;" + NL + "import org.apache.giraph.master.DefaultMasterCompute;" + NL + "import org.apache.hadoop.io.ByteWritable;" + NL + "import org.apache.hadoop.io.LongWritable;";
  protected final String TEXT_8 = NL + "import org.apache.log4j.Logger;";
  protected final String TEXT_9 = NL + "import static ";
  protected final String TEXT_10 = ".HenshinUtil" + NL + "  .ApplicationStack;" + NL + "import static ";
  protected final String TEXT_11 = ".HenshinUtil" + NL + "  .ApplicationStackAggregator;" + NL + "import static ";
  protected final String TEXT_12 = ".HenshinUtil" + NL + "  .Match;" + NL + "import static ";
  protected final String TEXT_13 = ".HenshinUtil" + NL + "  .VertexId;" + NL + "" + NL + "/**" + NL + " * Generated implementation of the Henshin unit \"";
  protected final String TEXT_14 = "\"." + NL + " */" + NL + "@Algorithm(" + NL + "    name = \"";
  protected final String TEXT_15 = "\"" + NL + ")" + NL + "public class ";
  protected final String TEXT_16 = " extends" + NL + "  BasicComputation<VertexId, ByteWritable, ByteWritable, Match> {" + NL + "" + NL + "  /**" + NL + "   * Name of the match count aggregator." + NL + "   */" + NL + "  public static final String AGGREGATOR_MATCHES = \"matches\";" + NL + "" + NL + "  /**" + NL + "   * Name of the rule application count aggregator." + NL + "   */" + NL + "  public static final String AGGREGATOR_RULE_APPLICATIONS = \"ruleApps\";" + NL + "" + NL + "  /**" + NL + "   * Name of the node generation aggregator." + NL + "   */" + NL + "  public static final String AGGREGATOR_NODE_GENERATION = \"nodeGen\";" + NL + "" + NL + "  /**" + NL + "   * Name of the application stack aggregator." + NL + "   */" + NL + "  public static final String AGGREGATOR_APPLICATION_STACK = \"appStack\";";
  protected final String TEXT_17 = NL + NL + "  /**" + NL + "   * Type constant for \"";
  protected final String TEXT_18 = "\"." + NL + "   */" + NL + "  public static final byte ";
  protected final String TEXT_19 = " = ";
  protected final String TEXT_20 = ";";
  protected final String TEXT_21 = NL + NL + "  /**" + NL + "   * ";
  protected final String TEXT_22 = " constant for \"";
  protected final String TEXT_23 = "\"." + NL + "   */" + NL + "  public static final int ";
  protected final String TEXT_24 = " = ";
  protected final String TEXT_25 = ";";
  protected final String TEXT_26 = NL + NL + "  /**" + NL + "   * Logging support." + NL + "   */" + NL + "  protected static final Logger LOG = Logger.getLogger(";
  protected final String TEXT_27 = ".class);";
  protected final String TEXT_28 = NL + NL + "  /**" + NL + "   * Default segment count." + NL + "   */" + NL + "  private static int SEGMENT_COUNT = ";
  protected final String TEXT_29 = ";" + NL + "" + NL + "  /**" + NL + "   * Currently active rule." + NL + "   */" + NL + "  private int rule;" + NL + "" + NL + "  /**" + NL + "   * Current segment." + NL + "   */" + NL + "  private int segment;" + NL + "" + NL + "  /**" + NL + "   * Current microstep." + NL + "   */" + NL + "  private int microstep;" + NL + "" + NL + "  /**" + NL + "   * Finished flag." + NL + "   */" + NL + "  private boolean finished;" + NL + "" + NL + "  /*" + NL + "   * (non-Javadoc)" + NL + "   * @see org.apache.giraph.graph.Computation#preSuperstep()" + NL + "   */" + NL + "  @Override" + NL + "  public void preSuperstep() {" + NL + "    ApplicationStack stack =" + NL + "      getAggregatedValue(AGGREGATOR_APPLICATION_STACK);" + NL + "    if (stack.getStackSize() == 0) {" + NL + "      long ruleApps = ((LongWritable)" + NL + "        getAggregatedValue(AGGREGATOR_RULE_APPLICATIONS)).get();" + NL + "      finished = ruleApps == 0;" + NL + "      rule = -1;" + NL + "    } else {" + NL + "      finished = false;" + NL + "      rule = stack.getLastUnit();" + NL + "      segment = stack.getLastSegment();" + NL + "      microstep = stack.getLastMicrostep();" + NL + "    }" + NL + "  }" + NL + "" + NL + "  /*" + NL + "   * (non-Javadoc)" + NL + "   * @see org.apache.giraph.graph.Computation#compute(" + NL + "   *        org.apache.giraph.graph.Vertex, java.lang.Iterable)" + NL + "   */" + NL + "  @Override" + NL + "  public void compute(" + NL + "      Vertex<VertexId, ByteWritable, ByteWritable> vertex," + NL + "      Iterable<Match> matches) throws IOException {" + NL + "    if (finished) {" + NL + "      vertex.voteToHalt();" + NL + "      return;" + NL + "    }" + NL + "    switch (rule) {";
  protected final String TEXT_30 = NL + "    case ";
  protected final String TEXT_31 = ":" + NL + "      match";
  protected final String TEXT_32 = "(" + NL + "        vertex, matches, segment, microstep);" + NL + "      break;";
  protected final String TEXT_33 = NL + "    default:" + NL + "      break;" + NL + "    }" + NL + "  }";
  protected final String TEXT_34 = NL + NL + "  /**" + NL + "   * Match (and apply) the rule \"";
  protected final String TEXT_35 = "\"." + NL + "   * This takes ";
  protected final String TEXT_36 = " microsteps." + NL + "   * @param vertex The current vertex." + NL + "   * @param matches The current matches." + NL + "   * @param segment The current segment." + NL + "   * @param microstep The current microstep." + NL + "   */" + NL + "  protected void match";
  protected final String TEXT_37 = "(" + NL + "    Vertex<VertexId, ByteWritable, ByteWritable> vertex," + NL + "    Iterable<Match> matches, int segment, int microstep)" + NL + "    throws IOException {" + NL;
  protected final String TEXT_38 = NL + "    LOG.info(\"Vertex \" + vertex.getId() + \" in superstep \" + getSuperstep() +" + NL + "      \" matching rule ";
  protected final String TEXT_39 = " on segment \" + segment +" + NL + "      \" in microstep \" + microstep);" + NL + "    for (Match match : matches) {" + NL + "      LOG.info(\"Vertex \" + vertex.getId() +" + NL + "        \" in superstep \" + getSuperstep() +" + NL + "        \" received (partial) match \" + match);" + NL + "    }";
  protected final String TEXT_40 = NL + "    Set<Match> finalMatches = new HashSet<Match>();";
  protected final String TEXT_41 = NL + "    ";
  protected final String TEXT_42 = "filter";
  protected final String TEXT_43 = "(" + NL + "      vertex, matches, segment, microstep, finalMatches);" + NL + "    long matchCount = 0;" + NL + "    long appCount = 0;" + NL;
  protected final String TEXT_44 = " if (microstep == ";
  protected final String TEXT_45 = ") {";
  protected final String TEXT_46 = NL + "      // Joining matches at node ";
  protected final String TEXT_47 = ":" + NL + "      List<Match> matches1 = new ArrayList<Match>();" + NL + "      List<Match> matches2 = new ArrayList<Match>();" + NL + "      VertexId id = vertex.getId();" + NL + "      for (Match match : matches) {" + NL + "        if (id.equals(match.getVertexId(";
  protected final String TEXT_48 = "))) {" + NL + "          matches1.add(match.copy());" + NL + "        } else {" + NL + "          matches2.add(match.copy());" + NL + "        }" + NL + "      }";
  protected final String TEXT_49 = NL + "      LOG.info(\"Vertex \" + id + \" in superstep \" + getSuperstep() +" + NL + "        \" joining \" + matches1.size() + \" x \" + matches2.size() +" + NL + "        \" partial matches of rule ";
  protected final String TEXT_50 = "\");";
  protected final String TEXT_51 = NL + "      for (Match m1 : matches1) {" + NL + "        for (Match m2 : matches2) {" + NL + "          Match match = m1.append(m2);";
  protected final String TEXT_52 = NL + "          if (!match.isInjective()) {" + NL + "            continue;" + NL + "          }";
  protected final String TEXT_53 = NL + "          matchCount++;";
  protected final String TEXT_54 = NL + "          LOG.info(\"Vertex \" + vertex.getId() +" + NL + "            \" sending (partial) match \" + match +" + NL + "            \" back to vertex \" + match.getVertexId(";
  protected final String TEXT_55 = "));";
  protected final String TEXT_56 = NL + "          sendMessage(match.getVertexId(";
  protected final String TEXT_57 = "), match);";
  protected final String TEXT_58 = NL + "          match = match.remove(";
  protected final String TEXT_59 = ");";
  protected final String TEXT_60 = NL + "          if (!finalMatches.add(match)) {" + NL + "            continue;" + NL + "          }" + NL + "          matchCount++;" + NL + "          if (segment == SEGMENT_COUNT - 1) {" + NL + "            apply";
  protected final String TEXT_61 = "(" + NL + "              vertex, match, appCount++);" + NL + "          } else {" + NL + "            sendMessage(vertex.getId(), match);" + NL + "          }";
  protected final String TEXT_62 = NL + "        }" + NL + "      }";
  protected final String TEXT_63 = NL + "      // Matching node ";
  protected final String TEXT_64 = ":";
  protected final String TEXT_65 = NL + "      ";
  protected final String TEXT_66 = "vertex.getValue().get() == ";
  protected final String TEXT_67 = NL + "      ok = ok && vertex.getNumEdges() >= ";
  protected final String TEXT_68 = ";";
  protected final String TEXT_69 = NL + "      ok = ok && (SEGMENT_COUNT == 1 || getSegment(vertex.getId()) == segment);";
  protected final String TEXT_70 = NL + "      if (ok) {";
  protected final String TEXT_71 = NL + "        Match match = new Match(segment).append(vertex.getId());";
  protected final String TEXT_72 = NL;
  protected final String TEXT_73 = "      for (Match match : matches) {";
  protected final String TEXT_74 = NL;
  protected final String TEXT_75 = "        match = match.append(vertex.getId());";
  protected final String TEXT_76 = NL;
  protected final String TEXT_77 = "        if (!match.isInjective()) {";
  protected final String TEXT_78 = NL;
  protected final String TEXT_79 = "          continue;";
  protected final String TEXT_80 = NL;
  protected final String TEXT_81 = "        }";
  protected final String TEXT_82 = NL;
  protected final String TEXT_83 = "        if (vertex.getId().compareTo(match.getVertexId(";
  protected final String TEXT_84 = ")) < 0) {";
  protected final String TEXT_85 = NL;
  protected final String TEXT_86 = "          continue;";
  protected final String TEXT_87 = NL;
  protected final String TEXT_88 = "        }";
  protected final String TEXT_89 = NL;
  protected final String TEXT_90 = "    // Node ";
  protected final String TEXT_91 = ": check for edge to match of ";
  protected final String TEXT_92 = " of type \"";
  protected final String TEXT_93 = "\":";
  protected final String TEXT_94 = NL;
  protected final String TEXT_95 = "    VertexId targetId = match.getVertexId(";
  protected final String TEXT_96 = ");";
  protected final String TEXT_97 = NL;
  protected final String TEXT_98 = "    for (Edge<VertexId, ByteWritable> edge :";
  protected final String TEXT_99 = NL;
  protected final String TEXT_100 = "      vertex.getEdges()) {";
  protected final String TEXT_101 = NL;
  protected final String TEXT_102 = "      if (edge.getValue().get() ==";
  protected final String TEXT_103 = NL;
  protected final String TEXT_104 = "        ";
  protected final String TEXT_105 = " &&";
  protected final String TEXT_106 = NL;
  protected final String TEXT_107 = "        edge.getTargetVertexId().equals(targetId)) {";
  protected final String TEXT_108 = NL;
  protected final String TEXT_109 = "        matchCount++;";
  protected final String TEXT_110 = NL;
  protected final String TEXT_111 = "        LOG.info(\"Vertex \" + vertex.getId() +";
  protected final String TEXT_112 = NL;
  protected final String TEXT_113 = "          \" sending (partial) match \" + match +";
  protected final String TEXT_114 = NL;
  protected final String TEXT_115 = "          \" back to vertex \" + match.getVertexId(";
  protected final String TEXT_116 = "));";
  protected final String TEXT_117 = NL;
  protected final String TEXT_118 = "        sendMessage(match.getVertexId(";
  protected final String TEXT_119 = "), match);";
  protected final String TEXT_120 = NL;
  protected final String TEXT_121 = "        match = match.remove(";
  protected final String TEXT_122 = ");";
  protected final String TEXT_123 = NL;
  protected final String TEXT_124 = "        if (finalMatches.add(match)) {";
  protected final String TEXT_125 = NL;
  protected final String TEXT_126 = "          matchCount++;";
  protected final String TEXT_127 = NL;
  protected final String TEXT_128 = "          if (segment == SEGMENT_COUNT - 1) {";
  protected final String TEXT_129 = NL;
  protected final String TEXT_130 = "            apply";
  protected final String TEXT_131 = "(";
  protected final String TEXT_132 = NL;
  protected final String TEXT_133 = "              vertex, match, appCount++);";
  protected final String TEXT_134 = NL;
  protected final String TEXT_135 = "          } else {";
  protected final String TEXT_136 = NL;
  protected final String TEXT_137 = "            sendMessage(vertex.getId(), match);";
  protected final String TEXT_138 = NL;
  protected final String TEXT_139 = "          }";
  protected final String TEXT_140 = NL;
  protected final String TEXT_141 = "        }";
  protected final String TEXT_142 = NL;
  protected final String TEXT_143 = "        break;";
  protected final String TEXT_144 = NL;
  protected final String TEXT_145 = "      }";
  protected final String TEXT_146 = NL;
  protected final String TEXT_147 = "    }";
  protected final String TEXT_148 = NL;
  protected final String TEXT_149 = "        matchCount++;";
  protected final String TEXT_150 = NL;
  protected final String TEXT_151 = "        Set<VertexId> targets = new HashSet<VertexId>();";
  protected final String TEXT_152 = NL;
  protected final String TEXT_153 = "        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {";
  protected final String TEXT_154 = NL;
  protected final String TEXT_155 = "          if (edge.getValue().get() ==";
  protected final String TEXT_156 = NL;
  protected final String TEXT_157 = "            ";
  protected final String TEXT_158 = " &&";
  protected final String TEXT_159 = NL;
  protected final String TEXT_160 = "            targets.add(edge.getTargetVertexId())) {";
  protected final String TEXT_161 = NL;
  protected final String TEXT_162 = "            LOG.info(\"Vertex \" + vertex.getId() +";
  protected final String TEXT_163 = NL;
  protected final String TEXT_164 = "              \" sending (partial) match \" + match +";
  protected final String TEXT_165 = NL;
  protected final String TEXT_166 = "              \" forward to vertex \" + edge.getTargetVertexId());";
  protected final String TEXT_167 = NL;
  protected final String TEXT_168 = "            sendMessage(edge.getTargetVertexId(), match);";
  protected final String TEXT_169 = NL;
  protected final String TEXT_170 = "          }";
  protected final String TEXT_171 = NL;
  protected final String TEXT_172 = "        }";
  protected final String TEXT_173 = NL;
  protected final String TEXT_174 = "      }";
  protected final String TEXT_175 = NL + "      }";
  protected final String TEXT_176 = NL + "      for (Match match : matches) {" + NL + "        VertexId id = match.getVertexId(";
  protected final String TEXT_177 = ");" + NL + "        if (vertex.getId().equals(id)) {" + NL + "          matchCount++;";
  protected final String TEXT_178 = NL + "          LOG.info(\"Vertex \" + id + \" in superstep \" + getSuperstep() +" + NL + "            \" sending (partial) match \" + match + \" to myself\");";
  protected final String TEXT_179 = NL + "          sendMessage(id, match);" + NL + "        }" + NL + "      }";
  protected final String TEXT_180 = NL + "    }";
  protected final String TEXT_181 = " else {" + NL + "      throw new RuntimeException(\"Illegal microstep for rule \" +" + NL + "        \"";
  protected final String TEXT_182 = ": \" + microstep);" + NL + "    }" + NL + "    if (matchCount > 0) {" + NL + "      aggregate(AGGREGATOR_MATCHES," + NL + "        new LongWritable(matchCount));" + NL + "    }" + NL + "    if (appCount > 0) {" + NL + "      aggregate(AGGREGATOR_RULE_APPLICATIONS," + NL + "        new LongWritable(appCount));" + NL + "    }" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Filter matches per segment for the rule \"";
  protected final String TEXT_183 = "\"." + NL + "   * @param vertex The current vertex." + NL + "   * @param matches The current matches." + NL + "   * @param segment The current segment." + NL + "   * @param microstep The current microstep." + NL + "   * @param finalMatches Set of final matches." + NL + "   * @return The filtered matches." + NL + "   */" + NL + "  protected Iterable<Match> filter";
  protected final String TEXT_184 = "(" + NL + "    Vertex<VertexId, ByteWritable, ByteWritable> vertex," + NL + "    Iterable<Match> matches, int segment, int microstep," + NL + "    Set<Match> finalMatches)" + NL + "    throws IOException {" + NL + "    if (segment > 0) {" + NL + "      List<Match> filtered = new ArrayList<Match>();" + NL + "      long matchCount = 0;" + NL + "      long appCount = 0;" + NL + "      for (Match match : matches) {" + NL + "        int matchSegment = match.getSegment();" + NL + "        if (matchSegment < segment) {" + NL + "          if (!finalMatches.add(match)) {" + NL + "            continue;" + NL + "          }" + NL + "          matchCount++;" + NL + "          if (segment == SEGMENT_COUNT - 1 && microstep == ";
  protected final String TEXT_185 = ") {" + NL + "            apply";
  protected final String TEXT_186 = "(" + NL + "              vertex, match, appCount++);" + NL + "          } else {" + NL + "            sendMessage(vertex.getId(), match);" + NL + "          }" + NL + "        } else if (matchSegment > segment) {" + NL + "          throw new RuntimeException(\"Received match \" + match +" + NL + "            \" of rule ";
  protected final String TEXT_187 = " of segment \" +" + NL + "            matchSegment + \", but current segment is only \" + segment);" + NL + "        } else {" + NL + "          filtered.add(match.copy());" + NL + "        }" + NL + "      }" + NL + "      if (matchCount > 0) {" + NL + "        aggregate(AGGREGATOR_MATCHES," + NL + "          new LongWritable(matchCount));" + NL + "      }" + NL + "      if (appCount > 0) {" + NL + "        aggregate(AGGREGATOR_RULE_APPLICATIONS," + NL + "          new LongWritable(appCount));" + NL + "      }" + NL + "      return filtered;" + NL + "    }" + NL + "    return matches;" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Apply the rule \"";
  protected final String TEXT_188 = "\" to a given match." + NL + "   * @param vertex The base vertex." + NL + "   * @param match The match object." + NL + "   * @param matchIndex Match index." + NL + "   * @return true if the rule was applied." + NL + "   * @throws IOException On I/O errors." + NL + "   */" + NL + "  protected boolean apply";
  protected final String TEXT_189 = "(" + NL + "    Vertex<VertexId, ByteWritable, ByteWritable> vertex," + NL + "    Match match, long matchIndex) throws IOException {";
  protected final String TEXT_190 = NL + "    VertexId cur";
  protected final String TEXT_191 = " = match.getVertexId(";
  protected final String TEXT_192 = ");";
  protected final String TEXT_193 = NL + "    LOG.info(\"Vertex \" + vertex.getId() +" + NL + "      \" applying rule ";
  protected final String TEXT_194 = " with match \" + match);";
  protected final String TEXT_195 = NL + "    removeEdgesRequest(cur";
  protected final String TEXT_196 = ", cur";
  protected final String TEXT_197 = ");";
  protected final String TEXT_198 = NL + "    removeVertexRequest(cur";
  protected final String TEXT_199 = ");";
  protected final String TEXT_200 = NL + "    VertexId new";
  protected final String TEXT_201 = " =";
  protected final String TEXT_202 = NL + "      VertexId.randomVertexId();";
  protected final String TEXT_203 = NL + "      deriveVertexId(vertex.getId(), (int) matchIndex, ";
  protected final String TEXT_204 = ");";
  protected final String TEXT_205 = NL + "    addVertexRequest(new";
  protected final String TEXT_206 = "," + NL + "      new ByteWritable(";
  protected final String TEXT_207 = "));";
  protected final String TEXT_208 = NL + "    VertexId src";
  protected final String TEXT_209 = " = new";
  protected final String TEXT_210 = ";";
  protected final String TEXT_211 = NL + "    VertexId src";
  protected final String TEXT_212 = " = cur";
  protected final String TEXT_213 = ";";
  protected final String TEXT_214 = NL + "    VertexId trg";
  protected final String TEXT_215 = " = new";
  protected final String TEXT_216 = ";";
  protected final String TEXT_217 = NL + "    VertexId trg";
  protected final String TEXT_218 = " = cur";
  protected final String TEXT_219 = ";";
  protected final String TEXT_220 = NL + "    Edge<VertexId, ByteWritable> edge";
  protected final String TEXT_221 = " =" + NL + "      EdgeFactory.create(trg";
  protected final String TEXT_222 = "," + NL + "        new ByteWritable(";
  protected final String TEXT_223 = "));" + NL + "    addEdgeRequest(src";
  protected final String TEXT_224 = ", edge";
  protected final String TEXT_225 = ");";
  protected final String TEXT_226 = NL + "    return true;" + NL + "  }";
  protected final String TEXT_227 = NL;
  protected final String TEXT_228 = NL + "  /**" + NL + "   * Derive a new vertex Id from an exiting one." + NL + "   * @param baseId The base vertex Id." + NL + "   * @param matchIndex The index of the match." + NL + "   * @param vertexIndex The index of the new vertex." + NL + "   * @return The derived vertex Id." + NL + "   */" + NL + "  private VertexId deriveVertexId(VertexId baseId, int matchIndex," + NL + "    int vertexIndex) {" + NL + "    long generation = ((LongWritable) getAggregatedValue(" + NL + "        AGGREGATOR_NODE_GENERATION)).get();" + NL + "    return baseId" + NL + "      .append((byte) generation)" + NL + "      .append((byte) matchIndex)" + NL + "      .append((byte) vertexIndex);" + NL + "  }" + NL;
  protected final String TEXT_229 = NL + "  /**" + NL + "   * Get the segment that a vertex belongs to." + NL + "   * @param vertexId The ID of the vertex." + NL + "   * @return The segment of the vertex." + NL + "   */" + NL + "  private int getSegment(VertexId vertexId) {" + NL + "    return Math.abs(vertexId.hashCode()) % SEGMENT_COUNT;" + NL + "  }" + NL + "" + NL + "  /**" + NL + "   * Master compute which registers and updates the required aggregators." + NL + "   */" + NL + "  public static class MasterCompute extends DefaultMasterCompute {" + NL + "" + NL + "    /**" + NL + "     * Stack for storing unit success flags." + NL + "     */" + NL + "    private final Deque<Boolean> unitSuccesses =" + NL + "      new ArrayDeque<Boolean>();" + NL + "" + NL + "    /**" + NL + "     * Stack for storing the execution orders of independent units." + NL + "     */" + NL + "    private final Deque<List<Integer>> unitOrders =" + NL + "      new ArrayDeque<List<Integer>>();" + NL + "" + NL + "    /*" + NL + "     * (non-Javadoc)" + NL + "     * @see org.apache.giraph.master.DefaultMasterCompute#compute()" + NL + "     */" + NL + "    @Override" + NL + "    public void compute() {" + NL + "      long ruleApps = ((LongWritable)" + NL + "        getAggregatedValue(AGGREGATOR_RULE_APPLICATIONS)).get();";
  protected final String TEXT_230 = NL + "      long matches = ((LongWritable)" + NL + "        getAggregatedValue(AGGREGATOR_MATCHES)).get();" + NL + "      if (getSuperstep() > 0) {" + NL + "        LOG.info(matches + \" (partial) matches computed and \" +" + NL + "          ruleApps + \" rule applications conducted in superstep \" +" + NL + "          (getSuperstep() - 1));" + NL + "      }";
  protected final String TEXT_231 = NL + "      if (ruleApps > 0) {" + NL + "        long nodeGen = ((LongWritable)" + NL + "          getAggregatedValue(AGGREGATOR_NODE_GENERATION)).get();" + NL + "        setAggregatedValue(AGGREGATOR_NODE_GENERATION," + NL + "          new LongWritable(nodeGen + 1));" + NL + "      }" + NL + "      ApplicationStack stack;" + NL + "      if (getSuperstep() == 0) {" + NL + "        stack = new ApplicationStack();" + NL + "        stack = stack.append(";
  protected final String TEXT_232 = ", 0, 0);";
  protected final String TEXT_233 = NL + "        stack = nextRuleStep(stack, ruleApps);";
  protected final String TEXT_234 = NL + "      } else {" + NL + "        stack = getAggregatedValue(AGGREGATOR_APPLICATION_STACK);" + NL + "        stack = nextRuleStep(stack, ruleApps);" + NL + "      }" + NL + "      setAggregatedValue(AGGREGATOR_APPLICATION_STACK, stack);" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * Compute the next rule application stack." + NL + "     * @param stack The current application stack." + NL + "     * @param ruleApps Number of rule applications in last superstep." + NL + "     * @return The new application stack." + NL + "     */" + NL + "    private ApplicationStack nextRuleStep(" + NL + "      ApplicationStack stack, long ruleApps) {" + NL + "      while (stack.getStackSize() > 0) {" + NL + "        int unit = stack.getLastUnit();" + NL + "        int segment = stack.getLastSegment();" + NL + "        int microstep = stack.getLastMicrostep();" + NL + "        stack = stack.removeLast();" + NL + "        switch (unit) {";
  protected final String TEXT_235 = NL + "        case ";
  protected final String TEXT_236 = ":" + NL + "          stack = process";
  protected final String TEXT_237 = "(" + NL + "            stack";
  protected final String TEXT_238 = ", microstep";
  protected final String TEXT_239 = ");" + NL + "          break;";
  protected final String TEXT_240 = NL + "        default:" + NL + "          throw new RuntimeException(\"Unknown unit \" + unit);" + NL + "        }" + NL + "        if (stack.getStackSize() > 0) {" + NL + "          unit = stack.getLastUnit();";
  protected final String TEXT_241 = NL + "          ";
  protected final String TEXT_242 = "unit == ";
  protected final String TEXT_243 = NL + "            break;" + NL + "          }" + NL + "        }" + NL + "      }" + NL + "      return stack;" + NL + "    }";
  protected final String TEXT_244 = NL + NL + "   /**" + NL + "     * Process ";
  protected final String TEXT_245 = " \"";
  protected final String TEXT_246 = "\"." + NL + "     * @param stack The current application stack.";
  protected final String TEXT_247 = NL + "     * @param segment The current segment.";
  protected final String TEXT_248 = NL + "     * @param microstep The current microstep.";
  protected final String TEXT_249 = NL + "     * @param ruleApps Number of rule applications in last superstep.";
  protected final String TEXT_250 = NL + "     * @return The new application stack." + NL + "     */" + NL + "    private ApplicationStack process";
  protected final String TEXT_251 = "(" + NL + "      ApplicationStack stack";
  protected final String TEXT_252 = ", int microstep";
  protected final String TEXT_253 = ") {";
  protected final String TEXT_254 = NL + "      if (microstep > 0 && !unitSuccesses.pop()) {" + NL + "        unitSuccesses.push(false);" + NL + "      } else if (microstep == ";
  protected final String TEXT_255 = ") {" + NL + "        unitSuccesses.push(true);" + NL + "      } else if (microstep < ";
  protected final String TEXT_256 = ") {" + NL + "        stack = stack.append(";
  protected final String TEXT_257 = ", 0, microstep + 1);" + NL + "        stack = stack.append(";
  protected final String TEXT_258 = ", 0, 0);" + NL + "      }";
  protected final String TEXT_259 = NL + "      if (microstep > 0 && !unitSuccesses.pop()) {" + NL + "        unitSuccesses.push(false);" + NL + "      } else if (microstep == ";
  protected final String TEXT_260 = ") {" + NL + "        unitSuccesses.push(true);" + NL + "      } else {" + NL + "        switch (microstep) {";
  protected final String TEXT_261 = NL + "        case ";
  protected final String TEXT_262 = ":" + NL + "          stack = stack.append(";
  protected final String TEXT_263 = ", 0, ";
  protected final String TEXT_264 = ");" + NL + "          stack = stack.append(";
  protected final String TEXT_265 = ", 0, 0);" + NL + "          break;";
  protected final String TEXT_266 = NL + "        default:" + NL + "          break;" + NL + "        }" + NL + "      }";
  protected final String TEXT_267 = NL + "      if (microstep == 0) {" + NL + "        List<Integer> order = new ArrayList<Integer>();" + NL + "        for (int i = 0; i < ";
  protected final String TEXT_268 = "; i++) {" + NL + "          order.add(i);" + NL + "        }" + NL + "        Collections.shuffle(order);" + NL + "        unitOrders.push(order);" + NL + "      }" + NL + "      if (microstep > 0 && unitSuccesses.pop()) {" + NL + "        unitOrders.pop();" + NL + "        unitSuccesses.push(true);" + NL + "      } else if (microstep == ";
  protected final String TEXT_269 = ") {" + NL + "        unitOrders.pop();" + NL + "        unitSuccesses.push(false);" + NL + "      } else {" + NL + "        int next = unitOrders.peek().get(microstep);" + NL + "        switch (next) {";
  protected final String TEXT_270 = NL + "        case ";
  protected final String TEXT_271 = ":" + NL + "          stack = stack.append(";
  protected final String TEXT_272 = ", 0, microstep + 1);" + NL + "          stack = stack.append(";
  protected final String TEXT_273 = ", 0, 0);" + NL + "          break;";
  protected final String TEXT_274 = NL + "        default:" + NL + "          break;" + NL + "        }" + NL + "      }";
  protected final String TEXT_275 = NL + "      if (microstep == 0 || unitSuccesses.pop()) {" + NL + "        stack = stack.append(";
  protected final String TEXT_276 = ", 0, 1);" + NL + "        stack = stack.append(";
  protected final String TEXT_277 = ", 0, 0);" + NL + "      } else {" + NL + "        unitSuccesses.push(true);" + NL + "      }";
  protected final String TEXT_278 = NL + "      if (microstep < ";
  protected final String TEXT_279 = ") {" + NL + "        stack = stack.append(";
  protected final String TEXT_280 = ", segment, microstep + 1);" + NL + "      } else if (segment < SEGMENT_COUNT - 1) {" + NL + "        stack = stack.append(";
  protected final String TEXT_281 = ", segment + 1, 0);" + NL + "      } else {" + NL + "        unitSuccesses.push(ruleApps > 0);" + NL + "      }";
  protected final String TEXT_282 = NL + "      return stack;" + NL + "    }";
  protected final String TEXT_283 = NL + NL + "    /*" + NL + "     * (non-Javadoc)" + NL + "     * @see org.apache.giraph.master.DefaultMasterCompute#initialize()" + NL + "     */" + NL + "    @Override" + NL + "    public void initialize() throws InstantiationException," + NL + "        IllegalAccessException {" + NL + "      registerAggregator(AGGREGATOR_MATCHES," + NL + "        LongSumAggregator.class);" + NL + "      registerAggregator(AGGREGATOR_RULE_APPLICATIONS," + NL + "        LongSumAggregator.class);" + NL + "      registerPersistentAggregator(AGGREGATOR_NODE_GENERATION," + NL + "        LongSumAggregator.class);" + NL + "      registerPersistentAggregator(AGGREGATOR_APPLICATION_STACK," + NL + "        ApplicationStackAggregator.class);" + NL + "    }" + NL + "" + NL + "  }" + NL + "}";
  protected final String TEXT_284 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    

@SuppressWarnings("unchecked")
Map<String,Object> args = (Map<String,Object>) argument;

@SuppressWarnings("unchecked")
Map<Rule,GiraphRuleData> ruleData = (Map<Rule,GiraphRuleData>) args.get("ruleData");

Unit mainUnit = (Unit) args.get("mainUnit");
String className = (String) args.get("className");
String packageName = (String) args.get("packageName");
boolean masterLogging = (Boolean) args.get("masterLogging");
boolean vertexLogging = (Boolean) args.get("vertexLogging");
boolean useUUIDs = (Boolean) args.get("useUUIDs");
int segmentCount = (Integer) args.get("segmentCount");

List<Unit> allUnits = new ArrayList<Unit>();
allUnits.add(mainUnit);
allUnits.addAll(mainUnit.getSubUnits(true));

List<Rule> rules = new ArrayList<Rule>(ruleData.keySet());

boolean needsEdgeFactory = false;
boolean needsVertexIdFactory = false;
int maxCreatedNodes = 0;
for (GiraphRuleData data : ruleData.values()) {
  if (!data.changeInfo.getCreatedEdges().isEmpty()) {
    needsEdgeFactory = true;
  }
  if (!data.changeInfo.getCreatedNodes().isEmpty()) {
    needsVertexIdFactory = true;
  }
  maxCreatedNodes = Math.max(maxCreatedNodes, data.changeInfo.getCreatedNodes().size());
}

boolean needsCollections = false;
for (Unit unit : allUnits) {
  if (unit instanceof IndependentUnit) {
    needsCollections = true;
    break;
  }
}

boolean needsEdgeClass = false;
for (Rule rule : rules) {
  if (!rule.getLhs().getEdges().isEmpty() || !rule.getRhs().getEdges().isEmpty()) {
    needsEdgeClass = true;
    break;
  }
}


    stringBuffer.append(TEXT_1);
    stringBuffer.append( packageName );
    stringBuffer.append(TEXT_2);
     if (needsCollections) { 
    stringBuffer.append(TEXT_3);
     } 
    stringBuffer.append(TEXT_4);
     if (needsEdgeClass) { 
    stringBuffer.append(TEXT_5);
     }
if (needsEdgeFactory) { 
    stringBuffer.append(TEXT_6);
     } 
    stringBuffer.append(TEXT_7);
    if (masterLogging || vertexLogging) { 
    stringBuffer.append(TEXT_8);
    } 
    stringBuffer.append(TEXT_9);
    stringBuffer.append( packageName );
    stringBuffer.append(TEXT_10);
    stringBuffer.append( packageName );
    stringBuffer.append(TEXT_11);
    stringBuffer.append( packageName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append( packageName );
    stringBuffer.append(TEXT_13);
    stringBuffer.append( mainUnit.getName() );
    stringBuffer.append(TEXT_14);
    stringBuffer.append( mainUnit.getName() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_16);
    

Map<ENamedElement,String> typeConstants = GiraphUtil.getTypeConstants(mainUnit.getModule());
int value = 0;
for (ENamedElement type : typeConstants.keySet()) {
  
    stringBuffer.append(TEXT_17);
    stringBuffer.append( type.getName() );
    stringBuffer.append(TEXT_18);
    stringBuffer.append( typeConstants.get(type) );
    stringBuffer.append(TEXT_19);
    stringBuffer.append( value++ );
    stringBuffer.append(TEXT_20);
    
}

Map<Unit,String> unitConstants = GiraphUtil.getUnitConstants(mainUnit);
value = 0;
for (Unit unit : unitConstants.keySet()) {
  
    stringBuffer.append(TEXT_21);
    stringBuffer.append( (unit instanceof Rule) ? "Rule" : "Unit" );
    stringBuffer.append(TEXT_22);
    stringBuffer.append( unit.getName() );
    stringBuffer.append(TEXT_23);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_24);
    stringBuffer.append( value++ );
    stringBuffer.append(TEXT_25);
    
}

if (masterLogging || vertexLogging) {

    stringBuffer.append(TEXT_26);
    stringBuffer.append( className );
    stringBuffer.append(TEXT_27);
     } 
    stringBuffer.append(TEXT_28);
    stringBuffer.append( segmentCount );
    stringBuffer.append(TEXT_29);
     for (Rule rule : rules) { 
    stringBuffer.append(TEXT_30);
    stringBuffer.append( unitConstants.get(rule) );
    stringBuffer.append(TEXT_31);
    stringBuffer.append( ruleData.get(rule).rule.getName() );
    stringBuffer.append(TEXT_32);
     } 
    stringBuffer.append(TEXT_33);
    

// Generate the code for all rules: 
for (GiraphRuleData data : ruleData.values()) {
  Rule rule = data.rule;
  RuleChangeInfo changeInfo = data.changeInfo;

  // Sort indexes of nodes to be removed from the match:
  List<Integer> required = new ArrayList<Integer>();
  for (Node node : data.requiredNodes) {
    required.add(data.orderedLhsNodes.indexOf(node));
  }
  Collections.sort(required);
  Collections.reverse(required);


    stringBuffer.append(TEXT_34);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append( data.matchingSteps.size() );
    stringBuffer.append(TEXT_36);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_37);
    
  /* START LOGGING */
  if (vertexLogging) { 
    stringBuffer.append(TEXT_38);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_39);
     } 
  /* END LOGGING */

    stringBuffer.append(TEXT_40);
    stringBuffer.append(TEXT_41);
    stringBuffer.append( data.matchingSteps.size() > 1 ? "matches = " : "" );
    stringBuffer.append(TEXT_42);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_43);
      for (int i=0; i<data.matchingSteps.size(); i++) {

      /* START STEP LOOP */
      GiraphRuleData.MatchingStep step = data.matchingSteps.get(i);

    stringBuffer.append( i>0 ? " else" : "   " );
    stringBuffer.append(TEXT_44);
    stringBuffer.append( i );
    stringBuffer.append(TEXT_45);
        if (step.isJoin) {
        /* START JOIN */        
        
    stringBuffer.append(TEXT_46);
    stringBuffer.append( GiraphUtil.getNodeName(step.node) );
    stringBuffer.append(TEXT_47);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.node) );
    stringBuffer.append(TEXT_48);
          if (vertexLogging) { 
    stringBuffer.append(TEXT_49);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_50);
          } 
    stringBuffer.append(TEXT_51);
        if (rule.isInjectiveMatching()) {
    stringBuffer.append(TEXT_52);
        }
      if (step.sendBackTo != null) {
        /* START SEND BACK TO */        

    stringBuffer.append(TEXT_53);
          if (vertexLogging) { 
    stringBuffer.append(TEXT_54);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.sendBackTo) );
    stringBuffer.append(TEXT_55);
          } 
    stringBuffer.append(TEXT_56);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.sendBackTo) );
    stringBuffer.append(TEXT_57);
            /* END SEND BACK TO */
      } else if (i == data.matchingSteps.size()-1) {
        for (Integer req : required) { 
    stringBuffer.append(TEXT_58);
    stringBuffer.append( req );
    stringBuffer.append(TEXT_59);
     } 
    stringBuffer.append(TEXT_60);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_61);
        } 
    stringBuffer.append(TEXT_62);
    
        /* END JOIN */        
      } else {
        /* START CHECKING */        
        String xx = "";
        if (step.isMatching) {
          /* START MATCHING */
          xx = "  ";
          List<EClass> validTypes = GiraphUtil.getValidTypes(step.node, mainUnit.getModule());

    stringBuffer.append(TEXT_63);
    stringBuffer.append( GiraphUtil.getNodeName(step.node) );
    stringBuffer.append(TEXT_64);
        for (int j=0; j<validTypes.size(); j++) { 
    stringBuffer.append(TEXT_65);
    stringBuffer.append( (j==0) ? "boolean ok = " : "  " );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( typeConstants.get(validTypes.get(j)) );
    stringBuffer.append( (j==validTypes.size()-1) ? ";" : " ||" );
        }
      if (rule.isInjectiveMatching() && !step.node.getOutgoing().isEmpty()) { 
    stringBuffer.append(TEXT_67);
    stringBuffer.append( step.node.getOutgoing().size() );
    stringBuffer.append(TEXT_68);
        } 
      if (i==0) { 
    stringBuffer.append(TEXT_69);
        } 
    stringBuffer.append(TEXT_70);
    
          /* END MATCHING */
        }
        if (step.isStart) {
          /* START IS START */        

    stringBuffer.append(TEXT_71);
    
          /* END IS START */        
        } else {
          /* START IS NOT START*/        

    stringBuffer.append(TEXT_72);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_73);
            if (step.isMatching) { 
    stringBuffer.append(TEXT_74);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_75);
              if (rule.isInjectiveMatching()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_81);
              }
            NodeEquivalence equi = data.requiredNodesEquivalences.get(step.node);
            if (equi!=null && equi.indexOf(step.node)>0) { 
              Node compareTo = equi.get(equi.indexOf(step.node)-1); 
    stringBuffer.append(TEXT_82);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_83);
    stringBuffer.append( data.orderedLhsNodes.indexOf(compareTo) );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_88);
              }
          } 
          /* END IS NOT START*/
        }
        if (step.edge != null) {
          /* START EDGE */
          if (step.verifyEdgeTo != null) {
            /* START VERIFY EDGE */
            xx = xx + "    ";

    stringBuffer.append(TEXT_89);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_90);
    stringBuffer.append( GiraphUtil.getNodeName(step.edge.getSource()) );
    stringBuffer.append(TEXT_91);
    stringBuffer.append( GiraphUtil.getNodeName(step.edge.getTarget()) );
    stringBuffer.append(TEXT_92);
    stringBuffer.append( step.edge.getType().getName() );
    stringBuffer.append(TEXT_93);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_95);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.verifyEdgeTo) );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(TEXT_103);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_104);
    stringBuffer.append( typeConstants.get(step.edge.getType()) );
    stringBuffer.append(TEXT_105);
    stringBuffer.append(TEXT_106);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_107);
    
            /* END VERIFY EDGE */        
          }
          /* END EDGE */
        } 
          if (step.sendBackTo != null) {
          /* START SEND BACK TO */        

    stringBuffer.append(TEXT_108);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_109);
            if (vertexLogging) { 
    stringBuffer.append(TEXT_110);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_111);
    stringBuffer.append(TEXT_112);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(TEXT_114);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_115);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.sendBackTo) );
    stringBuffer.append(TEXT_116);
            } 
    stringBuffer.append(TEXT_117);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_118);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.sendBackTo) );
    stringBuffer.append(TEXT_119);
            /* END SEND BACK TO */        
        } else if (i == data.matchingSteps.size()-1) {
          /* START LAST STEP */ 
          if (step.isStart) {
            xx = "";
          }
          for (Integer req : required) { 
    stringBuffer.append(TEXT_120);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_121);
    stringBuffer.append( req );
    stringBuffer.append(TEXT_122);
            } 
    stringBuffer.append(TEXT_123);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_124);
    stringBuffer.append(TEXT_125);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_126);
    stringBuffer.append(TEXT_127);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_128);
    stringBuffer.append(TEXT_129);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_130);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_131);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_133);
    stringBuffer.append(TEXT_134);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_135);
    stringBuffer.append(TEXT_136);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_137);
    stringBuffer.append(TEXT_138);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_139);
    stringBuffer.append(TEXT_140);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_141);
            /* END LAST STEP */        
        }
        if (step.verifyEdgeTo != null) {
          /* START VERIFY EDGE */

    stringBuffer.append(TEXT_142);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_143);
    stringBuffer.append(TEXT_144);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_145);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_147);
    
          xx = xx.substring(0, xx.length() - 4);
          /* END VERIFY EDGE */
        }
        if (step.edge!=null && step.verifyEdgeTo==null) {
          /* START NOT VERIFY EDGE */
          String yy = !step.isStart && step.isMatching ? "  " : "";

    stringBuffer.append(TEXT_148);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_149);
    stringBuffer.append(TEXT_150);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_151);
    stringBuffer.append(TEXT_152);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_153);
    stringBuffer.append(TEXT_154);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_155);
    stringBuffer.append(TEXT_156);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_157);
    stringBuffer.append( typeConstants.get(step.edge.getType()) );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(TEXT_159);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_160);
              if (vertexLogging) { 
    stringBuffer.append(TEXT_161);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_162);
    stringBuffer.append(TEXT_163);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_164);
    stringBuffer.append(TEXT_165);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_166);
              } 
    stringBuffer.append(TEXT_167);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_168);
    stringBuffer.append(TEXT_169);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_170);
    stringBuffer.append(TEXT_171);
    stringBuffer.append(yy);
    stringBuffer.append(TEXT_172);
    
          /* END NOT VERIFY EDGE */        
        }
        if (!step.isStart) {
    stringBuffer.append(TEXT_173);
    stringBuffer.append(xx);
    stringBuffer.append(TEXT_174);
          }
        if (step.isMatching) { 
    stringBuffer.append(TEXT_175);
          }
        if (step.keepMatchesOf != null) {

    stringBuffer.append(TEXT_176);
    stringBuffer.append( data.orderedLhsNodes.indexOf(step.keepMatchesOf) );
    stringBuffer.append(TEXT_177);
            if (vertexLogging) { 
    stringBuffer.append(TEXT_178);
            } 
    stringBuffer.append(TEXT_179);
            }
     } 
    stringBuffer.append(TEXT_180);
    
    } // end for

    stringBuffer.append(TEXT_181);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_183);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_184);
    stringBuffer.append( data.matchingSteps.size()-1 );
    stringBuffer.append(TEXT_185);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_186);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_187);
    stringBuffer.append( rule.getName() );
    stringBuffer.append(TEXT_188);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_189);
    
  List<Node> matchNodes = new ArrayList<Node>();
  matchNodes.addAll(data.orderedLhsNodes);
  matchNodes.removeAll(data.requiredNodes);
  for (int j = 0; j < matchNodes.size(); j++) {
    Node lhsNode = matchNodes.get(j);
    Node rhsNode = data.rule.getMappings().getImage(lhsNode, data.rule.getRhs());
    boolean needed = changeInfo.getDeletedNodes().contains(lhsNode);
    for (Edge edge : lhsNode.getAllEdges()) {
      needed = needed || changeInfo.getDeletedEdges().contains(edge);
    }
    if (rhsNode!=null) {
      for (Edge edge : rhsNode.getAllEdges()) {
        needed = needed || changeInfo.getCreatedEdges().contains(edge);
      }
    }
    if (needed) { 
    stringBuffer.append(TEXT_190);
    stringBuffer.append( j );
    stringBuffer.append(TEXT_191);
    stringBuffer.append( j );
    stringBuffer.append(TEXT_192);
      }
  }
  if (vertexLogging) { 
    stringBuffer.append(TEXT_193);
    stringBuffer.append( data.rule.getName() );
    stringBuffer.append(TEXT_194);
     } 
    
  for (Edge edge : changeInfo.getDeletedEdges()) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append( matchNodes.indexOf(edge.getSource()) );
    stringBuffer.append(TEXT_196);
    stringBuffer.append( matchNodes.indexOf(edge.getTarget()) );
    stringBuffer.append(TEXT_197);
      }
    for (Node node : changeInfo.getDeletedNodes()) {
    stringBuffer.append(TEXT_198);
    stringBuffer.append( matchNodes.indexOf(node) );
    stringBuffer.append(TEXT_199);
      }

    int n = 0;
    for (Node node : changeInfo.getCreatedNodes()) {
    stringBuffer.append(TEXT_200);
    stringBuffer.append( n );
    stringBuffer.append(TEXT_201);
     if (useUUIDs) { 
    stringBuffer.append(TEXT_202);
     } else { 
    stringBuffer.append(TEXT_203);
    stringBuffer.append( n );
    stringBuffer.append(TEXT_204);
     } 
    stringBuffer.append(TEXT_205);
    stringBuffer.append( n++ );
    stringBuffer.append(TEXT_206);
    stringBuffer.append( typeConstants.get(node.getType()) );
    stringBuffer.append(TEXT_207);
      }

    int e = 0;
    for (Edge edge : changeInfo.getCreatedEdges()) { 
    	// THE SOURCE OF THE NEW EDGE:
   	if (changeInfo.getCreatedNodes().contains(edge.getSource())) { 
    stringBuffer.append(TEXT_208);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_209);
    stringBuffer.append( changeInfo.getCreatedNodes().indexOf(edge.getSource()) );
    stringBuffer.append(TEXT_210);
    	} else { 
    stringBuffer.append(TEXT_211);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_212);
    stringBuffer.append( matchNodes.indexOf(data.rule.getMappings().getOrigin(edge.getSource())) );
    stringBuffer.append(TEXT_213);
    	}
	// THE TARGET OF THE NEW EDGE:
   	if (changeInfo.getCreatedNodes().contains(edge.getTarget())) { 
    stringBuffer.append(TEXT_214);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_215);
    stringBuffer.append( changeInfo.getCreatedNodes().indexOf(edge.getTarget()) );
    stringBuffer.append(TEXT_216);
    	} else { 
    stringBuffer.append(TEXT_217);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_218);
    stringBuffer.append( matchNodes.indexOf(data.rule.getMappings().getOrigin(edge.getTarget())) );
    stringBuffer.append(TEXT_219);
    	} 
    stringBuffer.append(TEXT_220);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_221);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_222);
    stringBuffer.append( typeConstants.get(edge.getType()) );
    stringBuffer.append(TEXT_223);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_224);
    stringBuffer.append( e );
    stringBuffer.append(TEXT_225);
      e++;
    } 
    stringBuffer.append(TEXT_226);
    
} // end of for all rules

    stringBuffer.append(TEXT_227);
     if (needsVertexIdFactory && !useUUIDs) { 
    stringBuffer.append(TEXT_228);
     } 
    stringBuffer.append(TEXT_229);
     if (masterLogging) { 
    stringBuffer.append(TEXT_230);
     } 
    stringBuffer.append(TEXT_231);
    stringBuffer.append( unitConstants.get(mainUnit) );
    stringBuffer.append(TEXT_232);
     if (!(mainUnit instanceof Rule)) { 
    stringBuffer.append(TEXT_233);
     } 
    stringBuffer.append(TEXT_234);
     for (Unit unit : allUnits) { 
    stringBuffer.append(TEXT_235);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_236);
    stringBuffer.append( unit.getName() );
    stringBuffer.append(TEXT_237);
    stringBuffer.append( (unit instanceof Rule) ? ", segment" : "" );
    stringBuffer.append(TEXT_238);
    stringBuffer.append( (unit instanceof Rule) ? ", ruleApps" : "" );
    stringBuffer.append(TEXT_239);
     } // end for 
    stringBuffer.append(TEXT_240);
     for (int i=0; i<rules.size(); i++) { 
    stringBuffer.append(TEXT_241);
    stringBuffer.append( i==0 ? "if (" : "  " );
    stringBuffer.append(TEXT_242);
    stringBuffer.append( unitConstants.get(rules.get(i)) + (i<rules.size()-1 ? " ||" : ") {" ) );
     } 
    stringBuffer.append(TEXT_243);
    

for (Unit unit : allUnits) { 
    stringBuffer.append(TEXT_244);
    stringBuffer.append( unit.eClass().getName() );
    stringBuffer.append(TEXT_245);
    stringBuffer.append( unit.getName() );
    stringBuffer.append(TEXT_246);
     if (unit instanceof Rule) { 
    stringBuffer.append(TEXT_247);
     } 
    stringBuffer.append(TEXT_248);
     if (unit instanceof Rule) { 
    stringBuffer.append(TEXT_249);
     } 
    stringBuffer.append(TEXT_250);
    stringBuffer.append( unit.getName() );
    stringBuffer.append(TEXT_251);
    stringBuffer.append( (unit instanceof Rule) ? ", int segment" : "" );
    stringBuffer.append(TEXT_252);
    stringBuffer.append( (unit instanceof Rule) ? ", long ruleApps" : "" );
    stringBuffer.append(TEXT_253);
     if (unit instanceof IteratedUnit) {
   int iters = Integer.parseInt(((IteratedUnit) unit).getIterations()); 
    stringBuffer.append(TEXT_254);
    stringBuffer.append( iters );
    stringBuffer.append(TEXT_255);
    stringBuffer.append( iters );
    stringBuffer.append(TEXT_256);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_257);
    stringBuffer.append( unitConstants.get(((IteratedUnit) unit).getSubUnit()) );
    stringBuffer.append(TEXT_258);
     } else if (unit instanceof SequentialUnit) {
     SequentialUnit seq = (SequentialUnit) unit; 
    stringBuffer.append(TEXT_259);
    stringBuffer.append( seq.getSubUnits().size() );
    stringBuffer.append(TEXT_260);
     for (int i=0; i<seq.getSubUnits().size(); i++) { 
    stringBuffer.append(TEXT_261);
    stringBuffer.append( i);
    stringBuffer.append(TEXT_262);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_263);
    stringBuffer.append( i+1 );
    stringBuffer.append(TEXT_264);
    stringBuffer.append( unitConstants.get(seq.getSubUnits().get(i)) );
    stringBuffer.append(TEXT_265);
     } 
    stringBuffer.append(TEXT_266);
     } else if (unit instanceof IndependentUnit) { 
     IndependentUnit indi = (IndependentUnit) unit; 
    stringBuffer.append(TEXT_267);
    stringBuffer.append( indi.getSubUnits().size() );
    stringBuffer.append(TEXT_268);
    stringBuffer.append( indi.getSubUnits().size() );
    stringBuffer.append(TEXT_269);
     for (int i=0; i<indi.getSubUnits().size(); i++) { 
    stringBuffer.append(TEXT_270);
    stringBuffer.append( i);
    stringBuffer.append(TEXT_271);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_272);
    stringBuffer.append( unitConstants.get(indi.getSubUnits().get(i)) );
    stringBuffer.append(TEXT_273);
     } 
    stringBuffer.append(TEXT_274);
     } else if (unit instanceof LoopUnit) { 
    stringBuffer.append(TEXT_275);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_276);
    stringBuffer.append( unitConstants.get(((LoopUnit) unit).getSubUnit()) );
    stringBuffer.append(TEXT_277);
     } else if (unit instanceof Rule) { 
    stringBuffer.append(TEXT_278);
    stringBuffer.append( ruleData.get(unit).matchingSteps.size()-1 );
    stringBuffer.append(TEXT_279);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_280);
    stringBuffer.append( unitConstants.get(unit) );
    stringBuffer.append(TEXT_281);
     } 
    stringBuffer.append(TEXT_282);
     } // end for 
    stringBuffer.append(TEXT_283);
    stringBuffer.append(TEXT_284);
    return stringBuffer.toString();
  }
}
