package core_assessment;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductRecordManagement {

	// Creating an empty LinkedList
	LinkedList<Product> list;
	
	// Default Constructor
	public ProductRecordManagement() {
		list = new LinkedList<>();
	}
	
	// Method 1
    // Adding Record
    // @param record
	public void add(Product product) {
		// Checking if a record already exists or not,
        // if not add it to Record list, Otherwise
        // error display message
		if (!find(product.getId())) {
			list.add(product);
		} else {
			 // Print statement
            System.out.println(
                "Record already exists in the Record list");
		}
	}
	
	// Method 2
    // Searching Record
    // @param id
    //  @return
	public boolean find(int id) {
		
		// Iterating record list
        // using for each loop
		for (Product p : list) {
			
			// Checking record by id Number
			if (p.getId() == id) {
				
				System.out.println(p);
				return true;
			}
		}
		return false;
	}
	
	// Method 3
    // Delete Record
    // @param recId
	public void delete(int recid) {
		Product productDel = null;
		
		// Iterating record list
		for (Product pp : list) {
			
			// Finding record to be deleted by id Number
			if (pp.getId() == recid) {
				productDel = pp;
			}
		}
		
		// If productDel is null, then show error message,
        // otherwise remove the product from Product list
		if (productDel == null) {
			
			// Displaying no record found
			System.out.println("Invalid product Id");
		} else {

			list.remove(productDel);
			
			// Display message for successful deletion of
			// product
			System.out.println("Successfully removed product from the list");
		}
	}
	
	 // Method 4
    // Finding Product
    // @param id
    // @return
	public Product findProduct(int id) {
		
		//Iterate Product list
		// using for each loop
		for (Product p : list) {
			
			//checking product by id;
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}
	
	// Method 5
    // Update Product
    // @param id
    // @param input
	public void update(int idNo,Scanner input) {
		if (find(idNo)) {
			Product pro = findProduct(idNo);
			
			//Display message only
			System.out.print("what is the product id: ");
			int id = input.nextInt();
			
			//Display message only
			System.out.print("what is the product name ?\n");
			String name = input.next();
			
			//Display message only
			System.out.print("what is the product price ?\n");
			double price =  input.nextDouble();
			
			//Display message only
			System.out.print("what is the product Quantity ?\n");
			int quantity = input.nextInt();
			
			//Display message only
			System.out.print("what is the product company ?\n");
			String company = input.next();
			
			pro.setId(id);
			pro.setName(name);
			pro.setPrice(price);
			pro.setQuantity(quantity);
			pro.setCompany(company);
			System.out.println("Product Updated Successfully");
		} else {
			
			//print statement
			System.out.println("Product Not Fount in the Product list");
		}
	}
	
	//Method 6
	// Display Records
	public void display() {
		
		// If product list is empty then
		// print the message below
		if (list.isEmpty()) {
			
			
			// Print Statement
			System.out.println("The list has no products\n");
		}
		//Iterating Record list
		// using for each loop
		for (Product product : list) {
			
			// Printing the list
			System.out.println(product.toString());
		}
	}
}
