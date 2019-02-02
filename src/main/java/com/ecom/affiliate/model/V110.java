
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
    "resourceName",
    "delete",
    "put",
    "post",
    "get",
    "deltaGet"
})
public class V110 {

    @JsonProperty("resourceName")
    private String resourceName;
    @JsonProperty("delete")
    private Object delete;
    @JsonProperty("put")
    private Object put;
    @JsonProperty("post")
    private Object post;
    @JsonProperty("get")
    private String get;
    @JsonProperty("deltaGet")
    private String deltaGet;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resourceName")
    public String getResourceName() {
        return resourceName;
    }

    @JsonProperty("resourceName")
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @JsonProperty("delete")
    public Object getDelete() {
        return delete;
    }

    @JsonProperty("delete")
    public void setDelete(Object delete) {
        this.delete = delete;
    }

    @JsonProperty("put")
    public Object getPut() {
        return put;
    }

    @JsonProperty("put")
    public void setPut(Object put) {
        this.put = put;
    }

    @JsonProperty("post")
    public Object getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(Object post) {
        this.post = post;
    }

    @JsonProperty("get")
    public String getGet() {
        return get;
    }

    @JsonProperty("get")
    public void setGet(String get) {
        this.get = get;
    }

    @JsonProperty("deltaGet")
    public String getDeltaGet() {
        return deltaGet;
    }

    @JsonProperty("deltaGet")
    public void setDeltaGet(String deltaGet) {
        this.deltaGet = deltaGet;
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
