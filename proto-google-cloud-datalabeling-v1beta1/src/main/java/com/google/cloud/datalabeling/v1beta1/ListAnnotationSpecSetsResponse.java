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
 * Results of listing annotation spec set under a project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse}
 */
public final class ListAnnotationSpecSetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)
    ListAnnotationSpecSetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListAnnotationSpecSetsResponse.newBuilder() to construct.
  private ListAnnotationSpecSetsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListAnnotationSpecSetsResponse() {
    annotationSpecSets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListAnnotationSpecSetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotationSpecSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
        .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotationSpecSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.class,
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.Builder.class);
  }

  public static final int ANNOTATION_SPEC_SETS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      annotationSpecSets_;
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getAnnotationSpecSetsList() {
    return annotationSpecSets_;
  }
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
      getAnnotationSpecSetsOrBuilderList() {
    return annotationSpecSets_;
  }
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  @java.lang.Override
  public int getAnnotationSpecSetsCount() {
    return annotationSpecSets_.size();
  }
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSets(int index) {
    return annotationSpecSets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The list of annotation spec sets.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder
      getAnnotationSpecSetsOrBuilder(int index) {
    return annotationSpecSets_.get(index);
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
    for (int i = 0; i < annotationSpecSets_.size(); i++) {
      output.writeMessage(1, annotationSpecSets_.get(i));
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
    for (int i = 0; i < annotationSpecSets_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, annotationSpecSets_.get(i));
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse other =
        (com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse) obj;

    if (!getAnnotationSpecSetsList().equals(other.getAnnotationSpecSetsList())) return false;
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
    if (getAnnotationSpecSetsCount() > 0) {
      hash = (37 * hash) + ANNOTATION_SPEC_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationSpecSetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse parseFrom(
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
      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse prototype) {
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
   * Results of listing annotation spec set under a project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)
      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotationSpecSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotationSpecSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.class,
              com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (annotationSpecSetsBuilder_ == null) {
        annotationSpecSets_ = java.util.Collections.emptyList();
      } else {
        annotationSpecSets_ = null;
        annotationSpecSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass
          .internal_static_google_cloud_datalabeling_v1beta1_ListAnnotationSpecSetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse build() {
      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse result =
          new com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse(this);
      int from_bitField0_ = bitField0_;
      if (annotationSpecSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          annotationSpecSets_ = java.util.Collections.unmodifiableList(annotationSpecSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.annotationSpecSets_ = annotationSpecSets_;
      } else {
        result.annotationSpecSets_ = annotationSpecSetsBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse) {
        return mergeFrom(
            (com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse other) {
      if (other
          == com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
              .getDefaultInstance()) return this;
      if (annotationSpecSetsBuilder_ == null) {
        if (!other.annotationSpecSets_.isEmpty()) {
          if (annotationSpecSets_.isEmpty()) {
            annotationSpecSets_ = other.annotationSpecSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAnnotationSpecSetsIsMutable();
            annotationSpecSets_.addAll(other.annotationSpecSets_);
          }
          onChanged();
        }
      } else {
        if (!other.annotationSpecSets_.isEmpty()) {
          if (annotationSpecSetsBuilder_.isEmpty()) {
            annotationSpecSetsBuilder_.dispose();
            annotationSpecSetsBuilder_ = null;
            annotationSpecSets_ = other.annotationSpecSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            annotationSpecSetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getAnnotationSpecSetsFieldBuilder()
                    : null;
          } else {
            annotationSpecSetsBuilder_.addAllMessages(other.annotationSpecSets_);
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
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet m =
                    input.readMessage(
                        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.parser(),
                        extensionRegistry);
                if (annotationSpecSetsBuilder_ == null) {
                  ensureAnnotationSpecSetsIsMutable();
                  annotationSpecSets_.add(m);
                } else {
                  annotationSpecSetsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        annotationSpecSets_ = java.util.Collections.emptyList();

    private void ensureAnnotationSpecSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        annotationSpecSets_ =
            new java.util.ArrayList<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>(
                annotationSpecSets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
        annotationSpecSetsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        getAnnotationSpecSetsList() {
      if (annotationSpecSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(annotationSpecSets_);
      } else {
        return annotationSpecSetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public int getAnnotationSpecSetsCount() {
      if (annotationSpecSetsBuilder_ == null) {
        return annotationSpecSets_.size();
      } else {
        return annotationSpecSetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSets(
        int index) {
      if (annotationSpecSetsBuilder_ == null) {
        return annotationSpecSets_.get(index);
      } else {
        return annotationSpecSetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder setAnnotationSpecSets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet value) {
      if (annotationSpecSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.set(index, value);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder setAnnotationSpecSets(
        int index,
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder builderForValue) {
      if (annotationSpecSetsBuilder_ == null) {
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        annotationSpecSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder addAnnotationSpecSets(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet value) {
      if (annotationSpecSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.add(value);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder addAnnotationSpecSets(
        int index, com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet value) {
      if (annotationSpecSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.add(index, value);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder addAnnotationSpecSets(
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder builderForValue) {
      if (annotationSpecSetsBuilder_ == null) {
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.add(builderForValue.build());
        onChanged();
      } else {
        annotationSpecSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder addAnnotationSpecSets(
        int index,
        com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder builderForValue) {
      if (annotationSpecSetsBuilder_ == null) {
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        annotationSpecSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder addAllAnnotationSpecSets(
        java.lang.Iterable<? extends com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
            values) {
      if (annotationSpecSetsBuilder_ == null) {
        ensureAnnotationSpecSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, annotationSpecSets_);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder clearAnnotationSpecSets() {
      if (annotationSpecSetsBuilder_ == null) {
        annotationSpecSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public Builder removeAnnotationSpecSets(int index) {
      if (annotationSpecSetsBuilder_ == null) {
        ensureAnnotationSpecSetsIsMutable();
        annotationSpecSets_.remove(index);
        onChanged();
      } else {
        annotationSpecSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder
        getAnnotationSpecSetsBuilder(int index) {
      return getAnnotationSpecSetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder
        getAnnotationSpecSetsOrBuilder(int index) {
      if (annotationSpecSetsBuilder_ == null) {
        return annotationSpecSets_.get(index);
      } else {
        return annotationSpecSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
        getAnnotationSpecSetsOrBuilderList() {
      if (annotationSpecSetsBuilder_ != null) {
        return annotationSpecSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(annotationSpecSets_);
      }
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder
        addAnnotationSpecSetsBuilder() {
      return getAnnotationSpecSetsFieldBuilder()
          .addBuilder(com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder
        addAnnotationSpecSetsBuilder(int index) {
      return getAnnotationSpecSetsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The list of annotation spec sets.
     * </pre>
     *
     * <code>repeated .google.cloud.datalabeling.v1beta1.AnnotationSpecSet annotation_spec_sets = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder>
        getAnnotationSpecSetsBuilderList() {
      return getAnnotationSpecSetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>
        getAnnotationSpecSetsFieldBuilder() {
      if (annotationSpecSetsBuilder_ == null) {
        annotationSpecSetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet.Builder,
                com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOrBuilder>(
                annotationSpecSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        annotationSpecSets_ = null;
      }
      return annotationSpecSetsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse)
  private static final com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse();
  }

  public static com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListAnnotationSpecSetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListAnnotationSpecSetsResponse>() {
        @java.lang.Override
        public ListAnnotationSpecSetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListAnnotationSpecSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListAnnotationSpecSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
