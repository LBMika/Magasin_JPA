package fr.mika.magasin.service;

import fr.mika.magasin.dto.client.ClientDTO;
import fr.mika.magasin.dto.client.ClientDeleteDTO;
import fr.mika.magasin.dto.client.ClientSaveDTO;
import fr.mika.magasin.dto.client.ClientUpdateDTO;
import fr.mika.magasin.entity.Client;
import fr.mika.magasin.repository.ClientRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private ClientRepository repository;
    private ModelMapper mapper;

    public ClientService (ClientRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ClientDTO> findAll() {
        List<ClientDTO> result = new ArrayList<>();
        this.repository.findAll().forEach(c -> result.add(this.mapper.map(c, ClientDTO.class)));
        return result;
    }

    public ClientDTO findById(Long id) {
        Client client = this.repository.findById(id).orElse(Client.NULL_CLIENT);
        return this.mapper.map(client, ClientDTO.class);
    }

    public ClientDTO save(ClientSaveDTO clientToSave) {
        Client client = this.repository.save(this.mapper.map(clientToSave, Client.class));
        return this.mapper.map(client, ClientDTO.class);
    }

    public ClientDTO update(ClientUpdateDTO clientToUpdate) {
        Client client = this.repository.save(this.mapper.map(clientToUpdate, Client.class));
        return this.mapper.map(client, ClientDTO.class);
    }

    public void delete(ClientDeleteDTO clientToDelete) {
        this.repository.deleteById(clientToDelete.getClientId());
    }
}
