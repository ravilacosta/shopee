package shopee_mercadorias.shopee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopee_mercadorias.shopee.DTO.MercadoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Mercadoria;
import shopee_mercadorias.shopee.Repository.MercadoriaRepository;

import java.util.UUID;

@Service
public class MercadoriaService {
    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    public MercadoriaCreateDTO findById(UUID id) {
        //retorna uma entidade mercadoria
        Mercadoria mercadoria = mercadoriaRepository.findById(id).orElseThrow();
        // metodo para converter uma mercadoria entity em mercadoria create dto
        MercadoriaCreateDTO mercadoriaCreateDTO = convertDTO(mercadoria);
        return mercadoriaCreateDTO;
    }
    //metodo para salvar uma mercadoria
    public  MercadoriaCreateDTO save ( MercadoriaCreateDTO mercadoriaDTO){
        Mercadoria mercadoria = convertToEntity(mercadoriaDTO);
        return  converToDTO(mercadoria);
    }

    //metodo para atualizar mercadoria










}
