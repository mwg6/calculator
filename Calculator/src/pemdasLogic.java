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
		
		//diagnostics stuff, to be deleted
		System.out.println(Arrays.toString(indexOParans));
		System.out.println(Arrays.toString(indexCParans));
		
		for(int i = 0; i<countOParans;i++){
			
			//diagnostic stuff, to be deleted
			System.out.println("countOParans Modified " + (countOParans-1-i));
			System.out.println("indexOParans Modified " + indexOParans[(countOParans-1-i)]);
			System.out.println("countOParans Modified " + (i));
			System.out.println("indexOParans Modified " + indexCParans[(i)]);
			System.out.println(equationP.substring(6, 9));
			
			parans[i] = equationP.substring(indexOParans[(countOParans-1-i)]+1, indexCParans[i]);
		}
		
		//Having an array of the isolated parens strings, evaluate those first
		//count operations
		for(int i =0; i<parans.length;i++){
			//Within here we want to isolate the sequence of numbers and operations separately, then use them in pemdas order
		}
		return parans;
	}
	public float handleEMDAS(String equation){
		float answer=-1;
		int numOperations;
		String nums;
		
		char[] all = equation.toCharArray();
		
		//will create a string of numbers and operations
	    final StringBuilder numBuild = new StringBuilder(equation.length() );
	    final StringBuilder operationsBuild = new StringBuilder(equation.length() );
	    
	    for(int i = 0; i < equation.length(); i++){
	        final char c = equation.charAt(i);
	        //will seek out operations
	        if(c > 42 && c < 45||c==47){
	        	//now located at the "+" of 3+3
	            numBuild.append(c);
	        }
	        else{
	        	//this will also put any erroneous chars in operations. needs fixing later
	        	operationsBuild.append(c);
	        }
	        
	    }
	    nums = numBuild.toString();

		}
		
		return answer;
	}
	public static void main(String[] args){
		pemdasLogic a = new pemdasLogic();
		String test1 ="(30+3)-(2)";
		String test2 ="((30+3))-(2)";
		System.out.println(a.pemdasCalc(test2));
		System.out.println(Arrays.toString(a.getParans(test2)));
	}
}
