/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import lib.jdb.jdbquery.JDBQuery;
import view.JFrameLogin;

/**
 *
 * @author max
 */
public class Usuario {
    
    private int id;
    private String username;
    private int pessoa_id;
    private int grupo_id;

    public Usuario(int id) {
        this.id = id;
        this.grupo_id = JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsInteger("grupo_id");
        this.pessoa_id = JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsInteger("pessoa_id");
        this.username = JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsString("username");
    }
    /**
    * Verifica se o usuario que está logado ou seja, 
    * na jDBQueryLogin tem permissão para acessar a tela informa no parametro
    *
    * @param  nome_jframe variavel com o nome do JFrame cadastrada na base
    * @return true se tiver acesso , falase se não
    */
    public boolean verificaAcesso(String nome_jframe){
        JDBQuery query = new JDBQuery();
        query.setJDBConnection(JFrameLogin.jDBConnectionPrincipal);
        query.setSQL("SELECT permissao FROM interface_usuario iu \n" 
                        + " INNER JOIN interface i ON i.id = iu.telas_id\n"
                        + " WHERE "
                        + " i.nome_jframe = \"" + nome_jframe + "\""
                        + " AND iu.usuario_id = " + this.id);
        query.execQuery();
        query.first();
        return query.getCurrentFieldValueAsBoolean("permissao");
    }
    
}
