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
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

package com.google.cloud.datalabeling.v1beta1;

/**
 *
 *
 * <pre>
 * Container of information about an image.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImagePayload}
 */
public final class ImagePayload extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.ImagePayload)
    ImagePayloadOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImagePayload.newBuilder() to construct.
  private ImagePayload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImagePayload() {
    mimeType_ = "";
    imageThumbnail_ = com.google.protobuf.ByteString.EMPTY;
    imageUri_ = "";
    signedUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImagePayload();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImagePayload(
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

              mimeType_ = s;
              break;
            }
          case 18:
            {
              imageThumbnail_ = input.readBytes();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              imageUri_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              signedUri_ = s;
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
    return com.google.cloud.datalabeling.v1beta1.DataPayloads
        .internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.DataPayloads
        .internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.ImagePayload.class,
            com.google.cloud.datalabeling.v1beta1.ImagePayload.Builder.class);
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object mimeType_;
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The mimeType.
   */
  public java.lang.String getMimeType() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mimeType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The bytes for mimeType.
   */
  public com.google.protobuf.ByteString getMimeTypeBytes() {
    java.lang.Object ref = mimeType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mimeType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_THUMBNAIL_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString imageThumbnail_;
  /**
   *
   *
   * <pre>
   * A byte string of a thumbnail image.
   * </pre>
   *
   * <code>bytes image_thumbnail = 2;</code>
   *
   * @return The imageThumbnail.
   */
  public com.google.protobuf.ByteString getImageThumbnail() {
    return imageThumbnail_;
  }

  public static final int IMAGE_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object imageUri_;
  /**
   *
   *
   * <pre>
   * Image uri from the user bucket.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   *
   * @return The imageUri.
   */
  public java.lang.String getImageUri() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Image uri from the user bucket.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   *
   * @return The bytes for imageUri.
   */
  public com.google.protobuf.ByteString getImageUriBytes() {
    java.lang.Object ref = imageUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      imageUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNED_URI_FIELD_NUMBER = 4;
  private volatile java.lang.Object signedUri_;
  /**
   *
   *
   * <pre>
   * Signed uri of the image file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 4;</code>
   *
   * @return The signedUri.
   */
  public java.lang.String getSignedUri() {
    java.lang.Object ref = signedUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signedUri_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Signed uri of the image file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 4;</code>
   *
   * @return The bytes for signedUri.
   */
  public com.google.protobuf.ByteString getSignedUriBytes() {
    java.lang.Object ref = signedUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      signedUri_ = b;
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
    if (!getMimeTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mimeType_);
    }
    if (!imageThumbnail_.isEmpty()) {
      output.writeBytes(2, imageThumbnail_);
    }
    if (!getImageUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, imageUri_);
    }
    if (!getSignedUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, signedUri_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMimeTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mimeType_);
    }
    if (!imageThumbnail_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, imageThumbnail_);
    }
    if (!getImageUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, imageUri_);
    }
    if (!getSignedUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, signedUri_);
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.ImagePayload)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.ImagePayload other =
        (com.google.cloud.datalabeling.v1beta1.ImagePayload) obj;

    if (!getMimeType().equals(other.getMimeType())) return false;
    if (!getImageThumbnail().equals(other.getImageThumbnail())) return false;
    if (!getImageUri().equals(other.getImageUri())) return false;
    if (!getSignedUri().equals(other.getSignedUri())) return false;
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
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMimeType().hashCode();
    hash = (37 * hash) + IMAGE_THUMBNAIL_FIELD_NUMBER;
    hash = (53 * hash) + getImageThumbnail().hashCode();
    hash = (37 * hash) + IMAGE_URI_FIELD_NUMBER;
    hash = (53 * hash) + getImageUri().hashCode();
    hash = (37 * hash) + SIGNED_URI_FIELD_NUMBER;
    hash = (53 * hash) + getSignedUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.ImagePayload prototype) {
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
   * Container of information about an image.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.ImagePayload}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.ImagePayload)
      com.google.cloud.datalabeling.v1beta1.ImagePayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.ImagePayload.class,
              com.google.cloud.datalabeling.v1beta1.ImagePayload.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.ImagePayload.newBuilder()
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
      mimeType_ = "";

      imageThumbnail_ = com.google.protobuf.ByteString.EMPTY;

      imageUri_ = "";

      signedUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.DataPayloads
          .internal_static_google_cloud_datalabeling_v1beta1_ImagePayload_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImagePayload getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.ImagePayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImagePayload build() {
      com.google.cloud.datalabeling.v1beta1.ImagePayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.ImagePayload buildPartial() {
      com.google.cloud.datalabeling.v1beta1.ImagePayload result =
          new com.google.cloud.datalabeling.v1beta1.ImagePayload(this);
      result.mimeType_ = mimeType_;
      result.imageThumbnail_ = imageThumbnail_;
      result.imageUri_ = imageUri_;
      result.signedUri_ = signedUri_;
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.ImagePayload) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.ImagePayload) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.ImagePayload other) {
      if (other == com.google.cloud.datalabeling.v1beta1.ImagePayload.getDefaultInstance())
        return this;
      if (!other.getMimeType().isEmpty()) {
        mimeType_ = other.mimeType_;
        onChanged();
      }
      if (other.getImageThumbnail() != com.google.protobuf.ByteString.EMPTY) {
        setImageThumbnail(other.getImageThumbnail());
      }
      if (!other.getImageUri().isEmpty()) {
        imageUri_ = other.imageUri_;
        onChanged();
      }
      if (!other.getSignedUri().isEmpty()) {
        signedUri_ = other.signedUri_;
        onChanged();
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
      com.google.cloud.datalabeling.v1beta1.ImagePayload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.datalabeling.v1beta1.ImagePayload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mimeType_ = "";
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return The mimeType.
     */
    public java.lang.String getMimeType() {
      java.lang.Object ref = mimeType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mimeType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return The bytes for mimeType.
     */
    public com.google.protobuf.ByteString getMimeTypeBytes() {
      java.lang.Object ref = mimeType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mimeType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mimeType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {

      mimeType_ = getDefaultInstance().getMimeType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image format.
     * </pre>
     *
     * <code>string mime_type = 1;</code>
     *
     * @param value The bytes for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      mimeType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString imageThumbnail_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * A byte string of a thumbnail image.
     * </pre>
     *
     * <code>bytes image_thumbnail = 2;</code>
     *
     * @return The imageThumbnail.
     */
    public com.google.protobuf.ByteString getImageThumbnail() {
      return imageThumbnail_;
    }
    /**
     *
     *
     * <pre>
     * A byte string of a thumbnail image.
     * </pre>
     *
     * <code>bytes image_thumbnail = 2;</code>
     *
     * @param value The imageThumbnail to set.
     * @return This builder for chaining.
     */
    public Builder setImageThumbnail(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      imageThumbnail_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A byte string of a thumbnail image.
     * </pre>
     *
     * <code>bytes image_thumbnail = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageThumbnail() {

      imageThumbnail_ = getDefaultInstance().getImageThumbnail();
      onChanged();
      return this;
    }

    private java.lang.Object imageUri_ = "";
    /**
     *
     *
     * <pre>
     * Image uri from the user bucket.
     * </pre>
     *
     * <code>string image_uri = 3;</code>
     *
     * @return The imageUri.
     */
    public java.lang.String getImageUri() {
      java.lang.Object ref = imageUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image uri from the user bucket.
     * </pre>
     *
     * <code>string image_uri = 3;</code>
     *
     * @return The bytes for imageUri.
     */
    public com.google.protobuf.ByteString getImageUriBytes() {
      java.lang.Object ref = imageUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        imageUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Image uri from the user bucket.
     * </pre>
     *
     * <code>string image_uri = 3;</code>
     *
     * @param value The imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      imageUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image uri from the user bucket.
     * </pre>
     *
     * <code>string image_uri = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearImageUri() {

      imageUri_ = getDefaultInstance().getImageUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Image uri from the user bucket.
     * </pre>
     *
     * <code>string image_uri = 3;</code>
     *
     * @param value The bytes for imageUri to set.
     * @return This builder for chaining.
     */
    public Builder setImageUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      imageUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object signedUri_ = "";
    /**
     *
     *
     * <pre>
     * Signed uri of the image file in the service bucket.
     * </pre>
     *
     * <code>string signed_uri = 4;</code>
     *
     * @return The signedUri.
     */
    public java.lang.String getSignedUri() {
      java.lang.Object ref = signedUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signedUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Signed uri of the image file in the service bucket.
     * </pre>
     *
     * <code>string signed_uri = 4;</code>
     *
     * @return The bytes for signedUri.
     */
    public com.google.protobuf.ByteString getSignedUriBytes() {
      java.lang.Object ref = signedUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        signedUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Signed uri of the image file in the service bucket.
     * </pre>
     *
     * <code>string signed_uri = 4;</code>
     *
     * @param value The signedUri to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      signedUri_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signed uri of the image file in the service bucket.
     * </pre>
     *
     * <code>string signed_uri = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSignedUri() {

      signedUri_ = getDefaultInstance().getSignedUri();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Signed uri of the image file in the service bucket.
     * </pre>
     *
     * <code>string signed_uri = 4;</code>
     *
     * @param value The bytes for signedUri to set.
     * @return This builder for chaining.
     */
    public Builder setSignedUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      signedUri_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.ImagePayload)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.ImagePayload)
  private static final com.google.cloud.datalabeling.v1beta1.ImagePayload DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.ImagePayload();
  }

  public static com.google.cloud.datalabeling.v1beta1.ImagePayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImagePayload> PARSER =
      new com.google.protobuf.AbstractParser<ImagePayload>() {
        @java.lang.Override
        public ImagePayload parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImagePayload(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImagePayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImagePayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.ImagePayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
