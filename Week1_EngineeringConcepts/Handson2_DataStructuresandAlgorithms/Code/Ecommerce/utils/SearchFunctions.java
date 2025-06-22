package Ecommerce.utils;

import Ecommerce.model.Product;

public class SearchFunctions {

    // Linear Search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search by product name (assumes sorted array)
    public static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = name.compareToIgnoreCase(products[mid].getProductName());

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }
}
