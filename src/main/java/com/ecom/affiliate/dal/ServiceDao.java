package com.ecom.affiliate.dal;

import java.util.List;

import com.ecom.affiliate.exception.FeedServiceException;
import com.ecom.affiliate.model.ProductCategoryResponse;
import com.ecom.affiliate.model.ProductInfo;
import com.ecom.affiliate.model.ProductListResponse;

public interface ServiceDao {
	
	public ProductCategoryResponse getAllCategories() throws FeedServiceException;

	public ProductListResponse getProductsFromCategory(String category) throws FeedServiceException;

	public List<ProductInfo> findProducts(String category, String productKey);
}
