import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class token {
     public static void main(String[] args) {
        long timestamp = 1707934206L;
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timestamp), ZoneOffset.UTC);
        Duration duration = Duration.between(iatIstDateTime, expIstDateTime);
        System.out.println("Date and time: " + dateTime);
    }
    
}
