package tema2;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Clock {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("G Q dd/M/yyyy HH:mm:ss n");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime currentDateTime = LocalDateTime.now();
		String formattedDateTime = currentDateTime.format(FORMATTER);
		System.out.println(formattedDateTime);
	}

}
