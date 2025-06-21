package Products;

import java.util.*;

public class BinarySearch implements SearchEngine{
	@Override
	public product Search(List<product> prod,int k) {
		
		Collections.sort(prod,Comparator.comparingInt(product::getProductId));
		
		int low=0;
		int high = prod.size()-1;
		

		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(prod.get(mid).getProductId()==k) {
				return prod.get(mid);
			}
			
			if(k<prod.get(mid).getProductId()) {
				high=mid-1;
			}
			else if(k>prod.get(mid).getProductId()) {
				low = mid+1;
			}
			
		}
		System.out.println("Not Found...");
		return null;
	}
}
