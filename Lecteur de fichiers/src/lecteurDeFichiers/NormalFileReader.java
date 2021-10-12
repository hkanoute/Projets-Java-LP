package lecteurDeFichiers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NormalFileReader extends MyFileReader{
	private String path;
	
	public NormalFileReader(String path) {
		super();
		this.path = path;
		
	}
	public ArrayList<String> stream() {
			if(super.isFileReadable(this.path)) {
				super.readFile();
				for(int i = 0; i < content.size();i++){
					System.out.println(content.get(i));
				}
				return content;
			} else System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
			return null;
	}
	
	public void diff(ArrayList<String> content1, ArrayList<String>content2) {
		List<String> difference = content1.stream()
			    .filter(aObject -> !content2.contains(aObject))
			    .collect(Collectors.toList());
		List<String> difference2 = content2.stream()
			    .filter(aObject -> !content1.contains(aObject))
			    .collect(Collectors.toList());
		System.out.println("Elements that are not contained on both files :" + difference + " " + difference2);
		
	}
}	



