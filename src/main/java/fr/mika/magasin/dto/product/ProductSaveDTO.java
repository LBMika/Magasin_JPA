package fr.mika.magasin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductSaveDTO {
    public static final ProductSaveDTO NULL_PRODUCTSAVEDTO = new ProductSaveDTO();

    private String name;
    private float price;

    public ProductSaveDTO() {
        this.name = "";
        this.price = -1f;
    }
}
