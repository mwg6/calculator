import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

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
		main.add(displayTop, BorderLayout.NORTH);
		main.add(display);
		
		main.setFocusable(true);
		display.addKeyListener(new KeyListener(){
			@Override
			public void keyPressed(KeyEvent e){
				System.out.println(e.getKeyCode());
				if(e.getKeyCode() == KeyEvent.VK_ENTER){
					operans.math(oper,calculator.getDispText());

					calculator.setTopText("answer: " + calculator.getAnswer());
					oper=-1;

					calculator.setDispText("");
					calculator.setAnswer(0);;
					System.out.print("Success");
				}
			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
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
