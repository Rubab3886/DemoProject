import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class HardImage3 {
		JFrame jf;
		JLabel l1,l2;
		HardImage3(){
			JPanel p=new JPanel(null);
			jf=new JFrame(" **Memory Game** ");
			l1=new JLabel("OBSERVED THE IMAGE CAREFULLY AND REMEMBER THE OBJECTS IN IT");
			l1.setFont(new Font("Bahnschrift SemiBold SemiConden",Font.BOLD,18));
			  l2=new JLabel();
			  //l3=new JLabel();
		    l2.setIcon(new ImageIcon("C:\\Users\\waqas laptops\\Pictures\\Hard3.jpeg"));
		   
			l1.setBounds(20,10,900,40);
			l2.setBounds(50,30,2000,600);
		p.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10, true));
			//Border border = new LineBorder(Color.black, 10, true);
		//r4	p.setBorder(border);
		    p.add(l1);
		    p.add(l2);
		    l1.setForeground(Color.BLACK);
		    p.setBackground(Color.MAGENTA);
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



