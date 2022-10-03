/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Results for listing evaluation jobs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse}
 */
public final class ListEvaluationJobsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)
    ListEvaluationJobsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListEvaluationJobsResponse.newBuilder() to construct.
  private ListEvaluationJobsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListEvaluationJobsResponse() {
    evaluationJobs_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListEvaluationJobsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListEvaluationJobsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListEvaluationJobsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.class,
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.Builder.class);
  }

  public static final int EVALUATION_JOBS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob> evaluationJobs_;
  /**
   *
   *
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getEvaluationJobsList() {
    return evaluationJobs_;
  }
  /**
   *
   *
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
      getEvaluationJobsOrBuilderList() {
    return evaluationJobs_;
  }
  /**
   *
   *
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  @java.lang.Override
  public int getEvaluationJobsCount() {
    return evaluationJobs_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJobs(int index) {
    return evaluationJobs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of evaluation jobs to return.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getEvaluationJobsOrBuilder(
      int index) {
    return evaluationJobs_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < evaluationJobs_.size(); i++) {
      output.writeMessage(1, evaluationJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < evaluationJobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, evaluationJobs_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse other =
        (com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse) obj;

    if (!getEvaluationJobsList().equals(other.getEvaluationJobsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getEvaluationJobsCount() > 0) {
      hash = (37 * hash) + EVALUATION_JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluationJobsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse prototype) {
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
   * Results for listing evaluation jobs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)
      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListEvaluationJobsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListEvaluationJobsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.class,
              com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (evaluationJobsBuilder_ == null) {
        evaluationJobs_ = java.util.Collections.emptyList();
      } else {
        evaluationJobs_ = null;
        evaluationJobsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListEvaluationJobsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse build() {
      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse result =
          new com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse(this);
      int from_bitField0_ = bitField0_;
      if (evaluationJobsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          evaluationJobs_ = java.util.Collections.unmodifiableList(evaluationJobs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.evaluationJobs_ = evaluationJobs_;
      } else {
        result.evaluationJobs_ = evaluationJobsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse.getDefaultInstance())
        return this;
      if (evaluationJobsBuilder_ == null) {
        if (!other.evaluationJobs_.isEmpty()) {
          if (evaluationJobs_.isEmpty()) {
            evaluationJobs_ = other.evaluationJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEvaluationJobsIsMutable();
            evaluationJobs_.addAll(other.evaluationJobs_);
          }
          onChanged();
        }
      } else {
        if (!other.evaluationJobs_.isEmpty()) {
          if (evaluationJobsBuilder_.isEmpty()) {
            evaluationJobsBuilder_.dispose();
            evaluationJobsBuilder_ = null;
            evaluationJobs_ = other.evaluationJobs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            evaluationJobsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEvaluationJobsFieldBuilder()
                    : null;
          } else {
            evaluationJobsBuilder_.addAllMessages(other.evaluationJobs_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                com.google.cloud.datalabeling.v1beta1.EvaluationJob m =
                    input.readMessage(
                        com.google.cloud.datalabeling.v1beta1.EvaluationJob.parser(),
                        extensionRegistry);
                if (evaluationJobsBuilder_ == null) {
                  ensureEvaluationJobsIsMutable();
                  evaluationJobs_.add(m);
                } else {
                  evaluationJobsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob> evaluationJobs_ =
        java.util.Collections.emptyList();

    private void ensureEvaluationJobsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        evaluationJobs_ =
            new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.EvaluationJob>(
                evaluationJobs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
            com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
        evaluationJobsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        getEvaluationJobsList() {
      if (evaluationJobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(evaluationJobs_);
      } else {
        return evaluationJobsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public int getEvaluationJobsCount() {
      if (evaluationJobsBuilder_ == null) {
        return evaluationJobs_.size();
      } else {
        return evaluationJobsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJobs(int index) {
      if (evaluationJobsBuilder_ == null) {
        return evaluationJobs_.get(index);
      } else {
        return evaluationJobsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder setEvaluationJobs(
        int index, com.google.cloud.datalabeling.v1beta1.EvaluationJob value) {
      if (evaluationJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.set(index, value);
        onChanged();
      } else {
        evaluationJobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder setEvaluationJobs(
        int index, com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder builderForValue) {
      if (evaluationJobsBuilder_ == null) {
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        evaluationJobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder addEvaluationJobs(com.google.cloud.datalabeling.v1beta1.EvaluationJob value) {
      if (evaluationJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.add(value);
        onChanged();
      } else {
        evaluationJobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder addEvaluationJobs(
        int index, com.google.cloud.datalabeling.v1beta1.EvaluationJob value) {
      if (evaluationJobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.add(index, value);
        onChanged();
      } else {
        evaluationJobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder addEvaluationJobs(
        com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder builderForValue) {
      if (evaluationJobsBuilder_ == null) {
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.add(builderForValue.build());
        onChanged();
      } else {
        evaluationJobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder addEvaluationJobs(
        int index, com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder builderForValue) {
      if (evaluationJobsBuilder_ == null) {
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        evaluationJobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder addAllEvaluationJobs(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.EvaluationJob> values) {
      if (evaluationJobsBuilder_ == null) {
        ensureEvaluationJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, evaluationJobs_);
        onChanged();
      } else {
        evaluationJobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder clearEvaluationJobs() {
      if (evaluationJobsBuilder_ == null) {
        evaluationJobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        evaluationJobsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public Builder removeEvaluationJobs(int index) {
      if (evaluationJobsBuilder_ == null) {
        ensureEvaluationJobsIsMutable();
        evaluationJobs_.remove(index);
        onChanged();
      } else {
        evaluationJobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder getEvaluationJobsBuilder(
        int index) {
      return getEvaluationJobsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getEvaluationJobsOrBuilder(
        int index) {
      if (evaluationJobsBuilder_ == null) {
        return evaluationJobs_.get(index);
      } else {
        return evaluationJobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
        getEvaluationJobsOrBuilderList() {
      if (evaluationJobsBuilder_ != null) {
        return evaluationJobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(evaluationJobs_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder addEvaluationJobsBuilder() {
      return getEvaluationJobsFieldBuilder()
          .addBuilder(com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder addEvaluationJobsBuilder(
        int index) {
      return getEvaluationJobsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datalabeling.v1beta1.EvaluationJob.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of evaluation jobs to return.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.EvaluationJob evaluation_jobs = 1;</code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder>
        getEvaluationJobsBuilderList() {
      return getEvaluationJobsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
            com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>
        getEvaluationJobsFieldBuilder() {
      if (evaluationJobsBuilder_ == null) {
        evaluationJobsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.EvaluationJob,
                com.google.cloud.datalabeling.v1beta1.EvaluationJob.Builder,
                com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder>(
                evaluationJobs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        evaluationJobs_ = null;
      }
      return evaluationJobsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve next page of results.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse)
  private static final com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse();
  }

  public static com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEvaluationJobsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListEvaluationJobsResponse>() {
        @java.lang.Override
        public ListEvaluationJobsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ListEvaluationJobsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEvaluationJobsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
