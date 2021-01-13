import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;
import javax.swing.Timer;
public class EasyImage3 {
	JFrame jf;
	JLabel l1,l2,l3;
	int count=1;
	EasyImage3(){
		JPanel p=new JPanel(null);
		jf=new JFrame(" **Memory Game** ");
		l1=new JLabel("OBSERVED THE IMAGE CAREFULLY AND REMEMBER THE OBJECTS IN IT");
		l1.setFont(new Font("Bahnschrift SemiBold SemiConden",Font.BOLD,24));
		  l2=new JLabel();
	    l2.setIcon(new ImageIcon("C:\\Users\\waqas laptops\\Pictures\\Easy3.jpeg"));
	   l3=new JLabel();
		l1.setBounds(50,10,900,20);
		l2.setBounds(10,40,2000,700);
		l3.setBounds(10,40,2000,700);
	    p.add(l1);
	    p.add(l2);
	    l1.setForeground(Color.WHITE);
	    p.setBackground(Color.BLACK);
		jf.add(p);
	    jf.setVisible(true);
	    jf.setSize(2000, 800);
		Timer timer = new Timer(6000,null);//6000 means 6 seconds
		timer.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			jf.dispose();
		}       
});
		timer.start();
		timer.setRepeats(false);
	




}
	
	}
	




