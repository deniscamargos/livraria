package br.DigitalHouse.livraria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Livro {

//    Um livro tem  código, título, autor, ano de lançamento, código ISBN,quantidade em estoque e preço.
    private String nome;
    private int id;
    private int anoLancamento;
    private int isbn;
    private int quantidade;
    private double preco;

    public Livro(String nome, int id, int anoLancamento, int isbn, int quantidade, double preco) {
        this.nome = nome;
        this.id = id;
        this.anoLancamento = anoLancamento;
        this.isbn = isbn;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", anoLancamento=" + anoLancamento +
                ", isbn=" + isbn +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
