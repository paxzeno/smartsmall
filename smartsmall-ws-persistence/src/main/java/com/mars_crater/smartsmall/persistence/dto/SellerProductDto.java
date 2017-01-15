package com.mars_crater.smartsmall.persistence.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.mars_crater.smartsmall.persistence.enums.ProductTag;
import com.mars_crater.smartsmall.persistence.enums.Sizes;

@XmlRootElement(name = "sellerProducts")
public class SellerProductDto implements Serializable {

	/** serial version unique identifier */
	private static final long serialVersionUID = -4434533585837294938L;

	private Long id;

	@XmlElement
	private String refName;

	@XmlElement
	private Set<Sizes> sizesAvailable;

	@XmlElement
	private Integer productsAvailable;

	@XmlElement
	private Integer productsSold;

	@XmlElement
	private List<ProductTag> productCategory;

	public SellerProductDto() {
	}

	public SellerProductDto(Long id, String refName, Set<Sizes> sizesAvailable, Integer productsAvailable,
			Integer productsSold, List<ProductTag> productCategory) {
		super();
		this.id = id;
		this.refName = refName;
		this.sizesAvailable = sizesAvailable;
		this.productsAvailable = productsAvailable;
		this.productsSold = productsSold;
		this.productCategory = productCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRefName() {
		return refName;
	}

	public void setRefName(String refName) {
		this.refName = refName;
	}

	public Set<Sizes> getSizesAvailable() {
		return sizesAvailable;
	}

	public void setSizesAvailable(Set<Sizes> sizesAvailable) {
		this.sizesAvailable = sizesAvailable;
	}

	public Integer getProductsAvailable() {
		return productsAvailable;
	}

	public void setProductsAvailable(Integer productsAvailable) {
		this.productsAvailable = productsAvailable;
	}

	public Integer getProductsSold() {
		return productsSold;
	}

	public void setProductsSold(Integer productsSold) {
		this.productsSold = productsSold;
	}

	public List<ProductTag> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<ProductTag> productCategory) {
		this.productCategory = productCategory;
	}

}
