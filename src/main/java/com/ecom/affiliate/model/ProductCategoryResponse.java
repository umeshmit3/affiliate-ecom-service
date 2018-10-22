
package com.ecom.affiliate.model;

import com.ecom.affiliate.transformer.CustomCategoryDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = CustomCategoryDeserializer.class)
public class ProductCategoryResponse {

    private String title;
    private String description;
    private ApiGroups apiGroups;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiGroups getApiGroups() {
        return apiGroups;
    }

    public void setApiGroups(ApiGroups apiGroups) {
        this.apiGroups = apiGroups;
    }

}
