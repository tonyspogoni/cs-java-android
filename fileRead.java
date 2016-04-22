import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.lang.Exception;

class FileOpen {

public FileOpen(){
// A constructor 
}

	void ErrorChecking(String filename){
		// A function that handles errors
		File theFile = new File(filename);

		if(!theFile.exists()){
			System.out.println("Bad Filename");
			System.exit(-1);
		}

		if(!theFile.canRead()){
			System.out.println("Could not read");
			System.exit(-2);
		}
	}
	void ReadFile(String filename){

		// reads the file and displays the words in each line
		try(BufferedReader bufferRead = new BufferedReader(new FileReader(filename))){ 
		String theLine;
		while((theLine = bufferRead.readLine()) != null) { // Keep reading as long as there is stuff to read
			
			String[] wordArray = theLine.split("\\s+"); // Spilt into an array of words
			int wordCount = wordArray.length; // length of the array is the number of words in the line 

			System.out.println(wordCount + " : " + theLine); // Prints number of words and the line


		}

		}
		catch(Exception ex){ // a catch all
			System.out.println(("Exception occurred. ") + ex.getMessage());
			System.exit(-1);
		}
		
	}


	public static void main(String[] args) {

		if(args.length == 0){ // Checks for no filename entered 
			System.out.println("No filename specefied");
			System.exit(-3);
		}
		String filename = args[0]; // First argument is the filename
		FileOpen opener = new FileOpen(); //New object to open the file
		opener.ErrorChecking(filename); // Error checking
		opener.ReadFile(filename);		// Reads file and displays info
}
}