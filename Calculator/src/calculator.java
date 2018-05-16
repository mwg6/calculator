import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
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
		/*
		//this area will deal with operators
		JPanel operands = new JPanel();
		GridLayout operandLayout = new GridLayout(4,1);
		operands.setLayout(operandLayout);
		JButton[] operand = new JButton[4];
		
		

		
		operand[0] = new JButton("+");
		operand[0].addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent j){
				disp = display.getText();
				math(oper,disp);
				dispT = displayTop.getText();
				displayTop.setText(String.valueOf(answer));
				//tells the next call to add its number
				oper = 1;
				disp = "";
				display.setText(disp);
			}
			
				});

		operand[1] = new JButton("-");
		operand[1].addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent j){
		disp = display.getText();
		math(oper,disp);
		dispT = displayTop.getText();
		displayTop.setText(String.valueOf(answer));
		//tells the next call to add its number
		oper = 2;
		disp = "";
		display.setText(disp);
					
	}
		});
		operand[2] = new JButton("*");
		operand[2].addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent j){
		disp = display.getText();
		math(oper,disp);
		dispT = displayTop.getText();
		displayTop.setText(String.valueOf(answer));
		//tells the next call to add its number
		oper = 3;
		disp = "";
		display.setText(disp);
	}
		});
		operand[3] = new JButton("/");
		operand[3].addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent j){
		disp = display.getText();
		math(oper,disp);
		dispT = displayTop.getText();
		displayTop.setText(String.valueOf(answer));
		//tells the next call to add its number
		oper = 4;
		disp = "";
		display.setText(disp);
	}
		});
		for(int i =0 ; i<4; i++){
			operands.add(operand[i]);
		}
		
		main.add(operands, BorderLayout.EAST);
		
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener()
		{
	public void actionPerformed(ActionEvent j){
		disp = display.getText();
		math(oper,disp);
		dispT = "answer: " + answer;
		displayTop.setText(dispT);
		oper=-1;
		disp ="";
		display.setText(disp);
		answer=0;
	}
		});
		main.add(equals, BorderLayout.SOUTH);
	}

	protected static void math(int oper, String text) {
		if(oper ==-1){
			//this is the equals case
		}
		else if(oper==0){
			answer = answer+Float.parseFloat(text);
		}
		else if(oper==1){
			answer = answer + Float.parseFloat(text);
		}
		else if(oper==2){
			answer =  answer - Float.parseFloat(text);
		}
		else if(oper==3){
			answer = answer * Float.parseFloat(text);
		}
		else if(oper==4){
			answer = answer / Float.parseFloat(text);
		}
		else{
			System.out.println("Invalid Operation");
		}
			*/
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
