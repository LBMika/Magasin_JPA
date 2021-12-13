package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
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
}
