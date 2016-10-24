/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author max
 */
public class JFrameLogin extends javax.swing.JFrame {

    public JFrameLogin() {
        initComponents();
        initJDB();
        this.getRootPane().setDefaultButton(jButtonEntrar);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDBConnectionPrincipal = new lib.jdb.connection.JDBConnection();
        jDBQueryLogin = new lib.jdb.jdbquery.JDBQuery();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();

        jDBConnectionPrincipal.setURL("jdbc:mysql://localhost/hunger?zeroDateTimeBehavior=convertToNull");
        jDBConnectionPrincipal.setDriver("com.mysql.jdbc.Driver");
        jDBConnectionPrincipal.setFilePath("");
        jDBConnectionPrincipal.setIdiom("pt");
        jDBConnectionPrincipal.setPassword("root");
        jDBConnectionPrincipal.setUserName("root");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEntrar)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setBounds(0, 0, 297, 213);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        String SQL;
        SQL = "SELECT * FROM usuario WHERE username = \"" + jTextFieldUsuario.getText()
                + "\"AND senha = md5(\"" + String.valueOf(jPasswordFieldSenha.getPassword())
                + "\") ";
        jDBQueryLogin.setSQL(SQL);
        jDBQueryLogin.execQuery();
        if (jDBQueryLogin.getRow() == 1){  
            jDBQueryLogin.first();
//            JOptionPane.showMessageDialog(null, "Usuario "+jDBQueryLogin.getCurrentFieldValueAsString("username"));
            new JFramePrincipal().setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,
                    "Usuário ou senha incorreto!",
                    "Acesso Negado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEntrarActionPerformed
    /* Metodos personalizados */
    private void initJDB() {
        jDBConnectionPrincipal.connectDB();
        jDBQueryLogin.setJDBConnection(jDBConnectionPrincipal);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEntrar;
    public static lib.jdb.connection.JDBConnection jDBConnectionPrincipal;
    public static lib.jdb.jdbquery.JDBQuery jDBQueryLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
