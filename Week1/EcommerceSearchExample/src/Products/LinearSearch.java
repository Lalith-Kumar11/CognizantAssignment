package Products;

import java.util.List;

public class LinearSearch implements SearchEngine{
	@Override
	public product Search(List<product> prod,int k) {
		
		for(int i=0;i<prod.size();i++) {
			if(prod.get(i).getProductId()==k) {
				return prod.get(i);
			}
		}
		
		System.out.println("Not Found...");
		return null;
	}
}
