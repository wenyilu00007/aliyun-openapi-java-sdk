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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListScalingConfigItemV2Request extends RpcAcsRequest<ListScalingConfigItemV2Response> {
	   

	private Long resourceOwnerId;

	private Integer pageCount;

	private String orderMode;

	private Integer pageNumber;

	private String scalingGroupBizId;

	private String resourceGroupId;

	private Integer limit;

	private Integer pageSize;

	private Integer currentSize;

	private String orderField;

	private String configItemType;
	public ListScalingConfigItemV2Request() {
		super("Emr", "2016-04-08", "ListScalingConfigItemV2");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Integer getPageCount() {
		return this.pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
		if(pageCount != null){
			putQueryParameter("PageCount", pageCount.toString());
		}
	}

	public String getOrderMode() {
		return this.orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
		if(orderMode != null){
			putQueryParameter("OrderMode", orderMode);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getScalingGroupBizId() {
		return this.scalingGroupBizId;
	}

	public void setScalingGroupBizId(String scalingGroupBizId) {
		this.scalingGroupBizId = scalingGroupBizId;
		if(scalingGroupBizId != null){
			putQueryParameter("ScalingGroupBizId", scalingGroupBizId);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getCurrentSize() {
		return this.currentSize;
	}

	public void setCurrentSize(Integer currentSize) {
		this.currentSize = currentSize;
		if(currentSize != null){
			putQueryParameter("CurrentSize", currentSize.toString());
		}
	}

	public String getOrderField() {
		return this.orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
		if(orderField != null){
			putQueryParameter("OrderField", orderField);
		}
	}

	public String getConfigItemType() {
		return this.configItemType;
	}

	public void setConfigItemType(String configItemType) {
		this.configItemType = configItemType;
		if(configItemType != null){
			putQueryParameter("ConfigItemType", configItemType);
		}
	}

	@Override
	public Class<ListScalingConfigItemV2Response> getResponseClass() {
		return ListScalingConfigItemV2Response.class;
	}

}
