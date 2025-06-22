package Ecommerce.main;

import Ecommerce.model.Product;
import Ecommerce.utils.SearchFunctions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Mouse", "Electronics"),
            new Product(102, "Keyboard", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "T-shirt", "Fashion"),
            new Product(105, "Monitor", "Electronics")
        };

        System.out.println("🔍 Linear Search for 'Shoes':");
        Product result1 = SearchFunctions.linearSearch(products, "Shoes");
        System.out.println(result1 != null ? result1 : "Not Found");

        // Sort the array before binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        System.out.println("\n🔍 Binary Search for 'Shoes':");
        Product result2 = SearchFunctions.binarySearch(products, "Shoes");
        System.out.println(result2 != null ? result2 : "Not Found");
    }
}

