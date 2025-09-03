package shopee_mercadorias.shopee.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shopee_mercadorias.shopee.DTO.MercadoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Mercadoria;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/mercadoria")

public class MercadoriaController {
    @Autowired
    MercadoriaService service;

    //pegar uma mercadoria pelo seu id
    @GetMapping("/{id}")
    public MercadoriaCreateDTO findById(@PathVariable("id") UUID id) {
        return service.findById(UUID);
    }
    //pegar todas as mercadorias
    @GetMapping
    public List<MercadoriaCreateDTO> findAll() {
        return service.findAll();
    }
    //salvar uma mercadoria
    @PostMapping
    public MercadoriaCreateDTO save (@RequestBody MercadoriaCreateDTO mercadoriaCreateDTO){
        return  service.save(mercadoriaCreateDTO);
    }

    //atulizar uma mercadoria
    @PutMapping("/{id}")
    public MercadoriaCreateDTO update (@PathVariable("id") UUID id,
                                       @RequestBody MercadoriaCreateDTO mercadoriaCreateDTO){
        return  service.update(UUID, mercadoriaCreateDTO);
    }

//deletar uma mercadoria pelo id
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") UUID id){
        service.delete(id);
    }



}