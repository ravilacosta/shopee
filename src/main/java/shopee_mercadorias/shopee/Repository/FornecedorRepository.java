package shopee_mercadorias.shopee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shopee_mercadorias.shopee.Entity.Fornecedor;

import java.util.UUID;
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {

}
