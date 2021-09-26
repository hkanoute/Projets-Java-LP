package lecteurDeFichiers;

import java.util.ArrayList;

public class PalindromicFileReader extends MyFileReader  {
	
private String path;
	
	public PalindromicFileReader(String path) {
		super();
		this.path = path;
		
	}

	public ArrayList<String> stream() {
			if(super.isFileReadable(this.path)) {
				super.readFile();
				String inversedCharacter = "";
				for(int a = 0; a < content.size();a++){
					String[] mots = content.get(a).split(" ");
					for(int b = 0; b < mots.length; b++){
						int taille = mots[b].length();
						for(int i = taille -1; i>-1; i--)
				         {
				            inversedCharacter+= mots[b].substring(i, i +1);
				         }
						inversedCharacter+= " ";
						
					}
					inversedCharacter+= "\n";
					
				}
				System.out.println(inversedCharacter);
				return parse(inversedCharacter);
			} else System.out.println("An error occured ! verify that your file exist or if the path isn't wrong");
			return null;	
	}

	private ArrayList<String> parse(String inversedCharacter) {
		// TODO Auto-generated method stub
		return null;
	}


}
