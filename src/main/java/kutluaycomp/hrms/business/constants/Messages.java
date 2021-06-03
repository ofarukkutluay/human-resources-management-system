package kutluaycomp.hrms.business.constants;

public class Messages {
	public static String added = "Eklendi";
	public static String added(String how) { return how + " eklendi";}
	public static String listed = "Listelendi";
	public static String listed(String how) {return how + " listelendi";}
	public static String mernisError = "Kişi mernisten doğrulanamadı!";
	public static String objectNullError = "Tüm alanlar doldurulmalıdır!";
	public static String emailDomainError = "Web sitesi ile email domaini aynı olmalıdır!";
	public static String userExistsError = "Girilen emailde kullanıcı bulunmaktadır!";
}
