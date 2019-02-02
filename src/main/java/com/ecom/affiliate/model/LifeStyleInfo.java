
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
    "sleeve",
    "neck",
    "idealFor"
})
public class LifeStyleInfo {

    @JsonProperty("sleeve")
    private Object sleeve;
    @JsonProperty("neck")
    private Object neck;
    @JsonProperty("idealFor")
    private Object idealFor;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sleeve")
    public Object getSleeve() {
        return sleeve;
    }

    @JsonProperty("sleeve")
    public void setSleeve(Object sleeve) {
        this.sleeve = sleeve;
    }

    @JsonProperty("neck")
    public Object getNeck() {
        return neck;
    }

    @JsonProperty("neck")
    public void setNeck(Object neck) {
        this.neck = neck;
    }

    @JsonProperty("idealFor")
    public Object getIdealFor() {
        return idealFor;
    }

    @JsonProperty("idealFor")
    public void setIdealFor(Object idealFor) {
        this.idealFor = idealFor;
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
