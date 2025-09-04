package shopee_mercadorias.shopee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopee_mercadorias.shopee.DTO.MercadoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Mercadoria;
import shopee_mercadorias.shopee.Repository.MercadoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MercadoriaService {
    @Autowired
    private MercadoriaRepository mercadoriaRepository;

    public MercadoriaCreateDTO findById(UUID id) {
        //retorna uma entidade mercadoria
        Mercadoria mercadoria = mercadoriaRepository.findById(id).orElseThrow();
        // metodo para converter uma mercadoria entity em mercadoria create dto
        MercadoriaCreateDTO mercadoriaCreateDTO = converToDTO(mercadoria);
        return mercadoriaCreateDTO;
    }
    //metodo para salvar uma mercadoria
    public  MercadoriaCreateDTO save ( MercadoriaCreateDTO mercadoriaDTO){
        Mercadoria mercadoria = convertToEntity(mercadoriaDTO);
        return  converToDTO(mercadoria);
    }

    //metodo para atualizar mercadoria
    public MercadoriaCreateDTO update (UUID id, MercadoriaCreateDTO mercadoriaDTO) {
        Mercadoria mercadoria = convertToEntity(mercadoriaDTO);
        mercadoria.setId(id);
        mercadoria = mercadoriaRepository.save(mercadoria);
        return converToDTO(mercadoria);
    }
    //metodo para listar todas as mercadorias
    public List<MercadoriaCreateDTO> findAll() {
        List<Mercadoria> mercadoria = mercadoriaRepository.findAll();
        // Criar uma lista de mercadoria createDTO
        List<MercadoriaCreateDTO> mercadoriaCreateDTOS = new ArrayList<>();
        // para cada mercadoria na lista de mercadoria, converter para DTO e add  na lista
        for (Mercadoria m : mercadoria) {
            mercadoriaCreateDTOS.add(converToDTO(mercadoria));
        }
        //metodo para deletar uma mercadoria
        public  void delete (UUID id) {
            mercadoriaRepository.deleteById(id);
    }
    return mercadoriaCreateDTOS;
    }

    public MercadoriaCreateDTO converToDTO(Mercadoria mercadoria) {
        MercadoriaCreateDTO mercadoriaDTO = new MercadoriaCreateDTO();
        mercadoriaDTO.setNome(mercadoria.getNome());
        mercadoriaDTO.setPreco(mercadoria.getPreco());
        mercadoriaDTO.setQuantidade(mercadoria.getQuantidade());
        return mercadoriaDTO;
    }
    public Mercadoria convertToEntity(MercadoriaCreateDTO mercadoriaCreateDTO) {
        Mercadoria mercadoria = new Mercadoria();
        mercadoria.setNome(mercadoriaCreateDTO.getNome());
        mercadoria.setPreco(mercadoriaCreateDTO.getPreco());
        mercadoria.setQuantidade(mercadoriaCreateDTO.getQuantidade());
        return mercadoria;
    }

}
