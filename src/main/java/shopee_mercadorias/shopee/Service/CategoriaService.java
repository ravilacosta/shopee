package shopee_mercadorias.shopee.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;
import shopee_mercadorias.shopee.DTO.CategoriaCreateDTO;
import shopee_mercadorias.shopee.Entity.Categoria;
import shopee_mercadorias.shopee.Repository.CategoriaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    // listar todas as categorias
    public List<CategoriaCreateDTO> findAll() {
        List<Categoria> categorias = categoriaRepository.findAll();

        List<CategoriaCreateDTO> categoriasDTOS = new ArrayList<>();
        for (Categoria categoria : categorias) {
            categoriasDTOS.add(converToDTO(categoria));
        }
        return categoriasDTOS;
    }

    public CategoriaCreateDTO findById(UUID id) {
        //retorna uma entidade categoria
        Categoria categoria = categoriaRepository.findById(id).orElseThrow();
        // metodo para converter uma categoria entity em categoria create dto
        return converToDTO(categoria);

    }

    //metodo para salvar uma categoria
    public CategoriaCreateDTO save(CategoriaCreateDTO categoriaDTO) {
        Categoria categoria = converToEntity(categoriaDTO);
        categoria = categoriaRepository.save(categoria);
        return converToDTO(categoria);
    }

    // atualizar
    public CategoriaCreateDTO update(UUID id, CategoriaCreateDTO categoriaDTO) {
        Categoria categoria = converToEntity(categoriaDTO);
        categoria.setId(id);
        categoria = categoriaRepository.save(categoria);
        return converToDTO(categoria);
    }

    //metodo para deletar uma categoria
    public void delete(UUID id) {
        categoriaRepository.deleteById(id);
    }

    public CategoriaCreateDTO converToDTO(Categoria categoria) {
        CategoriaCreateDTO categoriaCreateDTO = new CategoriaCreateDTO();
        categoriaCreateDTO.setNome(categoria.getNome());
        categoriaCreateDTO.setDescricao(categoria.getDescricao());
        return categoriaCreateDTO;
    }

    public Categoria converToEntity(CategoriaCreateDTO categoriaCreateDTO) {
        Categoria categoria = new Categoria();
        categoria.setNome(categoriaCreateDTO.getNome());
        categoria.setDescricao(categoriaCreateDTO.getDescricao());
        return categoria;
    }
}