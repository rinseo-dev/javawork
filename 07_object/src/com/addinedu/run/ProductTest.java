package com.addinedu.run;

import com.addinedu.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {

		//Product pd1 = new Product();
		Product pd1 = new Product("캔참치","동원참치","롯데마트",3000,300);
		
		pd1.setPrice(1200000);
		pd1.setTax(0.05);
		
		System.out.println(pd1.information());
		System.out.println("부가세 포함 가격 = "+(pd1.getPrice()+(pd1.getPrice()*pd1.getTax())));
	}

}
