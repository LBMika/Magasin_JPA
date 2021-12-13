package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
}
