import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.*;
public class main_menu implements ActionListener {
	JFrame jf;
	JLabel l,l1,l2;
	JPanel p;
	JButton b1,b2,b3;
	main_menu()
	{
		jf=new JFrame("Memory Game!!!");
		l=new JLabel("If you want to play:) ");
		l1=new JLabel("Click on PLAY button:)");
		l2=new JLabel();
		l2.setIcon(new ImageIcon("C:\\Users\\waqas laptops\\Pictures\\mem.jpg"));
		p=new JPanel();
		p.setLayout(null);
		b1=new JButton("PLAY");
		b2=new JButton("EXIT");
		jf.setVisible(true);
	    jf.setSize(600,700);
	    l.setFont(new Font("Algerian",Font.BOLD,24));
	    l1.setFont(new Font("Algerian",Font.BOLD,24));
	    l.setBounds(139, 50, 400, 20);
	    l1.setBounds(139,100,400,20);
	    l2.setBounds(40,240,600,400);
	    b1.setBounds(150,160,250,50);
	    b1.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
		b2.setBounds(150,230,250,50);
		b2.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.black);
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		 p.setBackground(Color.cyan);
		 p.setBorder(BorderFactory.createLineBorder(Color.BLACK,10, true));
		 p.add(b1);
		 p.add(b2);
		 p.add(l);
		 p.add(l1);
		 p.add(l2);
		 jf.add(p);
		 jf.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{ 
			new Levels();
		}
		if(e.getSource()==b2)
		{
			System.exit(1);
		}
	}
	public static void main(String args[])
	{
		new main_menu();
	}

}
