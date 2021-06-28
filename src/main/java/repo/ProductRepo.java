package repo;

import dto.ProductDTO;

public interface ProductRepo {

    void saveProduct(ProductDTO productDTO);

    ProductDTO getProduct();

    void deleteProduct(String name);

}
