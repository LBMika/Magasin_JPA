package fr.mika.magasin.configuration;

import fr.mika.magasin.repository.PurchaseRepository;
import fr.mika.magasin.service.PurchaseService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PurchaseConfiguration {
    @Bean
    public PurchaseService purchaseService(PurchaseRepository repository, ModelMapper mapper) {
        return new PurchaseService(repository, mapper);
    }
}
