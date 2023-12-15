package tester;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
import static code.ProductUtils.populateList;
import code.Product;

public class ProductTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			ArrayList<Product> prodList = populateList();// new ArrayList<Product>();

			do {
				System.out.println(
						"**********************************************************************************************");
				System.out.println("Enter choice : \n" + "1: Accept product Details :\n"
						+ "2: Search Product by Name :\n" + "3: Exit");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter Product Datails : ID , Name, Price , Quantity :");
					Product p1 = new Product(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
					prodList.add(p1);
					System.out.println("Sorted product list According to name :");
					
					Collections.sort(prodList, (pr1, pr2) -> pr1.getpName().compareTo(pr2.getpName()));
					prodList.forEach(d -> System.out.println(d));
					break;
				case 2:
					System.out.println("Enter Product Name :");
					String nm = sc.next();
					Product pr = new Product(nm);
					int index = prodList.indexOf(pr);
					if (index == -1) {
						return;
					} else {
						Product prod = prodList.get(index);
						System.out.println(prod);
					}

					break;
				case 0:
					break;
				default:
					System.out.println("Please Enter Valid Choice");
					break;

				}
			} while (choice != 0);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
