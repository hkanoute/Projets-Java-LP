package lecteurDeFichiers;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public abstract class MyFileReader implements InterfaceFileReader{
	protected ArrayList<String> content;
	private File file;
	
	public MyFileReader () {
		this.content = new ArrayList<String>();
		this.file = null;

	}
	
	public boolean isFileReadable(String path) {
		this.file = new File(path);
		return (file.isFile()&&file.canRead());
	}
	
	public void readFile() {
		try {
			Reader reader = new FileReader(this.file);
			BufferedReader br = new BufferedReader(reader, 16384);
			String line;
			while ((line = br.readLine())!=null){
					this.content.add(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public abstract ArrayList<String> stream();

}
