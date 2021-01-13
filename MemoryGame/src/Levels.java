import java.awt.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Levels implements ActionListener{
	JFrame jf;
	JPanel p;
	JLabel l,l1,l2;
	JButton b1,b2,b3,b4;
	Levels()
	{
		jf=new JFrame("Memory Game!!!");
		p=new JPanel();
		p.setLayout(null);
		l=new JLabel("ARE YOU READY :) LETS START!!");
		l.setFont(new Font("Algerian",Font.BOLD,18));
		l1=new JLabel();
		l2=new JLabel();
		l1.setIcon(new ImageIcon("C:\\Users\\waqas laptops\\Pictures\\e2.jpg"));
		l2.setIcon(new ImageIcon("C:\\Users\\waqas laptops\\Pictures\\b1.jpg"));
		b1=new JButton("EASY:)");
		b2=new JButton("MEDIUM:)");
		b3=new JButton("HARD:)");
		b4=new JButton("Exit:(");
		jf.setSize(600,700);
		l.setBounds(120,30,400,30);
		l1.setBounds(250,90,200,200);
		b1.setBounds(120,90,100,40);
		b2.setBounds(120,140,100,40);
		b3.setBounds(120,189,100,40);
		b4.setBounds(120,240,100,40);
		l2.setBounds(150,300,200,200);
		jf.add(p);
		p.setBackground(Color.ORANGE);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
	    b1.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
	   // b1.setBorder(BorderFactory.createBevelBorder(type, highlightOuter, highlightInner, shadowOuter, shadowInner)
	    b4.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
	    b3.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
	    b2.setBorder(BorderFactory.createBevelBorder(1, Color.blue, Color.black, Color.cyan, Color.black));
	    p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10, true));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		p.add(l);
		p.add(l1);
		p.add(l2);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		jf.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			new EImgComp1();
			new EasyImage1();
		}
		else if(e.getSource()==b2)
		{
			new MedImgComp1();
			new MediumImage1();
		}
		else if(e.getSource()==b3)
		{
			new HrdImgComp1();
			new HardImage1();
		}
		else if(e.getSource()==b4)
		{
			System.exit(1);
		}
	}
}

