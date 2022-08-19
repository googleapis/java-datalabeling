/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datalabeling.v1beta1.samples;

// [START datalabeling_v1beta1_generated_datalabelingserviceclient_listevaluationjobs_paged_async]
import com.google.cloud.datalabeling.v1beta1.DataLabelingServiceClient;
import com.google.cloud.datalabeling.v1beta1.EvaluationJob;
import com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsRequest;
import com.google.cloud.datalabeling.v1beta1.ListEvaluationJobsResponse;
import com.google.cloud.datalabeling.v1beta1.ProjectName;
import com.google.common.base.Strings;

public class AsyncListEvaluationJobsPaged {

  public static void main(String[] args) throws Exception {
    asyncListEvaluationJobsPaged();
  }

  public static void asyncListEvaluationJobsPaged() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (DataLabelingServiceClient dataLabelingServiceClient = DataLabelingServiceClient.create()) {
      ListEvaluationJobsRequest request =
          ListEvaluationJobsRequest.newBuilder()
              .setParent(ProjectName.of("[PROJECT]").toString())
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      while (true) {
        ListEvaluationJobsResponse response =
            dataLabelingServiceClient.listEvaluationJobsCallable().call(request);
        for (EvaluationJob element : response.getEvaluationJobsList()) {
          // doThingsWith(element);
        }
        String nextPageToken = response.getNextPageToken();
        if (!Strings.isNullOrEmpty(nextPageToken)) {
          request = request.toBuilder().setPageToken(nextPageToken).build();
        } else {
          break;
        }
      }
    }
  }
}
// [END datalabeling_v1beta1_generated_datalabelingserviceclient_listevaluationjobs_paged_async]
