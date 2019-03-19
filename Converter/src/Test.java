import java.io.File;
import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args)throws IOException {
		File file = new File("C:/commande.txt");
		FileInputStream input = null;
		
		//OutputStream output = null;
		
		 try {
			 input = new FileInputStream(file);
//				 output = new FileOutputStream("C:/Users/infooplus/Downloads/Compressed/monNouveauFichier.txt");
//		        byte[] buffer = new byte[1024];
//		        int length;
//		        while ((length = input.read(buffer)) > 0) {
//		        	output.write(buffer, 0, length);
		        //}
		    } finally {
		    	input.close();
		    	//output.close();
		    }
	}
	
	}

