package probeercode;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateData {

	
// n00b: genereert willekeurige TEKST	(*tekstlengte)
public static String generateRandomString(int length){
	 return RandomStringUtils.randomAlphabetic(length);
 }

 //n00b: genereert willekeurige NUMMERS (*tekstlengte)	
public static String generateRandomNumber(int length){
	 return RandomStringUtils.randomNumeric(length);
 }

//n00b: genereert willekeurige TEKST+NUMMERS (*tekstlengte)	
public static String generateRandomAlphaNumeric(int length){
	 return RandomStringUtils.randomAlphanumeric(length);
 }
 
//n00b: genereert willekeurige TEKST+SPECIFIEKE SPECIALE KARAKTERS (*tekstlengte, 'speciale karakters')	
public static String generateStringWithAllowedSplChars(int length,String allowedSplChrs){
	 String allowedChars="abcdefghijklmnopqrstuvwxyz" +    // toegestane alfabetische tekens
	 "1234567890" +   	// toegestane nummers
     allowedSplChrs;
	 return RandomStringUtils.random(length, allowedChars);
 }
 
//n00b: genereert willekeurige EMAILADRES (*tekstlengte)	
public static String generateEmail(int length) {
	 String allowedChars="abcdefghijklmnopqrstuvwxyz" +   // toegestane alfabetische tekens
     "1234567890" +   	// toegestane nummers
     "_-.";   			// toegestane speciale karakters
	 String email="";
	 String temp=RandomStringUtils.random(length,allowedChars);
	 email=temp.substring(0,temp.length()-9)+"@ytp.com";
	 return email;
 }
 
//n00b: genereert willekeurige URL (*tekstlengte)	
public static String generateUrl(int length) {
	 String allowedChars="abcdefghijklmnopqrstuvwxyz" +   // toegestane alfabetische tekens
     "1234567890" + 	// toegestane nummerieke tekens
     "_-.";   			// toegestane speciale karakters
	 String url="";
	 String temp=RandomStringUtils.random(length,allowedChars);
	 url=temp.substring(0,3)+"."+temp.substring(4,temp.length()-4)+"."+temp.substring(temp.length()-3);
	 return url; 
 }
}
 