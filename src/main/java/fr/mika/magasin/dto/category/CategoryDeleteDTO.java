package fr.mika.magasin.dto.category;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CategoryDeleteDTO {
    public static final CategoryDeleteDTO NULL_CATEGORYDELETEDTO = new CategoryDeleteDTO();

    private long categoryId;

    public CategoryDeleteDTO() {
        this.categoryId = 0L;
    }
}
