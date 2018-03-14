
package Controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexaoBD {
 Connection con; //Responsavel por fazer a conecçao com o banco de dados
 Statement stm;// responsavel por fazer a pesquisa no banco de dados 
 ResultSet rs; // Armazena o resultado da sua pesquisa
 
 private String driver = "org.postgresql.Driver"; // identifica nosso serviço do banco de dados
 private String caminho = "jdbc:postgresql://localhost:5432/ProjetoCadastro"; // qual o caminho do banco de dados aonde ta alocado ( ele seta o local)
 private String usuario = "postgres"; 
 private String senha = "italolima";
 
 public void conexao(){
          try { 
         System.setProperty("jdbc.Drivers", driver);// Responsavel por setar a propriedade do Drive de conection
         con=DriverManager.getConnection(caminho, usuario, senha);
         JOptionPane.showMessageDialog(null,"Conexão efetuada com Sucesso");// MSG se for conectado o banco
     } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Conexão Falhou com o Banco de Dados:\n"+ex.getMessage());
     }
 }
 public void desconecta(){
     try {   
         con.close();
         JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,"Erro ao fechar a Conexão com o BD/n:"+ex.getMessage());
     }
 }

}
