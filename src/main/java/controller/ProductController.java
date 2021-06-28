package controller;

import service.ProductService;
import service.impl.ProductServiceImpl;

public class ProductController {

    private static ProductService productService;

    public static ProductService getService() {
        if (productService == null) {
            productService = new ProductServiceImpl();
        }
        return productService;
    }

}
