package inventario_tibu.inventario_tibu.domain.entities;

import inventario_tibu.inventario_tibu.domain.Fk_class.ProductProveiderId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "products_providers")
@Entity
public class ProductProveider {
    @EmbeddedId
    private ProductProveiderId id;
    
    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "provider_id", insertable = false, updatable = false)
    private Provider provider;
}
