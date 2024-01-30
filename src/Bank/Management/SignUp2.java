package Bank.Management;
import javax.swing.*;
import java.awt.*;


public class SignUp2 extends JFrame {

    JTextField text1,text2,text3;
    JLabel income, edQual, existAcc,marital, pNo, adNo;
    JRadioButton male,female,married,unmarried,others;
    SignUp2(){
//        BACKGROUND COLOR
        getContentPane().setBackground(Color.pink);
//        FRAME
        setLayout(null);
        setTitle("Page No.2");
        setSize(750,770);
        setVisible(true);
        setLocation(410,30);
//        HEAD IMG
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


//        Personal Details
        JLabel additionalDet=new JLabel("Additional Details:-");
        additionalDet.setFont(new Font("sanserif",Font.BOLD,30));
        additionalDet.setBounds(60,70,450,40);
        add(additionalDet);
//       STARTING FROM NAME:
        income =new JLabel("Annual Income:");
        income.setFont(new Font("sanserif",Font.BOLD,20));
        income.setBounds(70,130,450,40);
        add(income);
        String[] inco ={"null","<150000","<250000","<350000","<500000"};
        JComboBox inc=new JComboBox(inco);
        inc.setBounds(250,137,250,25);
        inc.setFont(new Font("SanSerif",Font.BOLD,18));
        add(inc);
        pNo =new JLabel("PAN Number:");
        pNo.setFont(new Font("sanserif",Font.BOLD,20));
        pNo.setBounds(70,180,450,40);
        add(pNo);
        text2=new JTextField();
        text2.setBounds(250,188,250,25);
        text2.setFont(new Font("SanSerif",Font.BOLD,18));
        add(text2);
        adNo =new JLabel("Aadhar No:");
        adNo.setFont(new Font("sanserif",Font.BOLD,20));
        adNo.setBounds(70,230,450,40);
        add(adNo);
        text3=new JTextField();
        text3.setBounds(250,238,250,25);
        text3.setFont(new Font("SanSerif",Font.BOLD,13));
        add(text3);
//
        edQual =new JLabel("Education:");
        edQual.setFont(new Font("sanserif",Font.BOLD,20));
        edQual.setBounds(70,280,450,40);
        add(edQual);
//        -------------------------------------------------------------------------------------------
//       JCALENDAR site:"https://toedter.com/jcalendar/"-->unzip -->bin --> jcalendar  {Upload Jcalendar into library} (IMPORT JCalender through module settings)

        existAcc =new JLabel("Existing Account:");
        existAcc.setFont(new Font("sanserif",Font.BOLD,20));
        existAcc.setBounds(70,330,450,40);
        add(existAcc);

//        ------------------------------------------------------------------------------------


//        Buttons

        JButton next=new JButton("Next");
        next.setBounds(300,650,150,30);
        next.setFont(new Font("SanSerif",Font.BOLD,18));
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        add(next);
    }

    public static void main(String[] args) {
        new SignUp2();
    }

}
