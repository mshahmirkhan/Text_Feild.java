package textfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Textfield extends JFrame {
    //private String x;
Textfield(){
    setTitle("text field");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //setSize(100,200);
    setVisible(true);
    pack();
    
    setLayout(new FlowLayout());
    
    JTextField txtf =new JTextField("enter something ");
    JLabel lbl = new JLabel();
    JButton btn =new JButton("submite");
    
    txtf.setBounds(100,100,100,50);
    lbl.setBounds(150,150,100,50);
    btn.setBounds(150,150,100,50);
    
    add(txtf);
    add(btn);
    add(lbl);
    //public void actionPerformed(actionPerformed e){
    
    btn.addActionListener(new ActionListener(){ 

        public void actionPerformed(ActionEvent e) {
            String x = txtf.getText();
            lbl.setText(x);
        }
       
           
       
    });
    
    
    
    
    
}//contructor
    public static void main(String[] args) {
        Textfield obj =new Textfield();
    }
    
}
