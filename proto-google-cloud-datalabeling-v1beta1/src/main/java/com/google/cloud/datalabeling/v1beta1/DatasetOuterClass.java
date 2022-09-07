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
// source: google/cloud/datalabeling/v1beta1/dataset.proto

package com.google.cloud.datalabeling.v1beta1;

public final class DatasetOuterClass {
  private DatasetOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_GcsFolderDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_GcsFolderDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_DataItem_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_DataItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_LabelStats_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDatasetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDatasetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Example_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Example_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/datalabeling/v1beta1/data"
          + "set.proto\022!google.cloud.datalabeling.v1b"
          + "eta1\032\031google/api/resource.proto\0322google/"
          + "cloud/datalabeling/v1beta1/annotation.pr"
          + "oto\032;google/cloud/datalabeling/v1beta1/a"
          + "nnotation_spec_set.proto\0325google/cloud/d"
          + "atalabeling/v1beta1/data_payloads.proto\032"
          + "?google/cloud/datalabeling/v1beta1/human"
          + "_annotation_config.proto\032\037google/protobu"
          + "f/timestamp.proto\"\300\002\n\007Dataset\022\014\n\004name\030\001 "
          + "\001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description"
          + "\030\003 \001(\t\022/\n\013create_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022E\n\rinput_configs\030\005 \003(\0132."
          + ".google.cloud.datalabeling.v1beta1.Input"
          + "Config\022\032\n\022blocking_resources\030\006 \003(\t\022\027\n\017da"
          + "ta_item_count\030\007 \001(\003:O\352AL\n#datalabeling.g"
          + "oogleapis.com/Dataset\022%projects/{project"
          + "}/datasets/{dataset}\"\361\003\n\013InputConfig\022H\n\r"
          + "text_metadata\030\006 \001(\0132/.google.cloud.datal"
          + "abeling.v1beta1.TextMetadataH\000\022B\n\ngcs_so"
          + "urce\030\002 \001(\0132,.google.cloud.datalabeling.v"
          + "1beta1.GcsSourceH\001\022L\n\017bigquery_source\030\005 "
          + "\001(\01321.google.cloud.datalabeling.v1beta1."
          + "BigQuerySourceH\001\022>\n\tdata_type\030\001 \001(\0162+.go"
          + "ogle.cloud.datalabeling.v1beta1.DataType"
          + "\022J\n\017annotation_type\030\003 \001(\01621.google.cloud"
          + ".datalabeling.v1beta1.AnnotationType\022Z\n\027"
          + "classification_metadata\030\004 \001(\01329.google.c"
          + "loud.datalabeling.v1beta1.Classification"
          + "MetadataB\024\n\022data_type_metadataB\010\n\006source"
          + "\"%\n\014TextMetadata\022\025\n\rlanguage_code\030\001 \001(\t\""
          + "0\n\026ClassificationMetadata\022\026\n\016is_multi_la"
          + "bel\030\001 \001(\010\"1\n\tGcsSource\022\021\n\tinput_uri\030\001 \001("
          + "\t\022\021\n\tmime_type\030\002 \001(\t\"#\n\016BigQuerySource\022\021"
          + "\n\tinput_uri\030\001 \001(\t\"\306\001\n\014OutputConfig\022L\n\017gc"
          + "s_destination\030\001 \001(\01321.google.cloud.datal"
          + "abeling.v1beta1.GcsDestinationH\000\022Y\n\026gcs_"
          + "folder_destination\030\002 \001(\01327.google.cloud."
          + "datalabeling.v1beta1.GcsFolderDestinatio"
          + "nH\000B\r\n\013destination\"7\n\016GcsDestination\022\022\n\n"
          + "output_uri\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\"1\n\024G"
          + "csFolderDestination\022\031\n\021output_folder_uri"
          + "\030\001 \001(\t\"\347\002\n\010DataItem\022H\n\rimage_payload\030\002 \001"
          + "(\0132/.google.cloud.datalabeling.v1beta1.I"
          + "magePayloadH\000\022F\n\014text_payload\030\003 \001(\0132..go"
          + "ogle.cloud.datalabeling.v1beta1.TextPayl"
          + "oadH\000\022H\n\rvideo_payload\030\004 \001(\0132/.google.cl"
          + "oud.datalabeling.v1beta1.VideoPayloadH\000\022"
          + "\014\n\004name\030\001 \001(\t:f\352Ac\n$datalabeling.googlea"
          + "pis.com/DataItem\022;projects/{project}/dat"
          + "asets/{dataset}/dataItems/{data_item}B\t\n"
          + "\007payload\"\377\004\n\020AnnotatedDataset\022\014\n\004name\030\001 "
          + "\001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description"
          + "\030\t \001(\t\022N\n\021annotation_source\030\003 \001(\01623.goog"
          + "le.cloud.datalabeling.v1beta1.Annotation"
          + "Source\022J\n\017annotation_type\030\010 \001(\01621.google"
          + ".cloud.datalabeling.v1beta1.AnnotationTy"
          + "pe\022\025\n\rexample_count\030\004 \001(\003\022\037\n\027completed_e"
          + "xample_count\030\005 \001(\003\022B\n\013label_stats\030\006 \001(\0132"
          + "-.google.cloud.datalabeling.v1beta1.Labe"
          + "lStats\022/\n\013create_time\030\007 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022M\n\010metadata\030\n \001(\0132;.goog"
          + "le.cloud.datalabeling.v1beta1.AnnotatedD"
          + "atasetMetadata\022\032\n\022blocking_resources\030\013 \003"
          + "(\t:~\352A{\n,datalabeling.googleapis.com/Ann"
          + "otatedDataset\022Kprojects/{project}/datase"
          + "ts/{dataset}/annotatedDatasets/{annotate"
          + "d_dataset}\"\231\001\n\nLabelStats\022V\n\rexample_cou"
          + "nt\030\001 \003(\0132?.google.cloud.datalabeling.v1b"
          + "eta1.LabelStats.ExampleCountEntry\0323\n\021Exa"
          + "mpleCountEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001"
          + "(\003:\0028\001\"\242\010\n\030AnnotatedDatasetMetadata\022c\n\033i"
          + "mage_classification_config\030\002 \001(\0132<.googl"
          + "e.cloud.datalabeling.v1beta1.ImageClassi"
          + "ficationConfigH\000\022U\n\024bounding_poly_config"
          + "\030\003 \001(\01325.google.cloud.datalabeling.v1bet"
          + "a1.BoundingPolyConfigH\000\022L\n\017polyline_conf"
          + "ig\030\004 \001(\01321.google.cloud.datalabeling.v1b"
          + "eta1.PolylineConfigH\000\022T\n\023segmentation_co"
          + "nfig\030\005 \001(\01325.google.cloud.datalabeling.v"
          + "1beta1.SegmentationConfigH\000\022c\n\033video_cla"
          + "ssification_config\030\006 \001(\0132<.google.cloud."
          + "datalabeling.v1beta1.VideoClassification"
          + "ConfigH\000\022[\n\027object_detection_config\030\007 \001("
          + "\01328.google.cloud.datalabeling.v1beta1.Ob"
          + "jectDetectionConfigH\000\022Y\n\026object_tracking"
          + "_config\030\010 \001(\01327.google.cloud.datalabelin"
          + "g.v1beta1.ObjectTrackingConfigH\000\022F\n\014even"
          + "t_config\030\t \001(\0132..google.cloud.datalabeli"
          + "ng.v1beta1.EventConfigH\000\022a\n\032text_classif"
          + "ication_config\030\n \001(\0132;.google.cloud.data"
          + "labeling.v1beta1.TextClassificationConfi"
          + "gH\000\022f\n\035text_entity_extraction_config\030\013 \001"
          + "(\0132=.google.cloud.datalabeling.v1beta1.T"
          + "extEntityExtractionConfigH\000\022Y\n\027human_ann"
          + "otation_config\030\001 \001(\01328.google.cloud.data"
          + "labeling.v1beta1.HumanAnnotationConfigB\033"
          + "\n\031annotation_request_config\"\316\003\n\007Example\022"
          + "H\n\rimage_payload\030\002 \001(\0132/.google.cloud.da"
          + "talabeling.v1beta1.ImagePayloadH\000\022F\n\014tex"
          + "t_payload\030\006 \001(\0132..google.cloud.datalabel"
          + "ing.v1beta1.TextPayloadH\000\022H\n\rvideo_paylo"
          + "ad\030\007 \001(\0132/.google.cloud.datalabeling.v1b"
          + "eta1.VideoPayloadH\000\022\014\n\004name\030\001 \001(\t\022B\n\013ann"
          + "otations\030\005 \003(\0132-.google.cloud.datalabeli"
          + "ng.v1beta1.Annotation:\211\001\352A\205\001\n#datalabeli"
          + "ng.googleapis.com/Example\022^projects/{pro"
          + "ject}/datasets/{dataset}/annotatedDatase"
          + "ts/{annotated_dataset}/examples/{example"
          + "}B\t\n\007payload*W\n\010DataType\022\031\n\025DATA_TYPE_UN"
          + "SPECIFIED\020\000\022\t\n\005IMAGE\020\001\022\t\n\005VIDEO\020\002\022\010\n\004TEX"
          + "T\020\004\022\020\n\014GENERAL_DATA\020\006B\347\001\n%com.google.clo"
          + "ud.datalabeling.v1beta1P\001ZMgoogle.golang"
          + ".org/genproto/googleapis/cloud/datalabel"
          + "ing/v1beta1;datalabeling\252\002!Google.Cloud."
          + "DataLabeling.V1Beta1\312\002!Google\\Cloud\\Data"
          + "Labeling\\V1beta1\352\002$Google::Cloud::DataLa"
          + "beling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.DataPayloads.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Dataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "CreateTime",
              "InputConfigs",
              "BlockingResources",
              "DataItemCount",
            });
    internal_static_google_cloud_datalabeling_v1beta1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_InputConfig_descriptor,
            new java.lang.String[] {
              "TextMetadata",
              "GcsSource",
              "BigquerySource",
              "DataType",
              "AnnotationType",
              "ClassificationMetadata",
              "DataTypeMetadata",
              "Source",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_TextMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextMetadata_descriptor,
            new java.lang.String[] {
              "LanguageCode",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ClassificationMetadata_descriptor,
            new java.lang.String[] {
              "IsMultiLabel",
            });
    internal_static_google_cloud_datalabeling_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datalabeling_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUri", "MimeType",
            });
    internal_static_google_cloud_datalabeling_v1beta1_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datalabeling_v1beta1_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_BigQuerySource_descriptor,
            new java.lang.String[] {
              "InputUri",
            });
    internal_static_google_cloud_datalabeling_v1beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datalabeling_v1beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "GcsFolderDestination", "Destination",
            });
    internal_static_google_cloud_datalabeling_v1beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datalabeling_v1beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUri", "MimeType",
            });
    internal_static_google_cloud_datalabeling_v1beta1_GcsFolderDestination_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datalabeling_v1beta1_GcsFolderDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_GcsFolderDestination_descriptor,
            new java.lang.String[] {
              "OutputFolderUri",
            });
    internal_static_google_cloud_datalabeling_v1beta1_DataItem_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datalabeling_v1beta1_DataItem_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_DataItem_descriptor,
            new java.lang.String[] {
              "ImagePayload", "TextPayload", "VideoPayload", "Name", "Payload",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDataset_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "AnnotationSource",
              "AnnotationType",
              "ExampleCount",
              "CompletedExampleCount",
              "LabelStats",
              "CreateTime",
              "Metadata",
              "BlockingResources",
            });
    internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datalabeling_v1beta1_LabelStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor,
            new java.lang.String[] {
              "ExampleCount",
            });
    internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_LabelStats_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_LabelStats_ExampleCountEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDatasetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDatasetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotatedDatasetMetadata_descriptor,
            new java.lang.String[] {
              "ImageClassificationConfig",
              "BoundingPolyConfig",
              "PolylineConfig",
              "SegmentationConfig",
              "VideoClassificationConfig",
              "ObjectDetectionConfig",
              "ObjectTrackingConfig",
              "EventConfig",
              "TextClassificationConfig",
              "TextEntityExtractionConfig",
              "HumanAnnotationConfig",
              "AnnotationRequestConfig",
            });
    internal_static_google_cloud_datalabeling_v1beta1_Example_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datalabeling_v1beta1_Example_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Example_descriptor,
            new java.lang.String[] {
              "ImagePayload", "TextPayload", "VideoPayload", "Name", "Annotations", "Payload",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.AnnotationOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.DataPayloads.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
