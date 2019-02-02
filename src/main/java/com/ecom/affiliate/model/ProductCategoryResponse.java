
package com.ecom.affiliate.model;

import java.util.List;

import com.ecom.affiliate.transformer.CustomCategoryDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = CustomCategoryDeserializer.class)
public class ProductCategoryResponse {

    private List<ProductCategory> productCategories;

	public List<ProductCategory> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<ProductCategory> productCategories) {
		this.productCategories = productCategories;
	}


}
