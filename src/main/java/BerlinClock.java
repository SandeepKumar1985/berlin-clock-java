import java.util.Collections;

public class BerlinClock {

    private BerlinTime berlinTime;

    public BerlinClock(String time) {

        if(time == null) throw new IllegalArgumentException("No time provided.");

        String[] times = time.split(":", 3);

        if(times.length != 3) throw new IllegalArgumentException("Invalid time provided.");

        int hours = Integer.parseInt(times[0]);
        int minutes = Integer.parseInt(times[1]);
        int seconds = Integer.parseInt(times[2]);

        if (hours < 0 || hours > 23) throw new IllegalArgumentException("Hours out of bounds.");
        if (minutes < 0 || minutes > 59) throw new IllegalArgumentException("Minutes out of bounds.");
        if (seconds < 0 || seconds > 59) throw new IllegalArgumentException("Seconds out of bounds.");

        this.berlinTime = processTime(hours, minutes, seconds);
    }

    public void printClock() {
        System.out.println(berlinTime);
    }

    private BerlinTime processTime(int hours, int minutes, int seconds) {

        String line1 = (seconds % 2 == 0) ? "Y" : "0";
        String line2 = rowString(hours / 5, 4, "R");
        String line3 = rowString(hours % 5, 4, "R");
        String line4 = rowString(minutes / 5, 11, "Y").replaceAll("YYY", "YYR");
        String line5 = rowString(minutes % 5, 4, "Y");

        return new BerlinTime(line1, line2, line3, line4, line5);
    }

    private String rowString(int litLights, int lightsInRow, String lampType) {

        int unlitLights = lightsInRow - litLights;
        String lit = String.join("", Collections.nCopies(litLights, lampType));
        String unlit = String.join("", Collections.nCopies(unlitLights, "0"));

        return lit + unlit;
    }


}
