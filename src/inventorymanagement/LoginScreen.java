
package inventorymanagement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LoginScreen extends javax.swing.JFrame  {

   
    public LoginScreen() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        LogInButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Pictures\\LOGIN.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
        );

        MainPanel.setBackground(new java.awt.Color(34, 56, 52));
        MainPanel.setForeground(new java.awt.Color(1, 10, 8));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(220, 239, 235));
        jLabel1.setText("User Name");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 110, 20));

        UserNameTextField.setBackground(new java.awt.Color(34, 56, 52));
        UserNameTextField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        UserNameTextField.setForeground(new java.awt.Color(247, 247, 247));
        UserNameTextField.setBorder(null);
        UserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTextFieldActionPerformed(evt);
            }
        });
        MainPanel.add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 250, 30));
        MainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, -1));

        jPasswordField1.setBackground(new java.awt.Color(34, 56, 52));
        jPasswordField1.setForeground(new java.awt.Color(247, 247, 247));
        jPasswordField1.setBorder(null);
        MainPanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, 30));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Password");
        MainPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 80, -1));
        MainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, -1));

        LogInButton.setBackground(new java.awt.Color(227, 244, 241));
        LogInButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogInButton.setText("LOG IN");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });
        MainPanel.add(LogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTextFieldActionPerformed
        
    }//GEN-LAST:event_UserNameTextFieldActionPerformed
    private String UserName,PassWord;
    
    void getInput(){
        UserName = UserNameTextField.getText();
        PassWord = jPasswordField1.getText();
        
    }
    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
      getInput();
        try {
            BufferedReader ab = new BufferedReader(new FileReader("UserLogin.txt"));
            String s;
             while ((s = ab.readLine()) != null) {
                String a[] = s.split(" ");
                 if(UserName.equals(a[0]) && PassWord.equals(a[1])){
               
                     setVisible(false);
                     new Home().setVisible(true);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                 }
             }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_LogInButtonActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new LoginScreen().setVisible(true);
                
                
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogInButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
