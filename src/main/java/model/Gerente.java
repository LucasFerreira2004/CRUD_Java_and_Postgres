/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LEI
 */
public class Gerente extends control.ControleGerente{
    
    private int matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private float salario;
    private float adicionalSalario;
    private String senha;

    //construtor

    public Gerente(int matricula, String nome, String endereco, String telefone, float salario, float adicionalSalario, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.adicionalSalario = adicionalSalario;
        this.senha = senha;
    }

    public Gerente(String nome, String endereco, String telefone, float salario, float adicionalSalario, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.adicionalSalario = adicionalSalario;
        this.senha = senha;
    }
    
    public String describeGerente (){
        return ("\nMatrícula: " + getMatricula()
                +"\nNome: " + getNome()
                + "\nEndereço: " + getEndereco()
                +"\nTelefone: " + getTelefone()
                +"\nSalario: " + getSalario()
                +"\nAdicional Salario: " + getAdicionalSalario()
                +"\nSenha: " + getSenha());
    }
    

    //getters e seters 
    public float getAdicionalSalario() {
        return adicionalSalario;
    }

    public void setAdicionalSalario(float adicionalSalario) {
        this.adicionalSalario = adicionalSalario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    
}
