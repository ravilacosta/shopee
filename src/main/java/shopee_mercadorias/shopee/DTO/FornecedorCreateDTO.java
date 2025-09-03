package shopee_mercadorias.shopee.DTO;

public class FornecedorCreateDTO {


    private String nome;
    private String cnpj;

    public FornecedorCreateDTO() {
    }

    public FornecedorCreateDTO(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
