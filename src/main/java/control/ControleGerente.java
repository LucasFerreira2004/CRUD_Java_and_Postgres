/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import model.Funcionario;
import model.Gerente;


/**
 *
 * @author LEI
 */
public class ControleGerente extends ControleFuncionario{
    // Objeto da classe conexao
    private Connection connection;
    
    public ControleGerente(){
    
        this.connection = new ConnectionFactory().getConnection();
    }
            /*-----CRUD FUNCIONARIOS-----*/
    // Inserindo dados no banco - Create
    public void addFuncionario(Funcionario funcionario){
        String sql = "INSERT INTO funcionario (id, nome, endereco, telefone, salario, senha) VALUES (?,?,?,?,?,?)";
                
        // preparando statement para inserção no banco 
        if(getFuncionarioById(funcionario.getMatricula()) == null){
            try {
            PreparedStatement statement = connection.prepareStatement(sql);
            
            //setando os valorees indefinidos "(?,?,?)"
            statement.setInt(1, funcionario.getMatricula() );
            statement.setString(2, funcionario.getNome());
            statement.setString(3, funcionario.getEndereco());
            statement.setString(4, funcionario.getTelefone());
            statement.setFloat(5, funcionario.getSalario());
            statement.setString(6, funcionario.getSenha());
            
            // executando 
            statement.execute();
            statement.close();
    
            String mensagemSucesso = "Funcionario: " + funcionario.describeFuncionario() + " cadastrado com sucesso.";
            JOptionPane.showMessageDialog(null, mensagemSucesso);           
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Identificador já cadastrado");
        }
        
        
    }
    
    // Buscando dados no banco - Read
    public Funcionario getFuncionarioById(int idFuncionario) {
        String sql = "SELECT * FROM funcionario WHERE id = ? ;";
        try {
            Funcionario funcionario = null;
            
            //prepara statment para inserção no banco de dados
            PreparedStatement statement = connection.prepareStatement(sql);
            // seta o id "?"
            statement.setInt(1, idFuncionario);
            
            //executa um SELECT  no banco
            ResultSet resultSet = statement.executeQuery();
            
            //percorrendo o resultSet
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String telefone = resultSet.getString("telefone");
                float salario = resultSet.getFloat("salario");
                String senha = resultSet.getString("senha");
                
                
                //instanciando objeto produto
                funcionario = new Funcionario(id, nome, endereco, telefone, salario, senha);
                   
                //retirar id do construtor e colocar através de 
                //produto.setId caso erro
                funcionario.describeFuncionario();
            }
            resultSet.close();
            statement.close();
                
            return funcionario;           
        } catch (SQLException e) {
            return null;
        }
        }
        
    // Alterando dados no banco - Update
    // Update passando o id através do OBJETO
    public void updateFuncionario(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET nome = ?, endereco = ?, telefone = ?, salario = ?, senha = ? WHERE id = ?";
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, funcionario.getNome());
            statement.setString(2, funcionario.getEndereco());
            statement.setString(3, funcionario.getTelefone());
            statement.setFloat(4, funcionario.getSalario());
            statement.setString(5, funcionario.getSenha());
            statement.setInt(6, funcionario.getMatricula());
            
            statement.execute();
            statement.close();
            
            String mensagemSucesso = "Produto: " + funcionario.describeFuncionario()+ "\nAlterado com sucesso";
            JOptionPane.showMessageDialog(null, mensagemSucesso);
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        }
    
    // Removendo dados no banco - Delete   
   public void deleteFuncionario(int idFuncionario){
       String sql = "DELETE FROM funcionario WHERE id = ?";        
       try{
           PreparedStatement statement = connection.prepareStatement(sql);
           
           statement.setInt(1, idFuncionario);
           
           statement.execute();
           statement.close();
           String mensagemSucesso = "Funcionario de id: " + idFuncionario + " removido com sucesso"; 
            JOptionPane.showMessageDialog(null, mensagemSucesso);
       } catch (SQLException e){
           throw new RuntimeException(e);
       }
   }
   
   
   /*-----CRUD GERENTES-----*/
   
    public void addGerente(Gerente gerente){
        String sql = "INSERT INTO gerente (nome, endereco, telefone, salario, adicional_salario, senha) VALUES (?,?,?,?,?,?)";
                
        // preparando statement para inserção no banco 
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            
            //setando os valorees indefinidos "(?,?,?)"
            //statement.setInt(1, gerente.getMatricula() );
            statement.setString(1, gerente.getNome());
            statement.setString(2, gerente.getEndereco());
            statement.setString(3, gerente.getTelefone());
            statement.setFloat(4, gerente.getSalario());
            statement.setFloat(5, gerente.getAdicionalSalario());
            statement.setString(6, gerente.getSenha());
            
            // executando 
            statement.execute();
            statement.close();
            
            System.out.println("Gerente: ");
            gerente.describeGerente();
            System.out.println("Inserido com sucesso no banco de dados!");
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    // Buscando dados no banco - Read
    public Gerente getGerenteById(int idGerente) {
        String sql = "SELECT * FROM gerente WHERE id = ? ;";
        try {
            Gerente gerente = null;
            
            //prepara statment para inserção no banco de dados
            PreparedStatement statement = connection.prepareStatement(sql);
            // seta o id "?"
            statement.setInt(1, idGerente);
            
            //executa um SELECT  no banco
            ResultSet resultSet = statement.executeQuery();
            
            //percorrendo o resultSet
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String endereco = resultSet.getString("endereco");
                String telefone = resultSet.getString("telefone");
                float salario = resultSet.getFloat("salario");
                float adicionalSalario = resultSet.getFloat("adicional_salario");
                String senha = resultSet.getString("senha");
                
                //instanciando objeto produt
                gerente = new Gerente(id, nome, endereco, telefone, salario, adicionalSalario, senha);
                   
                //retirar id do construtor e colocar através de 
                //produto.setId caso erro
                gerente.describeGerente();
            }
            resultSet.close();
            statement.close();
            System.out.println(" acessado com sucesso!");
            
            return gerente;
            
        } catch (SQLException e) {
            return null;
        }
        }
    
    // Alterando dados no banco - Update
    // Update passando o id através do OBJETO
    public void updateGerente(Gerente gerente) {
        String sql = "UPDATE gerente SET nome = ?, endereco = ?, telefone = ?, salario = ?, adicional_salario = ?, senha = ? WHERE id = ?";
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, gerente.getNome());
            statement.setString(2, gerente.getEndereco());
            statement.setString(3, gerente.getTelefone());
            statement.setFloat(4, gerente.getSalario());
            statement.setFloat(5, gerente.getAdicionalSalario());
            statement.setString(6, gerente.getSenha());
            statement.setInt(7, gerente.getMatricula());
            
            
            statement.execute();
            statement.close();
            
            System.out.println("\nGerente");
            getFuncionarioById(gerente.getMatricula());
            System.out.println("alterado com sucesso");
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        }        

    // Update passando o id através do PARÂMETRO
    public void updateGerente(int idGerente, Gerente gerente) {
        String sql = "UPDATE gerente SET nome = ?, endereco = ?, telefone = ?, salario = ?, adicional_salario = ?, senha = ? WHERE id = ?";
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, gerente.getNome());
            statement.setString(2, gerente.getEndereco());
            statement.setString(3, gerente.getTelefone());
            statement.setFloat(4, gerente.getSalario());
            statement.setFloat(5, gerente.getAdicionalSalario());
            statement.setString(6, gerente.getSenha());
            statement.setInt(7, idGerente);
            
            statement.execute();
            statement.close();
            
            System.out.println("\nGerente");
            getFuncionarioById(idGerente);
            System.out.println("alterado com sucesso");
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        }        
    
    // Removendo dados no banco - Delete   
   public void deleteGerente(int idGerente){
       String sql = "DELETE FROM gerente WHERE id = ?";        
       try{
           PreparedStatement statement = connection.prepareStatement(sql);
           
           statement.setInt(1, idGerente);
           
           statement.execute();
           statement.close();
           System.out.println("Gerente de id:  '" + idGerente + "'  removido com sucesso!");
       } catch (SQLException e){
           throw new RuntimeException(e);
       }
   }
}
