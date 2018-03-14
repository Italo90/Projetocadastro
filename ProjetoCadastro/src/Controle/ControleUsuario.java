/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloUsuario;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControleUsuario {
    ConexaoBD conex = new ConexaoBD();
    ModeloUsuario mod = new ModeloUsuario();
    
    
    public void Salvar(ModeloUsuario mod){
        conex.conexao();
        try {
            PreparedStatement stm = conex.con.prepareStatement("insert into Usuarios(nome_usuario,especialidade_usuario,reg_usuario,endereco_usuario)values(?,?,?)");
            stm.setString(1,mod.getnome());
            stm.setString(2,mod.getEndereco());             /*Esse é o metodo de salvar no banco com todas as tabelas que serao pesquisadas */
            stm.setString(3,mod.getespecialidade());
            stm.setInt(4,mod.getreg());
            stm.execute();
            JOptionPane.showMessageDialog(null,"Salvo com Sucesso");
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro a Inserir Dados/n"+ex);    
        }
        
        conex.desconecta(); 
}

    private String getnome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getespecialidade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int getreg() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Salvar(ControleUsuario control) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
