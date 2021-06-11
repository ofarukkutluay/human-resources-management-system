package kutluaycomp.hrms.core.utilities.validations;

import java.util.regex.Pattern;



public class CustomValidators {
		
	public static boolean isWebDomainEmail(String email,String website) {
		String[] websiteArray = website.split(".");
		
		String websiteDomain;
		if (websiteArray[0].contains("www")) {
			websiteDomain = websiteArray[1];
			System.out.println(websiteDomain);
		} else {
			websiteDomain = websiteArray[0];
			System.out.println(websiteDomain);
		}
		System.out.println(websiteDomain);
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@"+ websiteDomain +"+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}
	
	public static boolean doHaveEmail(String email) {
	
		return true;
	}
	

}
