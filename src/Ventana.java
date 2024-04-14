//Librerías utilizadas:

import java.awt.Image;
import java.awt.Toolkit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

/*
Hecho por: José Raymundo Baca Hernández
Algoritmos y Sistemas de Cifrado - Criptografía
Instituto Tecnológico de Chihuahua ll
 */
public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        setTitle("Método RC4"); //Declaramos título
        setIconImage(getIconImage()); //Pone el icono personalizado
    }

    @Override
    public Image getIconImage() {
        //Cambia el icono del JFrame
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Logo/RC4.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("RC4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 34));

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Texto plano");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setText("Texto cifrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 40, -1, -1));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Cifrar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, 120, 30));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 153, 0));
        jButton2.setText("Limpiar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 162, 110, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(51, 204, 0));
        jButton3.setText("Descifrar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 162, 114, 30));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(0, 204, 204));
        jButton4.setText("E-mail");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 162, 120, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextArea2.setText(""); // Borra el contenido de jTextArea2
        try {
            // Seleccionamos y convertimos todos los caracteres del texto plano a minúscula
            String arreCar = jTextArea1.getText().toLowerCase();
            // Crearé una instancia de la clave para RC4
            String llave = "SecretKey"; // Esta es mi llave secreta, le puedo poner cualquier cosa
            SecretKeySpec llavesecreta = new SecretKeySpec(llave.getBytes(StandardCharsets.UTF_8), "RC4");
            // Inicializaremos el cifrado en modo cifrado
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(Cipher.ENCRYPT_MODE, llavesecreta);
            // Encriptaremos el texto
            byte[] byteEncr = cipher.doFinal(arreCar.getBytes(StandardCharsets.UTF_8));
            // Convertiré los bytes en una representación base64 para almacenar en el TextArea2
            String arreCarEncr = Base64.getEncoder().encodeToString(byteEncr);
            jTextArea2.setText(arreCarEncr); //Ponemos el texto desencriptado en el TextArea2
        } catch (Exception e) {
            e.printStackTrace();// Manejamos las excepciones
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText(""); // Borra el contenido de jTextArea1
        jTextArea2.setText(""); // Borra el contenido de jTextArea2
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextArea1.setText(""); // Borra el contenido de jTextArea1
        try {
            // Seleccionamos todos los caracteres del texto encriptado
            String arreCarEncr = jTextArea2.getText();
            // Crearé una instancia de la clave para RC4
            String llave = "SecretKey"; // Esta es mi llave secreta, debo de poner la misma que declaré antes
            SecretKeySpec llavesecreta = new SecretKeySpec(llave.getBytes(StandardCharsets.UTF_8), "RC4");
            // Inicializaré el cifrado en modo descifrado
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(Cipher.DECRYPT_MODE, llavesecreta);
            // Decodificaremos la representación en base64 para el desencriptado
            byte[] byteDesencr = cipher.doFinal(Base64.getDecoder().decode(arreCarEncr));
            // Convertiremos los bytes desencriptados en texto
            String arreCarDesen = new String(byteDesencr, StandardCharsets.UTF_8);
            jTextArea1.setText(arreCarDesen); // Ponemos el texto desencriptado en el TextArea1
        } catch (Exception e) {
            e.printStackTrace();// Manejamos las excepciones
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Ventanas para capturar los datos necesarios para enviar el correo
        String correoemisor = JOptionPane.showInputDialog("Ingrese su dirección de correo electrónico:");
        String contraseña = JOptionPane.showInputDialog("Ingrese su contraseña:");
        String correoreceptor = JOptionPane.showInputDialog("Ingrese la dirección de correo del destinatario:");
        try {
            // Configuraré las propiedades para la sesión de JavaMail
            Properties props = new Properties();
            // Autenticación con el SMTP
            props.put("mail.smtp.auth", "true");
            // Cifra la comunicación entre el emisor y el cliente
            props.put("mail.smtp.starttls.enable", "true");
            // Solo utilizaré Gmail
            props.put("mail.smtp.host", "smtp.gmail.com");
            // Puerto SMTP
            props.put("mail.smtp.port", "587");
            // Crearemos una sesión de JavaMail con autenticación
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(correoemisor, contraseña);
                }
            });
            // Creamos un objeto MimeMessage para el correo
            MimeMessage mensaje = new MimeMessage(session);
            // Configuramos los campos del correo
            mensaje.setFrom(new InternetAddress(correoemisor));
            mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(correoreceptor));
            mensaje.setSubject("Mensaje Cifrado"); // Asunto del correo
            // Obtienemos el texto cifrado del textArea2
            String encryptedText = jTextArea2.getText();
            // Adjuntamos el texto cifrado al cuerpo del correo
            mensaje.setText(encryptedText);
            // Enviaré el correo
            Transport.send(mensaje);
            // Y mostramos un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Correo enviado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
