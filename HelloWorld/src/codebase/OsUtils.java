
public final class OsUtils {
	
   private static String OS = null;
   public static String getOsName()
   {
      if(OS == null) 
	      { 
    	  OS = System.getProperty("os.name"); 
    	  System.out.println(OS);
	      }
 
   return OS;
   }

   public static void main(String[] args) {
	getOsName();
	}

}