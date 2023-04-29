package core_assessment;

import java.util.Scanner;

public class ProductRecordLinkedList {

	public static void main(String[] args) {
		ProductRecordManagement mr = new ProductRecordManagement();
		
		Product product = new Product();
		
		product.setId(1);
		product.setName("mouse");
		product.setPrice(150);
		product.setQuantity(5);
		product.setCompany("logitek");
		
		mr.add(product);
		
		Scanner input = new Scanner(System.in);
		
		int option = 0;
		
		do {
			menu();
			option = input.nextInt();
			
			switch (option) {
			case 1: 
				
				//Display message only
				System.out.print("what is the product id ?");
				int id = input.nextInt();
				
				//Display message only
				System.out.print("what is the  name ?");
				String name = input.next();
				
				
				//Display message only
				System.out.print("what is the product price ?");
				double price =  input.nextDouble();
				
				//Display message only
				System.out.print("what is the product Quantity ?");
				int quantity = input.nextInt();
				
				//Display message only
				System.out.print("what is the product company ?");
				String company = input.next();
				
				product = new Product(id, name, price, quantity, company);
				
				mr.add(product);
				System.out.println(product.toString());
				break;
			
			
			case 2: 
				
				//Display message
				System.out.print("what is the product id ?");
				int rid = input.nextInt();
				
				mr.delete(rid);
				break;
			
			
			case 3:
				
				//Display message
				System.out.print("what is the product id ? ");
				
				int ridNo = input.nextInt();
				mr.update(ridNo, input);
				break;
				
			case 4:
				
				//Display message
				System.out.print("what is the product id?");
				int productId = input.nextInt();
				
				if (!mr.find(productId)) {
					System.out.println("product id does not exist\n");
				}
				break;
				
				case 5:
					mr.display();
					break;
					
				case 6:
					
					System.out.println("\nThank you for using the program. Goodbye!\n");
					System.exit(0);
					break;
					
			default:
				System.out.println("\nInvalid input\n");
				break;
			}
		} while (option != 6);
	}
	
	public static void menu() {
		System.out.println("Menu");
		System.out.println("1: Add Product");
        System.out.println("2: Delete Product");
        System.out.println("3: Update Product");
        System.out.println("4: Search Product");
        System.out.println("5: Display Product");
        System.out.println("6: Exit program");
        System.out.print("Enter your selection : ");
	}
}
