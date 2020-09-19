package teste.ordenacao.util;

import java.time.format.DateTimeFormatter;

public class Util {
	public static DateTimeFormatter getDateTimeFormate() {
		DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return formate;
	}
}
