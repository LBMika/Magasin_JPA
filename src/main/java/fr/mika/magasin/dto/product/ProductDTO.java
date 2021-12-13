package fr.mika.magasin.dto.product;

import fr.mika.magasin.dto.category.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Data
public class ProductDTO {
    public static final ProductDTO NULL_PRODUCTDTO = new ProductDTO();

    private Long productId;
    private String name;
    private float price;
    private CategoryDTO category;

    public ProductDTO() {
        this.productId = 0L;
        this.name = "";
        this.price = -1f;
        this.category = CategoryDTO.NULL_CATEGORYDTO;
    }
}
