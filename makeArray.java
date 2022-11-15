public class makeArray{

	private String [] letters ;//letter data
	private int [] freq;//letters frequency
	private static int top = 0; //letters actual array size;
	private static int length_a;

// 	public int bRe(){
// 		return length_a;
// 	}

	public int topRe(){ // take the letters array actual size
		return top;
	}

	public String get(int i){ //letters values getting to the other calsses	
			return letters[i];
	}

	public int frequency(int i){//frequency values getting to the other classes
		return freq[i];
	}
	
	public void set(String g){ // letters values setting in main method
		arrayMake(g);
	}

	public void Sort(){ //sorting array
		for(int i = 0; i < top; i++){
			for(int j = 0; j < top; j++){
				if(freq[i]>freq[j]){
					int temp = freq[i];//tempary value
					String tempS = letters[i];//tempary value
					freq[i] = freq[j];
					letters[i] = letters[j];
					freq[j] = temp;
					letters[j] =tempS;

				}
			}
		}
	}
	
	private  void arrayMake(String a){
		
		length_a = a.length(); 			//length of 'a' array
		this.letters = new String[length_a]; 		//letters data
		freq = new int[length_a]; 			//letters frequency	
		this.top = 0;			//letters array top value 
		int k = 0;		 // to make sure the charachter repeating or not 
		
		letters[0] = Character.toString(a.charAt(0));		
		top++; 			//letters array actual size

		for(int i = 0; i < length_a; i++){				//take the value of "a" array's charachters
	
			k = 0;		
	
			for(int j = 0; j < top; j++){ 			//for check letters array 
				char c = a.charAt(i);
				char d = letters[j].charAt(0);

				if(c == d){				// check is ther are a same charachter and increase frequency
					freq[j]++;
					k++;
					continue;
				}
			

			}

			if(k == 0){ 			//if it is a new charachter this will exicute and assign the value
				freq[top]++;
				letters[top] = Character.toString(a.charAt(i));
				top++;
			}		
		}
			
		Sort(); 			//letters array sorting
	}
	

}



















