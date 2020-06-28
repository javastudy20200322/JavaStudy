package summary.jaeyeon.practiceA.chap10_DTF3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

class NewTimeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date = LocalDate.of(2020, 12, 31);
		LocalTime time = LocalTime.of(12, 34, 56);

		LocalDateTime dt = LocalDateTime.of(date, time);

		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dt.atZone(zid);

		String strZid = zdt.getZone().getId();



		ZonedDateTime seoulTime = ZonedDateTime.now();
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyTime = ZonedDateTime.now().withZoneSameInstant(nyId);

		//ZonedDateTime ->OffsetDateTime
		
		OffsetDateTime odt  = zdt.toOffsetDateTime();
		
		
		System.out.println(dt);
		System.out.println(zid);
		System.out.println(zdt);
		System.out.println(seoulTime);
		System.out.println(nyTime);
		System.out.println(odt);
	}

}
