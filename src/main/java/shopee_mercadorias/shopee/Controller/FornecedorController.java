package shopee_mercadorias.shopee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopee_mercadorias.shopee.DTO.FornecedorCreateDTO;
import shopee_mercadorias.shopee.DTO.MercadoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Fornecedor;
import shopee_mercadorias.shopee.Entity.Mercadoria;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/fornecedor")

public class FornecedorController {
    @Autowired
    FornecedorService service;
    //pegar uma fornecedor pelo seu id
    @GetMapping("/{id}")
    public FornecedorCreateDTO findById(@PathVariable UUID id) {
        return  service.findAll();
    }
    // pegar todos os fornecedores
    @GetMapping
    public List<Fornecedor> findAll() {
        return service.findAll();
    }
    //salavar um fornecedor
    @PostMapping
    public FornecedorCreateDTO save(@RequestBody FornecedorCreateDTO fornecedorCreateDTO {
        return service.save(fornecedorCreateDTO);
    }

   //atulizar uma fornecedor
    @PutMapping("/{id}")
    public FornecedorCreateDTO update (@PathVariable UUID id, @RequestBody FornecedorCreateDTO fornecedorCreateDTO) {
        return  service.update(UUID,fornecedorCreateDTO);
    }
    //deletar um fornecedor pelo id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(UUID);
    }

}
