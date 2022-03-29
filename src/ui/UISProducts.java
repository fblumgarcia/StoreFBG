package ui;

import com.mysql.cj.jdbc.Blob;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import model.DataBase;

    /**
     * <h1>UISProducts</h1>
     * <p> Formato visual para acceder a la búsqueda de los productos
     * @author fblumgarcia
     * https://github.com/fblumgarcia
     * 
     */
public class UISProducts extends javax.swing.JPanel {
    public ArrayList productsBuy=new ArrayList();
    /**
     * Creates new form Products
     */
    public UISProducts() {
        initComponents();       
        TableColumnModel columnModel=tableInfo.getColumnModel();//Se inicializa el modelo de la tabla
        //Se da dimensiones a las columnas
        columnModel.getColumn(0).setPreferredWidth(5);columnModel.getColumn(1).setPreferredWidth(20);columnModel.getColumn(2).setPreferredWidth(15);
        columnModel.getColumn(3).setPreferredWidth(15);columnModel.getColumn(4).setPreferredWidth(40);columnModel.getColumn(5).setPreferredWidth(40);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchTF = new javax.swing.JTextField();
        searchProd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableInfo = new javax.swing.JTable();

        setForeground(new java.awt.Color(204, 255, 51));

        searchProd.setText("Buscar");
        searchProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchProdActionPerformed(evt);
            }
        });

        tableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "PRECIO", "CANTIDAD", "DESCRIPCIÓN", "IMÁGEN", "COMPRAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, ImageIcon.class, Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int row, int column) {
                if(column==6){
                    return true;
                }else{
                    return false;
                }
            }

        });
        tableInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableInfo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(searchProd)
                .addGap(177, 482, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchProdActionPerformed
        DataBase sP = new DataBase();   //Llama la base de datos   
        ArrayList prods=sP.SearchProduct(searchTF.getText().toUpperCase());//Ejecuta la busqueda
        DefaultTableModel model=(DefaultTableModel) tableInfo.getModel();//Se instancia la tabla
        model.setRowCount(0); //Se borra todas las filas
        for(int i=0;i<prods.size()/6;i++){
            Object[] row=new Object[6];//Se crea una array de la fila
            int k=0;//Es usado para ubicar dentro del array de la fila
            for(int j=i*6;j<(6*(i+1))-1;j++){//El j ya que inicia en 0 6 12..., y termina en 4 10...
                row[k]=(String) prods.get(j);//Se añade al array row de las 5 primeras columnas
                k++;//Se da el incremento del k
            }
            //Se convierte el archivo blob a ImageIcon
            Blob blob=(Blob) prods.get(6*(i+1)-1);
            try {
                int blobLength=(int) blob.length();
                byte[] bytes=blob.getBytes(1, blobLength);
                blob.free();
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
                ImageIcon icon = new ImageIcon(img); 
                row[5]=icon;     
                model.addRow(row);//Se añade a la fila dentro de la tabla
                tableInfo.setRowHeight(i, 200);//Dar la altura de la imagen a la fila
            } catch (SQLException | IOException ex) {
                Logger.getLogger(UISProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("");
    }//GEN-LAST:event_searchProdActionPerformed
    
    
    UISShop shop=new UISShop();
    private void tableInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableInfoMouseClicked
        if(evt.getX()>800&&evt.getX()<980){//Obtiene la posición en que se da click si cumple da sobre el checkbox
            if(tableInfo.getValueAt(evt.getY()/200, 6).equals(true)){//El primer valor da la posición de la fila en entero
                shop.setProductsToBuy((String) tableInfo.getValueAt(evt.getY()/200, 1),(String) tableInfo.getValueAt(evt.getY()/200, 2), 1);
            }else if(tableInfo.getValueAt(evt.getY()/200, 6).equals(false)){
                shop.setProductsToBuy((String) tableInfo.getValueAt(evt.getY()/200, 1),(String) tableInfo.getValueAt(evt.getY()/200, 2), 2);
            }     
        }
    }//GEN-LAST:event_tableInfoMouseClicked


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton searchProd;
    private javax.swing.JTextField searchTF;
    private javax.swing.JTable tableInfo;
    // End of variables declaration//GEN-END:variables
}
