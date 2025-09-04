package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopee_mercadorias.shopee.Entity.Mercadoria;

import java.util.UUID;
@Repository
public interface MercadoriaRepository extends JpaRepository<Mercadoria, UUID> {
    // save, delete, update, findAll, findByAll
}
