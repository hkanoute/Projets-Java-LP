package lecteurDeFichiers;

import java.util.ArrayList;

public interface InterfaceFileReader {
	
	 boolean isFileReadable(String path);	
	 void readFile();
	 ArrayList<String> stream();
	
}
