package fr.mika.magasin.controller;

import fr.mika.magasin.dto.purchase.PurchaseDTO;
import fr.mika.magasin.dto.purchase.PurchaseDeleteDTO;
import fr.mika.magasin.dto.purchase.PurchaseSaveDTO;
import fr.mika.magasin.dto.purchase.PurchaseUpdateDTO;
import fr.mika.magasin.service.PurchaseService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    private PurchaseService service;
    private ModelMapper mapper;

    public PurchaseController(PurchaseService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<PurchaseDTO> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PurchaseDTO> findById(@PathVariable Long id) {
        PurchaseDTO purchaseDTO = this.service.findById(id);
        ResponseEntity<PurchaseDTO> result;
        if (purchaseDTO.equals(PurchaseDTO.NULL_PURCHASEDTO))
            result = ResponseEntity.notFound().build();
        else
            result = ResponseEntity.ok(purchaseDTO);
        return result;
    }

    @PostMapping
    public ResponseEntity<PurchaseDTO> save(@RequestBody PurchaseSaveDTO purchaseToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(purchaseToSave));
    }

    @PutMapping
    public ResponseEntity<PurchaseDTO> save(@RequestBody PurchaseUpdateDTO purchaseToUpdate) {
        return ResponseEntity.ok(this.service.update(purchaseToUpdate));
    }

    @DeleteMapping
    public boolean delete(@RequestBody PurchaseDeleteDTO purchaseToDelete) {
        this.service.delete(purchaseToDelete);
        return true;
    }
}
