package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;



public class balanceenquiry extends JFrame implements ActionListener
{
    JButton back;
    String pinnumber;
    
    public balanceenquiry(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setTitle("ATM Simulation System");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);
        
        back = new JButton("back");
        back.setBounds(365,470,150,30);
        back.addActionListener(this);
        image.add(back);
    
         Conn c = new Conn();
         int balance =0;
            try
            {
                ResultSet rs = c.stmt.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                while(rs.next())
                {   //chech balance
                    if(rs.getString("type").equals("deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }else      //getbalance current
                    {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
            }catch(Exception ae)
            {
                ae.printStackTrace();
            }
            
            JLabel text = new JLabel("Your Current Blance is Rs:" + balance);
            text.setForeground(Color.WHITE);
            text.setBounds(170,250,400,30);
            image.add(text);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }

    
    public static void main(String args[])
    {
       new balanceenquiry(" ");
    }
}
