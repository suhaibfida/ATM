package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Balance extends JFrame implements ActionListener {

    JButton b1;
    String pin;
    Balance( String pin){
        this.pin= this.pin;
        setVisible(true);
        setLocation(400,50);
        setSize(700,740);
        setLayout(null);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/atm png.jpg"));
        Image img2=img1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel label=new JLabel(img3);
        label.setBounds(0,0,700,700);
        add(label);
        try {



            

        }
        catch (Exception e){
            System.out.println(e);

        }











        b1 =new JButton("Back");
        b1.setBounds(282,440,120,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,17));
        b1.setBackground(Color.PINK);
        b1.addActionListener(this);
        b1.setForeground(Color.black);
        label.add(b1);







    }




    public static void main(String[] args) {
        new Balance("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
