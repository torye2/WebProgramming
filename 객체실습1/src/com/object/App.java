package com.object;

import java.util.Scanner;

import com.object.practice.Product;

public class App {

	public static void main(String[] args) {
		Product products[] = new Product[4];
		products[0] = new Product("ss", "note10", "갤럭시 노트10", "수원", 960000, 0.1);
		products[1] = new Product("ss", "s25", "갤럭시 s25", "평택", 1200000, 0.7);
		products[2] = new Product("apple", "iphone15", "아이폰 15", "강남", 1400000, 0.3);
		products[3] = new Product("apple", "iphone14", "아이폰 14", "태평로", 1200000, 0.5);
		double realPrice;
		/*
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("product[" + i + "]의 ID: ");
			products[i].setId(sc.next());
			System.out.println("product[" + i + "]의 Name: ");
			products[i].setName(sc.next());
			System.out.println("product[" + i + "]의 Product: ");
			products[i].setProduct(sc.next());
			System.out.println("product[" + i + "]의 Site: ");
			products[i].setSite(sc.next());
			System.out.println("product[" + i + "]의 Price: ");
			products[i].setPrice(sc.nextInt());
			System.out.println("product[" + i + "]의 Tax: ");
			products[i].setTax(sc.nextDouble());
		}
		*/
		
		for(int i = 0; i < 4; i++) {
			System.out.println(products[i]);
		}
		System.out.println("======================================\n");
		
		for(int i = 0; i < 4; i++) {
			products[i].setPrice(1200000);
			products[i].setTax(0.1);
			System.out.println(products[i]);
		}
		System.out.println("======================================\n");
		
		for(int i = 0; i < 4; i++) {
			realPrice = products[i].getPrice() + (products[i].getPrice() * products[i].getTax());
			System.out.println(products[i].getProduct() + "의 부가세 포함 가격 = " + realPrice + "원\n");
		}
	}
}
