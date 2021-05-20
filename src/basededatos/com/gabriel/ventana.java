
package basededatos.com.gabriel;

import static com.sun.corba.se.impl.presentation.rmi.StubConnectImpl.connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.management.remote.JMXConnectorFactory.connect;
import static javax.rmi.PortableRemoteObject.connect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class ventana extends javax.swing.JFrame {

    Conector con = new Conector();
        
    public ventana() {
        initComponents();
    }
     public void mostrar(){
        DefaultTableModel tenist = new DefaultTableModel();
        tenist.addColumn("Marca");
        tenist.addColumn("Nombre");
        tenist.addColumn("Color");
        tenist.addColumn("Talla");
        tenist.addColumn("Codigo");
        this.tabla.setModel(tenist);
        
        String []datos = new String[5];
        
        try{
            Statement leer = con.connect.createStatement();
            ResultSet resultado = leer.executeQuery("select * from tenis");
            
            while(resultado.next()){
                
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                tenist.addRow(datos);
            }
            this.tabla.setModel(tenist);
        }catch(Exception e){
            
        }  
            
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        marca = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        talla = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        lmarca = new javax.swing.JTextField();
        lnombre = new javax.swing.JTextField();
        lcolor = new javax.swing.JTextField();
        ltalla = new javax.swing.JTextField();
        lcodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbuscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        conectar = new javax.swing.JButton();
        desconectar = new javax.swing.JButton();
        GUARDAR = new javax.swing.JButton();
        insertar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        marca.setText("Marca");

        nombre.setText("Nombre");

        color.setText("Color");

        talla.setText("Talla");

        codigo.setText("Codigo");

        jLabel1.setText("Buscar");

        lbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo)
                        .addGap(18, 18, 18)
                        .addComponent(lcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombre)
                                .addComponent(color)
                                .addComponent(talla)
                                .addComponent(marca))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(lnombre)
                                .addComponent(lcolor)
                                .addComponent(ltalla))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(lbuscar))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca)
                    .addComponent(lmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(lnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(lcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talla)
                    .addComponent(ltalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo)
                    .addComponent(lcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conectar.setText("CONECTAR");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        desconectar.setText("DESCONECTAR");
        desconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desconectarActionPerformed(evt);
            }
        });

        GUARDAR.setText("GUARDAR");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        insertar.setText("INSERTAR");
        insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarActionPerformed(evt);
            }
        });

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(conectar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desconectar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(GUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(limpiar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(insertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(buscar)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conectar)
                    .addComponent(desconectar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GUARDAR)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertar)
                    .addComponent(modificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(buscar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Color", "Talla", "Codigo"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
         try{
             PreparedStatement pt = con.connect.prepareStatement("insert into tenis values(?,?,?,?,?)");
            
            pt.setString(1,this.lmarca.getText().trim());
            pt.setString(2,this.lnombre.getText().trim());
            pt.setString(3, this.lcolor.getText().trim());
            pt.setString(4, this.ltalla.getText().trim());
            pt.setString(5, this.lcodigo.getText().trim());
            pt.executeUpdate();
            
            this.lmarca.setText("");
            this.lnombre.setText("");
            this.lcolor.setText("");
            this.ltalla.setText("");
            this.lcodigo.setText("");
            
            
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_GUARDARActionPerformed

    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        con.connect();
    }//GEN-LAST:event_conectarActionPerformed

    private void desconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desconectarActionPerformed
        con.close();
    }//GEN-LAST:event_desconectarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
            this.lmarca.setText("");
            this.lnombre.setText("");
            this.lcolor.setText("");
            this.ltalla.setText("");
            this.lcodigo.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarActionPerformed
        mostrar();
    }//GEN-LAST:event_insertarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        try{
            String marca = this.lmarca.getText().trim();
            String nombre = this.lnombre.getText().trim();
            String color = this.lcolor.getText().trim();
            String talla = this.ltalla.getText().trim();     
            String codigo = this.lcodigo.getText().trim();   
            PreparedStatement pst = con.connect.prepareStatement("UPDATE tenis SET Marca ='"+marca+"', Nombre='"+nombre+"',Color='"+color+"', Talla='"+talla+"' WHERE Codigo= '"+codigo+"'");
            pst.executeUpdate();
            

        }catch(Exception e){
            
        }
    }//GEN-LAST:event_modificarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
         try{
            PreparedStatement pt = con.connect.prepareStatement("delete from tenis where Codigo = ?");
            
             pt.setString(1,this.lcodigo.getText().trim());
             
             pt.executeUpdate();
             
            this.lcodigo.setText("");
            this.lmarca.setText("");
            this.lnombre.setText("");
            this.lcolor.setText("");
            this.ltalla.setText("");
        }catch(Exception e){
            
        } 
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
         try{
            PreparedStatement pt = con.connect.prepareStatement("select * from tenis where Codigo = ?");
            
            pt.setString(1, this.lbuscar.getText().trim());
            
            ResultSet rs = pt.executeQuery();
            
            if(rs.next()){
                this.lmarca.setText(rs.getString("Marca"));
                this.lnombre.setText(rs.getString("Nombre"));
                this.lcolor.setText(rs.getString("Color"));
                this.ltalla.setText(rs.getString("Talla"));
                this.lcodigo.setText(rs.getString("Codigo"));
                this.lbuscar.setText("");
                
            }else{
                JOptionPane.showMessageDialog(null, "No hay ese teni");
            }
       }catch(Exception e){
           
       }
    }//GEN-LAST:event_buscarActionPerformed

    private void lbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbuscarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel color;
    private javax.swing.JButton conectar;
    private javax.swing.JButton desconectar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbuscar;
    private javax.swing.JTextField lcodigo;
    private javax.swing.JTextField lcolor;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField lmarca;
    private javax.swing.JTextField lnombre;
    private javax.swing.JTextField ltalla;
    private javax.swing.JLabel marca;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel nombre;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel talla;
    // End of variables declaration//GEN-END:variables
}
