package dp_extra;

import org.testng.annotations.Test;

public class ArrayCheck {
// this is for singleDimension jo only ak hi row me hota h.
   @Test
   public void singleDimension() {
	   int [] arr = new int[5];
	   
	   arr[0] = 11;
	   arr[1] = 21;
	   arr[2] = 31;
	   arr[3] = 41;
	   arr[4] = 51;
	  
   System.out.println(arr[4]);
	  for (int i : arr) {
		  System.out.println(i);
	  }
   }
}
