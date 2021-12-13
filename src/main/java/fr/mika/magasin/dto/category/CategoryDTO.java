package fr.mika.magasin.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
public class CategoryDTO {
    public static final CategoryDTO NULL_CATEGORYDTO = new CategoryDTO();

    private long categoryId;
    private String name;

    public CategoryDTO() {
        this.categoryId = 0L;
        name = "";
    }
}
