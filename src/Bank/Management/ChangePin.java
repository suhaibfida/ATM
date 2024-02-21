package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {


    ChangePin(){
        setVisible(true);
        setLocation(400,20);
        setSize(710,740);
        setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Icons/atm png.jpg"));
        Image set=img.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT) ;
        ImageIcon aset=new ImageIcon(set);
        JLabel label=new JLabel(aset);
        label.setBounds(0,0,700,700);
        add(label);





    }

    public static void main(String[] args) {
        new ChangePin();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
