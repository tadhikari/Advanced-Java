import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
	
	
	public void ingredient() throws IOException {
		
		File file = new File("recipie.txt"); 
		
		file.createNewFile(); //create a new File
		
		String recipie = "";
		Scanner scan = new Scanner(System.in);
		
		PrintWriter pw = new PrintWriter(file); //open the file to write
		
		while(!recipie.equals(" ")) {
			recipie = scan.next();
			if(!recipie.equals(" ")) {	
			pw.print(recipie+System.getProperty("line.separator"));//write the file
			}
		}
		
		scan.close();
		pw.close();
		
	}
	

}
