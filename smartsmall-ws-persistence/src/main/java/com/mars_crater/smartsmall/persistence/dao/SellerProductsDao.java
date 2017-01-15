package com.mars_crater.smartsmall.persistence.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.mars_crater.smartsmall.persistence.dto.SellerProductDto;
import com.mars_crater.smartsmall.persistence.enums.ProductTag;
import com.mars_crater.smartsmall.persistence.enums.Sizes;

public class SellerProductsDao {

	public List<SellerProductDto> findAll() {
		final List<SellerProductDto> products = new ArrayList<>();
		
		final SellerProductDto sweater = new SellerProductDto(1l, "fantastic sweater",
				getSizes(Sizes.M, Sizes.L, Sizes.XL), 50, 25, getProductTags(ProductTag.MEN));
		products.add(sweater);
		
		final SellerProductDto blouse = new SellerProductDto(2l, "pink blouse",
				getSizes(Sizes.S, Sizes.L, Sizes.XL), 150, 25, getProductTags(ProductTag.WOMEN));
		products.add(blouse);
		
		final SellerProductDto snickers = new SellerProductDto(3l, "child snickers",
				getSizes(Sizes.M, Sizes.L, Sizes.XL), 200, 10, getProductTags(ProductTag.CHILD));
		products.add(snickers);

		return products;
	}

	public static Set<Sizes> getSizes(final Sizes... sizes) {
		final Set<Sizes> sizeSet = new HashSet<>();
		sizeSet.addAll(Arrays.asList(sizes));
		return sizeSet;
	}

	private static List<ProductTag> getProductTags(final ProductTag... productTags) {
		final List<ProductTag> productTagList = new ArrayList<>();
		productTagList.addAll(Arrays.asList(productTags));
		return productTagList;
	}
}
