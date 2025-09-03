package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopee_mercadorias.shopee.Entity.Fornecedor;

import java.util.UUID;

public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {

}
