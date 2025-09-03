package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopee_mercadorias.shopee.Entity.Mercadoria;

import java.util.UUID;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, UUID> {
    // save, delete, update, findAll, findByAll
}
