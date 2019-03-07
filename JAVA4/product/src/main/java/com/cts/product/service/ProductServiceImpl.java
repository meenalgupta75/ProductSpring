package com.cts.product.service;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
import com.cts.product.dao.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {

	
	private static ProductServiceImpl proSeviceImpl;
	private ProductDAO p_dao= ProductDAOImpl.getInstance();
	public static ProductServiceImpl getInstance(){
		if(proServiceImpl==null){ 
			proSeviceImpl = new ProductServiceImpl();
			return proSeviceImpl;
		}
		else{
			return proSeviceImpl;
		}
		
	}
	
	
	public String insertProduct(Product product) {
		System.out.println("Inside service insertProduct");
		return p_dao.insertProduct(product);
	}
	
	public Product getProductsbyID(String id) {
		System.out.println("Inside service getProductById");
		return p_dao.getProductsbyID(id);
		
	}
	public boolean updateProduct(Product product) {
		System.out.println("Inside service updateProduct");
		return p_dao.updateProduct(product);
	}
	public List<Product> getAllProduct() {
		System.out.println("Inside service getallProduct");
		return p_dao.getAllProduct();
	}
	public List<Product> getAllProductByName(String name) {
		System.out.println("Inside service getProductByname");
		return p_dao.getAllProductByName(name);
	}


	public String deleteProductbyId(String id) {
		// TODO Auto-generated method stub
		System.out.println("Inside service delete");
		return p_dao.deleteProduct(id);
	}
	
	
	
	
}
