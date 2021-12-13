package fr.mika.magasin.dto.purchase;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class PurchaseSaveDTO {
    public static final PurchaseSaveDTO NULL_PURCHASESAVEDTO = new PurchaseSaveDTO();

    private Long purchaseId;

    public PurchaseSaveDTO() {
        this.purchaseId = 0L;
    }
}
