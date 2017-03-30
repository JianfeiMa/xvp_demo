package com.lingke.xvp.demo.db.dao;

import com.lingke.xvp.demo.db.dao.base.BaseDemoProduct;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class DemoProduct extends BaseDemoProduct<DemoProduct> {
	public static final DemoProduct dao = new DemoProduct();

	public static void addProduct(Long product_id, String name) throws Exception {
		DemoProduct product = new DemoProduct();
		product.setProductId(product_id);
		product.setProductName(name);
		product.save();
	}

	public static String getProductName(Long product_id) {
		DemoProduct product =  dao.findFirst("select * from demo_product where product_id =?", product_id);
		if(product!=null){
			return product.getProductName();
		}
		return null;
	}

}
