package com.cts.product.dao;

import com.cts.product.bean.Product;

public interface ProductDAO {

	
	public <List>Product getAllProducts();
	public <List>Product getProductsbyID(String id);
	public String insertProduct(Product product);
	public String updateProduct(Product product);
	public String deleteProduct(String id);
	
}
