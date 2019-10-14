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
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ImageClassificationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImageClassificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   */
  java.lang.String getAnnotationSpecSet();
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1;</code>
   */
  com.google.protobuf.ByteString getAnnotationSpecSetBytes();

  /**
   *
   *
   * <pre>
   * Optional. If allow_multi_label is true, contributors are able to choose
   * multiple labels for one image.
   * </pre>
   *
   * <code>bool allow_multi_label = 2;</code>
   */
  boolean getAllowMultiLabel();

  /**
   *
   *
   * <pre>
   * Optional. The type of how to aggregate answers.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3;
   * </code>
   */
  int getAnswerAggregationTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of how to aggregate answers.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.StringAggregationType answer_aggregation_type = 3;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.StringAggregationType getAnswerAggregationType();
}
