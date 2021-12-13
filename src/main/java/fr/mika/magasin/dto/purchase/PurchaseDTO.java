package fr.mika.magasin.dto.purchase;

import fr.mika.magasin.dto.client.ClientDTO;
import fr.mika.magasin.dto.product.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Data
public class PurchaseDTO {
    public static final PurchaseDTO NULL_PURCHASEDTO = new PurchaseDTO();

    private Long purchaseId;
    private ClientDTO client;
    private List<ProductDTO> products = new ArrayList<>();

    public PurchaseDTO() {
        this.purchaseId = 0L;
        this.client = ClientDTO.NULL_CLIENTDTO;
    }
}
