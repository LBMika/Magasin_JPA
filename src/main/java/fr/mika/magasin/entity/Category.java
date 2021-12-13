package fr.mika.magasin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="category")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Category {
    @Id
    @Column(name="id_category")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categoryId;
    private String name;
}
