package rekenmachine;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Panel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField input;
	private JButton key1, key2, key3, key4, key5, key6, key7, key8, key9, key0,
					keyPlus, keyMin, keyKeer, keyDelen, keyIs, keyClear, keyDot;
	private JLabel lbl1;
	
	public Panel(){
		setBackground(new Color(120, 150, 170));
		setLayout(null);
		
		input = new JTextField();
		input.setBounds(15, 15, 340, 35);
		input.setFont(new Font("Calibri", Font.PLAIN, 24));
		input.setHorizontalAlignment(JTextField.RIGHT);
		add(input);
		
		
		
		key1 = new JButton("1");
		key1.setBounds(15, 65, 75, 60);
		key1.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key1);
		
		key2 = new JButton("2");
		key2.setBounds(100, 65, 75, 60);
		key2.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key2);
		
		key3 = new JButton("3");
		key3.setBounds(185, 65, 75, 60);
		key3.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key3);		
		
		keyPlus = new JButton("+");
		keyPlus.setBounds(280, 65, 75, 60);
		keyPlus.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyPlus);
		
		//____________________________________________________
		
		key4 = new JButton("4");
		key4.setBounds(15, 135, 75, 60);
		key4.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key4);
		
		key5 = new JButton("5");
		key5.setBounds(100, 135, 75, 60);
		key5.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key5);
		
		key6 = new JButton("6");
		key6.setBounds(185, 135, 75, 60);
		key6.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key6);		
		
		keyMin = new JButton("-");
		keyMin.setBounds(280, 135, 75, 60);
		keyMin.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyMin);

		//____________________________________________________
		
		key7 = new JButton("7");
		key7.setBounds(15, 205, 75, 60);
		key7.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key7);
		
		key8 = new JButton("8");
		key8.setBounds(100, 205, 75, 60);
		key8.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key8);
		
		key9 = new JButton("9");
		key9.setBounds(185, 205, 75, 60);
		key9.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key9);		
		
		keyKeer = new JButton("*");
		keyKeer.setBounds(280, 205, 75, 60);
		keyKeer.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyKeer);

		//____________________________________________________
		
		keyClear = new JButton("C");
		keyClear.setBounds(15, 275, 75, 60);
		keyClear.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyClear);
		
		key0 = new JButton("0");
		key0.setBounds(100, 275, 75, 60);
		key0.setFont(new Font("Calibri", Font.BOLD, 18));
		add(key0);
		
		keyDot = new JButton(".");
		keyDot.setBounds(185, 275, 75, 60);
		keyDot.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyDot);		
		
		keyDelen = new JButton("/");
		keyDelen.setBounds(280, 275, 75, 60);
		keyDelen.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyDelen);
		
		keyIs = new JButton("=");
		keyIs.setBounds(15, 360, 340, 60);
		keyIs.setFont(new Font("Calibri", Font.BOLD, 18));
		add(keyIs);
	}
	
	public void paintComponent(Graphics r){
		super.paintComponent(r);
		r.setColor(Color.BLACK);
		r.drawLine(270, 60, 270, 350);
		r.drawLine(15, 350, 355, 350);
		
	}
}
