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

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import org.apache.giraph.aggregators.BasicAggregator;
import org.apache.giraph.edge.Edge;
import org.apache.giraph.edge.EdgeFactory;
import org.apache.giraph.graph.Vertex;
import org.apache.giraph.io.formats.TextVertexInputFormat;
import org.apache.giraph.io.formats.TextVertexOutputFormat;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.ByteWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.InputSplit;
import org.apache.hadoop.mapreduce.TaskAttemptContext;
import org.json.JSONArray;
import org.json.JSONException;

import com.google.common.collect.Lists;

/**
 * Henshin utility classes and methods.
 */
public class HenshinUtil {

  /**
   * Length of integers in bytes.
   */
  private static final int INT_LENGTH = Integer.SIZE / Byte.SIZE;

  /**
   * Private constructor.
   */
  private HenshinUtil() {
    // Prevent instantiation
  }

  /**
   * Remove duplicate matches.
   * @param matches List of matches.
   * @return Filtered list.
   */
  public static List<Match> removeDuplicateMatches(Iterable<Match> matches) {
    Set<Match> result = new LinkedHashSet<Match>();
    for (Match m : matches) {
      result.add(m);
    }
    return new ArrayList<Match>(result);
  }

  /**
   * Remove non-injective matches.
   * @param matches List of matches.
   * @return Filtered list.
   */
  public static List<Match> removeNonInjectiveMatches(Iterable<Match> matches) {
    List<Match> result = new ArrayList<Match>();
    for (Match m : matches) {
      if (m.isInjective()) {
        result.add(m);
      }
    }
    return result;
  }

  /**
   * Henshin data.
   */
  public abstract static class Bytes extends BytesWritable {

    /**
     * Default constructor.
     */
    public Bytes() {
      super();
    }

    /**
     * Extra constructor.
     * @param data The data.
     */
    public Bytes(byte[] data) {
      super(data);
    }

    /**
     * Set the size.
     * @param size The new size.
     */
    @Override
    public void setSize(int size) {
      if (size != getCapacity()) {
        setCapacity(size);
      }
      super.setSize(size);
    }

    /**
     * Pretty-print this bytes object.
     * @return The printed string.
     */
    @Override
    public String toString() {
      byte[] bytes = getBytes();
      StringBuffer result = new StringBuffer();
      for (int i = 0; i < bytes.length; i++) {
        result.append(bytes[i]);
        if (i < bytes.length - 1) {
          result.append(",");
        }
      }
      return "[" + result + "]";
    }

  }

  /**
   * Henshin vertex ID.
   */
  public static class VertexId extends Bytes {

    /**
     * Default constructor.
     */
    public VertexId() {
      super();
    }

    /**
     * Extra constructor.
     * @param data The data.
     */
    public VertexId(byte[] data) {
      super(data);
    }

    /**
     * Create a new random vertex ID.
     * The vertex ID is derived from a random UUID.
     * @return The new vertex ID.
     */
    public static VertexId randomVertexId() {
      UUID uuid = UUID.randomUUID();
      byte[] bytes = new byte[(Long.SIZE / Byte.SIZE) * 2];
      ByteBuffer buffer = ByteBuffer.wrap(bytes);
      LongBuffer longBuffer = buffer.asLongBuffer();
      longBuffer.put(new long[] {
        uuid.getMostSignificantBits(),
        uuid.getLeastSignificantBits()
      });
      return new VertexId(bytes);
    }

    /**
     * Create an extended version of this vertex ID.
     * @param value The value to be appended to this vertex ID.
     * @return The extended version of this vertex ID.
     */
    public VertexId append(byte value) {
      byte[] bytes = getBytes();
      bytes = Arrays.copyOf(bytes, bytes.length + 1);
      bytes[bytes.length - 1] = value;
      return new VertexId(bytes);
    }

  }

  /**
   * Henshin match object.
   */
  public static class Match extends Bytes {

    /**
     * Empty match.
     */
    public static final Match EMPTY = new Match();

    /**
     * Default constructor.
     */
    public Match() {
      super();
    }

    /**
     * Extra constructor.
     * @param segment The segment of this match.
     */
    public Match(int segment) {
      super(new byte[] {
        (byte) (segment >>> 24),
        (byte) (segment >>> 16),
        (byte) (segment >>> 8),
        (byte) segment });
    }

    /**
     * Extra constructor.
     * @param data The data.
     */
    public Match(byte[] data) {
      super(data);
    }

    /**
     * Get the segment of this match.
     * @return The segment.
     */
    public int getSegment() {
      byte[] bytes = getBytes();
      return bytes[0] << 24 |
        (bytes[1] & 0xFF) << 16 |
        (bytes[2] & 0xFF) << 8 |
        (bytes[3] & 0xFF);
    }

    /**
     * Get the size of this match.
     * @return The match size.
     */
    public int getMatchSize() {
      byte[] bytes = getBytes();
      int d = 4;
      int size = 0;
      while (d < bytes.length) {
        d += bytes[d] + 1;
        size++;
      }
      return size;
    }

    /**
     * Get the vertex ID of a matched node.
     * @param vertexIndex Index of the next vertex.
     * @return The vertex ID.
     */
    public VertexId getVertexId(int vertexIndex) {
      byte[] bytes = getBytes();
      int d = 4;
      for (int i = 0; i < vertexIndex; i++) {
        if (d >= bytes.length) {
          return null;
        }
        d += bytes[d] + 1;
      }
      if (d >= bytes.length) {
        return null;
      }
      return new VertexId(
        Arrays.copyOfRange(bytes, d + 1, d + 1 + bytes[d]));
    }

    /**
     * Get the index of a vertex ID of a matched node.
     * @param vertexId A vertex ID.
     * @return The index of the vertex ID or -1.
     */
    public int indexOf(VertexId vertexId) {
      int i = 0;
      VertexId id;
      do {
        id = getVertexId(i);
        if (vertexId.equals(id)) {
          return i;
        }
        i++;
      } while (id != null);
      return -1;
    }

    /**
     * Returns true if this match is injective.
     * @return true if this match is injective.
     */
    public boolean isInjective() {
      Set<VertexId> ids = new HashSet<VertexId>();
      int i = 0;
      VertexId id;
      do {
        id = getVertexId(i++);
        if (id != null && !ids.add(id)) {
          return false;
        }
      } while (id != null);
      return true;
    }

    /**
     * Create an extended version of this (partial) match.
     * @param vertexId The ID of the next matched vertex.
     * @return The extended match object.
     */
    public Match append(VertexId vertexId) {
      byte[] bytes = getBytes();
      byte[] id = vertexId.getBytes();
      byte[] result = Arrays.copyOf(bytes, bytes.length + 1 + id.length);
      result[bytes.length] = (byte) id.length;
      System.arraycopy(id, 0, result, bytes.length + 1, id.length);
      return new Match(result);
    }

    /**
     * Create an extended version of this (partial) match.
     * @param match Another partial match for the next matched vertices.
     * @return The extended match object.
     */
    public Match append(Match match) {
      byte[] bytes1 = getBytes();
      byte[] bytes2 = match.getBytes();
      bytes1 = Arrays.copyOf(bytes1, bytes1.length + bytes2.length - 4);
      System.arraycopy(bytes2, 4,
        bytes1, bytes1.length - bytes2.length + 4, bytes2.length - 4);
      return new Match(bytes1);
    }

    /**
     * Remove a vertex ID of a matched node.
     * @param vertexIndex Index of the vertex ID.
     * @return The new match.
     */
    public Match remove(int vertexIndex) {
      byte[] bytes = getBytes();
      int d = 4;
      for (int i = 0; i < vertexIndex; i++) {
        if (d >= bytes.length) {
          return null;
        }
        d += bytes[d] + 1;
      }
      if (d >= bytes.length) {
        return null;
      }
      byte[] result = Arrays.copyOf(bytes, bytes.length - bytes[d] - 1);
      if (d < result.length) {
        System.arraycopy(bytes, d + 1 + bytes[d],
          result, d, result.length - d);
      }
      return new Match(result);
    }

    /**
     * Create a copy of this match.
     * @return The copy.
     */
    public Match copy() {
      return new Match(getBytes());
    }

    /**
     * Pretty-print this match.
     * @return The printed string.
     */
    @Override
    public String toString() {
      byte[] bytes = getBytes();
      StringBuffer result = new StringBuffer();
      int i = 4;
      while (i < bytes.length) {
        int len = bytes[i++];
        result.append("[");
        for (int j = 0; j < len; j++) {
          result.append(bytes[i + j]);
          if (j < len - 1) {
            result.append(",");
          }
        }
        result.append("]");
        i += len;
        if (i < bytes.length - 1) {
          result.append(",");
        }
      }
      if (bytes.length > 0) {
        return getSegment() + ":[" + result + "]";
      } else {
        return "[" + result + "]";
      }
    }

  }

  /**
   * Henshin application stack.
   */
  public static class ApplicationStack extends Bytes {

    /**
     * Default constructor.
     */
    public ApplicationStack() {
      super();
    }

    /**
     * Extra constructor.
     * @param data The data.
     */
    public ApplicationStack(byte[] data) {
      super(data);
    }

    /**
     * Get the size of this application stack.
     * @return the size of this application stack.
     */
    public int getStackSize() {
      return (getBytes().length / INT_LENGTH) / 3;
    }

    /**
     * Get the unit index at an absolute position.
     * @param position An absolute position in the stack.
     * @return the unit index or -1.
     */
    public int getUnit(int position) {
      IntBuffer intBuf = ByteBuffer.wrap(getBytes()).asIntBuffer();
      if (position < 0 || position * 3 >= intBuf.limit()) {
        return -1;
      }
      return intBuf.get(position * 3);
    }

    /**
     * Get the segment index at an absolute position.
     * @param position An absolute position in the stack.
     * @return the segment index or -1.
     */
    public int getSegment(int position) {
      IntBuffer intBuf = ByteBuffer.wrap(getBytes()).asIntBuffer();
      if (position < 0 || (position * 3) + 1 >= intBuf.limit()) {
        return -1;
      }
      return intBuf.get((position * 3) + 1);
    }

    /**
     * Get the microstep at an absolute position.
     * @param position An absolute position in the stack.
     * @return the microstp or -1.
     */
    public int getMicrostep(int position) {
      IntBuffer intBuf = ByteBuffer.wrap(getBytes()).asIntBuffer();
      if (position < 0 || (position * 3) + 2 >= intBuf.limit()) {
        return -1;
      }
      return intBuf.get((position * 3) + 2);
    }

    /**
     * Get the unit index at the last position.
     * @return the unit index or -1.
     */
    public int getLastUnit() {
      return getUnit(getStackSize() - 1);
    }

    /**
     * Get the segment index at the last position.
     * @return the segment index or -1.
     */
    public int getLastSegment() {
      return getSegment(getStackSize() - 1);
    }

    /**
     * Get the microstep at the last position.
     * @return the microstep or -1.
     */
    public int getLastMicrostep() {
      return getMicrostep(getStackSize() - 1);
    }

    /**
     * Create an extended version of this application stack.
     * @param unit The new unit index.
     * @param segment The new segment index.
     * @param microstep The new microstep.
     * @return The extended version of this application stack.
     */
    public ApplicationStack append(int unit, int segment, int microstep) {
      byte[] bytes = getBytes();
      bytes = Arrays.copyOf(bytes, bytes.length + (INT_LENGTH * 3));
      IntBuffer intBuffer = ByteBuffer.wrap(bytes).asIntBuffer();
      intBuffer.put((bytes.length / INT_LENGTH) - 3, unit);
      intBuffer.put((bytes.length / INT_LENGTH) - 2, segment);
      intBuffer.put((bytes.length / INT_LENGTH) - 1, microstep);
      return new ApplicationStack(bytes);
    }

    /**
     * Create a new version of this application stack without the last entry.
     * @return The new version of this application stack.
     */
    public ApplicationStack removeLast() {
      byte[] bytes = getBytes();
      bytes = Arrays.copyOf(bytes,
        Math.max(0, bytes.length - (INT_LENGTH * 3)));
      return new ApplicationStack(bytes);
    }

  }

  /**
   * Aggregator class for application stacks.
   */
  public static class ApplicationStackAggregator extends
    BasicAggregator<ApplicationStack> {

    @Override
    public void aggregate(ApplicationStack stack) {
      setAggregatedValue(stack);
    }

    @Override
    public ApplicationStack createInitialValue() {
      return new ApplicationStack();
    }

  }

  /**
   * Henshin input format.
   */
  public static class InputFormat extends
    TextVertexInputFormat<VertexId, ByteWritable, ByteWritable> {

    @Override
    public TextVertexReader createVertexReader(InputSplit split,
      TaskAttemptContext context) {
      return new InputReader();
    }

    /**
     * Henshin input reader.
     */
    class InputReader extends
      TextVertexReaderFromEachLineProcessedHandlingExceptions<JSONArray,
        JSONException> {

      @Override
      protected JSONArray preprocessLine(Text line) throws JSONException {
        return new JSONArray(line.toString());
      }

      @Override
      protected VertexId getId(JSONArray jsonVertex)
        throws JSONException, IOException {
        return jsonArrayToVertexId(jsonVertex.getJSONArray(0));
      }

      /**
       * Convert a JSON array to a VertexId object.
       * @param jsonArray The JSON array to be converted.
       * @return The corresponding VertexId.
       */
      private VertexId jsonArrayToVertexId(JSONArray jsonArray)
        throws JSONException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (int i = 0; i < jsonArray.length(); i++) {
          int value = jsonArray.getInt(i);
          if (value < 256) {
            out.write(value);
          } else {
            out.write(value >> 24);
            out.write(value >> 16);
            out.write(value >> 8);
            out.write(value);
          }
        }
        return new VertexId(out.toByteArray());
      }

      @Override
      protected ByteWritable getValue(JSONArray jsonVertex)
        throws JSONException, IOException {
        return new ByteWritable((byte) jsonVertex.getInt(1));
      }

      @Override
      protected Iterable<Edge<VertexId, ByteWritable>> getEdges(
        JSONArray jsonVertex) throws JSONException, IOException {
        JSONArray jsonEdgeArray = jsonVertex.getJSONArray(2);
        List<Edge<VertexId, ByteWritable>> edges =
          Lists.newArrayListWithCapacity(jsonEdgeArray.length());
        for (int i = 0; i < jsonEdgeArray.length(); ++i) {
          JSONArray jsonEdge = jsonEdgeArray.getJSONArray(i);
          edges.add(EdgeFactory.create(
            jsonArrayToVertexId(jsonEdge.getJSONArray(0)),
            new ByteWritable((byte) jsonEdge.getInt(1))));
        }
        return edges;
      }

      @Override
      protected Vertex<VertexId, ByteWritable, ByteWritable>
      handleException(Text line, JSONArray jsonVertex, JSONException e) {
        throw new IllegalArgumentException(
          "Couldn't get vertex from line " + line, e);
      }
    }
  }

  /**
   * Henshin output format.
   */
  public static class OutputFormat extends
    TextVertexOutputFormat<VertexId, ByteWritable, ByteWritable> {

    @Override
    public TextVertexWriter createVertexWriter(TaskAttemptContext context)
      throws IOException, InterruptedException {
      return new OutputWriter();
    }

    /**
     * Henshin output writer.
     */
    class OutputWriter extends TextVertexWriterToEachLine {

      @Override
      protected Text convertVertexToLine(
        Vertex<VertexId, ByteWritable, ByteWritable> vertex)
        throws IOException {

        JSONArray vertexArray = new JSONArray();
        JSONArray idArray = new JSONArray();
        byte[] id = vertex.getId().getBytes();
        for (int i = 0; i < id.length; i++) {
          idArray.put(id[i]);
        }
        vertexArray.put(idArray);
        vertexArray.put(vertex.getValue().get());
        JSONArray allEdgesArray = new JSONArray();
        for (Edge<VertexId, ByteWritable> edge : vertex.getEdges()) {
          JSONArray edgeArray = new JSONArray();
          JSONArray targetIdArray = new JSONArray();
          byte[] targetId = edge.getTargetVertexId().getBytes();
          for (int i = 0; i < targetId.length; i++) {
            targetIdArray.put(targetId[i]);
          }
          edgeArray.put(targetIdArray);
          edgeArray.put(edge.getValue().get());
          allEdgesArray.put(edgeArray);
        }
        vertexArray.put(allEdgesArray);
        return new Text(vertexArray.toString());
      }
    }
  }

}
