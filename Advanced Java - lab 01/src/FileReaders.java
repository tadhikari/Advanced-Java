import java.io.FileReader;
import java.io.IOException;

public class FileReaders {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
			FileReader fr = new FileReader("test.txt");
			
			int text = fr.read();
			
			while(fr.ready()) {
				
			}
		
		
		
	}

}
