package fr.mika.magasin.service;

import fr.mika.magasin.dto.purchase.PurchaseDTO;
import fr.mika.magasin.dto.purchase.PurchaseDeleteDTO;
import fr.mika.magasin.dto.purchase.PurchaseSaveDTO;
import fr.mika.magasin.dto.purchase.PurchaseUpdateDTO;
import fr.mika.magasin.entity.Purchase;
import fr.mika.magasin.repository.PurchaseRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class PurchaseService {
    private PurchaseRepository repository;
    private ModelMapper mapper;

    public PurchaseService(PurchaseRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<PurchaseDTO> findAll() {
        List<PurchaseDTO> result = new ArrayList<>();
        this.repository.findAll().forEach(c -> result.add(this.mapper.map(c, PurchaseDTO.class)));
        return result;
    }

    public PurchaseDTO findById(Long id) {
        Purchase purchase = this.repository.findById(id).orElse(Purchase.NULL_PURCHASE);
        return this.mapper.map(purchase, PurchaseDTO.class);
    }

    public PurchaseDTO save(PurchaseSaveDTO purchaseToSave) {
        Purchase purchase = this.repository.save(this.mapper.map(purchaseToSave, Purchase.class));
        return this.mapper.map(purchase, PurchaseDTO.class);
    }

    public PurchaseDTO update(PurchaseUpdateDTO purchaseToUpdate) {
        Purchase purchase = this.repository.save(this.mapper.map(purchaseToUpdate, Purchase.class));
        return this.mapper.map(purchase, PurchaseDTO.class);
    }

    public void delete(PurchaseDeleteDTO purchaseToDelete) {
        this.repository.deleteById(purchaseToDelete.getPurchaseId());
    }
}
