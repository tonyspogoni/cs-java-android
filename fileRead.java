import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.lang.Exception;

class FileOpen {

public FileOpen(){

}
	void ReadFile(String filename){
		File theFile = new File(filename);

		if(!theFile.exists()){
			System.out.println("Bad Filename");
			System.exit(-1);
		}

		if(!theFile.canRead()){
			System.out.println("Could not read");
			System.exit(-2);
		}

		try(BufferedReader bufferRead = new BufferedReader(new FileReader(filename))){ 
		String theLine;
		
		while((theLine = bufferRead.readLine()) != null) {
			System.out.println(theLine);


		}


		}
		catch(Exception ex){
			System.out.println(("Exception occurred. ") + ex.getMessage());
			System.exit(-1);
		}
		
	}


	public static void main(String[] args) {

		if(args.length == 0){
			System.out.println("No filename specefied");
			System.exit(-3);
		}
		String filename = args[0];
		FileOpen opener = new FileOpen();
		opener.ReadFile(filename);		
}
}