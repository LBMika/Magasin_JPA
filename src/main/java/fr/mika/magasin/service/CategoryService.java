package fr.mika.magasin.service;

import fr.mika.magasin.dto.category.CategoryDTO;
import fr.mika.magasin.dto.category.CategoryDeleteDTO;
import fr.mika.magasin.dto.category.CategorySaveDTO;
import fr.mika.magasin.dto.category.CategoryUpdateDTO;
import fr.mika.magasin.entity.Category;
import fr.mika.magasin.repository.CategoryRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private CategoryRepository repository;
    private ModelMapper mapper;

    public CategoryService(CategoryRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<CategoryDTO> findAll() {
        List<CategoryDTO> result = new ArrayList<>();
        this.repository.findAll().forEach(c -> result.add(this.mapper.map(c, CategoryDTO.class)));
        return result;
    }

    public CategoryDTO findById(Long id) {
        Category category = this.repository.findById(id).orElse(Category.NULL_CATEGORY);
        return this.mapper.map(category, CategoryDTO.class);
    }

    public CategoryDTO save(CategorySaveDTO categoryToSave) {
        Category category = this.repository.save(this.mapper.map(categoryToSave, Category.class));
        return this.mapper.map(category, CategoryDTO.class);
    }

    public CategoryDTO update(CategoryUpdateDTO categoryToUpdate) {
        Category category = this.repository.save(this.mapper.map(categoryToUpdate, Category.class));
        return this.mapper.map(category, CategoryDTO.class);
    }

    public void delete(CategoryDeleteDTO categoryToDelete) {
        this.repository.deleteById(categoryToDelete.getCategoryId());
    }
}
