package lecteurDeFichiers;

import java.util.ArrayList;

public class ReverseFileReader extends MyFileReader {

private String path;
	
	public ReverseFileReader(String path) {
		super();
		this.path = path;
		
	}

	public ArrayList<String> stream() {
			if(super.isFileReadable(this.path)) {
				super.readFile();
				for(int i = content.size() - 1  ; i >= 0 ;i--){
					System.out.println(content.get(i));
				}
				return content;
			} else System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
			return null;
	}

}
