/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEI
 */
public class Produto {
    private int id;
    private String nome;
    private String tipo;
    private float preco;
    private int qtdEstoque;
    private String dataFabricacao;
    
    // Construtores

    public Produto(int id, String nome, String tipo, float preco, int qtdEstoque, String dataFabricacao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.dataFabricacao = dataFabricacao;
    }

    public Produto(String nome, String tipo, float preco, int qtdEstoque, String dataFabricacao) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.dataFabricacao = dataFabricacao;
    }
    
    // métodos
    public String describeProduto() {
        return ("Id: " + getId()
        + "\nNome: " + getNome()
        + "\nTipo: " + getTipo()
        +"\nPreço: " + getPreco()
        +"\nQuantidade no estoque: " + getQtdEstoque()
        +"\nData de fabricação: " + getDataFabricacao());
}
    
    // getters e setters 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    
    
    
    
}
