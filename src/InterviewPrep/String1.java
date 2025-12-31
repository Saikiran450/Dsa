package InterviewPrep;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String txt="aabbccc";
		   
		   int count=1;
		   for(int i=0;i<txt.length();i++) {
			      
			       if(   i<txt.length()-1 &&txt.charAt(i)==txt.charAt(i+1)) {
			    	   count++;
			    	   
			       }
			       else {
			    	       System.out.println(txt.charAt(i)+" "+count);
			    	       count=1;
			    	       
			       }
		   }
	}
}