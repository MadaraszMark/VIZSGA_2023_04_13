package task_04;

import java.util.ArrayList;
import java.util.List;

public class TaskSolution {
	
	List<Product> products = new ArrayList<Product>();
	
    public void fillProductList() {
        ReadDataFromFile readData = new ReadDataFromFile();
        products = readData.readDataFromCsv();
    }
    
    public void printAllProductData() {
    	System.out.printf("%-15s %-28s %-20s %-15s %-15s %n", "Azonosító", "Név", "Kategória", "Ár", "Eladott db");
    	for (Product product : products) {
            System.out.println(product.toStringDivider());
        }
    }
    
    public void getLeastExpensiveFlower() {
    	int min = products.get(0).getPrice();
    	for (Product product : products) {
			if (product.getPrice() < min) {
				min = product.getPrice();
			}
		}
    	System.out.println("\nA legolcsóbb termék(ek): ");
    	for (Product product : products) {
			if (product.getPrice() == min) {
				System.out.println(product.toStringDivider());
			}
		}
    }

}
