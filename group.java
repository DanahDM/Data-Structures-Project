package projectds;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static projectds.ProjectDS.*;
public class group implements ActionListener {
        JFrame frame1;
        JPanel panel1;
        JLabel tital1;
        JLabel num;
        JLabel numx ;
        JLabel nam;
        JLabel namx ; 
        JButton next;
        JPanel panel2;
        JLabel tital2;
        JLabel nam2;
        JButton add ;
        JPanel panel3;
        JLabel tital3;
        JLabel sd;
        JLabel lab3;
        JLabel lab4;
        JLabel td;
        JLabel lab5;
        JLabel lab6;
        JLabel fh;
        JLabel lab7;
        JLabel lab8;
        JTextField namxx;
        
 public void actionPerformed(ActionEvent ae) {
            frame1 = new JFrame(); //create a Frame
                frame1.setTitle("CS.Hospital"); //titel of frame
                frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//exit
                frame1.setSize(650 ,650); //size x-dimension , y-dimensiob
                frame1.setLayout(null);
                frame1.setVisible(true);// make frame visibale.
               frame1.getContentPane().setBackground(new Color(0xDDD8FF));
                panel1 = new JPanel();
            //panel1.setBackground(Color.GREEN );
            panel1.setBounds(30, 20, 350, 270);
            panel1.setLayout(null);
            panel1.setBorder(BorderFactory.createEtchedBorder());
            panel1.setBackground(new Color(0xf7f7fb));
        tital1 = new JLabel(); 
            tital1.setText("Current Patient:");
            tital1.setFont(new Font("Serif", Font.CENTER_BASELINE,25));
            tital1.setBounds(20, 10, 1000, 80);

          
         num = new JLabel();
            num.setText("Number:");
            num.setBounds(30, 80, 100, 50);
            num.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
            
        numx = new JLabel();
            numx.setText(Integer.toString(printnum(1)));
            numx.setBounds(120, 80, 100, 50);
            numx.setFont(new Font("Serif", Font.CENTER_BASELINE,22));

        nam = new JLabel(); 
            nam.setBounds(30, 120, 100, 50);
            nam.setText("Name:");
            nam.setFont(new Font("Serif", Font.CENTER_BASELINE,22));;
        
        namx = new JLabel(); 
            namx.setBounds(120, 120, 300, 50);
            namx.setText(printname(1));
            namx.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
            
        next = new JButton ();
            next.setText("NEXT");
            next.setBounds(110, 200, 150, 40);
            next.setForeground(Color.BLACK);
            next.setHorizontalTextPosition(JButton.CENTER);
            next.setVerticalTextPosition(JButton.TOP);
            next.setFocusable(false);
            next.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
            next.setBackground(new Color(0xDDD8FF));
            next.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    if (!Q.isEmpty()){
                        if (Q.size()<= 1) {
                        next.setEnabled(false);
                    }
                        else if (Q.size()> 1 && Q.size()<51){
                            Q.deleteMax(); 
                            Q.sort();
                            numx.setText(Integer.toString(printnum(1)));
                            namx.setText(printname(1));
                            lab3.setText("Number: "+Integer.toString(printnum(2)));
                            lab4.setText("Name:"+printname(2));
                            lab5.setText("Number: "+Integer.toString(printnum(3)));
                            lab6.setText("Name: "+printname(3));
                            lab7.setText("Number: "+Integer.toString(printnum(4)));
                            lab8.setText("Name: "+printname(4));
                            Q.sort();
                            add.setEnabled(true);
                        
                        }    
                    }
                    
                }
            });

            
       panel3 = new JPanel();  
          
           //panel3.setBackground(Color.RED );
           panel3.setBounds(390, 130, 220, 370);
           panel3.setLayout(null);
           panel3.setBorder(BorderFactory.createEtchedBorder());
        panel3.  setBackground(new Color(0xf7f7fb));
           tital3 = new JLabel();
           tital3.setText("Who after Current?");
           tital3.setFont(new Font("Serif", Font.CENTER_BASELINE,20));
           tital3.setBounds(20, 5, 1000, 70);
          
       sd = new JLabel(); 
            sd.setText("Second patient");
            sd.setBounds(20, 20, 200, 100);
            sd.setFont(new Font("Serif", Font.CENTER_BASELINE,18));

       lab3 = new JLabel(); 
            lab3.setText("Number: "+Integer.toString(printnum(2)));
            lab3.setBounds(20, 40, 200, 100);
            lab3.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
            
       lab4 =  new JLabel();
            lab4.setText("Name: "+printname(2));
            lab4.setBounds(20, 60, 200, 100);
            lab4.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
            
       td = new JLabel(); 
            td.setText("Third patient");
            td.setBounds(20, 100, 200, 100);
            td.setFont(new Font("Serif", Font.CENTER_BASELINE,18));   
            
       lab5 = new JLabel(); 
            lab5.setText("Number: "+Integer.toString(printnum(3)));
            lab5.setBounds(20, 120, 200, 100);
            lab5.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
            
       lab6 =  new JLabel();
            lab6.setText("Name: "+printname(3));
            lab6.setBounds(20, 140, 200, 100);
            lab6.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
        
       fh = new JLabel(); 
            fh.setText("Fourth patient");
            fh.setBounds(20, 180, 200, 100);
            fh.setFont(new Font("Serif", Font.CENTER_BASELINE,18));   
            
       lab7 = new JLabel(); 
            lab7.setText("Number: "+Integer.toString(printnum( 4)));
            lab7.setBounds(20, 200, 200, 100); 
            lab7.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
            
       lab8 =  new JLabel();
            lab8.setText("Name: "+printname(4));
            lab8.setBounds(20, 220, 200, 100);
            lab8.setFont(new Font("Serif", Font.CENTER_BASELINE,16));
            
                    
                  
         
       

         
///////////////////////////// 
        panel2 = new JPanel();
        panel2.setBounds(30, 310, 350, 270);//(30, 20, 570, 300);
        panel2.setLayout(null);
        panel2.setBorder(BorderFactory.createEtchedBorder());
        panel2.setBackground(new Color(0xf7f7fb));
        tital2 = new JLabel(); 
            tital2.setText("Add New Patient:");
            tital2.setFont(new Font("Serif", Font.CENTER_BASELINE,25));
            tital2.setBounds(20, 10, 1000, 80);

            nam2 = new JLabel(); 
            nam2.setBounds(40, 80, 100, 50);
            nam2.setText("Name:");
            nam2.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
        
          namxx = new JTextField(); 
          namxx.setBounds(120, 90, 200, 30);
          namxx.setText(" ");
          namxx.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
        
            add = new JButton ();
            add.setText("ADD");
            add.setBounds(100, 150, 150, 40);
            add.setForeground(Color.BLACK);
            add.setHorizontalTextPosition(JButton.CENTER);
            add.setVerticalTextPosition(JButton.CENTER);
            add.setFocusable(false);
            add.setFont(new Font("Serif", Font.CENTER_BASELINE,22));
            add.setBackground(new Color(0xDDD8FF));
            add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            String name = namxx.getText();
            if (" ".equals(name)||"".equals(name)){
            JOptionPane.showMessageDialog
            (null, "Please Enter name", "Error",JOptionPane.ERROR_MESSAGE );}
                    else{
                    Q.insert(num(), name);
                    Q.sort();
                    next.setEnabled(true);
                    namxx.setText("");
                    lab3.setText("Number: "+Integer.toString(printnum(2)));
                    lab4.setText("Name:"+printname(2));
                    lab5.setText("Number: "+Integer.toString(printnum(3)));
                    lab6.setText("Name: "+printname(3));
                    lab7.setText("Number: "+Integer.toString(printnum(4)));
                    lab8.setText("Name: "+printname(4));
                    if (Q.size()==50){
                    add.setEnabled(false);}}}});
          
        panel2.add(add);
        panel2.add(tital2);
        panel2.add(nam2);
        panel2.add(namxx);
        panel1.add(tital1);
        panel1.add(num);
        panel1.add(numx);
        panel1.add(nam);
        panel1.add(namx);
        panel1.add(next);
        panel3.add(tital3);
        panel3.add(sd);
        panel3.add(lab3);
        panel3.add(lab4);
        panel3.add(td);
        panel3.add(lab5);
        panel3.add(lab6);
        panel3.add(fh);
        panel3.add(lab7);
        panel3.add(lab8);
        frame1.add(panel1);
        frame1.add(panel2);
        frame1.add(panel3);}}
