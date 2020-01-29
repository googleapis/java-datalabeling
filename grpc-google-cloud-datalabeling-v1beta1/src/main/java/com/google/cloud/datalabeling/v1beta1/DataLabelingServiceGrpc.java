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
package com.google.cloud.datalabeling.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto")
public final class DataLabelingServiceGrpc {

  private DataLabelingServiceGrpc() {}

  public static final String SERVICE_NAME = "google.cloud.datalabeling.v1beta1.DataLabelingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      METHOD_CREATE_DATASET = getCreateDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getCreateDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getCreateDatasetMethod() {
    return getCreateDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getCreateDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
            com.google.cloud.datalabeling.v1beta1.Dataset>
        getCreateDatasetMethod;
    if ((getCreateDatasetMethod = DataLabelingServiceGrpc.getCreateDatasetMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getCreateDatasetMethod = DataLabelingServiceGrpc.getCreateDatasetMethod) == null) {
          DataLabelingServiceGrpc.getCreateDatasetMethod =
              getCreateDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
                          com.google.cloud.datalabeling.v1beta1.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "CreateDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.Dataset.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("CreateDataset"))
                      .build();
        }
      }
    }
    return getCreateDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      METHOD_GET_DATASET = getGetDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getGetDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getGetDatasetMethod() {
    return getGetDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.Dataset>
      getGetDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
            com.google.cloud.datalabeling.v1beta1.Dataset>
        getGetDatasetMethod;
    if ((getGetDatasetMethod = DataLabelingServiceGrpc.getGetDatasetMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetDatasetMethod = DataLabelingServiceGrpc.getGetDatasetMethod) == null) {
          DataLabelingServiceGrpc.getGetDatasetMethod =
              getGetDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
                          com.google.cloud.datalabeling.v1beta1.Dataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.Dataset.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetDataset"))
                      .build();
        }
      }
    }
    return getGetDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDatasetsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
      METHOD_LIST_DATASETS = getListDatasetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
      getListDatasetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
      getListDatasetsMethod() {
    return getListDatasetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
      getListDatasetsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
            com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
        getListDatasetsMethod;
    if ((getListDatasetsMethod = DataLabelingServiceGrpc.getListDatasetsMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListDatasetsMethod = DataLabelingServiceGrpc.getListDatasetsMethod) == null) {
          DataLabelingServiceGrpc.getListDatasetsMethod =
              getListDatasetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListDatasets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListDatasets"))
                      .build();
        }
      }
    }
    return getListDatasetsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest, com.google.protobuf.Empty>
      METHOD_DELETE_DATASET = getDeleteDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest, com.google.protobuf.Empty>
      getDeleteDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest, com.google.protobuf.Empty>
      getDeleteDatasetMethod() {
    return getDeleteDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest, com.google.protobuf.Empty>
      getDeleteDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest, com.google.protobuf.Empty>
        getDeleteDatasetMethod;
    if ((getDeleteDatasetMethod = DataLabelingServiceGrpc.getDeleteDatasetMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getDeleteDatasetMethod = DataLabelingServiceGrpc.getDeleteDatasetMethod) == null) {
          DataLabelingServiceGrpc.getDeleteDatasetMethod =
              getDeleteDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "DeleteDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("DeleteDataset"))
                      .build();
        }
      }
    }
    return getDeleteDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getImportDataMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ImportDataRequest, com.google.longrunning.Operation>
      METHOD_IMPORT_DATA = getImportDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethod() {
    return getImportDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ImportDataRequest, com.google.longrunning.Operation>
      getImportDataMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ImportDataRequest,
            com.google.longrunning.Operation>
        getImportDataMethod;
    if ((getImportDataMethod = DataLabelingServiceGrpc.getImportDataMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getImportDataMethod = DataLabelingServiceGrpc.getImportDataMethod) == null) {
          DataLabelingServiceGrpc.getImportDataMethod =
              getImportDataMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ImportDataRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ImportData"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ImportDataRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ImportData"))
                      .build();
        }
      }
    }
    return getImportDataMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getExportDataMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ExportDataRequest, com.google.longrunning.Operation>
      METHOD_EXPORT_DATA = getExportDataMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethod() {
    return getExportDataMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ExportDataRequest, com.google.longrunning.Operation>
      getExportDataMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ExportDataRequest,
            com.google.longrunning.Operation>
        getExportDataMethod;
    if ((getExportDataMethod = DataLabelingServiceGrpc.getExportDataMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getExportDataMethod = DataLabelingServiceGrpc.getExportDataMethod) == null) {
          DataLabelingServiceGrpc.getExportDataMethod =
              getExportDataMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ExportDataRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ExportData"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ExportDataRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ExportData"))
                      .build();
        }
      }
    }
    return getExportDataMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetDataItemMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
          com.google.cloud.datalabeling.v1beta1.DataItem>
      METHOD_GET_DATA_ITEM = getGetDataItemMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
          com.google.cloud.datalabeling.v1beta1.DataItem>
      getGetDataItemMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
          com.google.cloud.datalabeling.v1beta1.DataItem>
      getGetDataItemMethod() {
    return getGetDataItemMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
          com.google.cloud.datalabeling.v1beta1.DataItem>
      getGetDataItemMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
            com.google.cloud.datalabeling.v1beta1.DataItem>
        getGetDataItemMethod;
    if ((getGetDataItemMethod = DataLabelingServiceGrpc.getGetDataItemMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetDataItemMethod = DataLabelingServiceGrpc.getGetDataItemMethod) == null) {
          DataLabelingServiceGrpc.getGetDataItemMethod =
              getGetDataItemMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
                          com.google.cloud.datalabeling.v1beta1.DataItem>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetDataItem"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetDataItemRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DataItem.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetDataItem"))
                      .build();
        }
      }
    }
    return getGetDataItemMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListDataItemsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
      METHOD_LIST_DATA_ITEMS = getListDataItemsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
      getListDataItemsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
      getListDataItemsMethod() {
    return getListDataItemsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
          com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
      getListDataItemsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
            com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
        getListDataItemsMethod;
    if ((getListDataItemsMethod = DataLabelingServiceGrpc.getListDataItemsMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListDataItemsMethod = DataLabelingServiceGrpc.getListDataItemsMethod) == null) {
          DataLabelingServiceGrpc.getListDataItemsMethod =
              getListDataItemsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListDataItems"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListDataItems"))
                      .build();
        }
      }
    }
    return getListDataItemsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAnnotatedDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
      METHOD_GET_ANNOTATED_DATASET = getGetAnnotatedDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
      getGetAnnotatedDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
      getGetAnnotatedDatasetMethod() {
    return getGetAnnotatedDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
      getGetAnnotatedDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
        getGetAnnotatedDatasetMethod;
    if ((getGetAnnotatedDatasetMethod = DataLabelingServiceGrpc.getGetAnnotatedDatasetMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetAnnotatedDatasetMethod = DataLabelingServiceGrpc.getGetAnnotatedDatasetMethod)
            == null) {
          DataLabelingServiceGrpc.getGetAnnotatedDatasetMethod =
              getGetAnnotatedDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
                          com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetAnnotatedDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.AnnotatedDataset
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetAnnotatedDataset"))
                      .build();
        }
      }
    }
    return getGetAnnotatedDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListAnnotatedDatasetsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
      METHOD_LIST_ANNOTATED_DATASETS = getListAnnotatedDatasetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
      getListAnnotatedDatasetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
      getListAnnotatedDatasetsMethod() {
    return getListAnnotatedDatasetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
      getListAnnotatedDatasetsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
        getListAnnotatedDatasetsMethod;
    if ((getListAnnotatedDatasetsMethod = DataLabelingServiceGrpc.getListAnnotatedDatasetsMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListAnnotatedDatasetsMethod =
                DataLabelingServiceGrpc.getListAnnotatedDatasetsMethod)
            == null) {
          DataLabelingServiceGrpc.getListAnnotatedDatasetsMethod =
              getListAnnotatedDatasetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListAnnotatedDatasets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListAnnotatedDatasets"))
                      .build();
        }
      }
    }
    return getListAnnotatedDatasetsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAnnotatedDatasetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
          com.google.protobuf.Empty>
      METHOD_DELETE_ANNOTATED_DATASET = getDeleteAnnotatedDatasetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotatedDatasetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotatedDatasetMethod() {
    return getDeleteAnnotatedDatasetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotatedDatasetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
            com.google.protobuf.Empty>
        getDeleteAnnotatedDatasetMethod;
    if ((getDeleteAnnotatedDatasetMethod = DataLabelingServiceGrpc.getDeleteAnnotatedDatasetMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getDeleteAnnotatedDatasetMethod =
                DataLabelingServiceGrpc.getDeleteAnnotatedDatasetMethod)
            == null) {
          DataLabelingServiceGrpc.getDeleteAnnotatedDatasetMethod =
              getDeleteAnnotatedDatasetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "DeleteAnnotatedDataset"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("DeleteAnnotatedDataset"))
                      .build();
        }
      }
    }
    return getDeleteAnnotatedDatasetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLabelImageMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelImageRequest, com.google.longrunning.Operation>
      METHOD_LABEL_IMAGE = getLabelImageMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelImageRequest, com.google.longrunning.Operation>
      getLabelImageMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelImageRequest, com.google.longrunning.Operation>
      getLabelImageMethod() {
    return getLabelImageMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelImageRequest, com.google.longrunning.Operation>
      getLabelImageMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.LabelImageRequest,
            com.google.longrunning.Operation>
        getLabelImageMethod;
    if ((getLabelImageMethod = DataLabelingServiceGrpc.getLabelImageMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getLabelImageMethod = DataLabelingServiceGrpc.getLabelImageMethod) == null) {
          DataLabelingServiceGrpc.getLabelImageMethod =
              getLabelImageMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.LabelImageRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "LabelImage"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.LabelImageRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("LabelImage"))
                      .build();
        }
      }
    }
    return getLabelImageMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLabelVideoMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelVideoRequest, com.google.longrunning.Operation>
      METHOD_LABEL_VIDEO = getLabelVideoMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelVideoRequest, com.google.longrunning.Operation>
      getLabelVideoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelVideoRequest, com.google.longrunning.Operation>
      getLabelVideoMethod() {
    return getLabelVideoMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelVideoRequest, com.google.longrunning.Operation>
      getLabelVideoMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,
            com.google.longrunning.Operation>
        getLabelVideoMethod;
    if ((getLabelVideoMethod = DataLabelingServiceGrpc.getLabelVideoMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getLabelVideoMethod = DataLabelingServiceGrpc.getLabelVideoMethod) == null) {
          DataLabelingServiceGrpc.getLabelVideoMethod =
              getLabelVideoMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "LabelVideo"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.LabelVideoRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("LabelVideo"))
                      .build();
        }
      }
    }
    return getLabelVideoMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLabelTextMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelTextRequest, com.google.longrunning.Operation>
      METHOD_LABEL_TEXT = getLabelTextMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelTextRequest, com.google.longrunning.Operation>
      getLabelTextMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelTextRequest, com.google.longrunning.Operation>
      getLabelTextMethod() {
    return getLabelTextMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.LabelTextRequest, com.google.longrunning.Operation>
      getLabelTextMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.LabelTextRequest,
            com.google.longrunning.Operation>
        getLabelTextMethod;
    if ((getLabelTextMethod = DataLabelingServiceGrpc.getLabelTextMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getLabelTextMethod = DataLabelingServiceGrpc.getLabelTextMethod) == null) {
          DataLabelingServiceGrpc.getLabelTextMethod =
              getLabelTextMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.LabelTextRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService", "LabelText"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.LabelTextRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("LabelText"))
                      .build();
        }
      }
    }
    return getLabelTextMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetExampleMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
          com.google.cloud.datalabeling.v1beta1.Example>
      METHOD_GET_EXAMPLE = getGetExampleMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
          com.google.cloud.datalabeling.v1beta1.Example>
      getGetExampleMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
          com.google.cloud.datalabeling.v1beta1.Example>
      getGetExampleMethod() {
    return getGetExampleMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
          com.google.cloud.datalabeling.v1beta1.Example>
      getGetExampleMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
            com.google.cloud.datalabeling.v1beta1.Example>
        getGetExampleMethod;
    if ((getGetExampleMethod = DataLabelingServiceGrpc.getGetExampleMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetExampleMethod = DataLabelingServiceGrpc.getGetExampleMethod) == null) {
          DataLabelingServiceGrpc.getGetExampleMethod =
              getGetExampleMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
                          com.google.cloud.datalabeling.v1beta1.Example>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetExample"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetExampleRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.Example.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetExample"))
                      .build();
        }
      }
    }
    return getGetExampleMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListExamplesMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
          com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
      METHOD_LIST_EXAMPLES = getListExamplesMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
          com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
      getListExamplesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
          com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
      getListExamplesMethod() {
    return getListExamplesMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
          com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
      getListExamplesMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
            com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
        getListExamplesMethod;
    if ((getListExamplesMethod = DataLabelingServiceGrpc.getListExamplesMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListExamplesMethod = DataLabelingServiceGrpc.getListExamplesMethod) == null) {
          DataLabelingServiceGrpc.getListExamplesMethod =
              getListExamplesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
                          com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListExamples"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListExamplesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListExamplesResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListExamples"))
                      .build();
        }
      }
    }
    return getListExamplesMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateAnnotationSpecSetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      METHOD_CREATE_ANNOTATION_SPEC_SET = getCreateAnnotationSpecSetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getCreateAnnotationSpecSetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getCreateAnnotationSpecSetMethod() {
    return getCreateAnnotationSpecSetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getCreateAnnotationSpecSetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        getCreateAnnotationSpecSetMethod;
    if ((getCreateAnnotationSpecSetMethod =
            DataLabelingServiceGrpc.getCreateAnnotationSpecSetMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getCreateAnnotationSpecSetMethod =
                DataLabelingServiceGrpc.getCreateAnnotationSpecSetMethod)
            == null) {
          DataLabelingServiceGrpc.getCreateAnnotationSpecSetMethod =
              getCreateAnnotationSpecSetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
                          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "CreateAnnotationSpecSet"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier(
                              "CreateAnnotationSpecSet"))
                      .build();
        }
      }
    }
    return getCreateAnnotationSpecSetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAnnotationSpecSetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      METHOD_GET_ANNOTATION_SPEC_SET = getGetAnnotationSpecSetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getGetAnnotationSpecSetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getGetAnnotationSpecSetMethod() {
    return getGetAnnotationSpecSetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
      getGetAnnotationSpecSetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        getGetAnnotationSpecSetMethod;
    if ((getGetAnnotationSpecSetMethod = DataLabelingServiceGrpc.getGetAnnotationSpecSetMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetAnnotationSpecSetMethod = DataLabelingServiceGrpc.getGetAnnotationSpecSetMethod)
            == null) {
          DataLabelingServiceGrpc.getGetAnnotationSpecSetMethod =
              getGetAnnotationSpecSetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
                          com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetAnnotationSpecSet"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetAnnotationSpecSet"))
                      .build();
        }
      }
    }
    return getGetAnnotationSpecSetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListAnnotationSpecSetsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
      METHOD_LIST_ANNOTATION_SPEC_SETS = getListAnnotationSpecSetsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
      getListAnnotationSpecSetsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
      getListAnnotationSpecSetsMethod() {
    return getListAnnotationSpecSetsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
      getListAnnotationSpecSetsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
        getListAnnotationSpecSetsMethod;
    if ((getListAnnotationSpecSetsMethod = DataLabelingServiceGrpc.getListAnnotationSpecSetsMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListAnnotationSpecSetsMethod =
                DataLabelingServiceGrpc.getListAnnotationSpecSetsMethod)
            == null) {
          DataLabelingServiceGrpc.getListAnnotationSpecSetsMethod =
              getListAnnotationSpecSetsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListAnnotationSpecSets"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListAnnotationSpecSets"))
                      .build();
        }
      }
    }
    return getListAnnotationSpecSetsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteAnnotationSpecSetMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
          com.google.protobuf.Empty>
      METHOD_DELETE_ANNOTATION_SPEC_SET = getDeleteAnnotationSpecSetMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotationSpecSetMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotationSpecSetMethod() {
    return getDeleteAnnotationSpecSetMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
          com.google.protobuf.Empty>
      getDeleteAnnotationSpecSetMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
            com.google.protobuf.Empty>
        getDeleteAnnotationSpecSetMethod;
    if ((getDeleteAnnotationSpecSetMethod =
            DataLabelingServiceGrpc.getDeleteAnnotationSpecSetMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getDeleteAnnotationSpecSetMethod =
                DataLabelingServiceGrpc.getDeleteAnnotationSpecSetMethod)
            == null) {
          DataLabelingServiceGrpc.getDeleteAnnotationSpecSetMethod =
              getDeleteAnnotationSpecSetMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "DeleteAnnotationSpecSet"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier(
                              "DeleteAnnotationSpecSet"))
                      .build();
        }
      }
    }
    return getDeleteAnnotationSpecSetMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateInstructionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
          com.google.longrunning.Operation>
      METHOD_CREATE_INSTRUCTION = getCreateInstructionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
          com.google.longrunning.Operation>
      getCreateInstructionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
          com.google.longrunning.Operation>
      getCreateInstructionMethod() {
    return getCreateInstructionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
          com.google.longrunning.Operation>
      getCreateInstructionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
            com.google.longrunning.Operation>
        getCreateInstructionMethod;
    if ((getCreateInstructionMethod = DataLabelingServiceGrpc.getCreateInstructionMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getCreateInstructionMethod = DataLabelingServiceGrpc.getCreateInstructionMethod)
            == null) {
          DataLabelingServiceGrpc.getCreateInstructionMethod =
              getCreateInstructionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
                          com.google.longrunning.Operation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "CreateInstruction"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.longrunning.Operation.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("CreateInstruction"))
                      .build();
        }
      }
    }
    return getCreateInstructionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetInstructionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
          com.google.cloud.datalabeling.v1beta1.Instruction>
      METHOD_GET_INSTRUCTION = getGetInstructionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
          com.google.cloud.datalabeling.v1beta1.Instruction>
      getGetInstructionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
          com.google.cloud.datalabeling.v1beta1.Instruction>
      getGetInstructionMethod() {
    return getGetInstructionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
          com.google.cloud.datalabeling.v1beta1.Instruction>
      getGetInstructionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
            com.google.cloud.datalabeling.v1beta1.Instruction>
        getGetInstructionMethod;
    if ((getGetInstructionMethod = DataLabelingServiceGrpc.getGetInstructionMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetInstructionMethod = DataLabelingServiceGrpc.getGetInstructionMethod) == null) {
          DataLabelingServiceGrpc.getGetInstructionMethod =
              getGetInstructionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
                          com.google.cloud.datalabeling.v1beta1.Instruction>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetInstruction"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetInstructionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.Instruction
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetInstruction"))
                      .build();
        }
      }
    }
    return getGetInstructionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListInstructionsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
          com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
      METHOD_LIST_INSTRUCTIONS = getListInstructionsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
          com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
      getListInstructionsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
          com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
      getListInstructionsMethod() {
    return getListInstructionsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
          com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
      getListInstructionsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
            com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
        getListInstructionsMethod;
    if ((getListInstructionsMethod = DataLabelingServiceGrpc.getListInstructionsMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListInstructionsMethod = DataLabelingServiceGrpc.getListInstructionsMethod)
            == null) {
          DataLabelingServiceGrpc.getListInstructionsMethod =
              getListInstructionsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListInstructions"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListInstructions"))
                      .build();
        }
      }
    }
    return getListInstructionsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteInstructionMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest, com.google.protobuf.Empty>
      METHOD_DELETE_INSTRUCTION = getDeleteInstructionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest, com.google.protobuf.Empty>
      getDeleteInstructionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest, com.google.protobuf.Empty>
      getDeleteInstructionMethod() {
    return getDeleteInstructionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest, com.google.protobuf.Empty>
      getDeleteInstructionMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,
            com.google.protobuf.Empty>
        getDeleteInstructionMethod;
    if ((getDeleteInstructionMethod = DataLabelingServiceGrpc.getDeleteInstructionMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getDeleteInstructionMethod = DataLabelingServiceGrpc.getDeleteInstructionMethod)
            == null) {
          DataLabelingServiceGrpc.getDeleteInstructionMethod =
              getDeleteInstructionMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "DeleteInstruction"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("DeleteInstruction"))
                      .build();
        }
      }
    }
    return getDeleteInstructionMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetEvaluationMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
          com.google.cloud.datalabeling.v1beta1.Evaluation>
      METHOD_GET_EVALUATION = getGetEvaluationMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
          com.google.cloud.datalabeling.v1beta1.Evaluation>
      getGetEvaluationMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
          com.google.cloud.datalabeling.v1beta1.Evaluation>
      getGetEvaluationMethod() {
    return getGetEvaluationMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
          com.google.cloud.datalabeling.v1beta1.Evaluation>
      getGetEvaluationMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
            com.google.cloud.datalabeling.v1beta1.Evaluation>
        getGetEvaluationMethod;
    if ((getGetEvaluationMethod = DataLabelingServiceGrpc.getGetEvaluationMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetEvaluationMethod = DataLabelingServiceGrpc.getGetEvaluationMethod) == null) {
          DataLabelingServiceGrpc.getGetEvaluationMethod =
              getGetEvaluationMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
                          com.google.cloud.datalabeling.v1beta1.Evaluation>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetEvaluation"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.Evaluation
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetEvaluation"))
                      .build();
        }
      }
    }
    return getGetEvaluationMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchEvaluationsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
      METHOD_SEARCH_EVALUATIONS = getSearchEvaluationsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
      getSearchEvaluationsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
      getSearchEvaluationsMethod() {
    return getSearchEvaluationsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
      getSearchEvaluationsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
            com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
        getSearchEvaluationsMethod;
    if ((getSearchEvaluationsMethod = DataLabelingServiceGrpc.getSearchEvaluationsMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getSearchEvaluationsMethod = DataLabelingServiceGrpc.getSearchEvaluationsMethod)
            == null) {
          DataLabelingServiceGrpc.getSearchEvaluationsMethod =
              getSearchEvaluationsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
                          com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "SearchEvaluations"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("SearchEvaluations"))
                      .build();
        }
      }
    }
    return getSearchEvaluationsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSearchExampleComparisonsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
      METHOD_SEARCH_EXAMPLE_COMPARISONS = getSearchExampleComparisonsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
      getSearchExampleComparisonsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
      getSearchExampleComparisonsMethod() {
    return getSearchExampleComparisonsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
      getSearchExampleComparisonsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
            com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
        getSearchExampleComparisonsMethod;
    if ((getSearchExampleComparisonsMethod =
            DataLabelingServiceGrpc.getSearchExampleComparisonsMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getSearchExampleComparisonsMethod =
                DataLabelingServiceGrpc.getSearchExampleComparisonsMethod)
            == null) {
          DataLabelingServiceGrpc.getSearchExampleComparisonsMethod =
              getSearchExampleComparisonsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
                          com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "SearchExampleComparisons"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier(
                              "SearchExampleComparisons"))
                      .build();
        }
      }
    }
    return getSearchExampleComparisonsMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getCreateEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      METHOD_CREATE_EVALUATION_JOB = getCreateEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getCreateEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getCreateEvaluationJobMethod() {
    return getCreateEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getCreateEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        getCreateEvaluationJobMethod;
    if ((getCreateEvaluationJobMethod = DataLabelingServiceGrpc.getCreateEvaluationJobMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getCreateEvaluationJobMethod = DataLabelingServiceGrpc.getCreateEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getCreateEvaluationJobMethod =
              getCreateEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
                          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "CreateEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.EvaluationJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("CreateEvaluationJob"))
                      .build();
        }
      }
    }
    return getCreateEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getUpdateEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      METHOD_UPDATE_EVALUATION_JOB = getUpdateEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getUpdateEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getUpdateEvaluationJobMethod() {
    return getUpdateEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getUpdateEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        getUpdateEvaluationJobMethod;
    if ((getUpdateEvaluationJobMethod = DataLabelingServiceGrpc.getUpdateEvaluationJobMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getUpdateEvaluationJobMethod = DataLabelingServiceGrpc.getUpdateEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getUpdateEvaluationJobMethod =
              getUpdateEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
                          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "UpdateEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.EvaluationJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("UpdateEvaluationJob"))
                      .build();
        }
      }
    }
    return getUpdateEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      METHOD_GET_EVALUATION_JOB = getGetEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getGetEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getGetEvaluationJobMethod() {
    return getGetEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
      getGetEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        getGetEvaluationJobMethod;
    if ((getGetEvaluationJobMethod = DataLabelingServiceGrpc.getGetEvaluationJobMethod) == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getGetEvaluationJobMethod = DataLabelingServiceGrpc.getGetEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getGetEvaluationJobMethod =
              getGetEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
                          com.google.cloud.datalabeling.v1beta1.EvaluationJob>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "GetEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.EvaluationJob
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("GetEvaluationJob"))
                      .build();
        }
      }
    }
    return getGetEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getPauseEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
          com.google.protobuf.Empty>
      METHOD_PAUSE_EVALUATION_JOB = getPauseEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
          com.google.protobuf.Empty>
      getPauseEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
          com.google.protobuf.Empty>
      getPauseEvaluationJobMethod() {
    return getPauseEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
          com.google.protobuf.Empty>
      getPauseEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
            com.google.protobuf.Empty>
        getPauseEvaluationJobMethod;
    if ((getPauseEvaluationJobMethod = DataLabelingServiceGrpc.getPauseEvaluationJobMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getPauseEvaluationJobMethod = DataLabelingServiceGrpc.getPauseEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getPauseEvaluationJobMethod =
              getPauseEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "PauseEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("PauseEvaluationJob"))
                      .build();
        }
      }
    }
    return getPauseEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getResumeEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
          com.google.protobuf.Empty>
      METHOD_RESUME_EVALUATION_JOB = getResumeEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
          com.google.protobuf.Empty>
      getResumeEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
          com.google.protobuf.Empty>
      getResumeEvaluationJobMethod() {
    return getResumeEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
          com.google.protobuf.Empty>
      getResumeEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
            com.google.protobuf.Empty>
        getResumeEvaluationJobMethod;
    if ((getResumeEvaluationJobMethod = DataLabelingServiceGrpc.getResumeEvaluationJobMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getResumeEvaluationJobMethod = DataLabelingServiceGrpc.getResumeEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getResumeEvaluationJobMethod =
              getResumeEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ResumeEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ResumeEvaluationJob"))
                      .build();
        }
      }
    }
    return getResumeEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDeleteEvaluationJobMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
          com.google.protobuf.Empty>
      METHOD_DELETE_EVALUATION_JOB = getDeleteEvaluationJobMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
          com.google.protobuf.Empty>
      getDeleteEvaluationJobMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
          com.google.protobuf.Empty>
      getDeleteEvaluationJobMethod() {
    return getDeleteEvaluationJobMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
          com.google.protobuf.Empty>
      getDeleteEvaluationJobMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
            com.google.protobuf.Empty>
        getDeleteEvaluationJobMethod;
    if ((getDeleteEvaluationJobMethod = DataLabelingServiceGrpc.getDeleteEvaluationJobMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getDeleteEvaluationJobMethod = DataLabelingServiceGrpc.getDeleteEvaluationJobMethod)
            == null) {
          DataLabelingServiceGrpc.getDeleteEvaluationJobMethod =
              getDeleteEvaluationJobMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "DeleteEvaluationJob"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("DeleteEvaluationJob"))
                      .build();
        }
      }
    }
    return getDeleteEvaluationJobMethod;
  }

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getListEvaluationJobsMethod()} instead.
  public static final io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
      METHOD_LIST_EVALUATION_JOBS = getListEvaluationJobsMethodHelper();

  private static volatile io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
      getListEvaluationJobsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
      getListEvaluationJobsMethod() {
    return getListEvaluationJobsMethodHelper();
  }

  private static io.grpc.MethodDescriptor<
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
      getListEvaluationJobsMethodHelper() {
    io.grpc.MethodDescriptor<
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
        getListEvaluationJobsMethod;
    if ((getListEvaluationJobsMethod = DataLabelingServiceGrpc.getListEvaluationJobsMethod)
        == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        if ((getListEvaluationJobsMethod = DataLabelingServiceGrpc.getListEvaluationJobsMethod)
            == null) {
          DataLabelingServiceGrpc.getListEvaluationJobsMethod =
              getListEvaluationJobsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
                          com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              "google.cloud.datalabeling.v1beta1.DataLabelingService",
                              "ListEvaluationJobs"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new DataLabelingServiceMethodDescriptorSupplier("ListEvaluationJobs"))
                      .build();
        }
      }
    }
    return getListEvaluationJobsMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static DataLabelingServiceStub newStub(io.grpc.Channel channel) {
    return new DataLabelingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataLabelingServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    return new DataLabelingServiceBlockingStub(channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static DataLabelingServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    return new DataLabelingServiceFutureStub(channel);
  }

  /** */
  public abstract static class DataLabelingServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Creates dataset. If success return a Dataset resource.
     * </pre>
     */
    public void createDataset(
        com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets dataset by resource name.
     * </pre>
     */
    public void getDataset(
        com.google.cloud.datalabeling.v1beta1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets under a project. Pagination is supported.
     * </pre>
     */
    public void listDatasets(
        com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListDatasetsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset by resource name.
     * </pre>
     */
    public void deleteDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports data into dataset based on source locations defined in request.
     * It can be called multiple times for the same dataset. Each dataset can
     * only have one long running operation running on it. For example, no
     * labeling task (also long running operation) can be started while
     * importing is still ongoing. Vice versa.
     * </pre>
     */
    public void importData(
        com.google.cloud.datalabeling.v1beta1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getImportDataMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports data and annotations from dataset.
     * </pre>
     */
    public void exportData(
        com.google.cloud.datalabeling.v1beta1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getExportDataMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a data item in a dataset by resource name. This API can be
     * called after data are imported into dataset.
     * </pre>
     */
    public void getDataItem(
        com.google.cloud.datalabeling.v1beta1.GetDataItemRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.DataItem>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetDataItemMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists data items in a dataset. This API can be called after data
     * are imported into dataset. Pagination is supported.
     * </pre>
     */
    public void listDataItems(
        com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListDataItemsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotated dataset by resource name.
     * </pre>
     */
    public void getAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotatedDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotated datasets for a dataset. Pagination is supported.
     * </pre>
     */
    public void listAnnotatedDatasets(
        com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListAnnotatedDatasetsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotated dataset by resource name.
     * </pre>
     */
    public void deleteAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAnnotatedDatasetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for image. The type of image labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelImage(
        com.google.cloud.datalabeling.v1beta1.LabelImageRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getLabelImageMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for video. The type of video labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelVideo(
        com.google.cloud.datalabeling.v1beta1.LabelVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getLabelVideoMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for text. The type of text labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelText(
        com.google.cloud.datalabeling.v1beta1.LabelTextRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getLabelTextMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an example by resource name, including both data and annotation.
     * </pre>
     */
    public void getExample(
        com.google.cloud.datalabeling.v1beta1.GetExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Example>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetExampleMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists examples in an annotated dataset. Pagination is supported.
     * </pre>
     */
    public void listExamples(
        com.google.cloud.datalabeling.v1beta1.ListExamplesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListExamplesMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation spec set by providing a set of labels.
     * </pre>
     */
    public void createAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAnnotationSpecSetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec set by resource name.
     * </pre>
     */
    public void getAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnnotationSpecSetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotation spec sets for a project. Pagination is supported.
     * </pre>
     */
    public void listAnnotationSpecSets(
        com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListAnnotationSpecSetsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotation spec set by resource name.
     * </pre>
     */
    public void deleteAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAnnotationSpecSetMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an instruction for how data should be labeled.
     * </pre>
     */
    public void createInstruction(
        com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInstructionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an instruction by resource name.
     * </pre>
     */
    public void getInstruction(
        com.google.cloud.datalabeling.v1beta1.GetInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Instruction>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetInstructionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists instructions for a project. Pagination is supported.
     * </pre>
     */
    public void listInstructions(
        com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListInstructionsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an instruction object by resource name.
     * </pre>
     */
    public void deleteInstruction(
        com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteInstructionMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation by resource name (to search, use
     * [projects.evaluations.search][google.cloud.datalabeling.v1beta1.DataLabelingService.SearchEvaluations]).
     * </pre>
     */
    public void getEvaluation(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Evaluation>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetEvaluationMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches [evaluations][google.cloud.datalabeling.v1beta1.Evaluation] within a project.
     * </pre>
     */
    public void searchEvaluations(
        com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchEvaluationsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches example comparisons from an evaluation. The return format is a
     * list of example comparisons that show ground truth and prediction(s) for
     * a single input. Search by providing an evaluation ID.
     * </pre>
     */
    public void searchExampleComparisons(
        com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getSearchExampleComparisonsMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an evaluation job.
     * </pre>
     */
    public void createEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an evaluation job. You can only update certain fields of the job's
     * [EvaluationJobConfig][google.cloud.datalabeling.v1beta1.EvaluationJobConfig]: `humanAnnotationConfig.instruction`,
     * `exampleCount`, and `exampleSamplePercentage`.
     * If you want to change any other aspect of the evaluation job, you must
     * delete the job and create a new one.
     * </pre>
     */
    public void updateEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation job by resource name.
     * </pre>
     */
    public void getEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses an evaluation job. Pausing an evaluation job that is already in a
     * `PAUSED` state is a no-op.
     * </pre>
     */
    public void pauseEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resumes a paused evaluation job. A deleted evaluation job can't be resumed.
     * Resuming a running or scheduled evaluation job is a no-op.
     * </pre>
     */
    public void resumeEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResumeEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Stops and deletes an evaluation job.
     * </pre>
     */
    public void deleteEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEvaluationJobMethodHelper(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all evaluation jobs within a project with possible filters.
     * Pagination is supported.
     * </pre>
     */
    public void listEvaluationJobs(
        com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListEvaluationJobsMethodHelper(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getCreateDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest,
                      com.google.cloud.datalabeling.v1beta1.Dataset>(
                      this, METHODID_CREATE_DATASET)))
          .addMethod(
              getGetDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetDatasetRequest,
                      com.google.cloud.datalabeling.v1beta1.Dataset>(this, METHODID_GET_DATASET)))
          .addMethod(
              getListDatasetsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>(
                      this, METHODID_LIST_DATASETS)))
          .addMethod(
              getDeleteDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_DATASET)))
          .addMethod(
              getImportDataMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ImportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_IMPORT_DATA)))
          .addMethod(
              getExportDataMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ExportDataRequest,
                      com.google.longrunning.Operation>(this, METHODID_EXPORT_DATA)))
          .addMethod(
              getGetDataItemMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetDataItemRequest,
                      com.google.cloud.datalabeling.v1beta1.DataItem>(
                      this, METHODID_GET_DATA_ITEM)))
          .addMethod(
              getListDataItemsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>(
                      this, METHODID_LIST_DATA_ITEMS)))
          .addMethod(
              getGetAnnotatedDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest,
                      com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>(
                      this, METHODID_GET_ANNOTATED_DATASET)))
          .addMethod(
              getListAnnotatedDatasetsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>(
                      this, METHODID_LIST_ANNOTATED_DATASETS)))
          .addMethod(
              getDeleteAnnotatedDatasetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_ANNOTATED_DATASET)))
          .addMethod(
              getLabelImageMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.LabelImageRequest,
                      com.google.longrunning.Operation>(this, METHODID_LABEL_IMAGE)))
          .addMethod(
              getLabelVideoMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.LabelVideoRequest,
                      com.google.longrunning.Operation>(this, METHODID_LABEL_VIDEO)))
          .addMethod(
              getLabelTextMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.LabelTextRequest,
                      com.google.longrunning.Operation>(this, METHODID_LABEL_TEXT)))
          .addMethod(
              getGetExampleMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetExampleRequest,
                      com.google.cloud.datalabeling.v1beta1.Example>(this, METHODID_GET_EXAMPLE)))
          .addMethod(
              getListExamplesMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListExamplesRequest,
                      com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>(
                      this, METHODID_LIST_EXAMPLES)))
          .addMethod(
              getCreateAnnotationSpecSetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest,
                      com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>(
                      this, METHODID_CREATE_ANNOTATION_SPEC_SET)))
          .addMethod(
              getGetAnnotationSpecSetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest,
                      com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>(
                      this, METHODID_GET_ANNOTATION_SPEC_SET)))
          .addMethod(
              getListAnnotationSpecSetsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>(
                      this, METHODID_LIST_ANNOTATION_SPEC_SETS)))
          .addMethod(
              getDeleteAnnotationSpecSetMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_ANNOTATION_SPEC_SET)))
          .addMethod(
              getCreateInstructionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest,
                      com.google.longrunning.Operation>(this, METHODID_CREATE_INSTRUCTION)))
          .addMethod(
              getGetInstructionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetInstructionRequest,
                      com.google.cloud.datalabeling.v1beta1.Instruction>(
                      this, METHODID_GET_INSTRUCTION)))
          .addMethod(
              getListInstructionsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>(
                      this, METHODID_LIST_INSTRUCTIONS)))
          .addMethod(
              getDeleteInstructionMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_INSTRUCTION)))
          .addMethod(
              getGetEvaluationMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest,
                      com.google.cloud.datalabeling.v1beta1.Evaluation>(
                      this, METHODID_GET_EVALUATION)))
          .addMethod(
              getSearchEvaluationsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest,
                      com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>(
                      this, METHODID_SEARCH_EVALUATIONS)))
          .addMethod(
              getSearchExampleComparisonsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest,
                      com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>(
                      this, METHODID_SEARCH_EXAMPLE_COMPARISONS)))
          .addMethod(
              getCreateEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest,
                      com.google.cloud.datalabeling.v1beta1.EvaluationJob>(
                      this, METHODID_CREATE_EVALUATION_JOB)))
          .addMethod(
              getUpdateEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest,
                      com.google.cloud.datalabeling.v1beta1.EvaluationJob>(
                      this, METHODID_UPDATE_EVALUATION_JOB)))
          .addMethod(
              getGetEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest,
                      com.google.cloud.datalabeling.v1beta1.EvaluationJob>(
                      this, METHODID_GET_EVALUATION_JOB)))
          .addMethod(
              getPauseEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_PAUSE_EVALUATION_JOB)))
          .addMethod(
              getResumeEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_RESUME_EVALUATION_JOB)))
          .addMethod(
              getDeleteEvaluationJobMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_EVALUATION_JOB)))
          .addMethod(
              getListEvaluationJobsMethodHelper(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest,
                      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>(
                      this, METHODID_LIST_EVALUATION_JOBS)))
          .build();
    }
  }

  /** */
  public static final class DataLabelingServiceStub
      extends io.grpc.stub.AbstractStub<DataLabelingServiceStub> {
    private DataLabelingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataLabelingServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLabelingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLabelingServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates dataset. If success return a Dataset resource.
     * </pre>
     */
    public void createDataset(
        com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets dataset by resource name.
     * </pre>
     */
    public void getDataset(
        com.google.cloud.datalabeling.v1beta1.GetDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets under a project. Pagination is supported.
     * </pre>
     */
    public void listDatasets(
        com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDatasetsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset by resource name.
     * </pre>
     */
    public void deleteDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Imports data into dataset based on source locations defined in request.
     * It can be called multiple times for the same dataset. Each dataset can
     * only have one long running operation running on it. For example, no
     * labeling task (also long running operation) can be started while
     * importing is still ongoing. Vice versa.
     * </pre>
     */
    public void importData(
        com.google.cloud.datalabeling.v1beta1.ImportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportDataMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Exports data and annotations from dataset.
     * </pre>
     */
    public void exportData(
        com.google.cloud.datalabeling.v1beta1.ExportDataRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExportDataMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a data item in a dataset by resource name. This API can be
     * called after data are imported into dataset.
     * </pre>
     */
    public void getDataItem(
        com.google.cloud.datalabeling.v1beta1.GetDataItemRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.DataItem>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDataItemMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists data items in a dataset. This API can be called after data
     * are imported into dataset. Pagination is supported.
     * </pre>
     */
    public void listDataItems(
        com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDataItemsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotated dataset by resource name.
     * </pre>
     */
    public void getAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotatedDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotated datasets for a dataset. Pagination is supported.
     * </pre>
     */
    public void listAnnotatedDatasets(
        com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAnnotatedDatasetsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotated dataset by resource name.
     * </pre>
     */
    public void deleteAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotatedDatasetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for image. The type of image labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelImage(
        com.google.cloud.datalabeling.v1beta1.LabelImageRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLabelImageMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for video. The type of video labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelVideo(
        com.google.cloud.datalabeling.v1beta1.LabelVideoRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLabelVideoMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for text. The type of text labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public void labelText(
        com.google.cloud.datalabeling.v1beta1.LabelTextRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLabelTextMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an example by resource name, including both data and annotation.
     * </pre>
     */
    public void getExample(
        com.google.cloud.datalabeling.v1beta1.GetExampleRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Example>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExampleMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists examples in an annotated dataset. Pagination is supported.
     * </pre>
     */
    public void listExamples(
        com.google.cloud.datalabeling.v1beta1.ListExamplesRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListExamplesMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation spec set by providing a set of labels.
     * </pre>
     */
    public void createAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAnnotationSpecSetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec set by resource name.
     * </pre>
     */
    public void getAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnnotationSpecSetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists annotation spec sets for a project. Pagination is supported.
     * </pre>
     */
    public void listAnnotationSpecSets(
        com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAnnotationSpecSetsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotation spec set by resource name.
     * </pre>
     */
    public void deleteAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAnnotationSpecSetMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an instruction for how data should be labeled.
     * </pre>
     */
    public void createInstruction(
        com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.longrunning.Operation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInstructionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an instruction by resource name.
     * </pre>
     */
    public void getInstruction(
        com.google.cloud.datalabeling.v1beta1.GetInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Instruction>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetInstructionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists instructions for a project. Pagination is supported.
     * </pre>
     */
    public void listInstructions(
        com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListInstructionsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes an instruction object by resource name.
     * </pre>
     */
    public void deleteInstruction(
        com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteInstructionMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation by resource name (to search, use
     * [projects.evaluations.search][google.cloud.datalabeling.v1beta1.DataLabelingService.SearchEvaluations]).
     * </pre>
     */
    public void getEvaluation(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Evaluation>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEvaluationMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches [evaluations][google.cloud.datalabeling.v1beta1.Evaluation] within a project.
     * </pre>
     */
    public void searchEvaluations(
        com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchEvaluationsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Searches example comparisons from an evaluation. The return format is a
     * list of example comparisons that show ground truth and prediction(s) for
     * a single input. Search by providing an evaluation ID.
     * </pre>
     */
    public void searchExampleComparisons(
        com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchExampleComparisonsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates an evaluation job.
     * </pre>
     */
    public void createEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Updates an evaluation job. You can only update certain fields of the job's
     * [EvaluationJobConfig][google.cloud.datalabeling.v1beta1.EvaluationJobConfig]: `humanAnnotationConfig.instruction`,
     * `exampleCount`, and `exampleSamplePercentage`.
     * If you want to change any other aspect of the evaluation job, you must
     * delete the job and create a new one.
     * </pre>
     */
    public void updateEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation job by resource name.
     * </pre>
     */
    public void getEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Pauses an evaluation job. Pausing an evaluation job that is already in a
     * `PAUSED` state is a no-op.
     * </pre>
     */
    public void pauseEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Resumes a paused evaluation job. A deleted evaluation job can't be resumed.
     * Resuming a running or scheduled evaluation job is a no-op.
     * </pre>
     */
    public void resumeEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResumeEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Stops and deletes an evaluation job.
     * </pre>
     */
    public void deleteEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEvaluationJobMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists all evaluation jobs within a project with possible filters.
     * Pagination is supported.
     * </pre>
     */
    public void listEvaluationJobs(
        com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEvaluationJobsMethodHelper(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class DataLabelingServiceBlockingStub
      extends io.grpc.stub.AbstractStub<DataLabelingServiceBlockingStub> {
    private DataLabelingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataLabelingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLabelingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLabelingServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates dataset. If success return a Dataset resource.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.Dataset createDataset(
        com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets dataset by resource name.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.Dataset getDataset(
        com.google.cloud.datalabeling.v1beta1.GetDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets under a project. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse listDatasets(
        com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDatasetsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset by resource name.
     * </pre>
     */
    public com.google.protobuf.Empty deleteDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Imports data into dataset based on source locations defined in request.
     * It can be called multiple times for the same dataset. Each dataset can
     * only have one long running operation running on it. For example, no
     * labeling task (also long running operation) can be started while
     * importing is still ongoing. Vice versa.
     * </pre>
     */
    public com.google.longrunning.Operation importData(
        com.google.cloud.datalabeling.v1beta1.ImportDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportDataMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Exports data and annotations from dataset.
     * </pre>
     */
    public com.google.longrunning.Operation exportData(
        com.google.cloud.datalabeling.v1beta1.ExportDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getExportDataMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a data item in a dataset by resource name. This API can be
     * called after data are imported into dataset.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.DataItem getDataItem(
        com.google.cloud.datalabeling.v1beta1.GetDataItemRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDataItemMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists data items in a dataset. This API can be called after data
     * are imported into dataset. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse listDataItems(
        com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListDataItemsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotated dataset by resource name.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotatedDataset getAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotatedDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotated datasets for a dataset. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse
        listAnnotatedDatasets(
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAnnotatedDatasetsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotated dataset by resource name.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAnnotatedDataset(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAnnotatedDatasetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for image. The type of image labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.longrunning.Operation labelImage(
        com.google.cloud.datalabeling.v1beta1.LabelImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getLabelImageMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for video. The type of video labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.longrunning.Operation labelVideo(
        com.google.cloud.datalabeling.v1beta1.LabelVideoRequest request) {
      return blockingUnaryCall(
          getChannel(), getLabelVideoMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for text. The type of text labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.longrunning.Operation labelText(
        com.google.cloud.datalabeling.v1beta1.LabelTextRequest request) {
      return blockingUnaryCall(getChannel(), getLabelTextMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an example by resource name, including both data and annotation.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.Example getExample(
        com.google.cloud.datalabeling.v1beta1.GetExampleRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetExampleMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists examples in an annotated dataset. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListExamplesResponse listExamples(
        com.google.cloud.datalabeling.v1beta1.ListExamplesRequest request) {
      return blockingUnaryCall(
          getChannel(), getListExamplesMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation spec set by providing a set of labels.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet createAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAnnotationSpecSetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec set by resource name.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet getAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnnotationSpecSetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotation spec sets for a project. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse
        listAnnotationSpecSets(
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAnnotationSpecSetsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotation spec set by resource name.
     * </pre>
     */
    public com.google.protobuf.Empty deleteAnnotationSpecSet(
        com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAnnotationSpecSetMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an instruction for how data should be labeled.
     * </pre>
     */
    public com.google.longrunning.Operation createInstruction(
        com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateInstructionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an instruction by resource name.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.Instruction getInstruction(
        com.google.cloud.datalabeling.v1beta1.GetInstructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetInstructionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists instructions for a project. Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse listInstructions(
        com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListInstructionsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an instruction object by resource name.
     * </pre>
     */
    public com.google.protobuf.Empty deleteInstruction(
        com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteInstructionMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation by resource name (to search, use
     * [projects.evaluations.search][google.cloud.datalabeling.v1beta1.DataLabelingService.SearchEvaluations]).
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.Evaluation getEvaluation(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEvaluationMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Searches [evaluations][google.cloud.datalabeling.v1beta1.Evaluation] within a project.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse searchEvaluations(
        com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchEvaluationsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Searches example comparisons from an evaluation. The return format is a
     * list of example comparisons that show ground truth and prediction(s) for
     * a single input. Search by providing an evaluation ID.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse
        searchExampleComparisons(
            com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchExampleComparisonsMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an evaluation job.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob createEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an evaluation job. You can only update certain fields of the job's
     * [EvaluationJobConfig][google.cloud.datalabeling.v1beta1.EvaluationJobConfig]: `humanAnnotationConfig.instruction`,
     * `exampleCount`, and `exampleSamplePercentage`.
     * If you want to change any other aspect of the evaluation job, you must
     * delete the job and create a new one.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob updateEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation job by resource name.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.EvaluationJob getEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses an evaluation job. Pausing an evaluation job that is already in a
     * `PAUSED` state is a no-op.
     * </pre>
     */
    public com.google.protobuf.Empty pauseEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getPauseEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Resumes a paused evaluation job. A deleted evaluation job can't be resumed.
     * Resuming a running or scheduled evaluation job is a no-op.
     * </pre>
     */
    public com.google.protobuf.Empty resumeEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getResumeEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Stops and deletes an evaluation job.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEvaluationJob(
        com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEvaluationJobMethodHelper(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all evaluation jobs within a project with possible filters.
     * Pagination is supported.
     * </pre>
     */
    public com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse listEvaluationJobs(
        com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEvaluationJobsMethodHelper(), getCallOptions(), request);
    }
  }

  /** */
  public static final class DataLabelingServiceFutureStub
      extends io.grpc.stub.AbstractStub<DataLabelingServiceFutureStub> {
    private DataLabelingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataLabelingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataLabelingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataLabelingServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Creates dataset. If success return a Dataset resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.Dataset>
        createDataset(com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets dataset by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.Dataset>
        getDataset(com.google.cloud.datalabeling.v1beta1.GetDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists datasets under a project. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>
        listDatasets(com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDatasetsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a dataset by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteDataset(com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Imports data into dataset based on source locations defined in request.
     * It can be called multiple times for the same dataset. Each dataset can
     * only have one long running operation running on it. For example, no
     * labeling task (also long running operation) can be started while
     * importing is still ongoing. Vice versa.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        importData(com.google.cloud.datalabeling.v1beta1.ImportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportDataMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Exports data and annotations from dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        exportData(com.google.cloud.datalabeling.v1beta1.ExportDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExportDataMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a data item in a dataset by resource name. This API can be
     * called after data are imported into dataset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.DataItem>
        getDataItem(com.google.cloud.datalabeling.v1beta1.GetDataItemRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDataItemMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists data items in a dataset. This API can be called after data
     * are imported into dataset. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>
        listDataItems(com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListDataItemsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotated dataset by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>
        getAnnotatedDataset(
            com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotatedDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotated datasets for a dataset. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>
        listAnnotatedDatasets(
            com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAnnotatedDatasetsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotated dataset by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteAnnotatedDataset(
            com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAnnotatedDatasetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for image. The type of image labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        labelImage(com.google.cloud.datalabeling.v1beta1.LabelImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLabelImageMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for video. The type of video labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        labelVideo(com.google.cloud.datalabeling.v1beta1.LabelVideoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLabelVideoMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Starts a labeling task for text. The type of text labeling task is
     * configured by feature in the request.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        labelText(com.google.cloud.datalabeling.v1beta1.LabelTextRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLabelTextMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an example by resource name, including both data and annotation.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.Example>
        getExample(com.google.cloud.datalabeling.v1beta1.GetExampleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExampleMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists examples in an annotated dataset. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>
        listExamples(com.google.cloud.datalabeling.v1beta1.ListExamplesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListExamplesMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates an annotation spec set by providing a set of labels.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        createAnnotationSpecSet(
            com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAnnotationSpecSetMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Gets an annotation spec set by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>
        getAnnotationSpecSet(
            com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnnotationSpecSetMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists annotation spec sets for a project. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>
        listAnnotationSpecSets(
            com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAnnotationSpecSetsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an annotation spec set by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteAnnotationSpecSet(
            com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAnnotationSpecSetMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Creates an instruction for how data should be labeled.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.longrunning.Operation>
        createInstruction(com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInstructionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an instruction by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.Instruction>
        getInstruction(com.google.cloud.datalabeling.v1beta1.GetInstructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetInstructionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists instructions for a project. Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>
        listInstructions(com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListInstructionsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes an instruction object by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteInstruction(com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteInstructionMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation by resource name (to search, use
     * [projects.evaluations.search][google.cloud.datalabeling.v1beta1.DataLabelingService.SearchEvaluations]).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.Evaluation>
        getEvaluation(com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEvaluationMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Searches [evaluations][google.cloud.datalabeling.v1beta1.Evaluation] within a project.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>
        searchEvaluations(com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchEvaluationsMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Searches example comparisons from an evaluation. The return format is a
     * list of example comparisons that show ground truth and prediction(s) for
     * a single input. Search by providing an evaluation ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>
        searchExampleComparisons(
            com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchExampleComparisonsMethodHelper(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Creates an evaluation job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        createEvaluationJob(
            com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Updates an evaluation job. You can only update certain fields of the job's
     * [EvaluationJobConfig][google.cloud.datalabeling.v1beta1.EvaluationJobConfig]: `humanAnnotationConfig.instruction`,
     * `exampleCount`, and `exampleSamplePercentage`.
     * If you want to change any other aspect of the evaluation job, you must
     * delete the job and create a new one.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        updateEvaluationJob(
            com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets an evaluation job by resource name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.EvaluationJob>
        getEvaluationJob(com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Pauses an evaluation job. Pausing an evaluation job that is already in a
     * `PAUSED` state is a no-op.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        pauseEvaluationJob(
            com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Resumes a paused evaluation job. A deleted evaluation job can't be resumed.
     * Resuming a running or scheduled evaluation job is a no-op.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        resumeEvaluationJob(
            com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getResumeEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Stops and deletes an evaluation job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteEvaluationJob(
            com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEvaluationJobMethodHelper(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists all evaluation jobs within a project with possible filters.
     * Pagination is supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>
        listEvaluationJobs(
            com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEvaluationJobsMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATASET = 0;
  private static final int METHODID_GET_DATASET = 1;
  private static final int METHODID_LIST_DATASETS = 2;
  private static final int METHODID_DELETE_DATASET = 3;
  private static final int METHODID_IMPORT_DATA = 4;
  private static final int METHODID_EXPORT_DATA = 5;
  private static final int METHODID_GET_DATA_ITEM = 6;
  private static final int METHODID_LIST_DATA_ITEMS = 7;
  private static final int METHODID_GET_ANNOTATED_DATASET = 8;
  private static final int METHODID_LIST_ANNOTATED_DATASETS = 9;
  private static final int METHODID_DELETE_ANNOTATED_DATASET = 10;
  private static final int METHODID_LABEL_IMAGE = 11;
  private static final int METHODID_LABEL_VIDEO = 12;
  private static final int METHODID_LABEL_TEXT = 13;
  private static final int METHODID_GET_EXAMPLE = 14;
  private static final int METHODID_LIST_EXAMPLES = 15;
  private static final int METHODID_CREATE_ANNOTATION_SPEC_SET = 16;
  private static final int METHODID_GET_ANNOTATION_SPEC_SET = 17;
  private static final int METHODID_LIST_ANNOTATION_SPEC_SETS = 18;
  private static final int METHODID_DELETE_ANNOTATION_SPEC_SET = 19;
  private static final int METHODID_CREATE_INSTRUCTION = 20;
  private static final int METHODID_GET_INSTRUCTION = 21;
  private static final int METHODID_LIST_INSTRUCTIONS = 22;
  private static final int METHODID_DELETE_INSTRUCTION = 23;
  private static final int METHODID_GET_EVALUATION = 24;
  private static final int METHODID_SEARCH_EVALUATIONS = 25;
  private static final int METHODID_SEARCH_EXAMPLE_COMPARISONS = 26;
  private static final int METHODID_CREATE_EVALUATION_JOB = 27;
  private static final int METHODID_UPDATE_EVALUATION_JOB = 28;
  private static final int METHODID_GET_EVALUATION_JOB = 29;
  private static final int METHODID_PAUSE_EVALUATION_JOB = 30;
  private static final int METHODID_RESUME_EVALUATION_JOB = 31;
  private static final int METHODID_DELETE_EVALUATION_JOB = 32;
  private static final int METHODID_LIST_EVALUATION_JOBS = 33;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataLabelingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataLabelingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATASET:
          serviceImpl.createDataset(
              (com.google.cloud.datalabeling.v1beta1.CreateDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>)
                  responseObserver);
          break;
        case METHODID_GET_DATASET:
          serviceImpl.getDataset(
              (com.google.cloud.datalabeling.v1beta1.GetDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Dataset>)
                  responseObserver);
          break;
        case METHODID_LIST_DATASETS:
          serviceImpl.listDatasets(
              (com.google.cloud.datalabeling.v1beta1.ListDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListDatasetsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_DATASET:
          serviceImpl.deleteDataset(
              (com.google.cloud.datalabeling.v1beta1.DeleteDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IMPORT_DATA:
          serviceImpl.importData(
              (com.google.cloud.datalabeling.v1beta1.ImportDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_EXPORT_DATA:
          serviceImpl.exportData(
              (com.google.cloud.datalabeling.v1beta1.ExportDataRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_DATA_ITEM:
          serviceImpl.getDataItem(
              (com.google.cloud.datalabeling.v1beta1.GetDataItemRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.DataItem>)
                  responseObserver);
          break;
        case METHODID_LIST_DATA_ITEMS:
          serviceImpl.listDataItems(
              (com.google.cloud.datalabeling.v1beta1.ListDataItemsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListDataItemsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_ANNOTATED_DATASET:
          serviceImpl.getAnnotatedDataset(
              (com.google.cloud.datalabeling.v1beta1.GetAnnotatedDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotatedDataset>)
                  responseObserver);
          break;
        case METHODID_LIST_ANNOTATED_DATASETS:
          serviceImpl.listAnnotatedDatasets(
              (com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListAnnotatedDatasetsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_ANNOTATED_DATASET:
          serviceImpl.deleteAnnotatedDataset(
              (com.google.cloud.datalabeling.v1beta1.DeleteAnnotatedDatasetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LABEL_IMAGE:
          serviceImpl.labelImage(
              (com.google.cloud.datalabeling.v1beta1.LabelImageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LABEL_VIDEO:
          serviceImpl.labelVideo(
              (com.google.cloud.datalabeling.v1beta1.LabelVideoRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_LABEL_TEXT:
          serviceImpl.labelText(
              (com.google.cloud.datalabeling.v1beta1.LabelTextRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_EXAMPLE:
          serviceImpl.getExample(
              (com.google.cloud.datalabeling.v1beta1.GetExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Example>)
                  responseObserver);
          break;
        case METHODID_LIST_EXAMPLES:
          serviceImpl.listExamples(
              (com.google.cloud.datalabeling.v1beta1.ListExamplesRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListExamplesResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_ANNOTATION_SPEC_SET:
          serviceImpl.createAnnotationSpecSet(
              (com.google.cloud.datalabeling.v1beta1.CreateAnnotationSpecSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>)
                  responseObserver);
          break;
        case METHODID_GET_ANNOTATION_SPEC_SET:
          serviceImpl.getAnnotationSpecSet(
              (com.google.cloud.datalabeling.v1beta1.GetAnnotationSpecSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.AnnotationSpecSet>)
                  responseObserver);
          break;
        case METHODID_LIST_ANNOTATION_SPEC_SETS:
          serviceImpl.listAnnotationSpecSets(
              (com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListAnnotationSpecSetsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_ANNOTATION_SPEC_SET:
          serviceImpl.deleteAnnotationSpecSet(
              (com.google.cloud.datalabeling.v1beta1.DeleteAnnotationSpecSetRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_INSTRUCTION:
          serviceImpl.createInstruction(
              (com.google.cloud.datalabeling.v1beta1.CreateInstructionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.longrunning.Operation>) responseObserver);
          break;
        case METHODID_GET_INSTRUCTION:
          serviceImpl.getInstruction(
              (com.google.cloud.datalabeling.v1beta1.GetInstructionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Instruction>)
                  responseObserver);
          break;
        case METHODID_LIST_INSTRUCTIONS:
          serviceImpl.listInstructions(
              (com.google.cloud.datalabeling.v1beta1.ListInstructionsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListInstructionsResponse>)
                  responseObserver);
          break;
        case METHODID_DELETE_INSTRUCTION:
          serviceImpl.deleteInstruction(
              (com.google.cloud.datalabeling.v1beta1.DeleteInstructionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_EVALUATION:
          serviceImpl.getEvaluation(
              (com.google.cloud.datalabeling.v1beta1.GetEvaluationRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.Evaluation>)
                  responseObserver);
          break;
        case METHODID_SEARCH_EVALUATIONS:
          serviceImpl.searchEvaluations(
              (com.google.cloud.datalabeling.v1beta1.SearchEvaluationsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.SearchEvaluationsResponse>)
                  responseObserver);
          break;
        case METHODID_SEARCH_EXAMPLE_COMPARISONS:
          serviceImpl.searchExampleComparisons(
              (com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.SearchExampleComparisonsResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_EVALUATION_JOB:
          serviceImpl.createEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>)
                  responseObserver);
          break;
        case METHODID_UPDATE_EVALUATION_JOB:
          serviceImpl.updateEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.UpdateEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>)
                  responseObserver);
          break;
        case METHODID_GET_EVALUATION_JOB:
          serviceImpl.getEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.GetEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.cloud.datalabeling.v1beta1.EvaluationJob>)
                  responseObserver);
          break;
        case METHODID_PAUSE_EVALUATION_JOB:
          serviceImpl.pauseEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.PauseEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESUME_EVALUATION_JOB:
          serviceImpl.resumeEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.ResumeEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_EVALUATION_JOB:
          serviceImpl.deleteEvaluationJob(
              (com.google.cloud.datalabeling.v1beta1.DeleteEvaluationJobRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EVALUATION_JOBS:
          serviceImpl.listEvaluationJobs(
              (com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse>)
                  responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private abstract static class DataLabelingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataLabelingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.DataLabelingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataLabelingService");
    }
  }

  private static final class DataLabelingServiceFileDescriptorSupplier
      extends DataLabelingServiceBaseDescriptorSupplier {
    DataLabelingServiceFileDescriptorSupplier() {}
  }

  private static final class DataLabelingServiceMethodDescriptorSupplier
      extends DataLabelingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataLabelingServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DataLabelingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new DataLabelingServiceFileDescriptorSupplier())
                      .addMethod(getCreateDatasetMethodHelper())
                      .addMethod(getGetDatasetMethodHelper())
                      .addMethod(getListDatasetsMethodHelper())
                      .addMethod(getDeleteDatasetMethodHelper())
                      .addMethod(getImportDataMethodHelper())
                      .addMethod(getExportDataMethodHelper())
                      .addMethod(getGetDataItemMethodHelper())
                      .addMethod(getListDataItemsMethodHelper())
                      .addMethod(getGetAnnotatedDatasetMethodHelper())
                      .addMethod(getListAnnotatedDatasetsMethodHelper())
                      .addMethod(getDeleteAnnotatedDatasetMethodHelper())
                      .addMethod(getLabelImageMethodHelper())
                      .addMethod(getLabelVideoMethodHelper())
                      .addMethod(getLabelTextMethodHelper())
                      .addMethod(getGetExampleMethodHelper())
                      .addMethod(getListExamplesMethodHelper())
                      .addMethod(getCreateAnnotationSpecSetMethodHelper())
                      .addMethod(getGetAnnotationSpecSetMethodHelper())
                      .addMethod(getListAnnotationSpecSetsMethodHelper())
                      .addMethod(getDeleteAnnotationSpecSetMethodHelper())
                      .addMethod(getCreateInstructionMethodHelper())
                      .addMethod(getGetInstructionMethodHelper())
                      .addMethod(getListInstructionsMethodHelper())
                      .addMethod(getDeleteInstructionMethodHelper())
                      .addMethod(getGetEvaluationMethodHelper())
                      .addMethod(getSearchEvaluationsMethodHelper())
                      .addMethod(getSearchExampleComparisonsMethodHelper())
                      .addMethod(getCreateEvaluationJobMethodHelper())
                      .addMethod(getUpdateEvaluationJobMethodHelper())
                      .addMethod(getGetEvaluationJobMethodHelper())
                      .addMethod(getPauseEvaluationJobMethodHelper())
                      .addMethod(getResumeEvaluationJobMethodHelper())
                      .addMethod(getDeleteEvaluationJobMethodHelper())
                      .addMethod(getListEvaluationJobsMethodHelper())
                      .build();
        }
      }
    }
    return result;
  }
}
