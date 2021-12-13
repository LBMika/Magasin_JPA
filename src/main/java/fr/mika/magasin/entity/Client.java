package fr.mika.magasin.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="client")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Client {
    @Id
    @Column(name="id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String firstname;
    private String lastname;


    @OneToMany(mappedBy = "client")
    private List<Purchase> purchases;
}
