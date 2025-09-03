package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopee_mercadorias.shopee.Entity.Categoria;

import java.util.UUID;

public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {
}
