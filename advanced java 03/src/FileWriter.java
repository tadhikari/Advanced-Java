/*
 * tribikram adhikari
 * 
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


public class FileWriter {
	String fname;
	
	public FileWriter() {
		fname = "recipie.txt";
	}
	
	public FileWriter(String fname) {
		this.fname = fname;
	}
	
	public void write() throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String recipie = "  ";
		File file = new File(fname);
		ArrayList<String> ingredients = new ArrayList<String>();	
		
		while(!recipie.equals(" ")) {
			System.out.print("=>");
			recipie = scan.nextLine();
			if(recipie.equals(recipie)) {
				ingredients.add(recipie);
			}
		}
		
		
		
		scan.close();
		
		Files.write
		(Paths.get(fname), ingredients, StandardCharsets.UTF_8,
		StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		
	}
	
	
	
}
