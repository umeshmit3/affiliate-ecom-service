package com.ecom.affiliate.dal;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.ecom.affiliate.client.FKServiceClient;
import com.ecom.affiliate.exception.FeedServiceException;
import com.ecom.affiliate.model.ProductCategoryResponse;
import com.ecom.affiliate.model.ProductInfo;
import com.ecom.affiliate.model.ProductListResponse;
import com.ecom.affiliate.transformer.CustomCategoryDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.gson.Gson;

@Component("serviceDao")
public class FKDaoImpl implements ServiceDao {

	@Resource(name = "fkClient")
	private FKServiceClient serviceClient;

	@Override
	public ProductCategoryResponse getAllCategories() throws FeedServiceException {
		ProductCategoryResponse resp = new ProductCategoryResponse();
		ObjectMapper mapper = new ObjectMapper();
		/*SimpleModule module = new SimpleModule();
		module.addDeserializer(ProductCategoryResponse.class, new CustomCategoryDeserializer(ProductCategoryResponse.class));
		mapper.registerModule(module);*/
		
		String response = serviceClient.get("https://affiliate-api.flipkart.net/affiliate/api/hotspotum.json");
//		ProductCategoryResponse data = new Gson().fromJson(response, ProductCategoryResponse.class);
		try {
			mapper.readValue(response, ProductCategoryResponse.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductListResponse getProductsFromCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductInfo> findProducts(String category, String productKey) {

		return null;
	}

}
