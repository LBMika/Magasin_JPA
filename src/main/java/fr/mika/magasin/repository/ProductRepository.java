package fr.mika.magasin.repository;

import fr.mika.magasin.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Client, Long> {
}