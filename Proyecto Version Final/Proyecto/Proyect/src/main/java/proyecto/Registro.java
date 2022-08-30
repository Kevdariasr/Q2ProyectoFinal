/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package proyecto;
import java.util.LinkedList;

/**
 *
 * @author DerekMSI
 */
public class Registro extends javax.swing.JPanel {
    
    public static LinkedList tablaDatos =new LinkedList();
    
    public int indice;
    
    public Registro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo_Registro = new javax.swing.JLabel();
        Label_1_Registro = new javax.swing.JLabel();
        Label_2_Registro = new javax.swing.JLabel();
        Label_3_Registro = new javax.swing.JLabel();
        Label_4_Registro = new javax.swing.JLabel();
        Label_5_Registro = new javax.swing.JLabel();
        Texto_Nombre_Registro = new javax.swing.JTextField();
        Texto_Apellidos_Registro = new javax.swing.JTextField();
        Texto_Telefono_Registro = new javax.swing.JTextField();
        Texto_Id_Registro = new javax.swing.JTextField();
        Texto_Precio_Registro = new javax.swing.JTextField();
        Boton_Guardar_Registro = new javax.swing.JButton();
        Boton_Editar_Registro = new javax.swing.JButton();
        Boton_Borrar_Registro = new javax.swing.JButton();
        Label_5_Registro1 = new javax.swing.JLabel();
        Label_5_Registro2 = new javax.swing.JLabel();
        Texto_Correo_Registro = new javax.swing.JTextField();
        Texto_Hora_Registro = new javax.swing.JTextField();

        Label_Titulo_Registro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_Titulo_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo_Registro.setText("Agregar Citas");

        Label_1_Registro.setText("Nombre");

        Label_2_Registro.setText("Apellidos");

        Label_3_Registro.setText("Telefono");

        Label_4_Registro.setText("Identificacion");

        Label_5_Registro.setText("Correo");

        Texto_Nombre_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_Nombre_RegistroActionPerformed(evt);
            }
        });

        Texto_Precio_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_Precio_RegistroActionPerformed(evt);
            }
        });

        Boton_Guardar_Registro.setText("Guardar");
        Boton_Guardar_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Guardar_RegistroActionPerformed(evt);
            }
        });

        Boton_Editar_Registro.setText("Editar");
        Boton_Editar_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Editar_RegistroActionPerformed(evt);
            }
        });

        Boton_Borrar_Registro.setText("Borrar");
        Boton_Borrar_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Borrar_RegistroActionPerformed(evt);
            }
        });

        Label_5_Registro1.setText("Hora");

        Label_5_Registro2.setText("Precio");

        Texto_Hora_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Texto_Hora_RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_5_Registro2)
                    .addComponent(Label_4_Registro)
                    .addComponent(Label_5_Registro)
                    .addComponent(Label_5_Registro1)
                    .addComponent(Label_3_Registro)
                    .addComponent(Label_2_Registro)
                    .addComponent(Label_1_Registro))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Texto_Nombre_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Apellidos_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Telefono_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Hora_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Correo_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Id_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Precio_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton_Guardar_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Editar_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Borrar_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Label_Titulo_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Label_Titulo_Registro)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_1_Registro)
                    .addComponent(Texto_Nombre_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_2_Registro)
                    .addComponent(Texto_Apellidos_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_3_Registro)
                    .addComponent(Texto_Telefono_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_4_Registro)
                    .addComponent(Texto_Id_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_5_Registro)
                    .addComponent(Texto_Correo_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_5_Registro1)
                    .addComponent(Texto_Hora_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_5_Registro2)
                    .addComponent(Texto_Precio_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Guardar_Registro)
                    .addComponent(Boton_Editar_Registro)
                    .addComponent(Boton_Borrar_Registro))
                .addContainerGap(168, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Texto_Nombre_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_Nombre_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_Nombre_RegistroActionPerformed

    private void Boton_Guardar_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Guardar_RegistroActionPerformed
        // TODO add your handling code here:
        
        //Declaracion de variables
        String Infonombre, Infoapellidos, Infoid, Infotelefono, Infocorreo;
        String InfoHoraCita, InfoPrecioCita;
        
        //Obtener los valores de los TextField
        Infonombre = Texto_Nombre_Registro.getText();
        Infoapellidos = Texto_Apellidos_Registro.getText();
        Infoid = Texto_Id_Registro.getText();
        Infotelefono = Texto_Telefono_Registro.getText();
        Infocorreo = Texto_Correo_Registro.getText();
        InfoHoraCita= Texto_Hora_Registro.getText();
        InfoPrecioCita= Texto_Precio_Registro.getText();
        
        //Establece un orden de los datos
        Usuarios agregar_usuarios=new Usuarios(Infonombre,Infoapellidos,Infoid,Infotelefono,Infocorreo,InfoHoraCita,InfoPrecioCita);
        
        //Agrega la informacion a la lista
        tablaDatos.add(agregar_usuarios);
        
        //Limpia la informacion anteriormente almacenada de los textfield
        Texto_Nombre_Registro.setText("");
        Texto_Apellidos_Registro.setText("");
        Texto_Id_Registro.setText("");
        Texto_Telefono_Registro.setText("");
        Texto_Correo_Registro.setText("");
        Texto_Hora_Registro.setText("");
        Texto_Precio_Registro.setText("");
        
        
    }//GEN-LAST:event_Boton_Guardar_RegistroActionPerformed

    private void Boton_Editar_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Editar_RegistroActionPerformed
        // TODO add your handling code here:
        
        //Declaracion de variables
        String Infonombre, Infoapellidos, Infoid, Infotelefono, Infocorreo;
        String InfoHoraCita, InfoPrecioCita;
        
        //Obtener los valores de los TextField
        Infonombre = Texto_Nombre_Registro.getText();
        Infoapellidos = Texto_Apellidos_Registro.getText();
        Infoid = Texto_Id_Registro.getText();
        Infotelefono = Texto_Telefono_Registro.getText();
        Infocorreo = Texto_Correo_Registro.getText();
        InfoHoraCita= Texto_Hora_Registro.getText();
        InfoPrecioCita= Texto_Precio_Registro.getText();
        
        //Establece un orden de los datos
        Usuarios agregar_usuarios=new Usuarios(Infonombre,Infoapellidos,Infoid,Infotelefono,Infocorreo,InfoHoraCita,InfoPrecioCita);
        
        //Cambia la informacion de la tabla por la nueva informacion, se establecera en la posicion 0 de la lista
        tablaDatos.set(indice, agregar_usuarios);
        
        //Limpia la informacion anteriormente almacenada de los textfield
        Texto_Nombre_Registro.setText("");
        Texto_Apellidos_Registro.setText("");
        Texto_Id_Registro.setText("");
        Texto_Telefono_Registro.setText("");
        Texto_Correo_Registro.setText("");
        Texto_Hora_Registro.setText("");
        Texto_Precio_Registro.setText("");
    }//GEN-LAST:event_Boton_Editar_RegistroActionPerformed

    private void Boton_Borrar_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Borrar_RegistroActionPerformed
        // TODO add your handling code here:
        
        //Borra la informacion establecida en la posicion 0 de la lista
        tablaDatos.remove(indice);
        
        //Limpia la informacion anteriormente almacenada de los textfield
        Texto_Nombre_Registro.setText(" ");
        Texto_Apellidos_Registro.setText(" ");
        Texto_Id_Registro.setText(" ");
        Texto_Telefono_Registro.setText(" ");
        Texto_Correo_Registro.setText(" ");
        Texto_Hora_Registro.setText(" ");
        Texto_Precio_Registro.setText(" ");
    }//GEN-LAST:event_Boton_Borrar_RegistroActionPerformed

    private void Texto_Precio_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_Precio_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_Precio_RegistroActionPerformed

    private void Texto_Hora_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Texto_Hora_RegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Texto_Hora_RegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Borrar_Registro;
    private javax.swing.JButton Boton_Editar_Registro;
    private javax.swing.JButton Boton_Guardar_Registro;
    private javax.swing.JLabel Label_1_Registro;
    private javax.swing.JLabel Label_2_Registro;
    private javax.swing.JLabel Label_3_Registro;
    private javax.swing.JLabel Label_4_Registro;
    private javax.swing.JLabel Label_5_Registro;
    private javax.swing.JLabel Label_5_Registro1;
    private javax.swing.JLabel Label_5_Registro2;
    private javax.swing.JLabel Label_Titulo_Registro;
    private javax.swing.JTextField Texto_Apellidos_Registro;
    private javax.swing.JTextField Texto_Correo_Registro;
    private javax.swing.JTextField Texto_Hora_Registro;
    private javax.swing.JTextField Texto_Id_Registro;
    private javax.swing.JTextField Texto_Nombre_Registro;
    private javax.swing.JTextField Texto_Precio_Registro;
    private javax.swing.JTextField Texto_Telefono_Registro;
    // End of variables declaration//GEN-END:variables
}
