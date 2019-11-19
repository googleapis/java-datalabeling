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

public interface HumanAnnotationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.HumanAnnotationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Instruction resource name.
   * </pre>
   *
   * <code>string instruction = 1;</code>
   */
  java.lang.String getInstruction();
  /**
   *
   *
   * <pre>
   * Required. Instruction resource name.
   * </pre>
   *
   * <code>string instruction = 1;</code>
   */
  com.google.protobuf.ByteString getInstructionBytes();

  /**
   *
   *
   * <pre>
   * Required. A human-readable name for AnnotatedDataset defined by
   * users. Maximum of 64 characters
   * .
   * </pre>
   *
   * <code>string annotated_dataset_display_name = 2;</code>
   */
  java.lang.String getAnnotatedDatasetDisplayName();
  /**
   *
   *
   * <pre>
   * Required. A human-readable name for AnnotatedDataset defined by
   * users. Maximum of 64 characters
   * .
   * </pre>
   *
   * <code>string annotated_dataset_display_name = 2;</code>
   */
  com.google.protobuf.ByteString getAnnotatedDatasetDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable description for AnnotatedDataset.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string annotated_dataset_description = 3;</code>
   */
  java.lang.String getAnnotatedDatasetDescription();
  /**
   *
   *
   * <pre>
   * Optional. A human-readable description for AnnotatedDataset.
   * The description can be up to 10000 characters long.
   * </pre>
   *
   * <code>string annotated_dataset_description = 3;</code>
   */
  com.google.protobuf.ByteString getAnnotatedDatasetDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. A human-readable label used to logically group labeling tasks.
   * This string must match the regular expression `[a-zA-Z&#92;&#92;d_-]{0,128}`.
   * </pre>
   *
   * <code>string label_group = 4;</code>
   */
  java.lang.String getLabelGroup();
  /**
   *
   *
   * <pre>
   * Optional. A human-readable label used to logically group labeling tasks.
   * This string must match the regular expression `[a-zA-Z&#92;&#92;d_-]{0,128}`.
   * </pre>
   *
   * <code>string label_group = 4;</code>
   */
  com.google.protobuf.ByteString getLabelGroupBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Language of this question, as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * Default value is en-US.
   * Only need to set this when task is language related. For example, French
   * text classification.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The Language of this question, as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt).
   * Default value is en-US.
   * Only need to set this when task is language related. For example, French
   * text classification.
   * </pre>
   *
   * <code>string language_code = 5;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Replication of questions. Each question will be sent to up to
   * this number of contributors to label. Aggregated answers will be returned.
   * Default is set to 1.
   * For image related labeling, valid values are 1, 3, 5.
   * </pre>
   *
   * <code>int32 replica_count = 6;</code>
   */
  int getReplicaCount();

  /**
   *
   *
   * <pre>
   * Optional. Maximum duration for contributors to answer a question. Default
   * is 1800 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration question_duration = 7;</code>
   */
  boolean hasQuestionDuration();
  /**
   *
   *
   * <pre>
   * Optional. Maximum duration for contributors to answer a question. Default
   * is 1800 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration question_duration = 7;</code>
   */
  com.google.protobuf.Duration getQuestionDuration();
  /**
   *
   *
   * <pre>
   * Optional. Maximum duration for contributors to answer a question. Default
   * is 1800 seconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration question_duration = 7;</code>
   */
  com.google.protobuf.DurationOrBuilder getQuestionDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If you want your own labeling contributors to manage and work on
   * this labeling request, you can set these contributors here. We will give
   * them access to the question types in crowdcompute. Note that these
   * emails must be registered in crowdcompute worker UI:
   * https://crowd-compute.appspot.com/
   * </pre>
   *
   * <code>repeated string contributor_emails = 9;</code>
   */
  java.util.List<java.lang.String> getContributorEmailsList();
  /**
   *
   *
   * <pre>
   * Optional. If you want your own labeling contributors to manage and work on
   * this labeling request, you can set these contributors here. We will give
   * them access to the question types in crowdcompute. Note that these
   * emails must be registered in crowdcompute worker UI:
   * https://crowd-compute.appspot.com/
   * </pre>
   *
   * <code>repeated string contributor_emails = 9;</code>
   */
  int getContributorEmailsCount();
  /**
   *
   *
   * <pre>
   * Optional. If you want your own labeling contributors to manage and work on
   * this labeling request, you can set these contributors here. We will give
   * them access to the question types in crowdcompute. Note that these
   * emails must be registered in crowdcompute worker UI:
   * https://crowd-compute.appspot.com/
   * </pre>
   *
   * <code>repeated string contributor_emails = 9;</code>
   */
  java.lang.String getContributorEmails(int index);
  /**
   *
   *
   * <pre>
   * Optional. If you want your own labeling contributors to manage and work on
   * this labeling request, you can set these contributors here. We will give
   * them access to the question types in crowdcompute. Note that these
   * emails must be registered in crowdcompute worker UI:
   * https://crowd-compute.appspot.com/
   * </pre>
   *
   * <code>repeated string contributor_emails = 9;</code>
   */
  com.google.protobuf.ByteString getContributorEmailsBytes(int index);

  /**
   *
   *
   * <pre>
   * Email of the user who started the labeling task and should be notified by
   * email. If empty no notification will be sent.
   * </pre>
   *
   * <code>string user_email_address = 10;</code>
   */
  java.lang.String getUserEmailAddress();
  /**
   *
   *
   * <pre>
   * Email of the user who started the labeling task and should be notified by
   * email. If empty no notification will be sent.
   * </pre>
   *
   * <code>string user_email_address = 10;</code>
   */
  com.google.protobuf.ByteString getUserEmailAddressBytes();
}
