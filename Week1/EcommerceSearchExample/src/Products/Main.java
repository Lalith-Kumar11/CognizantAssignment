package Products;
import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<product> prod = new ArrayList<>();
		
		prod.add(new product(303,"Red T-shirt","T-Shirt",569.00));
		prod.add(new product(205,"Black Shorts","Shorts",299.00));
		prod.add(new product(150,"white Shirt","Shirt",899.00));
		prod.add(new product(260,"grey jeans","Jeans",799.00));
		
		System.out.println("Enter id to serach the product");
		int k = sc.nextInt();	
		
		SearchEngine linear = new LinearSearch();
		System.out.println("Linear Search results");
		product resultLinear = linear.Search(prod, k);

		if(resultLinear!=null) {
			System.out.println(resultLinear.getProductId()+" - "+resultLinear.getProductName()+" - "+resultLinear.getProductCategory()+" - "+resultLinear.getProductPrice());
		}
		
		
		SearchEngine binary = new BinarySearch();
		System.out.println("Binary Search results");
		product resultBinary = binary.Search(prod,k);

		if(resultBinary!=null) {
			System.out.println(resultBinary.getProductId()+" - "+resultBinary.getProductName()+" - "+resultBinary.getProductCategory()+" - "+resultBinary.getProductPrice());
		}
		
		
		sc.close();
	}
}
