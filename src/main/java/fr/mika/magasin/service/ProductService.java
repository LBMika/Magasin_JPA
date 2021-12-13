package fr.mika.magasin.service;

import fr.mika.magasin.dto.product.ProductDTO;
import fr.mika.magasin.dto.product.ProductDeleteDTO;
import fr.mika.magasin.dto.product.ProductSaveDTO;
import fr.mika.magasin.dto.product.ProductUpdateDTO;
import fr.mika.magasin.entity.Product;
import fr.mika.magasin.repository.ProductRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private ProductRepository repository;
    private ModelMapper mapper;

    public ProductService(ProductRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ProductDTO> findAll() {
        List<ProductDTO> result = new ArrayList<>();
        this.repository.findAll().forEach(c -> result.add(this.mapper.map(c, ProductDTO.class)));
        return result;
    }

    public ProductDTO findById(Long id) {
        Product product = this.repository.findById(id).orElse(Product.NULL_PRODUCT);
        return this.mapper.map(product, ProductDTO.class);
    }

    public ProductDTO save(ProductSaveDTO productToSave) {
        Product product = this.repository.save(this.mapper.map(productToSave, Product.class));
        return this.mapper.map(product, ProductDTO.class);
    }

    public ProductDTO update(ProductUpdateDTO productToUpdate) {
        Product product = this.repository.save(this.mapper.map(productToUpdate, Product.class));
        return this.mapper.map(product, ProductDTO.class);
    }

    public void delete(ProductDeleteDTO productToDelete) {
        this.repository.deleteById(productToDelete.getProductId());
    }
}
