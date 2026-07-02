package ProductSearch;

public class SearchOperations {
    public static Product linearSearch(Product [] products,int target)
    {
        for(int i=0;i<products.length;i++)
        {
            if(products[i].getProductId()==target)
            {
                return products[i];
            }
        }
        return null;
    }
    public static Product binarySearch(Product [] products,int target)
    {
        int start=0;
        int end=products.length-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>products[mid].getProductId())
            {
                start=mid+1;
            }
            else if(target<products[mid].getProductId())
            {
                end=mid-1;
            }
            else 
            {
                return products[mid];
            }
        }
        return null;
    }
}
