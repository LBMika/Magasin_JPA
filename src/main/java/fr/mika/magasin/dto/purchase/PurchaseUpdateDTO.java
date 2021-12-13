package fr.mika.magasin.dto.purchase;

import fr.mika.magasin.dto.client.ClientDTO;
import fr.mika.magasin.dto.product.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Data
public class PurchaseUpdateDTO {
    public static final PurchaseUpdateDTO NULL_PURCHASEUPDATEDTO = new PurchaseUpdateDTO();

    private Long purchaseId;
    private ClientDTO client;
    private List<ProductDTO> products = new ArrayList<>();

    public PurchaseUpdateDTO() {
        this.purchaseId = 0L;
        this.client = ClientDTO.NULL_CLIENTDTO;

    }
}
