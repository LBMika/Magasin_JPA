package fr.mika.magasin.dto.product;

import fr.mika.magasin.dto.category.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductUpdateDTO {
    public static final ProductUpdateDTO NULL_PRODUCTUPDATEDTO = new ProductUpdateDTO();

    private Long productId;
    private String name;
    private float price;
    private CategoryDTO category;

    public ProductUpdateDTO() {
        this.productId = 0L;
        this.name = "";
        this.price = -1f;
        this.category = CategoryDTO.NULL_CATEGORYDTO;
    }
}
