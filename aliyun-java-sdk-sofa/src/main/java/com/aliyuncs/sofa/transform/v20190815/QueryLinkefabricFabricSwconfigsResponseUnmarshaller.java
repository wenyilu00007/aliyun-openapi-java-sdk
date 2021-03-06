/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSwconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSwconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSwconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricSwconfigsResponse unmarshall(QueryLinkefabricFabricSwconfigsResponse queryLinkefabricFabricSwconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSwconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.RequestId"));
		queryLinkefabricFabricSwconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.ResultCode"));
		queryLinkefabricFabricSwconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.ResultMessage"));
		queryLinkefabricFabricSwconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Message"));
		queryLinkefabricFabricSwconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSwconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricSwconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSwconfigsResponse.Success"));

		Data data = new Data();
		data.setDevStage(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.DevStage"));
		data.setEnv(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.Env"));
		data.setExtraParams(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.ExtraParams"));

		List<String> configs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSwconfigsResponse.Data.Configs.Length"); i++) {
			configs.add(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.Configs["+ i +"]"));
		}
		data.setConfigs(configs);

		List<String> projectConfigs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSwconfigsResponse.Data.ProjectConfigs.Length"); i++) {
			projectConfigs.add(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.ProjectConfigs["+ i +"]"));
		}
		data.setProjectConfigs(projectConfigs);

		List<String> sameRepoAppList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSwconfigsResponse.Data.SameRepoAppList.Length"); i++) {
			sameRepoAppList.add(_ctx.stringValue("QueryLinkefabricFabricSwconfigsResponse.Data.SameRepoAppList["+ i +"]"));
		}
		data.setSameRepoAppList(sameRepoAppList);
		queryLinkefabricFabricSwconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricSwconfigsResponse;
	}
}