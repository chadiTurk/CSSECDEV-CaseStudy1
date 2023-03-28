
package View;
import Model.User;
import javax.swing.JOptionPane;
import Model.BCrypt;
import java.util.*;

public class Login extends javax.swing.JPanel {

    public Frame frame;
    public PasswordRecovery passRec = new PasswordRecovery();
    private int userRole;
    private boolean userExists = false;
    private int currLockVal = 0;
    private boolean userIsLocked = false;
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        passwordFld = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginBtn.setText("LOGIN");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Forgot Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(usernameFld, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld))
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        
        Timer timer = new Timer();
        String currUsername = usernameFld.getText().toLowerCase();
         if(checkIfUserExists() && userExists && userIsLocked == false){
            
//            if(userRole == 5){
//                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
//                  return;
//            }
//            
               
            usernameFld.setText("");
            passwordFld.setText("");
            
            LoginThread thread = new LoginThread(userRole, currUsername);
            thread.run();

            TimeOutTask timeOutTask = new TimeOutTask(thread, "thread 1", timer);
            //10 mins session
            timer.schedule(timeOutTask, 600000);
            frame.updateLockedVal(usernameFld.getText().toLowerCase(), 0);


        }
        else if(userExists == false){
        JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
        else if(userIsLocked){
           JOptionPane.showMessageDialog(this, "Invalid Username or Password!");

        }
        else{
            frame.updateLockedVal(usernameFld.getText().toLowerCase(), currLockVal + 1);
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
       
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        frame.registerNav();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       frame.passRecNav();
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean checkIfUserExists(){
        
        boolean correctUser = false;
        String currUsername = usernameFld.getText().toLowerCase();
        String password = passwordFld.getText();
        String hashedPassword;
        boolean disabled = false;
        
        for (User user : frame.main.sqlite.getUsers()) {
            hashedPassword = user.getPassword();
            
            if(user.getUsername().toLowerCase().equals(currUsername)){
                userExists = true;
                currLockVal = user.getLocked();
                if(user.getRole()==1)
                    disabled = true;
                if(currLockVal >= 3 || disabled == true){
                    userIsLocked = true;
                }
                else{
                    userIsLocked = false;
                }
            }
            
            if(user.getUsername().toLowerCase().equals(currUsername)&& BCrypt.checkpw(password, hashedPassword)){
                correctUser = true;
                userRole = user.getRole();
                break;
            }
        }
        return correctUser;
    }
    
    class LoginThread extends Thread{
        
        private int userRole;
        private String currUsername;
        
        public LoginThread(int userRole, String currUsername){
            this.userRole = userRole;
            this.currUsername = currUsername;
        }
        
        public void run(){
            System.out.println("MyThread running");
            frame.mainNav(userRole, currUsername);
            if(Thread.interrupted()) {
                return;
            }  
        }
    }
    
    class TimeOutTask extends TimerTask {
        private Thread thread;
        private String name;
        private Timer timer;

        public TimeOutTask(Thread thread, String name, Timer timer) {
            this.thread = thread;
            this.name = name;
            this.timer = timer;

        }

        @Override
        public void run() {
           System.out.println("[" + new Date() + "] " + name + ": task executed!");
           if(thread != null && thread.isAlive()) {
                thread.interrupt();
                timer.cancel();
            }
           frame.loginNav();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
