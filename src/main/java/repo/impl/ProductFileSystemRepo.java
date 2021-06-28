package repo.impl;

import controller.ProductController;
import converter.JsonConverter;
import domain.Product;
import dto.ProductDTO;
import repo.ProductRepo;

import java.util.List;

public class ProductFileSystemRepo implements ProductRepo {

    @Override
    public void saveProduct(ProductDTO productDTO) {
        JsonConverter.objectToJsonFile(productDTO, "Product");
    }

    @Override
    public ProductDTO getProduct() {
        return (ProductDTO) JsonConverter.jsonFileToObject("Product", ProductDTO.class);
    }

    @Override
    public void deleteProduct(String name) {
        List<Product> productList = ProductController.getService().loadProduct().getProducts();
        productList.removeIf(p -> p.getName().equals(name));
        saveProduct(new ProductDTO(productList));
    }
}
