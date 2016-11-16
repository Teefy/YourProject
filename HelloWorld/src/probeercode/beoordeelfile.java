package probeercode;

import java.io.File;


public class beoordeelfile {

	public static void main(String[] args) {
		checkfile();
		
	}
	
	private static boolean checkfile() {
	 File f = new File("C:/Users/Michel/Downloads/test.doc");
		if(f.exists()){
		    System.out.println("success");
		}
		else{
		    System.out.println("fail");
	
		}
		f.delete();
		return false;
	}
}	
