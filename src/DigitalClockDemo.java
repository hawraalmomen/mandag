public class DigitalClockDemo {
    public static void main(String[] args) throws InterruptedException {
        ClockDisplay myClock = new ClockDisplay();
        while (true) {
            myClock.timeTick();
            System.out.println(myClock.timeTick());

            Thread.sleep(1000); //Sleep for 1000 milliseconds (1 second)
        }
    }
}
