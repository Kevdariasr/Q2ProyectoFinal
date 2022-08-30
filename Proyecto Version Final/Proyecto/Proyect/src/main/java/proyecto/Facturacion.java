/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto;

import javax.swing.*;
import java.util.LinkedList;
/**
 *
 * @author DerekMSI
 */
public class Facturacion extends javax.swing.JPanel {
    public static LinkedList DineroTotal=new LinkedList();

    public Facturacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_Titulo_Registro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Espacio_Nombre = new javax.swing.JTextField();
        Espacio_Apellido = new javax.swing.JTextField();
        Espacio_ID = new javax.swing.JTextField();
        Espacio_Precio = new javax.swing.JTextField();
        Boton_Pagar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Espacio_Descuento = new javax.swing.JTextField();

        Label_Titulo_Registro.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Label_Titulo_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo_Registro.setText(" Realizar pago");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Apellidos");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Identificacion");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Precio");

        Espacio_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Espacio_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio_NombreActionPerformed(evt);
            }
        });

        Espacio_Apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Espacio_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Espacio_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Espacio_IDActionPerformed(evt);
            }
        });

        Espacio_Precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Boton_Pagar.setText("Pagar");
        Boton_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_PagarActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Descuento");

        Espacio_Descuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Espacio_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Espacio_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Label_Titulo_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Boton_Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Label_Titulo_Registro)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Espacio_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Espacio_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Espacio_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Espacio_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Espacio_Descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(Boton_Pagar)
                .addContainerGap(328, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Espacio_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio_NombreActionPerformed
    }//GEN-LAST:event_Espacio_NombreActionPerformed

    private void Boton_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PagarActionPerformed
        
        //Variables
        String Nombre, Apellido, Cedula;
        Float Precio;
        String Descuento;
        Float TurnDescuento;
        
        //Obtener valor del TextField
        Nombre=Espacio_Nombre.getText();
        Apellido=Espacio_Apellido.getText();
        Cedula=Espacio_ID.getText();
        Precio=Float.parseFloat(Espacio_Precio.getText());
        Descuento=Espacio_Descuento.getText();
        
        //Realizar pago con o sin descuento
        if(Descuento.isEmpty()){
            //Sin Descuento
            JOptionPane.showMessageDialog(null,
                    "Cliente: "
                    +Nombre+" "+Apellido+
                    " Se ha realizado el pago con un valor de: "
                    +Precio);
            //Agregar a lista
            DineroTotal.add(Precio);
        }else{
            //Con Descuento
            TurnDescuento=Float.parseFloat(Espacio_Descuento.getText());
            TurnDescuento=TurnDescuento/100;
            Precio=Precio-(Precio*TurnDescuento);
            JOptionPane.showMessageDialog(null,
                    "Cliente: "
                    +Nombre+" "+Apellido+
                    " Se ha realizado el pago con un valor de: "
                    +Precio);
            //Agregar a lista
            DineroTotal.add(Precio);
        }
        Espacio_Nombre.setText("");
        Espacio_Apellido.setText("");
        Espacio_ID.setText("");
        Espacio_Precio.setText("");
        Espacio_Nombre.setText("");
        Espacio_Descuento.setText("");   

    }//GEN-LAST:event_Boton_PagarActionPerformed

    private void Espacio_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Espacio_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Espacio_IDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Pagar;
    private javax.swing.JTextField Espacio_Apellido;
    private javax.swing.JTextField Espacio_Descuento;
    private javax.swing.JTextField Espacio_ID;
    private javax.swing.JTextField Espacio_Nombre;
    private javax.swing.JTextField Espacio_Precio;
    private javax.swing.JLabel Label_Titulo_Registro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
