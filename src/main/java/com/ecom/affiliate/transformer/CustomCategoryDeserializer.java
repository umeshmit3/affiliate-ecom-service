package com.ecom.affiliate.transformer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ecom.affiliate.model.ProductCategory;
import com.ecom.affiliate.model.ProductCategoryResponse;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * @author Umesh
 *
 */
public class CustomCategoryDeserializer extends JsonDeserializer<ProductCategoryResponse> {

	private static final long serialVersionUID = 1L;

	@Override
	public ProductCategoryResponse deserialize(JsonParser parser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ProductCategoryResponse resp = new ProductCategoryResponse();
		List<ProductCategory> list = new ArrayList<>();
		JsonToken jsonToken = null;
		while (!parser.isClosed()) {
			jsonToken = parser.nextToken();

			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
				if(parser.getCurrentName().equalsIgnoreCase("apiListings")) {
					break;
				}
				jsonToken = parser.nextToken();
			}

		}

		jsonToken = parser.nextToken();

		
		while (!parser.isClosed()) {
			jsonToken = parser.nextToken();
			if(JsonToken.FIELD_NAME.equals(jsonToken)) {
				ObjectCodec oc = parser.getCodec();
				JsonNode node = oc.readTree(parser);
				System.out.println(node.toString());
//				mapper.readValue(response, ProductCategoryResponse.class);
				
				ProductCategory pc= new ProductCategory(); 
				String fieldName = parser.getCurrentName();
				System.out.println(fieldName);
				pc.setCategoryName(fieldName);
				jsonToken = parser.nextToken();
				list.add(pc);
				/*
				 * if("brand".equals(fieldName)){ car.setBrand(parser.getValueAsString()); }
				 * else if ("doors".equals(fieldName)){ car.setDoors(parser.getValueAsInt()); }
				 */
			}
		}
		for(ProductCategory p : list) {
			System.out.println(p.getCategoryName());
		}
		return resp;
	}

}
