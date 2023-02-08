 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grocery_store;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Win-10
 */
public class Item extends javax.swing.JPanel {

    /**
     * Creates new form Item
     */
    
    int ID ;
    public Item() {
        initComponents();

    }
    public Item(int id){
        initComponents();
        this.ID = id;    
    }
    
    public int getProductCount(){
        String count = count_label.getText();
        int c = Integer.valueOf(count);
        return c;
    }

//    public void Buy_records(int id,int count){
//        try{
//            FileReader filereader = new FileReader("Items.csv");
//            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
//            List<String[]> Items = reader.readAll(); 
//            for(String[] item: Items){
//                Checkout_Item checkout_item = new Checkout_Item();
//                checkout_item.setPrice(item[3]);
//                checkout_item.setProductName(item[1]);
//                ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource(item[0])).getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT)); 
//                checkout_item.setImage(img);
//                checkout_item.setUnit(item[2]);
//                JPanel main_panel = new Checkout_Items().getPanel();
//                java.awt.GridBagConstraints gb = new java.awt.GridBagConstraints(); 
//                main_panel.add(checkout_item,gb); 
//            }
//        }
//        catch(Exception e){
//            e.printStackTrace();
//        }
//    }
    
    
    public int getProductID(){
        return this.ID;
    }
    
    
    public String getProductName(){
        return product_name_label.getText();
    }
    
//    public void Order_Info(){
//        try{
//            CSVWriter writer = new CSVWriter(new FileWriter("Buy.csv",true));
//            List<String[]> records = new ArrayList<>();
// 
//            
//            String []record = new String[]{};
//            
//            FileReader filereader = new FileReader("user_information.csv");
//            CSVReader reader = new CSVReaderBuilder(filereader).withSkipLines(1).build();       
//            List <String[]> Buy_info;
//            int i=1;
//            for(String[] info : Buy_info){
//                if(info[0].equals(product_name_label.getText())){
//                    while(info[i]!=null){
//                        i++;
//                    }
//                    writer.writeAll(Buy_info);
//                }
//            }
//       
//   
//            writer.flush();
//            writer.close();
//            
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }
//        catch(CsvException e){
//            e.printStackTrace();
//        }
//        return flag;
//    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        image_label = new javax.swing.JLabel();
        unit_label = new javax.swing.JLabel();
        product_name_label = new javax.swing.JLabel();
        minus_label = new javax.swing.JLabel();
        count_label = new javax.swing.JLabel();
        plus_label = new javax.swing.JLabel();
        price_label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 247, 243));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        setMaximumSize(new java.awt.Dimension(305, 355));
        setMinimumSize(new java.awt.Dimension(300, 350));
        setPreferredSize(new java.awt.Dimension(300, 350));
        setRequestFocusEnabled(false);
        setLayout(null);

        image_label.setBackground(new java.awt.Color(255, 255, 255));
        image_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 51)));
        add(image_label);
        image_label.setBounds(50, 10, 200, 190);

        unit_label.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        unit_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(unit_label);
        unit_label.setBounds(0, 230, 300, 20);

        product_name_label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        product_name_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(product_name_label);
        product_name_label.setBounds(0, 200, 300, 40);

        minus_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        minus_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minus_label.setText("-");
        minus_label.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 51), new java.awt.Color(255, 204, 204)));
        minus_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minus_label.setVerifyInputWhenFocusTarget(false);
        minus_label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        minus_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minus_labelMouseClicked(evt);
            }
        });
        add(minus_label);
        minus_label.setBounds(80, 300, 30, 30);

        count_label.setBackground(new java.awt.Color(255, 255, 255));
        count_label.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        count_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        count_label.setText("0");
        count_label.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 102)));
        count_label.setVerifyInputWhenFocusTarget(false);
        count_label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        add(count_label);
        count_label.setBounds(120, 300, 60, 30);

        plus_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        plus_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plus_label.setText("+");
        plus_label.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 51), new java.awt.Color(255, 204, 204)));
        plus_label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plus_label.setVerifyInputWhenFocusTarget(false);
        plus_label.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        plus_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plus_labelMouseClicked(evt);
            }
        });
        add(plus_label);
        plus_label.setBounds(190, 300, 30, 30);

        price_label.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        price_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_label.setText("TK");
        add(price_label);
        price_label.setBounds(90, 260, 120, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1);
        jPanel1.setBounds(50, 10, 200, 190);
    }// </editor-fold>//GEN-END:initComponents
        
    Grocery_Store gc = new Grocery_Store();
    private void plus_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plus_labelMouseClicked
        String count = count_label.getText();
        int c = Integer.valueOf(count);
        if(c<10) c++ ;
        count = Integer.toString(c);
        count_label.setText(count);
        gc.Array_records(this.ID,c);
        
        //Buy_records(this.ID,c);
        //System.out.println(product_name_label.getText() + " c : " + c + "  id : "+ ID);
    }//GEN-LAST:event_plus_labelMouseClicked

    private void minus_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minus_labelMouseClicked
        String count = count_label.getText();
        int c = Integer.valueOf(count);
        if(c!=0) c-- ;
        count = Integer.toString(c);
        count_label.setText(count); 
        gc.Array_records(this.ID, c);
        
        
       // Buy_records(this.ID,c);
        
        //System.out.println(product_name_label.getText() + " c : " + c + "  id : "+ ID);
    }//GEN-LAST:event_minus_labelMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count_label;
    private javax.swing.JLabel image_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minus_label;
    private javax.swing.JLabel plus_label;
    private javax.swing.JLabel price_label;
    private javax.swing.JLabel product_name_label;
    private javax.swing.JLabel unit_label;
    // End of variables declaration//GEN-END:variables

    void setImage(ImageIcon image_icon) {
        image_label.setIcon(image_icon);
    }
    void setProductName(String name){        
        product_name_label.setText(name);
    }
    void setUnit(String s) {
       unit_label.setText(s);
    }
    void setPrice(String s){
        price_label.setText(s);
    }

}