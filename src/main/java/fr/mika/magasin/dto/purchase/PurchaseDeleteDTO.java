package fr.mika.magasin.dto.purchase;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class PurchaseDeleteDTO {
    public static final PurchaseDeleteDTO NULL_PURCHASEDELETEDTO = new PurchaseDeleteDTO();

    private Long purchaseId;

    public PurchaseDeleteDTO() {
        this.purchaseId = 0L;
    }
}
