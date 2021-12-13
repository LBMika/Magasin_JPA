package fr.mika.magasin.dto.product;

import fr.mika.magasin.dto.category.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductSaveDTO {
    public static final ProductSaveDTO NULL_PRODUCTSAVEDTO = new ProductSaveDTO();

    private String name;
    private float price;
    private CategoryDTO category;

    public ProductSaveDTO() {
        this.name = "";
        this.price = -1f;
        this.category = CategoryDTO.NULL_CATEGORYDTO;
    }
}
