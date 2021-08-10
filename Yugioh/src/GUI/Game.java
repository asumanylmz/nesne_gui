package GUI;
import java.awt.*;
import javax.swing.*;
import Logic.Islem;

import GUI.Game;


public class Game extends JFrame {

	Islem islem;
Game game;
	int j=0,t,t1,t2,top;
	JButton gonder;
	TextField tx1,tx2;
    JPanel panel;
    
	
	
	
	public Game() {
		   setLayout(null);
		   add(getPanel());
		   setTitle("Yu-gi-oh!");
           setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       setSize(1400,770);
	}
	
	public JPanel getPanel() {
		if(panel==null) {
			panel=new JPanel();
			panel.setSize(1400, 770);
		   add(getGonder());
		   add(getTx1());
		   add(getTx2());
		}
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel=panel;
	}
	public JButton getGonder() {
		if(gonder==null) {
			gonder=new JButton("Gönder");
			gonder.setBounds(1175,580,150,50);
			gonder.addActionListener(getClick());
			gonder.setFont(new Font("Serif", Font.BOLD, 17));
		}
		return gonder;
	}
	
	public void setGonder(JButton gonder) {
		this.gonder=gonder;
	}
	
	public TextField getTx1() {
		if(tx1==null) {
			tx1=new TextField();
			tx1.setBounds(1175,580,150,50);
			//yeniden.addActionListener(getClick());
			tx1.setFont(new Font("Serif", Font.BOLD, 17));
		}
		return tx1;
	}
	
	public void setTx1(TextField tx1) {
		this.tx1=tx1;
	}
	public TextField getTx2() {
		if(tx2==null) {
			tx2=new TextField();
			tx2.setBounds(1000,200,100,50);
			 tx2.setSize(100,200);
			tx2.setFont(new Font("Serif", Font.BOLD, 17));
		}
		return tx1;
	}
	
	public void setTx2(TextField tx2) {
		this.tx2=tx2;
	}
	
	
	public Islem getClick() {
		if(islem==null) {
			islem=new Islem(this);
		}
			
		return islem;
	}
	public void setClick() {
		this.islem=islem;
	}

}
