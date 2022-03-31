/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Validations;

/**
     * <h1>UISProfile</h1>
     * <p> Formato visual para acceder al perfil del usuario
     * @author fblumgarcia
     * https://github.com/fblumgarcia
     * 
     */
public class UISProfile extends javax.swing.JPanel {
    private Boolean valEmail;
    Validations val=new Validations();
    /**
     * Creates new form UISProfile
     */
    public UISProfile() {
        initComponents();
        emailLb.setVisible(false);
        newEmailLb.setVisible(false);
        newEmailTF.setVisible(false);
        newPassword1Tf.setVisible(false);
        newPassword2Tf.setVisible(false);
        newPassword1Lb.setVisible(false);
        newPassword2Lb.setVisible(false);
        makeChangeBtn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLb = new javax.swing.JLabel();
        emailLb = new javax.swing.JLabel();
        changeEmail = new javax.swing.JCheckBox();
        changePassword = new javax.swing.JCheckBox();
        newEmailLb = new javax.swing.JLabel();
        newEmailTF = new javax.swing.JTextField();
        newPassword1Lb = new javax.swing.JLabel();
        newPassword1Tf = new javax.swing.JPasswordField();
        newPassword2Tf = new javax.swing.JPasswordField();
        newPassword2Lb = new javax.swing.JLabel();
        makeChangeBtn = new javax.swing.JButton();

        setForeground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Panel del Perfil de:");

        nameLb.setText("jLabel2");

        emailLb.setText("jLabel2");

        changeEmail.setText("Cambio de Correo");
        changeEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailActionPerformed(evt);
            }
        });

        changePassword.setText("Cambio de Contraseña");
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        newEmailLb.setText("Nuevo Correo");

        newPassword1Lb.setText("Nueva contraseña");

        newPassword2Lb.setText("Repite la contraseña");

        makeChangeBtn.setText("Cambiar");
        makeChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeChangeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(changeEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePassword)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLb, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmailLb)
                        .addGap(46, 46, 46)
                        .addComponent(newEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(246, 246, 246)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newPassword2Lb)
                    .addComponent(newPassword1Lb))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newPassword1Tf, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(newPassword2Tf))
                .addGap(0, 96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(446, 446, 446))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(nameLb)
                        .addGap(473, 473, 473))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(makeChangeBtn)
                        .addGap(461, 461, 461))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLb)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeEmail)
                    .addComponent(changePassword))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLb, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(newPassword1Lb)
                        .addComponent(newPassword1Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newEmailLb)
                            .addComponent(newEmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newPassword2Tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newPassword2Lb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(makeChangeBtn)
                .addGap(191, 191, 191))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void changeEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailActionPerformed
        if(changeEmail.isSelected()==true){//Si esta seleccionado el checkbox
            emailLb.setVisible(true);//Hace visible para el cambio de email
            newEmailLb.setVisible(true);
            newEmailTF.setVisible(true);
            ShowChange();
        }else if(changeEmail.isSelected()==false){//Si no esta seleccionado el checkbox
            emailLb.setVisible(false);//Hace invisible lo que se muestra
            newEmailLb.setVisible(false);
            newEmailTF.setVisible(false);
            newEmailTF.setText("");
            ShowChange();
        }
    }//GEN-LAST:event_changeEmailActionPerformed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
       if(changePassword.isSelected()==true){//Si esta seleccionado el checkbox
           newPassword1Tf.setVisible(true);//Hace visible para el cambio de la contraseña
           newPassword2Tf.setVisible(true);
           newPassword1Lb.setVisible(true);
           newPassword2Lb.setVisible(true);
           ShowChange();
       }else if(changePassword.isSelected()==false){
           newPassword1Tf.setVisible(false);
           newPassword2Tf.setVisible(false);
           newPassword1Lb.setVisible(false);
           newPassword2Lb.setVisible(false);
           newPassword1Tf.setText("");
           newPassword2Tf.setText("");
           ShowChange();
       }
    }//GEN-LAST:event_changePasswordActionPerformed

    private void makeChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeChangeBtnActionPerformed
        char[] passw1=newPassword1Tf.getPassword();//Se obtiene password en characters
        if(!new String(passw1).equals("")||!newEmailTF.getText().equals("")){
            if(VerifyEmail().equals(true)&&VerifyPassw().equals(true)){
            UISPConfirm conf=new UISPConfirm();
            conf.setVisible(true);        
            conf.setData(email,emailNew,passwNew);  
            } 
        }
               
    }//GEN-LAST:event_makeChangeBtnActionPerformed
    
    private void ShowChange(){
        if(changePassword.isSelected()==true || changeEmail.isSelected()==true){
            makeChangeBtn.setVisible(true);
        }else if(changePassword.isSelected()==false && changeEmail.isSelected()==false){
            makeChangeBtn.setVisible(false);
        }
    }
    String email;String emailNew;String passwNew;
    public String ShowUser(ArrayList user){
        nameLb.setText((String) user.get(0));
        emailLb.setText("Tu email actual es: "+(String) user.get(1));
        email=(String) user.get(1);
        return email;
    }
    
    public Boolean VerifyEmail(){
        boolean verEmail=false;
        if(!newEmailTF.getText().equals("")){//Para hacer la validación del correo
            if(true==val.valEmail(newEmailTF.getText())){
                emailNew=newEmailTF.getText();
                verEmail=true;
            }else{
                JOptionPane.showMessageDialog(null,"Por favor verífique los datos");
            }
        }else{
            verEmail=true;
        }
        return verEmail;
    }
    
    public Boolean VerifyPassw(){
        boolean verPassw=false;
        char[] passw1=newPassword1Tf.getPassword();//Se obtiene password en characters
        char[] passw2=newPassword2Tf.getPassword();        
        if(!new String(passw1).equals("")){//Se valida que las dos passwords sean iguales
            if(new String(passw1).equals(new String(passw2))){
                passwNew=new String(passw1);
            }else{
                JOptionPane.showMessageDialog(null,"Por favor verífique los datos");
            }
        }else{
            verPassw=true;
        }
        return verPassw;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox changeEmail;
    private javax.swing.JCheckBox changePassword;
    private javax.swing.JLabel emailLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton makeChangeBtn;
    private javax.swing.JLabel nameLb;
    private javax.swing.JLabel newEmailLb;
    private javax.swing.JTextField newEmailTF;
    private javax.swing.JLabel newPassword1Lb;
    private javax.swing.JPasswordField newPassword1Tf;
    private javax.swing.JLabel newPassword2Lb;
    private javax.swing.JPasswordField newPassword2Tf;
    // End of variables declaration//GEN-END:variables
}
