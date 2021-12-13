package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="purchase")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Purchase {
    @Id
    @Column(name="id_purchase")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_purchase",
                joinColumns = @JoinColumn(name = "id_purchase"),
                inverseJoinColumns = @JoinColumn(name = "id_product"))
    private List<Product> products;
}
