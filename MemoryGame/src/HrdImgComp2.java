import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class HrdImgComp2 implements ActionListener {
	JFrame jf;
	JTextField t1,t2,t3,t;
	JLabel l1,l2,l3,l4,l;
	JButton b,b1,b2;
	HrdImgComp2(){
		JPanel p=new JPanel(null);
		jf=new JFrame("***MEMORY GAME***");
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t=new JTextField();
		l=new JLabel("ENTER THE OBJECTS YOU OBSERVED ");
		l.setFont(new Font("Britannic Bold",Font.BOLD,18));
		l.setBounds(370,10,320,50);
		t.setBounds(370,70,490,70);
		b1=new JButton("SUBMIT");
		b1.setBounds(490, 200, 150, 60);
		b2=new JButton("Back");
		b2.setBounds(380,210,90,40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		l1=new JLabel(" *** SCORE BOARD ***");
		l1.setFont(new Font("Britannic Bold",Font.BOLD,24));
		l1.setBounds(60, 10,250,50);
		l2=new JLabel("Total score = ");
		l2.setBounds(10,60,150,40);
		t1.setBounds(150,60,150,40);
		l3=new JLabel("Score You Obtained =");
		l3.setBounds(10,110,150,40);
		t2.setBounds(150,110,150,40);
		l4=new JLabel("Miss Matched item =");
		l4.setBounds(10,160,150,40);
		t3.setBounds(150,160,150,40);
		b=new JButton("THANKS FOR PLAYING");
		b.setBounds(150,250,180,50);
		p.add(b);
		p.add(b2);
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		p.add(l4);
		p.add(t);
		p.add(l);
		p.add(t1);
		p.add(b1);
		p.setBackground(Color.pink);
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		l1.setForeground(Color.BLACK);
		l2.setForeground(Color.BLACK);
		l3.setForeground(Color.BLACK);
		l4.setForeground(Color.BLACK);
		l.setForeground(Color.BLACK);
		t1.setEditable(false);
		t2.setEditable(false);
		t3.setEditable(false);
		Border border = new LineBorder(Color.black, 10, true);
		p.setBorder(border);
		jf.add(p);
		jf.setVisible(true);
		jf.setSize(900, 500);
		b1.addActionListener(this);
		b.addActionListener(this);
		b2.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e) {
			String values=t.getText();
			String array1[]= {values};
			array1=values.split(",");
			int length2=array1.length;
			String array[]={"Bed","telephone","bedtable","blinds","picture","television","curtains","upholstered bench",
			"NightStand","tablelamp","pillow","picture","Clock","airCondioner","dressingtable","Bookshelf","Hope chest","clothes vallet"};
			int length=array.length;
			int count=0;
			if(e.getSource()==b1) {
				for(int j=0;j<length2;j++) {
			for(int i=0;i<length;i++) {
				if(array1[j].equalsIgnoreCase(array[i])) {
					count=count+1;
				
					break;
				}
			}
				}
				String f=Integer.toString(count);
				int remaining=18-count;
				String re=Integer.toString(remaining);
				t1.setText("18");
				t2.setText(f);
				t3.setText(re);
			
			}
			if(e.getSource()==b) {
				System.exit(0);
			}
			if(e.getSource()==b2)
			{
				new HrdImgComp3();
				new HardImage3();
			}
			
		}
}
	


