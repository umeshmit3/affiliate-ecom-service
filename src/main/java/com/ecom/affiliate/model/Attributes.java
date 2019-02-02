
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
    "size",
    "color",
    "storage",
    "sizeUnit",
    "displaySize"
})
public class Attributes {

    @JsonProperty("size")
    private String size;
    @JsonProperty("color")
    private String color;
    @JsonProperty("storage")
    private String storage;
    @JsonProperty("sizeUnit")
    private String sizeUnit;
    @JsonProperty("displaySize")
    private String displaySize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("storage")
    public String getStorage() {
        return storage;
    }

    @JsonProperty("storage")
    public void setStorage(String storage) {
        this.storage = storage;
    }

    @JsonProperty("sizeUnit")
    public String getSizeUnit() {
        return sizeUnit;
    }

    @JsonProperty("sizeUnit")
    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    @JsonProperty("displaySize")
    public String getDisplaySize() {
        return displaySize;
    }

    @JsonProperty("displaySize")
    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
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
