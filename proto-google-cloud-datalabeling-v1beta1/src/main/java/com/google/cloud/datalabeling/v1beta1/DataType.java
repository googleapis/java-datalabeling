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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

/** Protobuf enum {@code google.cloud.datalabeling.v1beta1.DataType} */
public enum DataType implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>DATA_TYPE_UNSPECIFIED = 0;</code> */
  DATA_TYPE_UNSPECIFIED(0),
  /** <code>IMAGE = 1;</code> */
  IMAGE(1),
  /** <code>VIDEO = 2;</code> */
  VIDEO(2),
  /** <code>TEXT = 4;</code> */
  TEXT(4),
  /** <code>GENERAL_DATA = 6;</code> */
  GENERAL_DATA(6),
  UNRECOGNIZED(-1),
  ;

  /** <code>DATA_TYPE_UNSPECIFIED = 0;</code> */
  public static final int DATA_TYPE_UNSPECIFIED_VALUE = 0;
  /** <code>IMAGE = 1;</code> */
  public static final int IMAGE_VALUE = 1;
  /** <code>VIDEO = 2;</code> */
  public static final int VIDEO_VALUE = 2;
  /** <code>TEXT = 4;</code> */
  public static final int TEXT_VALUE = 4;
  /** <code>GENERAL_DATA = 6;</code> */
  public static final int GENERAL_DATA_VALUE = 6;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0:
        return DATA_TYPE_UNSPECIFIED;
      case 1:
        return IMAGE;
      case 2:
        return VIDEO;
      case 4:
        return TEXT;
      case 6:
        return GENERAL_DATA;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DataType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
        public DataType findValueByNumber(int number) {
          return DataType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.datalabeling.v1beta1.DataType)
}
