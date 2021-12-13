package fr.mika.magasin.configuration;

import fr.mika.magasin.repository.ProductRepository;
import fr.mika.magasin.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {
    @Bean
    public ProductService productService(ProductRepository repository, ModelMapper mapper) {
        return new ProductService (repository, mapper);
    }
}
