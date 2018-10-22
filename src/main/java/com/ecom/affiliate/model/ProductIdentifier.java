
package com.ecom.affiliate.model;


public class ProductIdentifier {

    private String productId;
    private CategoryPaths categoryPaths;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public CategoryPaths getCategoryPaths() {
        return categoryPaths;
    }

    public void setCategoryPaths(CategoryPaths categoryPaths) {
        this.categoryPaths = categoryPaths;
    }

}
