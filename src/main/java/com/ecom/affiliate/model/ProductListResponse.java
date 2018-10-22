
package com.ecom.affiliate.model;

import java.util.List;

public class ProductListResponse {

    private String nextUrl;
    private Integer validTill;
    private List<ProductInfo> productInfoList = null;

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public Integer getValidTill() {
        return validTill;
    }

    public void setValidTill(Integer validTill) {
        this.validTill = validTill;
    }

    public List<ProductInfo> getProductInfoList() {
        return productInfoList;
    }

    public void setProductInfoList(List<ProductInfo> productInfoList) {
        this.productInfoList = productInfoList;
    }

}
