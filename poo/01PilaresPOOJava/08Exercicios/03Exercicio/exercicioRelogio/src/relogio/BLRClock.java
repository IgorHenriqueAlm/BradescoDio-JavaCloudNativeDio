package relogio;
public non-sealed class BLRClock extends Clock {

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock ->
                this.hour = (usClock.getPeriodIncator().equals("PM")) ? 
                        usClock.getHour() + 12 : 
                        usClock.getHour() ;

            case BLRClock blrClock -> this.hour = blrClock.getHour();
        }
        return this;
    }

}
