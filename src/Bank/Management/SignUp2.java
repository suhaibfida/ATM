package Bank.Management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;


public class SignUp2 extends JFrame implements ActionListener {

    JTextField text4,text2,text3;
    JLabel income,edQual,existAcc,pNo,adNo,occu;
    JComboBox inc,educ,occup;
    JButton next;
    String formno;
    SignUp2(String random){
        this.formno=random;
//        BACKGROUND COLOR
        getContentPane().setBackground(Color.pink);
//        FRAME
        setLayout(null);
        setTitle("Page No.2");
        setSize(720,770);
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
        String[] inco ={"Nothing","<1,50,000","<2,50,000","<3,50,000","<=5,00,000"};
        inc=new JComboBox(inco);
        inc.setBounds(250,137,250,27);
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

        String[] edu ={"Nothing","HighSchool","College","Some College","Graduate","Masters"};
         educ=new JComboBox(edu);
        educ.setBounds(250,287,250,27);
        educ.setFont(new Font("SanSerif",Font.BOLD,18));
        add(educ);
//        -------------------------------------------------------------------------------------------
//       JCALENDAR site:"https://toedter.com/jcalendar/"-->unzip -->bin --> jcalendar  {Upload Jcalendar into library} (IMPORT JCalender through module settings)

        existAcc =new JLabel("Existing Account:");
        existAcc.setFont(new Font("sanserif",Font.BOLD,20));
        existAcc.setBounds(70,330,450,40);
        add(existAcc);
        text4=new JTextField();
        text4.setBounds(250,337,250,25);
        text4.setFont(new Font("SanSerif",Font.BOLD,13));
        add(text4);



        occu=new JLabel("Occupation:");
        occu.setFont(new Font("sanserif",Font.BOLD,20));
        occu.setBounds(70,380,450,40);
        add(occu);
        String [] occupation={"Employed","Self-Employed","Bussiness","Retired","Freelancing","Others"};
        occup=new JComboBox(occupation);
        occup.setFont(new Font("sanserif",Font.BOLD,20));
        occup.setBounds(250,387,250,28);
        add(occup);
         next=new JButton("Next");
        next.setBounds(290,550,150,30);
        next.setFont(new Font("SanSerif",Font.BOLD,18));
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        }


//        ------------------------------------------------------------------------------------
//        Buttons




    public static void main(String[] args) {
        new SignUp2("");

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String stinc = (String) inc.getSelectedItem();
        String txt2=  text2.getText();
        String txt3= text3.getText();
        String educ1= (String) educ.getSelectedItem();
        String existAcc=text4.getText();
        String occupa= (String) occup.getSelectedItem();
        try {
            if (stinc.equals("nothing")) {
                JOptionPane.showMessageDialog(null, "Invalid Income");
            } else if (e.getSource()==next){
                Connect c = new Connect();
                String insertVal = "insert into signUp2 values('" + formno + "','" + stinc + "','" + txt2 + "','" + txt3 + "','" + educ1 + "','" + existAcc + "','" + occupa + "')";
                c.s.executeUpdate(insertVal);
            }


        } catch (SQLException ex) {
            System.out.println(ex);;
        }

    }

    }




