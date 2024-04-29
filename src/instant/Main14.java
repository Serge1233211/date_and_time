package instant;


import java.time.Instant;

public class Main14 {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();

        System.out.println(timestamp);

        long n = timestamp.toEpochMilli();

        Instant time = Instant.ofEpochMilli(n);

        System.out.println(time);
    }

    }
