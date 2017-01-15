package com.mars_crater.rest.services.seller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mars_crater.smartsmall.persistence.dao.SellerProductsDao;
import com.mars_crater.smartsmall.persistence.dto.SellerProductDto;

@Path("/SellerProductServices")
public class ProductServices {

	private SellerProductsDao productsDao = new SellerProductsDao();

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<SellerProductDto> getUsers() {
		return productsDao.findAll();
	}
	
	
}
