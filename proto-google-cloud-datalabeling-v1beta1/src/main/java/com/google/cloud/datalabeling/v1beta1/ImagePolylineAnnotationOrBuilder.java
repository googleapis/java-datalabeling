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

public interface ImagePolylineAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code>
   *
   * @return Whether the polyline field is set.
   */
  boolean hasPolyline();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code>
   *
   * @return The polyline.
   */
  com.google.cloud.datalabeling.v1beta1.Polyline getPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.Polyline polyline = 2;</code> */
  com.google.cloud.datalabeling.v1beta1.PolylineOrBuilder getPolylineOrBuilder();

  /**
   * <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code>
   *
   * @return Whether the normalizedPolyline field is set.
   */
  boolean hasNormalizedPolyline();
  /**
   * <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code>
   *
   * @return The normalizedPolyline.
   */
  com.google.cloud.datalabeling.v1beta1.NormalizedPolyline getNormalizedPolyline();
  /** <code>.google.cloud.datalabeling.v1beta1.NormalizedPolyline normalized_polyline = 3;</code> */
  com.google.cloud.datalabeling.v1beta1.NormalizedPolylineOrBuilder
      getNormalizedPolylineOrBuilder();

  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return Whether the annotationSpec field is set.
   */
  boolean hasAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return The annotationSpec.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   *
   *
   * <pre>
   * Label of this polyline.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  public com.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotation.PolyCase getPolyCase();
}
