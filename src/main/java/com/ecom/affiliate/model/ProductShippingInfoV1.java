
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
    "shippingCharges",
    "estimatedDeliveryTime",
    "sellerName",
    "sellerAverageRating",
    "sellerNoOfRatings",
    "sellerNoOfReviews"
})
public class ProductShippingInfoV1 {

    @JsonProperty("shippingCharges")
    private ShippingCharges shippingCharges;
    @JsonProperty("estimatedDeliveryTime")
    private String estimatedDeliveryTime;
    @JsonProperty("sellerName")
    private String sellerName;
    @JsonProperty("sellerAverageRating")
    private Object sellerAverageRating;
    @JsonProperty("sellerNoOfRatings")
    private Integer sellerNoOfRatings;
    @JsonProperty("sellerNoOfReviews")
    private Integer sellerNoOfReviews;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shippingCharges")
    public ShippingCharges getShippingCharges() {
        return shippingCharges;
    }

    @JsonProperty("shippingCharges")
    public void setShippingCharges(ShippingCharges shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    @JsonProperty("estimatedDeliveryTime")
    public String getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    @JsonProperty("estimatedDeliveryTime")
    public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    @JsonProperty("sellerName")
    public String getSellerName() {
        return sellerName;
    }

    @JsonProperty("sellerName")
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @JsonProperty("sellerAverageRating")
    public Object getSellerAverageRating() {
        return sellerAverageRating;
    }

    @JsonProperty("sellerAverageRating")
    public void setSellerAverageRating(Object sellerAverageRating) {
        this.sellerAverageRating = sellerAverageRating;
    }

    @JsonProperty("sellerNoOfRatings")
    public Integer getSellerNoOfRatings() {
        return sellerNoOfRatings;
    }

    @JsonProperty("sellerNoOfRatings")
    public void setSellerNoOfRatings(Integer sellerNoOfRatings) {
        this.sellerNoOfRatings = sellerNoOfRatings;
    }

    @JsonProperty("sellerNoOfReviews")
    public Integer getSellerNoOfReviews() {
        return sellerNoOfReviews;
    }

    @JsonProperty("sellerNoOfReviews")
    public void setSellerNoOfReviews(Integer sellerNoOfReviews) {
        this.sellerNoOfReviews = sellerNoOfReviews;
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
