public class Main {

    public static void main(String[] args) {

        BerlinClock clock = new BerlinClock(args[0]);

        System.out.println("====== Berlin Clock ======");
        clock.printClock();
        System.out.println("==========================");
    }

}
