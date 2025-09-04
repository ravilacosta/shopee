package shopee_mercadorias.shopee.Entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "mercadoria")

public class Mercadoria {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator = "UUID")
    private UUID id;
    private String nome;
    private double preco;
    private int quantidade;



@ManyToOne
@JoinColumn(name = "fornecedor_id")
private Fornecedor fornecedor;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


    public Mercadoria() {
    }

    public Mercadoria(UUID id, String nome, double preco, int quantidade,
                      String categoria, fornecedor fornecedor, List<Categoria> estoques) {
        this.id = id;
        this.nome = nome;
        this.double = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.fornecedor = fornecedor;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


}
