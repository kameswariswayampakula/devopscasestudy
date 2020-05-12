package com.example.devopscasestudy.api;

public class ProductDTO {


private Integer productId;

private String productName;

private Double price;

private String imageUrl;

private Double starRating;

private String releaseDate;

private String productCode;

public Integer getProductId() {
return this.productId;
}

public void setProductId(Integer productId) {
this.productId = productId;
}

public String getProductName() {
return this.productName;
}

public void setProductName(String productName) {
this.productName = productName;
}

public Double getPrice() {
return this.price;
}

public void setPrice(Double price) {
this.price = price;
}

public String getImageUrl() {
return this.imageUrl;
}

public void setImageUrl(String imageUrl) {
this.imageUrl = imageUrl;
}

public Double getStarRating() {
return this.starRating;
}

public void setStarRating(Double starRating) {
this.starRating = starRating;
}

public String getReleaseDate() {
return this.releaseDate;
}

public void setReleaseDate(String releaseDate) {
this.releaseDate = releaseDate;
}

public String getProductCode() {
return this.productCode;
}

public void setProductCode(String productCode) {
this.productCode = productCode;
}



}