 //shanon fenno

public class sha{
	public static void main(String args[]){
		take a = new take();
		makeArray b = new makeArray();
		
		

		b.set(a.input());

		System.out.println("Number of differnt letters are - " + b.topRe() + "\n they are");
				System.out.println("letter - frequency");
		for(int i = 0;i<b.topRe() - 1;i++){

				System.out.println("  "+b.get(i)+"   -      " + b.frequency(i));

		}
		
		

	}
}
