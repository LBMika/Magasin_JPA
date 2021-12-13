package fr.mika.magasin.dto.purchase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@Data
public class PurchaseDTO {
    public static final PurchaseDTO NULL_PURCHASEDTO = new PurchaseDTO();

    private Long purchaseId;

    public PurchaseDTO() {
        this.purchaseId = 0L;
    }
}
