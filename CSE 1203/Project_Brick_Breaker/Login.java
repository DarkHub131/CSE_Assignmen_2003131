
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nahid
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() {
        initComponents();
         this.setTitle("Login Form");
        this.setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setSize(400,420);
        //this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        user_name = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        user_input1 = new javax.swing.JTextField();
        log = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        log1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Panel");
        setAlwaysOnTop(true);

        user_name.setEditable(false);
        user_name.setBackground(new java.awt.Color(0, 0, 0));
        user_name.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 0, 0));
        user_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_name.setText("Gamer ID");
        user_name.setBorder(null);
        user_name.setCaretColor(new java.awt.Color(0, 0, 0));

        pass.setEditable(false);
        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 51, 0));
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.setText("Password");
        pass.setBorder(null);
        pass.setCaretColor(new java.awt.Color(0, 0, 0));

        user_input1.setBackground(new java.awt.Color(204, 204, 255));
        user_input1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        user_input1.setForeground(new java.awt.Color(0, 0, 0));
        user_input1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_input1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        user_input1.setCaretColor(new java.awt.Color(0, 0, 0));
        user_input1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        user_input1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                user_input1FocusGained(evt);
            }
        });

        log.setEditable(false);
        log.setBackground(new java.awt.Color(0, 0, 0));
        log.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        log.setForeground(new java.awt.Color(255, 0, 0));
        log.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        log.setBorder(null);
        log.setCaretColor(new java.awt.Color(0, 0, 0));

        passfield.setBackground(new java.awt.Color(204, 204, 255));
        passfield.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        passfield.setForeground(new java.awt.Color(0, 0, 0));
        passfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 51));
        jButton1.setText("LOGIN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        log1.setEditable(false);
        log1.setBackground(new java.awt.Color(0, 0, 0));
        log1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        log1.setForeground(new java.awt.Color(255, 0, 0));
        log1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        log1.setBorder(null);
        log1.setCaretColor(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Brick Breaker");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(log1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_input1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        user_input1.requestFocusInWindow();

        pack();
    }// </editor-fold>                        

    private void user_input1FocusGained(java.awt.event.FocusEvent evt) {                                        
        //Added to focus
    }                                       

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
       
        
        String s1 = user_input1.getText();
        String s = passfield.getText();
      
        if(s1.equals("nahid325")&&s.equals("12345"))
        {
            new Menu().setVisible(true);
            this.setVisible(false);
        }
        else
        {
            log.setText("Invalid Game ID or Password. ");
            log1.setText("Please Try Again");
        }
        
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField log;
    private javax.swing.JTextField log1;
    private javax.swing.JTextField pass;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField user_input1;
    private javax.swing.JTextField user_name;
    // End of variables declaration                   
}