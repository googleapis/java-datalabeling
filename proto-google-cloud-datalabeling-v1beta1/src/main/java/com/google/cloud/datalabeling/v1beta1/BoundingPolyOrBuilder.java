/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface BoundingPolyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.BoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> getVerticesList();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Vertex getVertices(int index);
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
      getVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VertexOrBuilder getVerticesOrBuilder(int index);
}
