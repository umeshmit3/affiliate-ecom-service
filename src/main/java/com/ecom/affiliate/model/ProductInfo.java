
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
    "productBaseInfoV1",
    "productShippingInfoV1",
    "categorySpecificInfoV1"
})
public class ProductInfo {

    @JsonProperty("productBaseInfoV1")
    private ProductBaseInfoV1 productBaseInfoV1;
    @JsonProperty("productShippingInfoV1")
    private ProductShippingInfoV1 productShippingInfoV1;
    @JsonProperty("categorySpecificInfoV1")
    private CategorySpecificInfoV1 categorySpecificInfoV1;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("productBaseInfoV1")
    public ProductBaseInfoV1 getProductBaseInfoV1() {
        return productBaseInfoV1;
    }

    @JsonProperty("productBaseInfoV1")
    public void setProductBaseInfoV1(ProductBaseInfoV1 productBaseInfoV1) {
        this.productBaseInfoV1 = productBaseInfoV1;
    }

    @JsonProperty("productShippingInfoV1")
    public ProductShippingInfoV1 getProductShippingInfoV1() {
        return productShippingInfoV1;
    }

    @JsonProperty("productShippingInfoV1")
    public void setProductShippingInfoV1(ProductShippingInfoV1 productShippingInfoV1) {
        this.productShippingInfoV1 = productShippingInfoV1;
    }

    @JsonProperty("categorySpecificInfoV1")
    public CategorySpecificInfoV1 getCategorySpecificInfoV1() {
        return categorySpecificInfoV1;
    }

    @JsonProperty("categorySpecificInfoV1")
    public void setCategorySpecificInfoV1(CategorySpecificInfoV1 categorySpecificInfoV1) {
        this.categorySpecificInfoV1 = categorySpecificInfoV1;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
