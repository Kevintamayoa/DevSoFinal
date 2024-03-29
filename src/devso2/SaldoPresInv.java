/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devso2;

//import Adicional.ExportExc;
import Classes.Client;
import Classes.Provider;
import Classes.Request;
import Classes.Save;
import static Classes.Save.Provider;
import Conexion.Conexion;
//import static ayana.Interfaz.SaldoProveedoresBool;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author macbook
 */
public class SaldoPresInv extends javax.swing.JFrame {

    /**
     * Creates new form SaldoProveedores
     */
    public SaldoPresInv() {
        initComponents();
     this.setIconImage (new ImageIcon(this.getClass().getResource("Images/Screenshot_1.png")).getImage());
         ImageIcon imagen = new ImageIcon(getClass().getResource("Images/Editar.png"));
        Icon fondo = new ImageIcon(imagen.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnEdita.setIcon(fondo);
  ImageIcon imagen1 = new ImageIcon(getClass().getResource("Images/Eliminar.png"));
        Icon fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnEliminar.setIcon(fondo1);
           ImageIcon imagen2 = new ImageIcon(getClass().getResource("Images/Info.png"));
        Icon fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnVentas.setIcon(fondo2);
           ImageIcon imagen3 = new ImageIcon(getClass().getResource("Images/Agregar.png"));
        Icon fondo3 = new ImageIcon(imagen3.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnPagar.setIcon(fondo3);
          imagen = new ImageIcon(getClass().getResource("Images/VerPagos.png"));
        fondo = new ImageIcon(imagen.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        btnPagos.setIcon(fondo);
        ImageIcon imagen4 = new ImageIcon(getClass().getResource("Images/Buscar.png"));
        Icon fondo4 = new ImageIcon(imagen4.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        txtBuscar.setIcon(fondo4);
                
        table.getTableHeader().setBackground(Color.white);
        table.getTableHeader().setForeground(Color.black);
        table.getTableHeader().setFont(new Font("InaiMathi", 0, 20)); 
        table.getColumnModel().getColumn(5).setCellRenderer(new CurrencyCellRenderer());
          table.getColumnModel().getColumn(6).setCellRenderer(new CurrencyCellRenderer());
              table.getColumnModel().getColumn(7).setCellRenderer(new CurrencyCellRenderer());
              DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        table.getColumnModel().getColumn(0).setCellRenderer(tcr);
             table.getColumnModel().getColumn(1).setCellRenderer(tcr);
        table.getColumnModel().getColumn(2).setCellRenderer(tcr);
        table.getColumnModel().getColumn(3).setCellRenderer(tcr);
        table.getColumnModel().getColumn(4).setCellRenderer(tcr);    
        con=new Conexion();
        model=(DefaultTableModel)table.getModel();
        con.Conectar();        
     try{
 
          providers=con.GetRegProviders();
     
      } catch (SQLException ex) {
                 }
     con.Desconectar();
        for(Provider obj: providers)
        {
            String tipo="Efectivo";
            boolean factura=false;
            DecimalFormat formatea = new DecimalFormat("$###,###.##");
 
            model.addRow(new Object[]{obj.Id,obj.Description,obj.Contacto,
               obj.Email,obj.Detalle,obj.Monto,obj.MontoPagado,obj.Saldo()});
        }
              trs=new TableRowSorter(model);
        table.setRowSorter(trs);
    }
  private DefaultTableModel model;
Conexion con;
List<Provider> providers;
TableRowSorter trs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SubMenu = new javax.swing.JPopupMenu();
        btnPagar = new javax.swing.JMenuItem();
        btnVentas = new javax.swing.JMenuItem();
        btnPagos = new javax.swing.JMenuItem();
        btnEdita = new javax.swing.JMenuItem();
        btnEliminar = new javax.swing.JMenuItem();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtBusqueda2 = new javax.swing.JTextPane();
        txtBuscar = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        btnPagar.setText("Realizar pago");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        SubMenu.add(btnPagar);

        btnVentas.setText("Ver pedidos");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        SubMenu.add(btnVentas);

        btnPagos.setText("Ver pagos");
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        SubMenu.add(btnPagos);

        btnEdita.setText("Editar");
        btnEdita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditaActionPerformed(evt);
            }
        });
        SubMenu.add(btnEdita);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        SubMenu.add(btnEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Saldo de proveedores");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(47, 51, 66));

        jScrollPane5.setForeground(new java.awt.Color(0, 0, 0));

        txtBusqueda2.setBackground(new java.awt.Color(255, 248, 245));
        txtBusqueda2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtBusqueda2.setFont(new java.awt.Font("InaiMathi", 0, 14)); // NOI18N
        txtBusqueda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusqueda2KeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(txtBusqueda2);

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        txtBuscar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtBuscar.setText("Buscar:");

        btnNuevoCliente.setBackground(new java.awt.Color(123, 163, 186));
        btnNuevoCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        btnNuevoCliente.setText("Agregar nuevo proveedor");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(47, 51, 66));
        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Saldo de proveedores");

        table.setBackground(new java.awt.Color(253, 239, 229));
        table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        table.setFont(new java.awt.Font("InaiMathi", 0, 18)); // NOI18N
        table.setForeground(new java.awt.Color(55, 55, 55));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id proveedor", "Proveedor", "Contacto", "Email", "Detalle", "Total de compras", "Total pagado", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setFocusable(false);
        table.setGridColor(new java.awt.Color(153, 153, 153));
        table.setRowHeight(22);
        table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(btnNuevoCliente)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jMenu2.setBackground(new java.awt.Color(187, 187, 187));
        jMenu2.setForeground(new java.awt.Color(51, 51, 51));
        jMenu2.setText("Exportar");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(187, 187, 187));
        jMenuItem3.setForeground(new java.awt.Color(51, 51, 51));
        jMenuItem3.setText("Archivo de Excel");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBusqueda2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqueda2KeyTyped
txtBusqueda2.addKeyListener(new KeyAdapter(){       
       @Override
       public void keyReleased(KeyEvent ke){
       trs.setRowFilter(RowFilter.regexFilter("(?i)"+txtBusqueda2.getText(),1));
       }


   });
     trs=new TableRowSorter(model);  
     table.setRowSorter(trs);
      
    }//GEN-LAST:event_txtBusqueda2KeyTyped

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
        evt.consume();
        SubMenu.show(table, evt.getX(), evt.getY());
        }      
    }//GEN-LAST:event_tableMouseReleased

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
         Save.ingreso=1;
        try{
        Save.Provider=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        RegistroEgresos form=new RegistroEgresos();
        form.show();
        }catch(Exception e){}
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
              Save.status2=1;
//        try{
//        Save.Provider=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
//        RegInventario form=new RegInventario();
//       form.show();
//       }catch(Exception e){}
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        Save.status2=0;
        //AddProvider form=new AddProvider();
//        form.setModal(true);
//        form.setVisible(true);
        int j=model.getRowCount();
        for(int i=0;i<j;i++){
            model.removeRow(j-i-1);
        }
        con=new Conexion();
        con.Conectar();
        try{

            providers=con.GetRegProviders();

        } catch (SQLException ex) {
        }
        con.Desconectar();
        for(Provider obj: providers)
        {
            String tipo="Efectivo";
            boolean factura=false;
            DecimalFormat formatea = new DecimalFormat("$###,###.##");

            model.addRow(new Object[]{obj.Id,obj.Description,obj.Contacto,
                obj.Email,obj.Detalle,obj.Monto,obj.MontoPagado,obj.Saldo()});
        }
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnEditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditaActionPerformed
       Save.status2=1;
            try{
         Save.Provider=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
        //AddProvider form=new AddProvider();
        //form.setModal(true);
        //form.setVisible(true);
           int j=model.getRowCount();
          for(int i=0;i<j;i++){
          model.removeRow(j-i-1);
          }
          con=new Conexion();
                    con.Conectar();        
     try{
 
          providers=con.GetRegProviders();
     
      } catch (SQLException ex) {
                 }
     con.Desconectar();
        for(Provider obj: providers)
        {
            String tipo="Efectivo";
            boolean factura=false;
            DecimalFormat formatea = new DecimalFormat("$###,###.##");
 
            model.addRow(new Object[]{obj.Id,obj.Description,obj.Contacto,
               obj.Email,obj.Detalle,obj.Monto,obj.MontoPagado,obj.Saldo()});
        }

         }catch(Exception e){}
    }//GEN-LAST:event_btnEditaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       try{
        Provider clt = providers.stream()
  .filter(obj -> Integer.parseInt( table.getValueAt(table.getSelectedRow(), 0).toString())==obj.Id)
  .findAny()
  .orElse(null);}
     catch(Exception e){
         return; 
     }
        int n = JOptionPane.showConfirmDialog(this,
"¿Desea eliminar el proveedor "+ table.getValueAt(table.getSelectedRow(), 1).toString() +"?, se eliminaran todas las ventas y toda la información relacionada.","Confirmación",
JOptionPane.YES_NO_OPTION);
   if(n==JOptionPane.YES_OPTION){
   
       con=new Conexion();
               con.Conectar();        
     try{
         con.DeleteProvider(Integer.parseInt( table.getValueAt(table.getSelectedRow(), 0).toString()));  
                providers=con.GetRegProviders();
      } catch (SQLException ex) {
                 }
     con.Desconectar();
       JOptionPane.showMessageDialog(this,"Proveedor eliminado con éxito.");
       
 int j=model.getRowCount();
        for(int i=0;i<j;i++){
            model.removeRow(j-i-1);
        }
        for(Provider obj: providers)
        {
            model.addRow(new Object[]{obj.Id,obj.Description,obj.Contacto,
                obj.Email,obj.Detalle,obj.Monto,obj.MontoPagado,obj.Saldo()});
        }
   }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        Save.ingreso=1;
      try{
           
        Provider clt = providers.stream()
  .filter(obj -> Integer.parseInt( table.getValueAt(table.getSelectedRow(), 0).toString())==obj.Id)
  .findAny()
  .orElse(null);
 
            Save.Providertext=table.getValueAt(table.getSelectedRow(), 1).toString();
            Save.ProviderSaldo=clt.Saldo();
            Save.Provider=Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
            //AuxPagos form=new AuxPagos();
            //form.setModal(true);
            //form.setVisible(true);
      }catch(Exception e){}
       int j=model.getRowCount();
        for(int i=0;i<j;i++){
            model.removeRow(j-i-1);
        }
        con=new Conexion();
        con.Conectar();
        try{

            providers=con.GetRegProviders();

        } catch (SQLException ex) {
        }
        con.Desconectar();
        for(Provider obj: providers)
        {
            model.addRow(new Object[]{obj.Id,obj.Description,obj.Contacto,
                obj.Email,obj.Detalle,obj.Monto,obj.MontoPagado,obj.Saldo()});
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//        ExportExc j=new ExportExc();
//        try{
//            j.exportarExcel(table);}
//        catch(IOException e){}
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Interfaz.SaldoProveedoresBool=false;       
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(SaldoPresInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaldoPresInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaldoPresInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaldoPresInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaldoPresInv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu SubMenu;
    private javax.swing.JMenuItem btnEdita;
    private javax.swing.JMenuItem btnEliminar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JMenuItem btnPagar;
    private javax.swing.JMenuItem btnPagos;
    private javax.swing.JMenuItem btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable table;
    private javax.swing.JLabel txtBuscar;
    private javax.swing.JTextPane txtBusqueda2;
    // End of variables declaration//GEN-END:variables
}
