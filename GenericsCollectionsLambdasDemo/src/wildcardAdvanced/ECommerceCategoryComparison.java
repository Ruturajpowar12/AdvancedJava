package wildcardAdvanced;

import java.util.Arrays;
import java.util.List;

//An e-commerce system contains List<Mobile>, List<Laptop>, and List<Product>.
//Write a method that accepts any list of products derived from Product and 
//calculates the total number of products.
class Product77 {}
class Mobile77 extends Product77 {}
class Laptop77 extends Product77 {}
public class ECommerceCategoryComparison {

	public static int totalProducts(List<? extends Product77> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Mobile77> mobiles = Arrays.asList(new Mobile77(), new Mobile77());
        List<Laptop77> laptops = Arrays.asList(new Laptop77());
        System.out.println("Total mobiles: " + totalProducts(mobiles));
        System.out.println("Total laptops: " + totalProducts(laptops));
    }
}
