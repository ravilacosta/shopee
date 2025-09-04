package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopee_mercadorias.shopee.Entity.Categoria;

import java.util.UUID;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
}
