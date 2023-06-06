package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.*;
import javax.swing.JOptionPane;

import model.Produto;

// realizasçao do CRUD(create, Read, Update e Delete)
public class ControleFuncionario {
    // Objeto da classe conexao
    private Connection connection;
    
    
    // construtor
    public ControleFuncionario(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    // Inserindo dados no banco - Create
    public void addProduto(Produto produto){
        String sql = "INSERT INTO produto (id, nome, tipo, preco, qtd_estoque, data_fabricacao) VALUES (?,?,?,?,?,?)";
                
        
        if(getProdutoById(produto.getId()) == null){
            try {
            PreparedStatement statement = connection.prepareStatement(sql);
            
            //setando os valorees indefinidos "(?,?,?)"
            statement.setInt(1, produto.getId() );
            statement.setString(2, produto.getNome());
            statement.setString(3, produto.getTipo());
            statement.setFloat(4, produto.getPreco());
            statement.setInt(5, produto.getQtdEstoque());
            statement.setString(6, produto.getDataFabricacao());
            
            // executando 
            statement.execute();
            statement.close();
            
            String mensagemSucesso = "Produto: " + produto.describeProduto() + "cadastrado com sucesso";
            JOptionPane.showMessageDialog(null, mensagemSucesso);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        } else{
            JOptionPane.showMessageDialog(null, "Identificador já cadastrado");
        }
        
    }
    
    // Buscando dados no banco - Read
    public Produto getProdutoById(int idProduto) {
        String sql = "SELECT * FROM produto WHERE id = ? ;";
        try {
            Produto produto = null;
            
            //prepara statment para inserção no banco de dados
            PreparedStatement statement = connection.prepareStatement(sql);
            // seta o id "?"
            statement.setInt(1, idProduto);
            
            //executa um SELECT  no banco
            ResultSet resultSet = statement.executeQuery();
            
            //percorrendo o resultSet
            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String tipo = resultSet.getString("tipo");
                float preco = resultSet.getFloat("preco");
                int qtdEstoque = resultSet.getInt("qtd_estoque");
                String dataFabricacao = resultSet.getString("data_fabricacao");
                
                
                //instanciando objeto produto
                produto = new Produto(id, nome, tipo, preco, qtdEstoque, dataFabricacao);
    
                //retirar id do construtor e colocar através de 
                //produto.setId caso erro
            }
            resultSet.close();
            statement.close();
            
            return produto;
        } catch (SQLException e) {
            return null;
        }
        
    }
        
    
    public void updateProduto(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, tipo = ?, preco = ?, qtd_estoque=?, data_fabricacao=? WHERE id = ?";
        
        try{
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, produto.getNome());
            statement.setString(2, produto.getTipo());
            statement.setFloat(3, produto.getPreco());
            statement.setInt(4, produto.getQtdEstoque());
            statement.setString(5, produto.getDataFabricacao());
            statement.setInt(6, produto.getId());
            
            statement.execute();
            statement.close();
            
            String mensagemSucesso = "Produto: " + produto.describeProduto() + "\nAlterado com sucesso";
            JOptionPane.showMessageDialog(null, mensagemSucesso);
            
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
        }    
    
    // Removendo dados no banco - Delete   
   public void deleteProduto(int idProduto){
       String sql = "DELETE FROM produto WHERE id = ?";        
       try{
           PreparedStatement statement = connection.prepareStatement(sql);
           
           statement.setInt(1, idProduto);
           
           statement.execute();
           statement.close();
           
           String mensagemSucesso = "Produto de id: " + idProduto + " removido com sucesso"; 
            JOptionPane.showMessageDialog(null, mensagemSucesso);
       } catch (SQLException e){
           throw new RuntimeException(e);
       }
       
   }
 }
    
    

