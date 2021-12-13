package fr.mika.magasin.dto.purchase;

import fr.mika.magasin.dto.client.ClientDTO;
import fr.mika.magasin.dto.product.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Data
public class PurchaseSaveDTO {
    public static final PurchaseSaveDTO NULL_PURCHASESAVEDTO = new PurchaseSaveDTO();

    private Long purchaseId;
    private ClientDTO client;
    private List<ProductDTO> products = new ArrayList<>();

    public PurchaseSaveDTO() {
        this.purchaseId = 0L;
        this.client = ClientDTO.NULL_CLIENTDTO;
    }
}
