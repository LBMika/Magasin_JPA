package fr.mika.magasin.controller;

import fr.mika.magasin.dto.client.ClientDTO;
import fr.mika.magasin.dto.client.ClientDeleteDTO;
import fr.mika.magasin.dto.client.ClientSaveDTO;
import fr.mika.magasin.dto.client.ClientUpdateDTO;
import fr.mika.magasin.service.ClientService;
import org.hibernate.annotations.Parameter;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientService service;
    private ModelMapper mapper;

    public ClientController(ClientService service, ModelMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<ClientDTO> findAll() {
        return this.service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        ClientDTO clientDTO = this.service.findById(id);
        ResponseEntity<ClientDTO> result;
        if (clientDTO.equals(ClientDTO.NULL_CLIENTDTO))
            result = ResponseEntity.notFound().build();
        else
            result = ResponseEntity.ok(clientDTO);
        return result;
    }

    @PostMapping
    public ResponseEntity<ClientDTO> save(@RequestBody ClientSaveDTO clientToSave) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(clientToSave));
    }

    @PutMapping
    public ResponseEntity<ClientDTO> save(@RequestBody ClientUpdateDTO clientToUpdate) {
        return ResponseEntity.ok(this.service.update(clientToUpdate));
    }

    @DeleteMapping
    public boolean delete(@RequestBody ClientDeleteDTO clientToDelete) {
        this.service.delete(clientToDelete);
        return true;
    }
}
