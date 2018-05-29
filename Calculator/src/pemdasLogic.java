import java.util.Arrays;

public class pemdasLogic {
	float trueAnswer;
	int countOParans = 0;
	int countCParans = 0;
	int paranLoc = 0;
	boolean containsOParans = false;
	boolean containsCParans = false;
	
	
	public float pemdasCalc(String equation){
		char[] a = equation.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
		
		//Solve parans first, then S/A, then D/M/%, then E
		for(char item:a){
			if(item=='('){
				containsOParans = true;
				countOParans++;
			}
			else if(item==')'){
				containsCParans = true;
				countCParans++;
			}
		}
		if(countOParans!=countCParans){
			System.out.println("Error: parantheses not matching");
		}
		else{
			
		}
		return trueAnswer;
	}
	public String[] getParans(String equationP){
		String[] parans = new String[countCParans];
		int paransLoc = 0;
		int[] indexOParans = new int[countOParans];
		int locOParans = 0;
		int[] indexCParans = new int[countCParans];
		int locCParans = 0;
		//first locate the amtching pairs
		char[] equP = equationP.toCharArray();
		
		for (int i =0;i< equP.length;i++){
			if(equP[i] == '('){
				
				indexOParans[locOParans]=i;
				locOParans++;
			}
			else if(equP[i] == ')'){
				System.out.println(i);
				indexCParans[locCParans]=i;
				locCParans++;
			}
		}
		//now to isolate the parantheses areas
		for(int i = 0; i<countOParans;i++){
			
			parans[i] = equationP.substring(indexOParans[i]+1, indexCParans[i]);
		}
		
		//Having an array of the isolated parens strings, evaluate those first
		//count operations
		for(int i =0; i<parans.length;i++){
			//Within here we want to isolate the sequence of numbers and operations separately, then use them in pemdas order
		}
		return parans;
	}
	public static void main(String[] args){
		pemdasLogic a = new pemdasLogic();
		System.out.println(a.pemdasCalc("(30+3)-(2)"));
		System.out.println(Arrays.toString(a.getParans("(30+3)-(2)")));
	}
}
