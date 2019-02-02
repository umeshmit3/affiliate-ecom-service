
package com.ecom.affiliate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "title",
    "productDescription",
    "imageUrls",
    "productFamily",
    "maximumRetailPrice",
    "flipkartSellingPrice",
    "flipkartSpecialPrice",
    "productUrl",
    "productBrand",
    "inStock",
    "codAvailable",
    "discountPercentage",
    "offers",
    "categoryPath",
    "attributes"
})
public class ProductBaseInfoV1 {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("productDescription")
    private String productDescription;
    @JsonProperty("imageUrls")
    private ImageUrls imageUrls;
    @JsonProperty("productFamily")
    private List<String> productFamily = null;
    @JsonProperty("maximumRetailPrice")
    private MaximumRetailPrice maximumRetailPrice;
    @JsonProperty("flipkartSellingPrice")
    private FlipkartSellingPrice flipkartSellingPrice;
    @JsonProperty("flipkartSpecialPrice")
    private FlipkartSpecialPrice flipkartSpecialPrice;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("productBrand")
    private String productBrand;
    @JsonProperty("inStock")
    private Boolean inStock;
    @JsonProperty("codAvailable")
    private Boolean codAvailable;
    @JsonProperty("discountPercentage")
    private Integer discountPercentage;
    @JsonProperty("offers")
    private List<String> offers = null;
    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("productDescription")
    public String getProductDescription() {
        return productDescription;
    }

    @JsonProperty("productDescription")
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @JsonProperty("imageUrls")
    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(ImageUrls imageUrls) {
        this.imageUrls = imageUrls;
    }

    @JsonProperty("productFamily")
    public List<String> getProductFamily() {
        return productFamily;
    }

    @JsonProperty("productFamily")
    public void setProductFamily(List<String> productFamily) {
        this.productFamily = productFamily;
    }

    @JsonProperty("maximumRetailPrice")
    public MaximumRetailPrice getMaximumRetailPrice() {
        return maximumRetailPrice;
    }

    @JsonProperty("maximumRetailPrice")
    public void setMaximumRetailPrice(MaximumRetailPrice maximumRetailPrice) {
        this.maximumRetailPrice = maximumRetailPrice;
    }

    @JsonProperty("flipkartSellingPrice")
    public FlipkartSellingPrice getFlipkartSellingPrice() {
        return flipkartSellingPrice;
    }

    @JsonProperty("flipkartSellingPrice")
    public void setFlipkartSellingPrice(FlipkartSellingPrice flipkartSellingPrice) {
        this.flipkartSellingPrice = flipkartSellingPrice;
    }

    @JsonProperty("flipkartSpecialPrice")
    public FlipkartSpecialPrice getFlipkartSpecialPrice() {
        return flipkartSpecialPrice;
    }

    @JsonProperty("flipkartSpecialPrice")
    public void setFlipkartSpecialPrice(FlipkartSpecialPrice flipkartSpecialPrice) {
        this.flipkartSpecialPrice = flipkartSpecialPrice;
    }

    @JsonProperty("productUrl")
    public String getProductUrl() {
        return productUrl;
    }

    @JsonProperty("productUrl")
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    @JsonProperty("productBrand")
    public String getProductBrand() {
        return productBrand;
    }

    @JsonProperty("productBrand")
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @JsonProperty("inStock")
    public Boolean getInStock() {
        return inStock;
    }

    @JsonProperty("inStock")
    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    @JsonProperty("codAvailable")
    public Boolean getCodAvailable() {
        return codAvailable;
    }

    @JsonProperty("codAvailable")
    public void setCodAvailable(Boolean codAvailable) {
        this.codAvailable = codAvailable;
    }

    @JsonProperty("discountPercentage")
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    @JsonProperty("discountPercentage")
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @JsonProperty("offers")
    public List<String> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    @JsonProperty("categoryPath")
    public String getCategoryPath() {
        return categoryPath;
    }

    @JsonProperty("categoryPath")
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
