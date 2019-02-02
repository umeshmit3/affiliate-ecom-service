
package com.ecom.affiliate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "keySpecs",
    "detailedSpecs",
    "specificationList",
    "booksInfo",
    "lifeStyleInfo"
})
public class CategorySpecificInfoV1 {

    @JsonProperty("keySpecs")
    private List<String> keySpecs = null;
    @JsonProperty("detailedSpecs")
    private List<String> detailedSpecs = null;
    @JsonProperty("specificationList")
    private List<SpecificationList> specificationList = null;
    @JsonProperty("booksInfo")
    private BooksInfo booksInfo;
    @JsonProperty("lifeStyleInfo")
    private LifeStyleInfo lifeStyleInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("keySpecs")
    public List<String> getKeySpecs() {
        return keySpecs;
    }

    @JsonProperty("keySpecs")
    public void setKeySpecs(List<String> keySpecs) {
        this.keySpecs = keySpecs;
    }

    @JsonProperty("detailedSpecs")
    public List<String> getDetailedSpecs() {
        return detailedSpecs;
    }

    @JsonProperty("detailedSpecs")
    public void setDetailedSpecs(List<String> detailedSpecs) {
        this.detailedSpecs = detailedSpecs;
    }

    @JsonProperty("specificationList")
    public List<SpecificationList> getSpecificationList() {
        return specificationList;
    }

    @JsonProperty("specificationList")
    public void setSpecificationList(List<SpecificationList> specificationList) {
        this.specificationList = specificationList;
    }

    @JsonProperty("booksInfo")
    public BooksInfo getBooksInfo() {
        return booksInfo;
    }

    @JsonProperty("booksInfo")
    public void setBooksInfo(BooksInfo booksInfo) {
        this.booksInfo = booksInfo;
    }

    @JsonProperty("lifeStyleInfo")
    public LifeStyleInfo getLifeStyleInfo() {
        return lifeStyleInfo;
    }

    @JsonProperty("lifeStyleInfo")
    public void setLifeStyleInfo(LifeStyleInfo lifeStyleInfo) {
        this.lifeStyleInfo = lifeStyleInfo;
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
