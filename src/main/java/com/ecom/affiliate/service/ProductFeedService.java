package com.ecom.affiliate.service;

import java.util.List;

import com.ecom.affiliate.model.ProductCategoryResponse;
import com.ecom.affiliate.model.ProductInfo;
import com.ecom.affiliate.model.ProductListResponse;

public interface ProductFeedService {

	public ProductCategoryResponse getAllCategories();

	public ProductListResponse getProductsFromCategory(String category);

	public List<ProductInfo> findProducts(String category, String productKey);
}
