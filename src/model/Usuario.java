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
        this.setGrupo_id(JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsInteger("grupo_id"));
        this.setPessoa_id(JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsInteger("pessoa_id"));
        this.setUsername(JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsString("username"));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    public int getGrupo_id() {
        return grupo_id;
    }

    public void setGrupo_id(int grupo_id) {
        this.grupo_id = grupo_id;
    }
    
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
