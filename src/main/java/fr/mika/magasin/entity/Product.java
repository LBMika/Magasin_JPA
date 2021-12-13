package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@AllArgsConstructor
@Data
public class Product {
    public static final Product NULL_PRODUCT = new Product();

    @Id
    @Column(name = "id_product")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private float price;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToMany(mappedBy = "products")
    private List<Purchase> purchases;

    public Product() {
        this.productId = 0L;
        this.name = "";
        this.price = -1f;
    }
}
