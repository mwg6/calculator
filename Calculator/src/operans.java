import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class operans extends calculator{
	static JPanel operands = new JPanel();
	int oper;
	
	public operans(){
				
    GridLayout operandLayout = new GridLayout(4,1);
	operands.setLayout(operandLayout);
	JButton[] operand = new JButton[4];
	calculator.getTopText();
	

	
	operand[0] = new JButton("+");
	operand[0].addActionListener(new ActionListener()
			{
		public void actionPerformed(ActionEvent j){
			math(oper,calculator.getDispText());
			calculator.addHistory(calculator.getDispText() + "+");
			calculator.setTopText(String.valueOf(calculator.getAnswer()));
			//tells the next call to add its number
			oper = 1;
			
			calculator.setDispText("");
		}
		
			});

	operand[1] = new JButton("-");
	operand[1].addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent j){
	math(oper,calculator.getDispText());
	calculator.addHistory(calculator.getDispText() + "-");
	calculator.setTopText(String.valueOf(calculator.getAnswer()));
	//tells the next call to add its number
	oper = 2;
	
	calculator.setDispText("");
				
}
	});
	operand[2] = new JButton("*");
	operand[2].addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent j){
	math(oper,calculator.getDispText());
	calculator.addHistory(calculator.getDispText() + "*");
	calculator.setTopText(String.valueOf(calculator.getAnswer()));
	//tells the next call to add its number
	oper = 3;
	
	calculator.setDispText("");
}
	});
	operand[3] = new JButton("/");
	operand[3].addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent j){
	math(oper,calculator.getDispText());
	calculator.addHistory(calculator.getDispText() + "/");
	calculator.setTopText(String.valueOf(calculator.getAnswer()));
	//tells the next call to add its number
	oper = 4;
	
	calculator.setDispText("");
}
	});
	for(int i =0 ; i<4; i++){
		operands.add(operand[i]);
	}
	

	
	JButton equals = new JButton("=");
	equals.addActionListener(new ActionListener()
	{
public void actionPerformed(ActionEvent j){
	
	math(oper,calculator.getDispText());
	calculator.addHistory(calculator.getDispText() + "=" +calculator.getAnswer() + "\n");
	calculator.setTopText("answer: " + calculator.getAnswer());
	oper=-1;

	calculator.setDispText("");
	calculator.setAnswer(0);
}
	});
	operands.addKeyListener(new KeyListener(){
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
	operands.add(equals);
}
	
	
public static void math(int oper, String text) {
	if(oper ==-1){
		//this is the equals case
	}
	else if(oper==0){
		calculator.setAnswer(calculator.getAnswer() + Float.parseFloat(text));
	}
	else if(oper==1){
		calculator.setAnswer(calculator.getAnswer() + Float.parseFloat(text));
	}
	else if(oper==2){
		calculator.setAnswer(calculator.getAnswer() - Float.parseFloat(text));
	}
	else if(oper==3){
		calculator.setAnswer(calculator.getAnswer() * Float.parseFloat(text));
	}
	else if(oper==4){
		calculator.setAnswer(calculator.getAnswer() / Float.parseFloat(text));
	}
	else{
		System.out.println("Invalid Operation");
	}
	
}
public static JPanel getOperands(){
	return operands;
}
}

