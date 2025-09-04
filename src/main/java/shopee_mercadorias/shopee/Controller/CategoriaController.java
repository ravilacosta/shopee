package shopee_mercadorias.shopee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopee_mercadorias.shopee.DTO.CategoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Categoria;
import shopee_mercadorias.shopee.Service.CategoriaService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    @Autowired
   private CategoriaService service;

    //pegar uma categoria pelo seu id
    @GetMapping("/{id}")
    public CategoriaCreateDTO findById(@PathVariable UUID id) {
        return service.findById(id);
    }

    // listar todas as categorias
    @GetMapping
   public List<CategoriaCreateDTO> findAll() { return  service.findAll();
    }

    //salvar ou criar uma categoria
    @PostMapping
    public CategoriaCreateDTO save (@RequestBody CategoriaCreateDTO categoriaCreateDTO) {
        return  service.save(categoriaCreateDTO);
    }

    //atulizar uma categoria
    @PutMapping ("/{id}")
    public CategoriaCreateDTO update(@PathVariable UUID id,
                                     @RequestBody CategoriaCreateDTO categoriaCreateDTO) {
        return  service.update(id, categoriaCreateDTO);
    }
    //deletar uma categoria pelo id
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        service.deleteById(id);
    }
}
