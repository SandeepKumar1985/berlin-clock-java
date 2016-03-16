/**
 * Created by Ryan on 16/03/2016.
 */
public class BerlinTime {

    private String formattedTime;

    public BerlinTime(String firstRow,
                      String secondRow,
                      String thirdRow,
                      String forthRow,
                      String fifthRow) {

        String newLine = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append(firstRow);
        sb.append(newLine);
        sb.append(secondRow);
        sb.append(newLine);
        sb.append(thirdRow);
        sb.append(newLine);
        sb.append(forthRow);
        sb.append(newLine);
        sb.append(fifthRow);
        this.formattedTime = sb.toString();
    }

    @Override
    public String toString() {
        return this.formattedTime;
    }

}
