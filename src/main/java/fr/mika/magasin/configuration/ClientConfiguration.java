package fr.mika.magasin.configuration;

import fr.mika.magasin.repository.ClientRepository;
import fr.mika.magasin.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfiguration {
    @Bean
    public ClientService clientService(ClientRepository repository, ModelMapper mapper) {
        return new ClientService(repository, mapper);
    }
}
