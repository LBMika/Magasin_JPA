package fr.mika.magasin.dto.product;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDeleteDTO {
    public static final ProductDeleteDTO NULL_PRODUCTDELETEDTO = new ProductDeleteDTO();

    private Long productId;

    public ProductDeleteDTO() {
        this.productId = 0L;
    }
}
