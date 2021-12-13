package fr.mika.magasin.configuration;

import fr.mika.magasin.repository.CategoryRepository;
import fr.mika.magasin.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConfiguration {
    @Bean
    public CategoryService categoryService(CategoryRepository repository, ModelMapper mapper) {
        return new CategoryService(repository, mapper);
    }
}
