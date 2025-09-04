package shopee_mercadorias.shopee.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUID")
    private UUID id;
    private String nome;
    private String contato;
    private String endereco;


    @OneToMany(mappedBy = "fornecedor_id")
    private List<Mercadoria> mercadorias;

    public Fornecedor() {
    }

    public Fornecedor(UUID id, String nome, String contato, String endereco, List<Mercadoria> mercadorias) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
        this.mercadorias = mercadorias;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
}
