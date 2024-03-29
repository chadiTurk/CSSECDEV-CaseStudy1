
package View;
import Model.BCrypt;
import Model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
        otherInitComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JPasswordField();
        backBtn = new javax.swing.JButton();
        phoneNumberFld = new javax.swing.JTextField();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        phoneNumberFld.setBackground(new java.awt.Color(240, 240, 240));
        phoneNumberFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phoneNumberFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phoneNumberFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumberFld))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(phoneNumberFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        
        boolean userExists = false;
        String currUsername = usernameFld.getText().toLowerCase();
       
        
        if(checkIfEmailAndIsValid(currUsername).equals("InvalidEmail")){
            JOptionPane.showMessageDialog(this
                    , "Please enter a valid email address.",
                               "Error", JOptionPane.WARNING_MESSAGE); 
       }
        
        for (User user : frame.main.sqlite.getUsers()) {
            if(user.getUsername().toLowerCase().equals(currUsername)){
                userExists = true;
                break;
            }
        }

        //If passwords do not match
        if(!passwordFld.getText().equals(confpassFld.getText()))
        {
             JOptionPane.showMessageDialog(this
                    , "Passwords do not match.",
                               "Error", JOptionPane.WARNING_MESSAGE);
        }
        //If password is weak
        else if(!checkPasswordStrength(passwordFld.getText())){
              JOptionPane.showMessageDialog(this
                    , "Password is weak, must be greater than or equal to 8 characters. Must contain at least one uppper,lowercase,numeric,and special character.",
                               "Error", JOptionPane.WARNING_MESSAGE);
        }
        //If password is too long
        else if(passwordFld.getText().length() > 64){
              JOptionPane.showMessageDialog(this
                    , "Password should not exceed 64 characters.",
                               "Error", JOptionPane.WARNING_MESSAGE);
        }
        else if(!checkValidPhoneNumber()){
              JOptionPane.showMessageDialog(this
                    , "Please enter a valid phone number.",
                               "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
            //Add user to database with hash password
            String hashedPassword = BCrypt.hashpw(passwordFld.getText(), BCrypt.gensalt(12));
            frame.registerAction(usernameFld.getText().toLowerCase(), hashedPassword, confpassFld.getText());
            JOptionPane.showMessageDialog(this
                    , "An SMS to activate your account has been sent to the phone number provided.",
                               "", JOptionPane.INFORMATION_MESSAGE);
            usernameFld.setText(null);
            passwordFld.setText(null);
            confpassFld.setText(null);
            phoneNumberFld.setText(null);
            frame.loginNav();
        }
        
        
        

    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed
    private boolean checkPasswordStrength(String password){
        
        Pattern patternCheckStrongPassword = Pattern.compile("(?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$");
        Matcher matcherCheckStrongPassword = patternCheckStrongPassword.matcher(password);
        
        boolean passwordIsStrong = matcherCheckStrongPassword.find();
        
        return passwordIsStrong;
        
    }
    private String checkIfEmailAndIsValid(String currUsername){
        
        Pattern patternCheckEmail = Pattern.compile("@");
        Matcher matcherCheckEmail = patternCheckEmail.matcher(currUsername);
        
        boolean emailDetected = matcherCheckEmail.find();
        
        //If email is found
        if(emailDetected){
            //Check if email is valid
            Pattern patternCheckValidEmail = Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
            Matcher matcherCheckValidEmail = patternCheckValidEmail.matcher(currUsername);
            
            System.out.println(currUsername);
            
            boolean emailIsValid = matcherCheckValidEmail.find();
            
            System.out.println(emailIsValid);
            
            if(emailIsValid){
                return "ValidEmail";
            }
            else{
                return "InvalidEmail";
            }
        }
        else{
            return "NotAnEmail";
        }
    }
    
    private boolean checkValidPhoneNumber(){
        Pattern patternCheckValidNumber = Pattern.compile("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$");
        Matcher matcherCheckValidNumber = patternCheckValidNumber.matcher(phoneNumberFld.getText());
        
        return matcherCheckValidNumber.find();
    }
    private void otherInitComponents(){
        phoneNumberFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PHONE NUMBER", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField confpassFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JTextField phoneNumberFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
