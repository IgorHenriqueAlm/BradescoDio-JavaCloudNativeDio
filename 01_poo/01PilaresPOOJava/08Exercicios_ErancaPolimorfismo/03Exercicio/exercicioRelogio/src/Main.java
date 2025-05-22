import relogio.BLRClock;
import relogio.Clock;
import relogio.USClock;

public class Main {
    public static void main(String[] args) {
        Clock brlclock = new BLRClock();
        brlclock.setSecond(0);
        brlclock.setMinute(0);
        brlclock.setHour(24);

        System.out.println(brlclock.getTime());

        System.out.println(new USClock().convert(brlclock).getTime());
    }
}
