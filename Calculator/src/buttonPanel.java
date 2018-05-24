import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class buttonPanel extends calculator{
	static JPanel nums = new JPanel();
	public buttonPanel(){
		
		GridLayout buttPanel = new GridLayout(3,3);
		nums.setLayout(buttPanel);
		JButton[] butts = new JButton[10];
		
		for(int i = 0;i<10;i++){
			butts[i] = new JButton(""+i+"");
			butts[i].addActionListener(new ActionListener()
			{ 
				  public void actionPerformed(ActionEvent j) { 
					  String numbers = "";
					  
				  Object source = j.getSource();
				  numbers = calculator.getDispText() + (((JButton) source).getText());
				  
				  
				  calculator.setDispText(numbers);
				  
				  } 
				} );
			
			nums.add(butts[i]);
			
		}
		JButton delete1 = new JButton("C");
		delete1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent j){
				String numbers = "";
				numbers = calculator.getDispText();
				if (numbers.length()>0){
					calculator.setDispText(numbers.substring(0, numbers.length()-1));
				}
				else
				{}
			}
				});
		JButton deleteAll = new JButton("CE");
		deleteAll.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent j){
				calculator.setDispText("");
				calculator.setTopText("");
				calculator.setAnswer(0);
			}
				});
		
		JButton oParans = new JButton("(");
		oParans.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent j){
				String numbers = "";
				  
				  Object source = j.getSource();
				  numbers = calculator.getDispText() + (((JButton) source).getText());
				  
				  
				  calculator.setDispText(numbers);
				  
			}
		});
		
		JButton cParans = new JButton(")");
		cParans.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent j){
				String numbers = "";
				  
				  Object source = j.getSource();
				  numbers = calculator.getDispText() + (((JButton) source).getText());
				  
				  
				  calculator.setDispText(numbers);
				  
			}
		});
		
		JButton decimal = new JButton(".");
		decimal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent j){
				String numbers = "";
				  
				  Object source = j.getSource();
				  numbers = calculator.getDispText() + (((JButton) source).getText());
				  
				  
				  calculator.setDispText(numbers);
				  
			}
		});
		nums.add(delete1);
		nums.add(deleteAll);
		nums.add(oParans);
		nums.add(cParans);
		nums.add(decimal);
	}
	
	public static JPanel getNums(){
		return nums;
	}
}
