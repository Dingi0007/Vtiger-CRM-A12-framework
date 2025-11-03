package dp_extra;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ForMultipleRow {
	@DataProvider
	   public void getData() {
		   Object [] [] arr = new Object[5] [2];
//		                          row = number of execution.
//		                          col = number of Parameters.
// imp: row's size mandotary but column is optional.		   
		   arr[0][0] = "Keerti";
		   arr[1][0] = "Shakya";
		   
		   arr[1][0] = "mayank";
		   arr[1][1] = "gautam";
		   
		   arr[2][0] = "Vedant";
		   arr[2][1] = "sahu";
		   
		   arr[3][0] = "Kajal";
		   arr[3][1] = "Shakya";
		   
		   arr[4][0] = "Palak";
		   arr[4][1] = "Nagvanshi";
		   
		   for (Object[] rows: arr) {
				 for(Object col: rows) {
					 System.out.println(col); 
			  }
    }		  
	}
}