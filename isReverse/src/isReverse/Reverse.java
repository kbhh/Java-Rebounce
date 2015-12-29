package isReverse;

public class Reverse {

	//function that reverses pair of words
	static String ReverseString(String n){

		String reversed="";
		int last;
	
		 for(int i=0;i<n.length()-1;i=i+2){
			 
			 if(i%2 == 0){ 
	
				reversed =reversed + n.charAt(i+1) + n.charAt(i);
			    last = i+3;
			    
			    if(last==n.length() && n.length()%2!= 0)
			    	reversed = reversed + n.charAt(n.length()-1);		   
			 }
		 }
		 
		return reversed;
	}
	
	public static void main(String[] args) {
		
     ///// Test of the reverse function
		
		String rev;
		String str = "kbrom";
		rev = ReverseString(str);
        System.out.println();
		System.out.println(rev);
	}

}
