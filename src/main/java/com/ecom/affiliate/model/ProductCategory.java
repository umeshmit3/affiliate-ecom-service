
package com.ecom.affiliate.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "availableVariants",
    "apiName"
})
public class ProductCategory {

    @JsonProperty("availableVariants")
    private AvailableVariants availableVariants;
    @JsonProperty("apiName")
    private String apiName;
   
    @JsonProperty("categoryName")
    private String categoryName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("availableVariants")
    public AvailableVariants getAvailableVariants() {
        return availableVariants;
    }

    @JsonProperty("availableVariants")
    public void setAvailableVariants(AvailableVariants availableVariants) {
        this.availableVariants = availableVariants;
    }

    @JsonProperty("apiName")
    public String getApiName() {
        return apiName;
    }

    @JsonProperty("apiName")
    public void setApiName(String apiName) {
        this.apiName = apiName;
		this.categoryName = this.apiName.indexOf('_') > 0 ? apiName.replace('_', ' ') : this.apiName;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
