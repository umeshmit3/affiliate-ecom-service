package com.ecom.affiliate.service;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.affiliate.dal.ServiceDao;
import com.ecom.affiliate.exception.FeedServiceException;
import com.ecom.affiliate.model.ProductCategoryResponse;
import com.ecom.affiliate.model.ProductInfo;
import com.ecom.affiliate.model.ProductListResponse;

@RestController
public class FKFeedService implements ProductFeedService {

	@Autowired
	private ServiceDao serviceDao;

	@RequestMapping(method = RequestMethod.GET, value = "/getallcategory")
	@Override
	public @ResponseBody ProductCategoryResponse getAllCategories() {
		// TODO Auto-generated method stub
		try {
			return serviceDao.getAllCategories();
		} catch (FeedServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getProducts/{category}")
	@Override
	public ProductListResponse getProductsFromCategory(@PathParam("category") String category) {
		// TODO Auto-generated method stub
		return serviceDao.getProductsFromCategory(category);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/findProducts/{category}/{key}")
	@Override
	public List<ProductInfo> findProducts(@PathParam("category") String category, @PathParam("key") String productKey) {
		// TODO Auto-generated method stub
		return serviceDao.findProducts(category, productKey);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String test() {
		System.out.println("Testing...");
		return "feeder service is up..";
	}

}
