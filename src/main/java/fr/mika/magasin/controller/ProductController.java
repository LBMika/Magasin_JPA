package fr.mika.magasin.controller;

import fr.mika.magasin.dto.product.ProductDTO;
import fr.mika.magasin.dto.client.ClientDeleteDTO;
import fr.mika.magasin.dto.client.ClientSaveDTO;
import fr.mika.magasin.dto.client.ClientUpdateDTO;
import fr.mika.magasin.controller.ProductController;
import fr.mika.magasin.dto.product.ProductDeleteDTO;
import fr.mika.magasin.dto.product.ProductSaveDTO;
import fr.mika.magasin.dto.product.ProductUpdateDTO;
import fr.mika.magasin.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService service;
    private ModelMapper mapper;

    public ProductController(ProductService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ProductDTO> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
        ProductDTO productDTO = this.service.findById(id);
        ResponseEntity<ProductDTO> result;
        if (productDTO.equals(ProductDTO.NULL_PRODUCTDTO))
            result = ResponseEntity.notFound().build();
        else
            result = ResponseEntity.ok(productDTO);
        return result;
    }

    @PostMapping
    public ResponseEntity<ProductDTO> save(@RequestBody ProductSaveDTO productToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(productToSave));
    }

    @PutMapping
    public ResponseEntity<ProductDTO> save(@RequestBody ProductUpdateDTO productToUpdate) {
        return ResponseEntity.ok(this.service.update(productToUpdate));
    }

    @DeleteMapping
    public boolean delete(@RequestBody ProductDeleteDTO productToDelete) {
        this.service.delete(productToDelete);
        return true;
    }
}
