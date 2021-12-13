package fr.mika.magasin.dto.purchase;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class PurchaseUpdateDTO {
    public static final PurchaseUpdateDTO NULL_PURCHASEUPDATEDTO = new PurchaseUpdateDTO();

    private Long purchaseId;

    public PurchaseUpdateDTO() {
        this.purchaseId = 0L;
    }
}
