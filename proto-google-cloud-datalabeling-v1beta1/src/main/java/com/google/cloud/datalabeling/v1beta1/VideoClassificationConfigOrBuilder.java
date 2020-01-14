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

public interface VideoClassificationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.VideoClassificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set configs.
   * Since watching a video clip takes much longer time than an image, we
   * support label with multiple AnnotationSpecSet at the same time. Labels
   * in each AnnotationSpecSet will be shown in a group to contributors.
   * Contributors can select one or more (depending on whether to allow multi
   * label) from each group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig annotation_spec_set_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          com.google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig>
      getAnnotationSpecSetConfigsList();
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set configs.
   * Since watching a video clip takes much longer time than an image, we
   * support label with multiple AnnotationSpecSet at the same time. Labels
   * in each AnnotationSpecSet will be shown in a group to contributors.
   * Contributors can select one or more (depending on whether to allow multi
   * label) from each group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig annotation_spec_set_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig
      getAnnotationSpecSetConfigs(int index);
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set configs.
   * Since watching a video clip takes much longer time than an image, we
   * support label with multiple AnnotationSpecSet at the same time. Labels
   * in each AnnotationSpecSet will be shown in a group to contributors.
   * Contributors can select one or more (depending on whether to allow multi
   * label) from each group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig annotation_spec_set_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getAnnotationSpecSetConfigsCount();
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set configs.
   * Since watching a video clip takes much longer time than an image, we
   * support label with multiple AnnotationSpecSet at the same time. Labels
   * in each AnnotationSpecSet will be shown in a group to contributors.
   * Contributors can select one or more (depending on whether to allow multi
   * label) from each group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig annotation_spec_set_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.datalabeling.v1beta1.VideoClassificationConfig
                  .AnnotationSpecSetConfigOrBuilder>
      getAnnotationSpecSetConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The list of annotation spec set configs.
   * Since watching a video clip takes much longer time than an image, we
   * support label with multiple AnnotationSpecSet at the same time. Labels
   * in each AnnotationSpecSet will be shown in a group to contributors.
   * Contributors can select one or more (depending on whether to allow multi
   * label) from each group.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfig annotation_spec_set_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.VideoClassificationConfig.AnnotationSpecSetConfigOrBuilder
      getAnnotationSpecSetConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Option to apply shot detection on the video.
   * </pre>
   *
   * <code>bool apply_shot_detection = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The applyShotDetection.
   */
  boolean getApplyShotDetection();
}
