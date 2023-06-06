
package model;

public class Funcionario extends control.ControleFuncionario {
    private int matricula;
    private String nome;
    private String endereco;
    private String telefone;
    private float salario;
    private String senha;

    // Construtores 
    public Funcionario(int matricula, String nome, String endereco, String telefone, float salario, String senha) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.senha = senha;
    }

    public Funcionario(String nome, String endereco, String telefone, float salario, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.senha = senha;
    }

    public String describeFuncionario(){
        return ( "\nMatrícula: " + getMatricula()
                +"\nNome :" + getNome()
                +"\nEndereco: " + getEndereco() 
                +"\nTelefone: " + getTelefone() 
                +"\nSalario: " + getSalario()
                +"\nSenha: " + getSenha());
    }
    // getters e setters
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
