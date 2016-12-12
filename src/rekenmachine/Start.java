package rekenmachine;
import javax.swing.*;

public class Start extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String args[]){
		JFrame start = new JFrame();
		start.setTitle("Calculator");
		start.setSize(385, 470);
		start.setLocation(400,  100);
		start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.setContentPane(new Panel());
		start.setVisible(true);
	}

}
