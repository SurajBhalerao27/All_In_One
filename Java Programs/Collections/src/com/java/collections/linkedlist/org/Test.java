package com.java.collections.linkedlist.org;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

import com.java.collections.arraylist.org.Product;

public class Test {

	/*
	 * LinkedList allows duplicates values and it allows duplicates values
	 * and follows insertion order. Null entries or values are allowed
	 * Multiple Null are allowed
	 */
	/*Difference Between ArrayList and LinkedList Difference is*/
	/*When we are doing frequent insertion and deletion LinkList is Better because in ArrayList
	 * if 1 million  entry is there then 1 million shift is there.
	 * if you want to do insertion and deletion best choice is LinkedList and to display data array is best */
	
	
	public static void main(String[] args) {

		Product p1 = new Product(11, "Pen", 20);
		Product p2 = new Product(12, "Notebook", 50);
		Product p3 = new Product(13, "Teskbook", 200);
		Product p4 = new Product(14, "Marker", 20);
		Product p5 = new Product(15, "Bag", 1000);

		LinkedList<Product> products = new LinkedList<>();

		products.add(null);
		products.add(p1);
		products.add(null);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p5);

		System.out.println("------------------------------------");
		System.out.println(products.contains(p5)); // this method gives the status of element present in the HashSet or
		// not.
		products.add(1,p5); // this method is used to update at particular index
		// (indexing starts form 0)
		products.remove(p3); // it remove the object of particular index
		//products.clear(); //it clear the data of all objects
		//products.removeAll(products); //it delete all objects
		System.out.println(products.size());// it gives no of elements present in HashSet

		System.out.println("------------------------------------");

		System.out.println("1.Using for loop iteration");
		for (int i = 0; i < products.size(); ++i) {
			System.out.println(products.get(i));
		}

		System.out.println("------------------------------------");

		System.out.println("2.Using for each loop iteration");
		for (Product p : products) {
			System.out.println(p);
		}

		System.out.println("------------------------------------");

		System.out.println("3.Using iteration");
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
			Product t = itr.next();
			System.out.println(t);
		}
		System.out.println("------------------------------------");

		System.out.println("4.a.Using Next List iteration"); // having advantage to
		// go forward and backward 
		ListIterator<Product> litr = products.listIterator();
		while (litr.hasNext()) { //forward traversing
			
			System.out.println(litr.next());   
		}
		System.out.println("4.b.Using Previous List iteration"); 
		while(litr.hasPrevious()) { // reverse traversing //
			
			System.out.println(litr.previous()); 
		}

		System.out.println("------------------------------------");

		System.out.println("5.Collection.Enumeration");
		Enumeration<Product> e = Collections.enumeration(products);
		while (e.hasMoreElements()) {
			Product p = e.nextElement();
			System.out.println(p);
		}
		System.out.println("------------------------------------");

		System.out.println("6.Lambda Exprssion or foreach method");
		products.forEach(p -> System.out.println(p));
		System.out.println("------------------------------------");
		System.out.println("------------------------------------");

		System.out.println("7. Using method ref");
		products.forEach(System.out::println);
		System.out.println("------------------------------------");

	}
}
