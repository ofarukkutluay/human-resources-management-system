package kutluaycomp.hrms.core.utilities;

import java.util.regex.Pattern;

public class Validators {
	public static boolean isItEqual(String text1,String text2) {
		if (text1==text2) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isThisAnEmail(String email) {
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}
	
	public static boolean isWebDomainEmail(String email,String website) {
		String[] websiteArray = website.split(".");
		String websiteDomain;
		if (websiteArray[0].contains("www")) {
			websiteDomain = websiteArray[1];
		} else {
			websiteDomain = websiteArray[0];
		}
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@"+ websiteDomain +"+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}
	
	

}
