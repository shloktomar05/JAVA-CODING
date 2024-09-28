package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.Duration;

public class Arraylist {
	public static void main(String[] args) {
		
	    // long timestamp = 1707938240;
		// LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneOffset.UTC);
		// System.out.println("Date and time: " + dateTime);
		long iatTimestamp = 1707938240L;
        long expTimestamp = 1739474240L;

        // Convert UTC to Indian Standard Time (IST)
        LocalDateTime iatUtcDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(iatTimestamp), ZoneOffset.UTC);
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZonedDateTime iatIstDateTime = iatUtcDateTime.atZone(istZone);

        LocalDateTime expUtcDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(expTimestamp), ZoneOffset.UTC);
        ZonedDateTime expIstDateTime = expUtcDateTime.atZone(istZone);

        // Calculate duration between the timestamps
        Duration duration = Duration.between(iatIstDateTime, expIstDateTime);

        // Display the duration
        System.out.println("Time difference between iat and exp in IST: " + duration);
		
	}

}
