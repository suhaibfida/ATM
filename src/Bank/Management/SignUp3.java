package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener{
    JRadioButton b1,b2,b3;
    JCheckBox c1,c2,c3,c4,c5;
    JButton submit,cancel;
    SignUp3 (){
      setTitle("Page No: 3");
      setVisible(true);
      setSize(600,650);
      setLayout(null);
      setLocation(450,80);
      getContentPane().setBackground(Color.pink);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image set=img1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(set);
        JLabel label=new JLabel(img2);
        label.setBounds(15,10,30,30);
        add(label);
//        Title
        JLabel bName=new JLabel("Form |Wall| Bank");
        bName.setFont(new Font("serif",Font.BOLD,13));
        bName.setBounds(50,12,130,30);
        add(bName);
        JLabel accountDetails=new JLabel("Additional Details:-");
        accountDetails.setFont(new Font("sanserif",Font.BOLD,30));
        accountDetails.setBounds(60,50,450,40);
        add(accountDetails);
        JLabel accType=new JLabel("Account Type:");
        accType.setFont(new Font("sanserif",Font.BOLD,20));
        accType.setBounds(70,100,450,40);
        add(accType);

        b1 =new JRadioButton("Saving Account");
        b1.setBounds(70,150,190,25);
        b1.setFont(new Font("Serif",Font.BOLD,17));
        add(b1);
        b2 =new JRadioButton("Current Account");
        b2.setBounds(270,150,190,25);
        b2.setFont(new Font("Serif",Font.BOLD,17));
        add(b2);
        b3 =new JRadioButton("Fixed Deposit");
        b3.setBounds(70,200,190,25);
        b3.setFont(new Font("Serif",Font.BOLD,17));
        add(b3);
        JLabel services=new JLabel("Services:");
        services.setFont(new Font("sanserif",Font.BOLD,20));
        services.setBounds(70,250,450,40);
        add(services);
        c1=new JCheckBox("ATM Card");
        c1.setBounds(70,300,190,25);
        c1.setFont(new Font("Serif",Font.BOLD,17));
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBounds(70,350,190,25);
        c2.setFont(new Font("Serif",Font.BOLD,17));
        add(c2);
        c3=new JCheckBox("Cheque Book");
        c3.setBounds(270,300,190,25);
        c3.setFont(new Font("Serif",Font.BOLD,17));
        add(c3);
        c4=new JCheckBox("SMS Alerts");
        c4.setBounds(270,350,190,25);
        c4.setFont(new Font("Serif",Font.BOLD,17));
        add(c4);
        c5=new JCheckBox("(Declaration) Above Details Are Correct");
        c5.setBounds(127,420,270,20);
        c5.setFont(new Font("Serif",Font.BOLD,11));
        add(c5);

        submit=new JButton("SUBMIT");
        submit.setBounds(110,450,150,30);
        submit.setFont(new Font("SanSerif",Font.BOLD,18));
        submit.setBackground(Color.darkGray);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(270,450,150,30);
        cancel.setFont(new Font("SanSerif",Font.BOLD,18));
        cancel.setBackground(Color.darkGray);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);






    }


    public static void main(String[] args) {
        new  SignUp3();

    }

  @Override
  public void actionPerformed(ActionEvent e) {
      if(e.getSource()==submit){
      String type=null;

      if(b1.isSelected()){
        type="Savings Account";
      }
      else if(b2.isSelected()){
        type="Current Account";
      }
      else {
        type = "Fixed Deposit ";
      }
      Random ran =new Random();
      String card=""+Math.abs((ran.nextLong()%90000000L)+5152808900000000L);
      String pin=""+Math.abs((ran.nextInt()%9000)+1000);
      String services="";
      if(c1.isSelected()){
        services=services+"ATM";


      }
    else if(c2.isSelected()){
      services=services+"Internet Banking";
        System.out.println(services);

    }
      else if(c3.isSelected()){
        services=services+"Cheque Book";

      }
      else if(c4.isSelected()){
        services=services+"SMS Alerts";

      }} else if (e.getSource()==cancel) {
        try {

        }
        catch (Exception ae){

        }


      }


  }
}
