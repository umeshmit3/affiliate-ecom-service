
package com.ecom.affiliate.model;

import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonDeserialize(using = CustomProductListDeserializer.class)
public class ProductListResponse {

    private String nextUrl;
    private BigInteger validTill;
    private String lastProductId;
    @JsonProperty("products")
    private List<ProductInfo> productInfoList = null;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public BigInteger getValidTill() {
        return validTill;
    }

    public void setValidTill(BigInteger validTill) {
        this.validTill = validTill;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }

	public String getLastProductId() {
		return lastProductId;
	}

	public void setLastProductId(String lastProductId) {
		this.lastProductId = lastProductId;
	}

}
