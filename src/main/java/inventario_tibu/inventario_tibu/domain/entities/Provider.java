package inventario_tibu.inventario_tibu.domain.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Table(name = "providers")
@Getter
@Entity
public class Provider {
    @Id
    @Column(name = "id_provider", length = 20, nullable = false)
    private String id;

    @Column(name = "provider_name", length = 50, nullable = false)
    private String providerName;

    @Column(name = "provider_address", length = 50, nullable = false)
    private String addressProvider;

    @OneToMany(mappedBy = "provider")
    private Set<ProductProveider> productProveiders = new HashSet<>();
}
