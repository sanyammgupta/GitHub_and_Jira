/*Question 3: Write some long text in a file (any paragraph taken from internet). Read the content of file through Java I/O. Create a program to 
find the frequency of all words. (using collections)*/

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Collection {
    

	public static void main(String[] args) throws IOException {
		
		 String data = readfile();
		 frequency(data);
	}
	public static String readfile() {
		String str = "";
		 File myFile = new File("File.txt");
	        try {
	            Scanner sc = new Scanner(myFile);
	            while(sc.hasNextLine()){
	                String line = sc.nextLine();
	                System.out.println(line);
	               str+=line;
	            }
	            sc.close();
	            }
	         catch (FileNotFoundException e) { 
	            e.printStackTrace();
	        
	}
			return str;
	 }
      
		
		public static void frequency(String data) {
			
			List<String> output= (List<String>) Arrays.asList(data.split(" "));
		for(int i=0;i<output.size();i++) {
		int freq  = Collections.frequency(output,output.get(i) ); 
	 System.out.println(output.get(i)+" word freuqency: " +freq);
			
			
		
			
		}
}
}
                   
		
 
    

