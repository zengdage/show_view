package test;

import java.awt.Graphics;
import javax.swing.*;

import orange.Inflate;
import view.Basewin;
public class MyText extends JPanel{
public void paint(Graphics g){
	g.fillOval((this.getWidth()-150)/2, (this.getHeight()-100)/2, 150, 100);
}
public static void main(String[] args) {
	Basewin basewin = Inflate.getLayout("layout.xml");
	
	//MyText jp=new MyText();
	JFrame jf=new JFrame();
	jf.add(basewin);
	jf.setTitle("ÎÒµÄ»­²¼");
	jf.setVisible(true);
	jf.setBounds(100,100,300,250);
	jf.setResizable(false);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
