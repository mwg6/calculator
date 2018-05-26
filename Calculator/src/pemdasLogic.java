
public class pemdasLogic {
	float trueAnswer;
	int countParans = 0;
	int paranLoc = 0;
	
	
	public float pemdasCalc(String equation){
		//count all parantheses
		if(equation.contains("("))
				{
			for(int i =0; i<equation.length(); i++)
			{
				if(equation.charAt(i)=='('){
					countParans++;
				}
				else{
					//do nothing, cycle
				}
			}
			//retrieve indexes of parantheses
			int[] paranInd = new int[countParans*2];
			
			for(int i =0; i<equation.length(); i++){
				if(equation.charAt(i)=='('){
					paranInd[paranLoc] = i;
					paranLoc++;
				}
				else if(equation.charAt(i)==')'){
					paranInd[paranLoc] = i;
					paranLoc++;
				}
				else{
					
				}
		}
			
		}
		
		
		//solve parantheses areas first
		
		
		return trueAnswer;
	}
}
