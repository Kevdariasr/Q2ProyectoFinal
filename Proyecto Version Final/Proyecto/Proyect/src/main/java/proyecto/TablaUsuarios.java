/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import javax.swing.table.DefaultTableModel;
import static proyecto.Registro.tablaDatos;

//Importa desde el apartado de registro el llamado a la tabla
/**
 *
 * @author maged
 */
public class TablaUsuarios extends javax.swing.JFrame {
    private DefaultTableModel tablaforma;
    int contador = 0;

    /**
     * Creates new form TablaUsuarios
     */
    public TablaUsuarios() {
        initComponents();
        iniciarTabla();
        cargarDatos();
        
    }
    
    public void iniciarTabla(){
        //Se define el espacio de los datos y el nombre de las columnas
        String datos[][] = {};
        String columna[] = {"Nombres", "Apellidos","Cedula", "Telefono", "Email","Hora","Precio"};
        tablaforma = new DefaultTableModel(datos, columna);
        UsuariosRegistrados.setModel(tablaforma);
    }
    public void cargarDatos(){
        Usuarios uss;

        //Un ciclo for que carga los datos, empezando con i=0,
        //hasta que i deje de ser menor al numero de elementos contenidos
        //en la lista, aumentando de 1 en 1
        
        for(int i=0; i < tablaDatos.size();i++){
            
            //Forma alternativa de llamar la tabla 
            // "uss=(Usuarios)Registro.tablaDatos.get(i);"
            
            //Se establece que "uss" es igual a la informacion del usuario
            //que esta almacenado en la tabla
            uss=(Usuarios)tablaDatos.get(i);
            
            //Agrega una fila vacia con contenedores basandose en el contador
            //y el nuevo objeto a crear
            tablaforma.insertRow(contador,new Object []{});
            
            //Se establece el valor del dato del usuario
            //en el contenedor correspondiente
            tablaforma.setValueAt(uss.getNombre(), contador, 0);
            tablaforma.setValueAt(uss.getApellidos(), contador, 1);
            tablaforma.setValueAt(uss.getID(), contador, 2);
            tablaforma.setValueAt(uss.getTelefono(), contador, 3);
            tablaforma.setValueAt(uss.getEmail(), contador,4);
            tablaforma.setValueAt(uss.getHora(), contador, 5);
            tablaforma.setValueAt(uss.getPrecio(), contador, 6);
        }  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        UsuariosRegistrados = new javax.swing.JTable();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UsuariosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(UsuariosRegistrados);

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(Cerrar)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

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
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JTable UsuariosRegistrados;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
