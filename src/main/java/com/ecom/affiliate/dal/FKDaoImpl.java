package com.ecom.affiliate.dal;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ecom.affiliate.client.FKServiceClient;
import com.ecom.affiliate.exception.FeedServiceException;
import com.ecom.affiliate.model.ProductCategory;
import com.ecom.affiliate.model.ProductCategoryResponse;
import com.ecom.affiliate.model.ProductInfo;
import com.ecom.affiliate.model.ProductListResponse;
import com.ecom.affiliate.util.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component("serviceDao")
public class FKDaoImpl implements ServiceDao {

	@Resource(name = "fkClient")
	private FKServiceClient serviceClient;

	private HashMap<String, ProductCategory> categoryDetailMap = new HashMap<>();

	@Override
	public ProductCategoryResponse getAllCategories() throws FeedServiceException {
		ObjectMapper mapper = new ObjectMapper();
		ProductCategoryResponse categories = null;

		String response = serviceClient.get(Constants.GET_ALL_CATEGORY);
		try {
			categories = mapper.readValue(response, ProductCategoryResponse.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		updateCategoryMap(categories);
		return categories;
	}

	@Override
	public ProductListResponse getProductsFromCategory(String category) throws FeedServiceException {
		ObjectMapper mapper = new ObjectMapper();
		ProductListResponse categories = null;
		String response = null;
		String requestUrl = categoryDetailMap.get(category).getAvailableVariants().getV110().getGet();
		if (requestUrl == null || requestUrl.isEmpty()) {
			getAllCategories();
		}
		response = serviceClient.get(requestUrl);
		try {
			categories = mapper.readValue(response, ProductListResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categories;
	}

	private void updateCategoryMap(ProductCategoryResponse categories) {
		for (ProductCategory product : categories.getProductCategories()) {
			categoryDetailMap.put(product.getApiName(), product);
		}
	}

	@Override
	public List<ProductInfo> findProducts(String category, String productKey) {

		return null;
	}

}
