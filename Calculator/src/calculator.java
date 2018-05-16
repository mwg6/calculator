import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class calculator {

	private static float answer = 0;
	private static int oper =0;
	public static String disp ="";
	public static String dispT ="";
	public static JTextField display = new JTextField(20);
	public static JTextField displayTop = new JTextField(20);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame main = new JFrame();
		
		main.setVisible(true);
		main.setSize(400, 400);
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		display.setEditable(false);
		
		display.setEditable(false);
		main.add(displayTop, BorderLayout.NORTH);
		main.add(display);
		
		
		
		buttonPanel keypad = new buttonPanel();
		main.add(keypad.getNums(), BorderLayout.WEST);
		
		operans operators = new operans();
		main.add(operators.getOperands(), BorderLayout.EAST);
		
		}

	public static String getTopText(){
		return dispT;
	}
	public static String getDispText(){
		return disp;
	}
	public static void setTopText(String text){
		dispT = text;
		displayTop.setText(dispT);

	}
	public static void setDispText(String text){
		disp = text;
		display.setText(disp);
	}
	public static float getAnswer(){
		return answer;
	}
	public static void setAnswer(float num){
		answer=num;
	}
}
