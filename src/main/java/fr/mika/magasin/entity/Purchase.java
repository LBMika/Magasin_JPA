package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="purchase")
@AllArgsConstructor
@Data
public class Purchase {
    public static final Purchase NULL_PURCHASE = new Purchase();

    @Id
    @Column(name="id_purchase")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long purchaseId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "product_purchase",
                joinColumns = @JoinColumn(name = "id_purchase"),
                inverseJoinColumns = @JoinColumn(name = "id_product"))
    private List<Product> products = new ArrayList<>();


    public Purchase() {
        this.purchaseId = 0L;
        this.client = Client.NULL_CLIENT;
    }
}
