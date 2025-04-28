package inventario_tibu.inventario_tibu.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "countries")
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name_country",length = 50, nullable = false, unique = true)
    String nameCountry;

}
