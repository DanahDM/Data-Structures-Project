package projectds;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
public class frame {
public frame() {        
    //fram insert and its properties
    JFrame frame=new JFrame();
    frame.setVisible(true);
    frame.setTitle("Team#7");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(650,650);
    frame.getContentPane().setBackground(Color.white);
    frame.setLayout(null);
    ImageIcon image=new ImageIcon("dsPic.jpg");
    JLabel label = new JLabel(image);
    frame.add(label);
    label.setSize(650, 650);
 
    Border border = BorderFactory.createLineBorder(Color.BLACK);    
    JLabel labl = new JLabel(); //create Label
    labl.setText(" The  personal code is  here:");//Set text of label
    labl.setFont(new Font("MV boli", Font.ITALIC,25)); //set font of text
    labl.setVerticalAlignment(JLabel.TOP); //set position.
    labl.setHorizontalAlignment(JLabel.CENTER);
    JButton button1=new JButton("Group Project");
    JButton button2=new JButton("Individual Project");
   
    button1.setBorder(border);
    button2.setBorder(border);
    //button 1
    button1.setBounds(450,430, 170, 70);
    button1.setFocusable(false);
    button1.setFont(new Font("Serif", Font.ITALIC,20));
    button1.setBackground(new Color(0xD5DCE2));
    button1.addActionListener(new group());
    //button 2
    button2.setBounds(450,510,170, 70);
    button2.setFocusable(false);
    button2.setFont(new Font("Serif", Font.ITALIC,20));
    button2.setBackground(new Color(0xD5DCE2));
    button2.addActionListener(new personal());
    //insert in JFrame
     
    frame.add(button1);
    frame.add(button2);
    frame.add(labl);}}