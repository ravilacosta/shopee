package shopee_mercadorias.shopee.DTO;

public class CategoriaCreateDTO {

    private String nome;

    public CategoriaCreateDTO() {
    }

    public CategoriaCreateDTO(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
