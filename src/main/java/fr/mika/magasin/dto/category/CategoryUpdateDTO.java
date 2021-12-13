package fr.mika.magasin.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategoryUpdateDTO {
    public static final CategoryUpdateDTO NULL_CATEGORYUPDATEDTO = new CategoryUpdateDTO();

    private long categoryId;
    private String name;

    public CategoryUpdateDTO() {
        this.categoryId = 0L;
        name = "";
    }
}
