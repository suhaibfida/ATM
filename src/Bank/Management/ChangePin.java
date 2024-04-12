package Bank.Management;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JTextField j1,j2;
    JButton b1,b2;
    String pin;

    ChangePin(String pin){
        this.pin=pin;
        setTitle("Change Pin");
        setLocation(400,20);
        setSize(710,740);
        setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Icons/atm png.jpg"));
        Image set=img.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT) ;
        ImageIcon aset=new ImageIcon(set);
        JLabel label=new JLabel(aset);
        label.setBounds(0,0,700,700);
        add(label);
        JLabel label1=new JLabel("Please Enter A New Pin:");
        label1.setBounds(210,240,450,40);
        label1.setFont(new Font("Raleway",Font.BOLD,17));
        label1.setForeground(Color.white);
        label.add(label1);
        j1=new JTextField();
        j1.setBounds(210,290,230,23);
        j1.setFont(new Font("Raleway",Font.BOLD,17));
        label.add(j1);

        JLabel label2=new JLabel("Please Re-Enter A New Pin:");
        label2.setBounds(210,320,450,40);
        label2.setFont(new Font("Raleway",Font.BOLD,17));
        label2.setForeground(Color.white);
        label.add(label2);
        j2=new JTextField();
        j2.setBounds(210,360,230,23);
        j2.setFont(new Font("Raleway",Font.BOLD,17));
        label.add(j2);
        b1=new JButton("Back");
        b1.setBounds(282,440,120,30);
        b1.setFont(new Font("SanSerif",Font.BOLD,17));
        b1.setBackground(Color.PINK);
        b1.addActionListener(this);
        b1.setForeground(Color.black);
        label.add(b1);
        b2=new JButton("Enter");
        b2.setBounds(410,440,120,30);
        b2.setFont(new Font("SanSerif",Font.BOLD,17));
        b2.addActionListener(this);
        b2.setBackground(Color.blue);
        b2.setForeground(Color.white);
        label.add(b2);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChangePin("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String c1pin=j1.getText();
            String c2pin=j2.getText();
            if(e.getSource()==b1){
                setVisible(false);
                new Transactions(pin).setVisible(true);

            }
            else{

                if(j1.getText().equals("") && j2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter A Pin");
                    return;


                }
                else if (!c1pin.equals(c2pin)){
                    JOptionPane.showMessageDialog(null,"Please enter the same Pin");
                    return;
                }

                Connect c=new Connect();
                String query1 ="update account set pin='"+c1pin+"'where pin='"+pin+"'";
                String query2="update login set Pin='"+c1pin+"'where Pin='"+pin+"'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                JOptionPane.showMessageDialog(null,"Changed Sucessfully");}
        }
        catch (Exception ae){
            System.out.println(ae);

        }
    }
}
