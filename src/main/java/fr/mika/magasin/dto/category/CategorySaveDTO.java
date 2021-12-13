package fr.mika.magasin.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategorySaveDTO {
    public static final CategorySaveDTO NULL_CATEGORYSAVEDTO = new CategorySaveDTO();

    private String name;

    public CategorySaveDTO() {
        name = "";
    }
}
