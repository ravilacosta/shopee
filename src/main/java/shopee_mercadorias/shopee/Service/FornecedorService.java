package shopee_mercadorias.shopee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shopee_mercadorias.shopee.DTO.FornecedorCreateDTO;
import shopee_mercadorias.shopee.Entity.Fornecedor;
import shopee_mercadorias.shopee.Repository.FornecedorRepository;

import java.util.List;
import java.util.UUID;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;
    public FornecedorCreateDTO findById(UUID id) {

        // retornar uma entidade  fornecedor
        Fornecedor fornecedor = fornecedorRepository.findById(id).orElseThrow();
        // converter um fornecedor entity para create dto
        FornecedorCreateDTO fornecedorCreateDTO = converToDTO(fornecedor);
        return fornecedorCreateDTO;
    }
    // salvar fornecedor
    public  FornecedorCreateDTO save (FornecedorCreateDTO fornecedorDTO) {
        Fornecedor fornecedor = converToDTO(fornecedorDTO);
       fornecedor = fornecedorRepository.save(fornecedor);
       return converToDTO(fornecedor);
    }
    //atualizar fornecedor
    public  FornecedorCreateDTO update (UUID id, FornecedorCreateDTO fornecedorDTO) {
        Fornecedor fornecedor = converToEntity(fornecedorDTO);
        fornecedor.setId(id);
        fornecedor = fornecedorRepository.save(fornecedor);
        return  converTODTO(fornecedor);
    }
    //  listar todos
    public List<FornecedorCreateDTO> findAll() {
        List<Fornecedor> fonecedor = fornecedorRepository.findAll();
        // criar creatDTO

    }
}
