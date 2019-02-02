package com.ecom.affiliate.transformer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Umesh
 *
 */
public class CustomCategoryDeserializer extends JsonDeserializer<ProductCategoryResponse> {

	@Override
	public ProductCategoryResponse deserialize(JsonParser parser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		ProductCategoryResponse response = new ProductCategoryResponse();
		List<ProductCategory> categories = new ArrayList<>();
		response.setProductCategories(categories);
		JsonToken jsonToken = null;
		while (!parser.isClosed()) {
			jsonToken = parser.nextToken();

			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
				if (parser.getCurrentName().equalsIgnoreCase("apiListings")) {
					break;
				}
				jsonToken = parser.nextToken();
			}

		}

		jsonToken = parser.nextToken();

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonNode = null;

		while (!parser.isClosed()) {
			jsonToken = parser.nextToken();
			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
				ObjectCodec oc = parser.getCodec();
				JsonNode node = oc.readTree(parser);
				Iterator<String> fieldNames = node.fieldNames();
				while (fieldNames.hasNext()) {
					jsonNode = node.get(fieldNames.next());
					if (jsonNode != null) {
						ProductCategory pc = mapper.convertValue(jsonNode, ProductCategory.class);
						categories.add(pc);
					}
				}

				jsonToken = parser.nextToken();

			}
		}
		/*for (ProductCategory p : categories) {
			System.out.println(p.getApiName());
		}*/
		return response;
	}

}
