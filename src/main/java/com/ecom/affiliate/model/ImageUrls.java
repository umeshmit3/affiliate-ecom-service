
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
    "200x200",
    "400x400",
    "800x800"
})
public class ImageUrls {

    @JsonProperty("200x200")
    private String _200x200;
    @JsonProperty("400x400")
    private String _400x400;
    @JsonProperty("800x800")
    private String _800x800;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("200x200")
    public String get200x200() {
        return _200x200;
    }

    @JsonProperty("200x200")
    public void set200x200(String _200x200) {
        this._200x200 = _200x200;
    }

    @JsonProperty("400x400")
    public String get400x400() {
        return _400x400;
    }

    @JsonProperty("400x400")
    public void set400x400(String _400x400) {
        this._400x400 = _400x400;
    }

    @JsonProperty("800x800")
    public String get800x800() {
        return _800x800;
    }

    @JsonProperty("800x800")
    public void set800x800(String _800x800) {
        this._800x800 = _800x800;
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
