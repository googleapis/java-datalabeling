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

/**
 *
 *
 * <pre>
 * Video event annotation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.VideoEventAnnotation}
 */
public final class VideoEventAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.VideoEventAnnotation)
    VideoEventAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use VideoEventAnnotation.newBuilder() to construct.
  private VideoEventAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VideoEventAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VideoEventAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private VideoEventAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder subBuilder = null;
              if (annotationSpec_ != null) {
                subBuilder = annotationSpec_.toBuilder();
              }
              annotationSpec_ =
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.AnnotationSpec.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(annotationSpec_);
                annotationSpec_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder subBuilder = null;
              if (timeSegment_ != null) {
                subBuilder = timeSegment_.toBuilder();
              }
              timeSegment_ =
                  input.readMessage(
                      com.google.cloud.datalabeling.v1beta1.TimeSegment.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(timeSegment_);
                timeSegment_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.class,
            com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.Builder.class);
  }

  public static final int ANNOTATION_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;
  /**
   *
   *
   * <pre>
   * Label of the event in this annotation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return Whether the annotationSpec field is set.
   */
  public boolean hasAnnotationSpec() {
    return annotationSpec_ != null;
  }
  /**
   *
   *
   * <pre>
   * Label of the event in this annotation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return The annotationSpec.
   */
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
    return annotationSpec_ == null
        ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
        : annotationSpec_;
  }
  /**
   *
   *
   * <pre>
   * Label of the event in this annotation.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder
      getAnnotationSpecOrBuilder() {
    return getAnnotationSpec();
  }

  public static final int TIME_SEGMENT_FIELD_NUMBER = 2;
  private com.google.cloud.datalabeling.v1beta1.TimeSegment timeSegment_;
  /**
   *
   *
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
   *
   * @return Whether the timeSegment field is set.
   */
  public boolean hasTimeSegment() {
    return timeSegment_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
   *
   * @return The timeSegment.
   */
  public com.google.cloud.datalabeling.v1beta1.TimeSegment getTimeSegment() {
    return timeSegment_ == null
        ? com.google.cloud.datalabeling.v1beta1.TimeSegment.getDefaultInstance()
        : timeSegment_;
  }
  /**
   *
   *
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
   */
  public com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder getTimeSegmentOrBuilder() {
    return getTimeSegment();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (annotationSpec_ != null) {
      output.writeMessage(1, getAnnotationSpec());
    }
    if (timeSegment_ != null) {
      output.writeMessage(2, getTimeSegment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (annotationSpec_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAnnotationSpec());
    }
    if (timeSegment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTimeSegment());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation other =
        (com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation) obj;

    if (hasAnnotationSpec() != other.hasAnnotationSpec()) return false;
    if (hasAnnotationSpec()) {
      if (!getAnnotationSpec().equals(other.getAnnotationSpec())) return false;
    }
    if (hasTimeSegment() != other.hasTimeSegment()) return false;
    if (hasTimeSegment()) {
      if (!getTimeSegment().equals(other.getTimeSegment())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAnnotationSpec()) {
      hash = (37 * hash) + ANNOTATION_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpec().hashCode();
    }
    if (hasTimeSegment()) {
      hash = (37 * hash) + TIME_SEGMENT_FIELD_NUMBER;
      hash = (53 * hash) + getTimeSegment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Video event annotation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.VideoEventAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.VideoEventAnnotation)
      com.google.cloud.datalabeling.v1beta1.VideoEventAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.class,
              com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (annotationSpecBuilder_ == null) {
        annotationSpec_ = null;
      } else {
        annotationSpec_ = null;
        annotationSpecBuilder_ = null;
      }
      if (timeSegmentBuilder_ == null) {
        timeSegment_ = null;
      } else {
        timeSegment_ = null;
        timeSegmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation build() {
      com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation buildPartial() {
      com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation result =
          new com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation(this);
      if (annotationSpecBuilder_ == null) {
        result.annotationSpec_ = annotationSpec_;
      } else {
        result.annotationSpec_ = annotationSpecBuilder_.build();
      }
      if (timeSegmentBuilder_ == null) {
        result.timeSegment_ = timeSegment_;
      } else {
        result.timeSegment_ = timeSegmentBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation other) {
      if (other == com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation.getDefaultInstance())
        return this;
      if (other.hasAnnotationSpec()) {
        mergeAnnotationSpec(other.getAnnotationSpec());
      }
      if (other.hasTimeSegment()) {
        mergeTimeSegment(other.getTimeSegment());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.datalabeling.v1beta1.AnnotationSpec annotationSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>
        annotationSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     *
     * @return Whether the annotationSpec field is set.
     */
    public boolean hasAnnotationSpec() {
      return annotationSpecBuilder_ != null || annotationSpec_ != null;
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     *
     * @return The annotationSpec.
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec() {
      if (annotationSpecBuilder_ == null) {
        return annotationSpec_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
            : annotationSpec_;
      } else {
        return annotationSpecBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotationSpec_ = value;
        onChanged();
      } else {
        annotationSpecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder setAnnotationSpec(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder builderForValue) {
      if (annotationSpecBuilder_ == null) {
        annotationSpec_ = builderForValue.build();
        onChanged();
      } else {
        annotationSpecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder mergeAnnotationSpec(com.google.cloud.datalabeling.v1beta1.AnnotationSpec value) {
      if (annotationSpecBuilder_ == null) {
        if (annotationSpec_ != null) {
          annotationSpec_ =
              com.google.cloud.datalabeling.v1beta1.AnnotationSpec.newBuilder(annotationSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          annotationSpec_ = value;
        }
        onChanged();
      } else {
        annotationSpecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public Builder clearAnnotationSpec() {
      if (annotationSpecBuilder_ == null) {
        annotationSpec_ = null;
        onChanged();
      } else {
        annotationSpec_ = null;
        annotationSpecBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder getAnnotationSpecBuilder() {

      onChanged();
      return getAnnotationSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder
        getAnnotationSpecOrBuilder() {
      if (annotationSpecBuilder_ != null) {
        return annotationSpecBuilder_.getMessageOrBuilder();
      } else {
        return annotationSpec_ == null
            ? com.google.cloud.datalabeling.v1beta1.AnnotationSpec.getDefaultInstance()
            : annotationSpec_;
      }
    }
    /**
     *
     *
     * <pre>
     * Label of the event in this annotation.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>
        getAnnotationSpecFieldBuilder() {
      if (annotationSpecBuilder_ == null) {
        annotationSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.AnnotationSpec,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpec.Builder,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder>(
                getAnnotationSpec(), getParentForChildren(), isClean());
        annotationSpec_ = null;
      }
      return annotationSpecBuilder_;
    }

    private com.google.cloud.datalabeling.v1beta1.TimeSegment timeSegment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.TimeSegment,
            com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder,
            com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder>
        timeSegmentBuilder_;
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     *
     * @return Whether the timeSegment field is set.
     */
    public boolean hasTimeSegment() {
      return timeSegmentBuilder_ != null || timeSegment_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     *
     * @return The timeSegment.
     */
    public com.google.cloud.datalabeling.v1beta1.TimeSegment getTimeSegment() {
      if (timeSegmentBuilder_ == null) {
        return timeSegment_ == null
            ? com.google.cloud.datalabeling.v1beta1.TimeSegment.getDefaultInstance()
            : timeSegment_;
      } else {
        return timeSegmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public Builder setTimeSegment(com.google.cloud.datalabeling.v1beta1.TimeSegment value) {
      if (timeSegmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        timeSegment_ = value;
        onChanged();
      } else {
        timeSegmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public Builder setTimeSegment(
        com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder builderForValue) {
      if (timeSegmentBuilder_ == null) {
        timeSegment_ = builderForValue.build();
        onChanged();
      } else {
        timeSegmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public Builder mergeTimeSegment(com.google.cloud.datalabeling.v1beta1.TimeSegment value) {
      if (timeSegmentBuilder_ == null) {
        if (timeSegment_ != null) {
          timeSegment_ =
              com.google.cloud.datalabeling.v1beta1.TimeSegment.newBuilder(timeSegment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          timeSegment_ = value;
        }
        onChanged();
      } else {
        timeSegmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public Builder clearTimeSegment() {
      if (timeSegmentBuilder_ == null) {
        timeSegment_ = null;
        onChanged();
      } else {
        timeSegment_ = null;
        timeSegmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder getTimeSegmentBuilder() {

      onChanged();
      return getTimeSegmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder getTimeSegmentOrBuilder() {
      if (timeSegmentBuilder_ != null) {
        return timeSegmentBuilder_.getMessageOrBuilder();
      } else {
        return timeSegment_ == null
            ? com.google.cloud.datalabeling.v1beta1.TimeSegment.getDefaultInstance()
            : timeSegment_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time segment of the video to which the annotation applies.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.TimeSegment,
            com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder,
            com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder>
        getTimeSegmentFieldBuilder() {
      if (timeSegmentBuilder_ == null) {
        timeSegmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.TimeSegment,
                com.google.cloud.datalabeling.v1beta1.TimeSegment.Builder,
                com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder>(
                getTimeSegment(), getParentForChildren(), isClean());
        timeSegment_ = null;
      }
      return timeSegmentBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.VideoEventAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.VideoEventAnnotation)
  private static final com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation();
  }

  public static com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoEventAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<VideoEventAnnotation>() {
        @java.lang.Override
        public VideoEventAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new VideoEventAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<VideoEventAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoEventAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.VideoEventAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
