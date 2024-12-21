
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;



public class Signuptwo extends JFrame implements ActionListener
{
    
    JTextField income,pan,aadhar;
    JRadioButton yes,no,yes1,no1;
    JComboBox religion,category,valeducation;
    JButton next;
    String formno;
    
    
    
    public Signuptwo (String formno)
    {
        this.formno=formno;
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        
        /*Random rad =new Random();
        long random = Math.abs((rad.nextLong() % 900L)+1000L);
      JLabel formno =new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("relway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);*/
        
        JLabel personaldetail =new JLabel("Page 2:Additional Detail");
        personaldetail.setFont(new Font("relway",Font.BOLD,22));
        personaldetail.setBounds(290,80,400,30);
        add(personaldetail);
        
        JLabel rellgion =new JLabel("Rellgion:");
        rellgion.setFont(new Font("relway",Font.BOLD,20));
        rellgion.setBounds(100,140,200,30);
        add(rellgion);
        
        String valReligion[]  = {"Hindu","Muslim","Sikh","Christion","Other"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);
        
        
        JLabel cat =new JLabel("Category:");
        cat.setFont(new Font("relway",Font.BOLD,20));
        cat.setBounds(100,190,300,30);
        add(cat);
        
        String valcategory[]  = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300,190,400,30);
        add(category);
        
                
        JLabel inc =new JLabel("Income:");
        inc.setFont(new Font("relway",Font.BOLD,20));
        inc.setBounds(100,240,300,30);
        add(inc);
        
        income= new JTextField(10);
        income.setFont(new Font("relway",Font.BOLD,20));
        income.setBounds(300,240,400,30);
        add(income);
        
        JLabel ed =new JLabel("Education");
        ed.setFont(new Font("relway",Font.BOLD,20));
        ed.setBounds(100,290,200,30);
        add(ed);
        
        JLabel qf =new JLabel("Qualification:");
        qf.setFont(new Font("relway",Font.BOLD,20));
        qf.setBounds(100,315,200,30);
        add(qf);
        
        String education[]  = {"Graduate","Post-Graduation","Ten-Pass","Twelve-Pass","Other"};
        valeducation = new JComboBox(education);
        valeducation.setBackground(Color.WHITE);
        valeducation.setBounds(300,315,400,30);
        add(valeducation);
        
        
        
        JLabel panno =new JLabel("Pan Number:");
        panno.setFont(new Font("relway",Font.BOLD,20));
        panno.setBounds(100,390,300,30);
        add(panno);
        
        pan= new JTextField(10);
        pan.setFont(new Font("relway",Font.BOLD,20));
        pan.setBounds(300,390,400,30);
        add(pan);
        
       
        JLabel aadharno =new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("relway",Font.BOLD,20));
        aadharno.setBounds(100,440,300,30);
        add(aadharno);
        
        aadhar=new JTextField();
        aadhar.setFont(new Font("ralway",Font.BOLD,20));
        aadhar.setBounds(300,440,400,30);
        add(aadhar);
        
        JLabel scitizen =new JLabel("Senior Citizen:");
        scitizen.setFont(new Font("relway",Font.BOLD,20));
        scitizen.setBounds(100,490,300,30);
        add(scitizen);
        
        yes = new JRadioButton("YES");
        yes.setBounds(300,490,70,30);
        yes.setBackground(Color.WHITE);
        add(yes);
        no = new JRadioButton("NO");
        no.setBounds(450,490,90,30);
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup citizen = new ButtonGroup();
        citizen.add(yes);
        citizen.add(no);
        
        JLabel acc =new JLabel("Existing Account:");
        acc.setFont(new Font("relway",Font.BOLD,20));
        acc.setBounds(100,540,300,30);
        add(acc);
        
        yes1 = new JRadioButton("YES");
        yes1.setBounds(300,540,70,30);
        yes1.setBackground(Color.WHITE);
        add(yes1);
        no1 = new JRadioButton("NO");
        no1.setBounds(450,540,90,30);
        no1.setBackground(Color.WHITE);
        add(no1);
        
        ButtonGroup existing = new ButtonGroup();
        existing.add(yes1);
        existing.add(no1);
        
        next =new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Machine",Font.BOLD,15));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(400,10);
        setVisible(true);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String inc = income.getText();
        String svaleducation = (String) valeducation.getSelectedItem();
        String panno = pan.getText();
        String aadharno = aadhar.getText();
        String scitizen=null;
        if(yes.isSelected())
        {
            scitizen="YES";
        }else if(no.isSelected())
        {
            scitizen="NO";
        }
        String acc=null;
        if(yes1.isSelected())
        {
            scitizen="YES";
        }else if(no1.isSelected())
        {
            scitizen="NO";
        }
        
        try
        {
            if(inc.equals(""))
            {
                JOptionPane.showMessageDialog(null,"income is Required");
            }
            else
            {
                Conn c= new Conn();
                String query ="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+inc+"','"+svaleducation+"','"+panno+"','"+aadharno+"','"+scitizen+"','"+acc+"')";
                c.stmt.executeUpdate(query);
               // JOptionPane.showMessageDialog(null,"Data Inserted SuccessFully.");
                
                this.setVisible(false);
                new signupthre(formno).setVisible(true);
                
            } 
        }
    catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[]) 
    {
       
           new Signuptwo("");
    }
}

