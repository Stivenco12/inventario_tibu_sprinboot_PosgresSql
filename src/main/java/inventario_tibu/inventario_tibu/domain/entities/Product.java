package inventario_tibu.inventario_tibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Table(name = "products")
@Getter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_name", length = 50, nullable = true)
    String productName;

    @Column(name = "product_stock", columnDefinition = "INTEGER")  
    int stock;

    @OneToMany(mappedBy = "product")
    private Set<ProductProveider> productProveiders = new HashSet<>();
}
