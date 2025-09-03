package shopee_mercadorias.shopee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopee_mercadorias.shopee.DTO.CategoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Categoria;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    @Autowired
    CategoriaService service;

    //pegar uma categoria pelo seu id
    @GetMapping("/{id}")
    public Categoria findById(@PathVariable UUID id) {
        return service.findById(UUID);
    }
    // pegar todos as categorias
    @GetMapping
    List<CategoriaCreateDTO> findAll() {
        return  service.findAll();
    }
    //salavar uma categoria
    @PostMapping
    public CategoriaCreateDTO save (@RequestBody CategoriaCreateDTO categoriaCreateDTO) {
        return  service.save(categoriaCreateDTO);
    }

    //atulizar uma categoria
    @PutMapping ("/{id}")
    public CategoriaCreateDTO update(@PathVariable UUID id,
                                     @RequestBody CategoriaCreateDTO categoriaCreateDTO) {
        return  service.update(UUID, categoriaCreateDTO);
    }
    //deletar uma categoria pelo id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(UUID);
    }
}
