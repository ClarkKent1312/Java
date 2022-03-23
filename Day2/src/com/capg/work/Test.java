package com.capg.work;

public class Test {
	public static String calcGST(String newString){
	      String[] s = newString.split("[@,]+");

	      int GST = 0;
	      
	      for (int i = 0; i<s.length ; i=i+2) {
	            
	            
	            int rate = Integer.parseInt(s[i]);
	            int quantity = Integer.parseInt(s[i+1]);
	            
	            GST += rate*quantity;
	            
	      }
	      
	      GST = GST * 12/100;

	      String result=Integer.toString(GST);
	      return result;
	    }
	
	public static void main(String[] args) {
		String s = Test.calcGST("100,20@70,30@40,50");
		System.out.println(s);
	}
	
	
	
	
}
