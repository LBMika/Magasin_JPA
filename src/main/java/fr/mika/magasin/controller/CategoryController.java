package fr.mika.magasin.controller;

import fr.mika.magasin.dto.category.CategoryDTO;
import fr.mika.magasin.dto.category.CategoryDeleteDTO;
import fr.mika.magasin.dto.category.CategorySaveDTO;
import fr.mika.magasin.dto.category.CategoryUpdateDTO;
import fr.mika.magasin.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private CategoryService service;
    private ModelMapper mapper;

    public CategoryController(CategoryService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<CategoryDTO> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> findById(@PathVariable Long id) {
        CategoryDTO categoryDTO = this.service.findById(id);
        ResponseEntity<CategoryDTO> result;
        if (categoryDTO.equals(CategoryDTO.NULL_CATEGORYDTO))
            result = ResponseEntity.notFound().build();
        else
            result = ResponseEntity.ok(categoryDTO);
        return result;
    }

    @PostMapping
    public ResponseEntity<CategoryDTO> save(@RequestBody CategorySaveDTO categoryToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(categoryToSave));
    }

    @PutMapping
    public ResponseEntity<CategoryDTO> save(@RequestBody CategoryUpdateDTO categoryToUpdate) {
        return ResponseEntity.ok(this.service.update(categoryToUpdate));
    }

    @DeleteMapping
    public boolean delete(@RequestBody CategoryDeleteDTO categoryToDelete) {
        this.service.delete(categoryToDelete);
        return true;
    }
}
