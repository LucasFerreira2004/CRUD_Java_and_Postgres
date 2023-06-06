package control;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.*;
import view.JfControleProduto;
import view.JfPainelSelecaoControles;
import view.UsuarioLogin;

public class ControleAutenticacaoUsuario {
    private String tipoUsuario;
    private final Connection connection;
    boolean autenticacao = false;
    
    public ControleAutenticacaoUsuario(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void autenticarUsuario(String tipoUsuario, int matriculaUsuario, String senhaUsuario){
        ControleGerente manGerente = new ControleGerente();
        ControleFuncionario manFuncionario = new ControleGerente();
        boolean verificacaoMatricula = (manGerente.getGerenteById(matriculaUsuario) != null || manGerente.getFuncionarioById(matriculaUsuario) != null);
        if(verificacaoMatricula){
            switch (tipoUsuario.toUpperCase()) {
            case "G":
                {
                    String sql = "SELECT senha FROM gerente WHERE id = ? ;";
                    try {
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setInt(1, matriculaUsuario);
                        
                        //executa um SELECT  no banco
                        ResultSet resultSet = statement.executeQuery();
                        while(resultSet.next()){
                            String senhaGerente = resultSet.getString("senha");
                            if (senhaUsuario.equals(senhaGerente)) {
                                UsuarioLogin jfUsuarioLogin = new UsuarioLogin();
                                jfUsuarioLogin.setVisible(false);
                                
                                JfPainelSelecaoControles jfPainelControles = new JfPainelSelecaoControles();
                                jfPainelControles.setVisible(true);               
                                autenticacao =  true;
                            }else{
                                JOptionPane.showMessageDialog(null, "Senha e/ou matrícula incorretos");
                                autenticacao = false;
                            }
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Matrícula não encontradas, verifique os dados e tente novamente.");
                        autenticacao = false;
                        
                    }
                    break;
                }
            //se o usuário for funcionário
            case "F":
                {
                    String sql = "SELECT senha FROM funcionario WHERE id = ? ;";
                    try {
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setInt(1, matriculaUsuario);
                        
                        //executando o select
                        ResultSet resultSet = statement.executeQuery();
                        while(resultSet.next()){
                            String senhaFuncionario = resultSet.getString("senha");
                            if (senhaUsuario.equals(senhaFuncionario)) {
                                UsuarioLogin jfUsuarioLogin = new UsuarioLogin();
                                jfUsuarioLogin.setVisible(false);
                                
                                JfControleProduto JfControleProduto = new JfControleProduto();
                                JfControleProduto.setVisible(true);
                                autenticacao = true;
                            }else{
                                JOptionPane.showMessageDialog(null, "Senha e/ou matrícula incorretos");
                                autenticacao = false;
                            }
                        }
                        
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Matrícula não encontradas, verifique os dados e tente novamente.");
                        autenticacao = false;
                    }
                    break;
                }
            default:
                JOptionPane.showMessageDialog(null, "Tipo de usúario inválido. Insira ('g' ou 'f')");
                autenticacao = false;
        }
        } else {
         JOptionPane.showMessageDialog(null, "Matrícula não encontrada, verifique os dados e tente novamente.");
         autenticacao = false;
        }
    }
     
    //getters e setters
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public boolean GetAutenticacao() {
        return autenticacao;
    }

    public void setAutenticacao(boolean autenticacao) {
        this.autenticacao = autenticacao;
    }
    
    
    
    
}
