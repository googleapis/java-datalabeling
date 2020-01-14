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

/**
 *
 *
 * <pre>
 * Config for video object detection human labeling task.
 * Object detection will be conducted on the images extracted from the video,
 * and those objects will be labeled with bounding boxes.
 * User need to specify the number of images to be extracted per second as the
 * extraction frame rate.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ObjectDetectionConfig}
 */
public final class ObjectDetectionConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ObjectDetectionConfig)
    ObjectDetectionConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ObjectDetectionConfig.newBuilder() to construct.
  private ObjectDetectionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ObjectDetectionConfig() {
    annotationSpecSet_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ObjectDetectionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ObjectDetectionConfig(
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
              java.lang.String s = input.readStringRequireUtf8();

              annotationSpecSet_ = s;
              break;
            }
          case 25:
            {
              extractionFrameRate_ = input.readDouble();
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
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.class,
            com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.Builder.class);
  }

  public static final int ANNOTATION_SPEC_SET_FIELD_NUMBER = 1;
  private volatile java.lang.Object annotationSpecSet_;
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The annotationSpecSet.
   */
  public java.lang.String getAnnotationSpecSet() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      annotationSpecSet_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Annotation spec set resource name.
   * </pre>
   *
   * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for annotationSpecSet.
   */
  public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
    java.lang.Object ref = annotationSpecSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      annotationSpecSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTRACTION_FRAME_RATE_FIELD_NUMBER = 3;
  private double extractionFrameRate_;
  /**
   *
   *
   * <pre>
   * Required. Number of frames per second to be extracted from the video.
   * </pre>
   *
   * <code>double extraction_frame_rate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The extractionFrameRate.
   */
  public double getExtractionFrameRate() {
    return extractionFrameRate_;
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
    if (!getAnnotationSpecSetBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, annotationSpecSet_);
    }
    if (extractionFrameRate_ != 0D) {
      output.writeDouble(3, extractionFrameRate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAnnotationSpecSetBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, annotationSpecSet_);
    }
    if (extractionFrameRate_ != 0D) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(3, extractionFrameRate_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig other =
        (com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig) obj;

    if (!getAnnotationSpecSet().equals(other.getAnnotationSpecSet())) return false;
    if (java.lang.Double.doubleToLongBits(getExtractionFrameRate())
        != java.lang.Double.doubleToLongBits(other.getExtractionFrameRate())) return false;
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
    hash = (37 * hash) + ANNOTATION_SPEC_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAnnotationSpecSet().hashCode();
    hash = (37 * hash) + EXTRACTION_FRAME_RATE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getExtractionFrameRate()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig prototype) {
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
   * Config for video object detection human labeling task.
   * Object detection will be conducted on the images extracted from the video,
   * and those objects will be labeled with bounding boxes.
   * User need to specify the number of images to be extracted per second as the
   * extraction frame rate.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ObjectDetectionConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ObjectDetectionConfig)
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.class,
              com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.newBuilder()
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
      annotationSpecSet_ = "";

      extractionFrameRate_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig build() {
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig result =
          new com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig(this);
      result.annotationSpecSet_ = annotationSpecSet_;
      result.extractionFrameRate_ = extractionFrameRate_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig other) {
      if (other == com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig.getDefaultInstance())
        return this;
      if (!other.getAnnotationSpecSet().isEmpty()) {
        annotationSpecSet_ = other.annotationSpecSet_;
        onChanged();
      }
      if (other.getExtractionFrameRate() != 0D) {
        setExtractionFrameRate(other.getExtractionFrameRate());
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
      com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object annotationSpecSet_ = "";
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The annotationSpecSet.
     */
    public java.lang.String getAnnotationSpecSet() {
      java.lang.Object ref = annotationSpecSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        annotationSpecSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for annotationSpecSet.
     */
    public com.google.protobuf.ByteString getAnnotationSpecSetBytes() {
      java.lang.Object ref = annotationSpecSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        annotationSpecSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSet(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      annotationSpecSet_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnnotationSpecSet() {

      annotationSpecSet_ = getDefaultInstance().getAnnotationSpecSet();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Annotation spec set resource name.
     * </pre>
     *
     * <code>string annotation_spec_set = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for annotationSpecSet to set.
     * @return This builder for chaining.
     */
    public Builder setAnnotationSpecSetBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      annotationSpecSet_ = value;
      onChanged();
      return this;
    }

    private double extractionFrameRate_;
    /**
     *
     *
     * <pre>
     * Required. Number of frames per second to be extracted from the video.
     * </pre>
     *
     * <code>double extraction_frame_rate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The extractionFrameRate.
     */
    public double getExtractionFrameRate() {
      return extractionFrameRate_;
    }
    /**
     *
     *
     * <pre>
     * Required. Number of frames per second to be extracted from the video.
     * </pre>
     *
     * <code>double extraction_frame_rate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The extractionFrameRate to set.
     * @return This builder for chaining.
     */
    public Builder setExtractionFrameRate(double value) {

      extractionFrameRate_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Number of frames per second to be extracted from the video.
     * </pre>
     *
     * <code>double extraction_frame_rate = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExtractionFrameRate() {

      extractionFrameRate_ = 0D;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ObjectDetectionConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ObjectDetectionConfig)
  private static final com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig();
  }

  public static com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ObjectDetectionConfig> PARSER =
      new com.google.protobuf.AbstractParser<ObjectDetectionConfig>() {
        @java.lang.Override
        public ObjectDetectionConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ObjectDetectionConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ObjectDetectionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ObjectDetectionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ObjectDetectionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
