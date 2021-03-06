/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import lib.jdb.connection.JDBConnection;
import model.Usuario;

/**
 *
 * @author max
 */
public class JFrameUsuario extends javax.swing.JFrame {

    private final String nome_jframe = "controleUsuario";
    /**
     * Creates new form JFrameUsuario
     */
    public JFrameUsuario() {
        initComponents();
        initJDB();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDBQueryGrupo = new lib.jdb.jdbquery.JDBQuery();
        jDBQueryPessoa = new lib.jdb.jdbquery.JDBQuery();
        jDBUpdateCadastrar = new lib.jdb.jdbupdate.JDBUpdate();
        jDBQueryUsuario = new lib.jdb.jdbquery.JDBQuery();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDBTextFieldUsername = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBTextFieldSenha = new lib.jdb.control.jdbtextfield.JDBTextField();
        jDBLookUpComboBoxGrupo = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jDBLookUpComboBoxPessoaa = new lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox();
        jLabelNovo = new javax.swing.JLabel();
        jLabelPesquisar = new javax.swing.JLabel();
        jLabelExcluir = new javax.swing.JLabel();
        jLabelSalvar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nome do usuário");

        jLabel2.setText("Pessoa");

        jLabel3.setText("Senha");

        jLabel4.setText("Grupo");

        jDBTextFieldUsername.setJDBQuery(jDBQueryUsuario);
        jDBTextFieldUsername.setFieldName("username");

        jDBTextFieldSenha.setJDBQuery(jDBQueryUsuario);
        jDBTextFieldSenha.setFieldName("senha");

        jDBLookUpComboBoxGrupo.setJDBListQuery(jDBQueryGrupo);
        jDBLookUpComboBoxGrupo.setJDBQuery(jDBQueryUsuario);
        jDBLookUpComboBoxGrupo.setInvisibleFields("id");
        jDBLookUpComboBoxGrupo.setKeyField("grupo_id");
        jDBLookUpComboBoxGrupo.setKeyListField("id");

        jDBLookUpComboBoxPessoaa.setJDBListQuery(jDBQueryPessoa);
        jDBLookUpComboBoxPessoaa.setJDBQuery(jDBQueryUsuario);
        jDBLookUpComboBoxPessoaa.setInvisibleFields("id");
        jDBLookUpComboBoxPessoaa.setKeyField("pessoa_id");
        jDBLookUpComboBoxPessoaa.setKeyListField("id");

        jLabelNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1477411422_new-file.png"))); // NOI18N
        jLabelNovo.setToolTipText("Novo");
        jLabelNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNovoMouseClicked(evt);
            }
        });

        jLabelPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1477411622_search-file.png"))); // NOI18N
        jLabelPesquisar.setToolTipText("Pesquisar");
        jLabelPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelPesquisarMouseClicked(evt);
            }
        });

        jLabelExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1477411516_delete-file.png"))); // NOI18N
        jLabelExcluir.setToolTipText("Excluir");

        jLabelSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1477411628_complete-file.png"))); // NOI18N
        jLabelSalvar.setToolTipText("Salvar");
        jLabelSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jDBTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDBTextFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(124, 124, 124))
                    .addComponent(jDBLookUpComboBoxGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDBLookUpComboBoxPessoaa, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabelNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDBLookUpComboBoxPessoaa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDBTextFieldUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBTextFieldSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDBLookUpComboBoxGrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabelExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabelSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Usuario user = new Usuario(JFrameLogin.jDBQueryLogin.getCurrentFieldValueAsInteger("id"));
        if(!user.verificaAcesso(nome_jframe)){
            dispose();
            JOptionPane.showMessageDialog(this, "Você não tem acesso a esse recurso");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabelNovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNovoMouseClicked
        carregarUsuario("novo", null);
    }//GEN-LAST:event_jLabelNovoMouseClicked

    private void jLabelPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPesquisarMouseClicked
        JDialogPesquisarUsuario dialog = new JDialogPesquisarUsuario(this, true);
        dialog.setVisible(true);
        String id = dialog.getUsuarioId();
        carregarUsuario("alterar", id);
        jDBTextFieldSenha.setEnabled(true);
        jDBQueryUsuario.edit();
    }//GEN-LAST:event_jLabelPesquisarMouseClicked

    private void jLabelSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarMouseClicked
        String sql="";
        if(jDBQueryUsuario.isEditing()){
            sql = "UPDATE usuario SET"
                    + " username = TRIM('"+jDBTextFieldUsername.getText().toString()+"')"
                    + (!jDBTextFieldSenha.getText().contains("*******")?",senha = md5("+jDBTextFieldSenha.getText()+")":"")
                    + " , grupo_id = " + jDBLookUpComboBoxGrupo.getKeyListValue().toString()
                    + " ,pessoa_id = " + (jDBLookUpComboBoxPessoaa.getSelectedIndex() < 1?" null":jDBLookUpComboBoxPessoaa.getKeyListValue().toString())
                    + " WHERE id = " + jDBQueryUsuario.getCurrentFieldValueAsInteger("id").toString();
            jDBQueryUsuario.cancel();
            jDBUpdateCadastrar.setSQL(sql);
            jDBUpdateCadastrar.execUpdate();
            carregarUsuario("alterar",jDBQueryUsuario.getCurrentFieldValue("id"));
        }else{
            sql = "INSERT INTO usuario (username, senha, grupo_id, pontos_fidelidade, pessoa_id) "
                    + " VALUES ( "
                    + " TRIM(\'" + jDBTextFieldUsername.getText().toString() + "\') "
                    + ", md5(\'"+jDBTextFieldSenha.getText()+"\')"
                    + ", " +jDBLookUpComboBoxGrupo.getKeyListValue().toString() 
                    + ", '0'"
                    + ", "+(jDBLookUpComboBoxPessoaa.getSelectedIndex() < 1?" null":jDBLookUpComboBoxPessoaa.getKeyListValue().toString())+");";
            jDBUpdateCadastrar.setSQL(sql);
            jDBUpdateCadastrar.execUpdate();
            carregarUsuario("todos",null);
            jDBQueryUsuario.last();
        }
        
        
        
        JOptionPane.showMessageDialog(null, "Usuário " + jDBQueryUsuario.getCurrentFieldValue("username") + " cadastrado com sucesso." );
    }//GEN-LAST:event_jLabelSalvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBoxGrupo;
    private lib.jdb.control.jdblookupcombobox.JDBLookUpComboBox jDBLookUpComboBoxPessoaa;
    private lib.jdb.jdbquery.JDBQuery jDBQueryGrupo;
    private lib.jdb.jdbquery.JDBQuery jDBQueryPessoa;
    private lib.jdb.jdbquery.JDBQuery jDBQueryUsuario;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextFieldSenha;
    private lib.jdb.control.jdbtextfield.JDBTextField jDBTextFieldUsername;
    private lib.jdb.jdbupdate.JDBUpdate jDBUpdateCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelExcluir;
    private javax.swing.JLabel jLabelNovo;
    private javax.swing.JLabel jLabelPesquisar;
    private javax.swing.JLabel jLabelSalvar;
    // End of variables declaration//GEN-END:variables
    
    protected static JDBConnection jDBConnection = null;
    private void initJDB() {
        jDBConnection = JFrameLogin.jDBConnectionPrincipal;
        jDBConnection.connectDB();
        jDBQueryUsuario.setJDBConnection(jDBConnection);
        jDBUpdateCadastrar.setJDBConnection(jDBConnection);
        
        jDBQueryGrupo.setJDBConnection(jDBConnection);
        jDBQueryGrupo.setSQL("select * from grupo");
        jDBQueryGrupo.execQuery();
        
        jDBQueryPessoa.setJDBConnection(jDBConnection);
        jDBQueryPessoa.setSQL("select * from pessoa");
        jDBQueryPessoa.execQuery();
        
        carregarUsuario("todos",null);
        
        jDBQueryUsuario.setJDBConnection(jDBConnection);
    }
    /**
    * Executa a consulta de usuário para para atualizar os usuários ativos na jDBQuery
    *
    * @param  acao [ novo, alterar]
    * @param  usuario_id id do usuário caso a opção seja alterar
    * @return metodo void
    */
    private void carregarUsuario(String acao,String usuario_id){
        String whereAcao = "";
        switch(acao){
            case "novo":
                whereAcao += " WHERE 1 != 1 ";
               jDBTextFieldSenha.setEnabled(true);
            break;
            case "alterar":
                whereAcao += " WHERE id = " + usuario_id;
                
            break;
            default:
                jDBTextFieldSenha.setEnabled(false);
            break;
        }
        jDBQueryUsuario.setSQL("select id,username,'*******' as senha,senha as nomask_senha,grupo_id,pessoa_id from usuario "+whereAcao);
        jDBQueryUsuario.execQuery();
    }

}
