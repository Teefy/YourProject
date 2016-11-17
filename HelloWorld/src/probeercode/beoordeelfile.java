package probeercode;

import java.io.File;


public class beoordeelfile {

	public static void main(String[] args) {
		checkfile();
		
	}
	
	private static boolean checkfile() {
	
		String home = System.getProperty("user.home");
		File f = new File(home+"/Downloads/test.doc"); 
		
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
