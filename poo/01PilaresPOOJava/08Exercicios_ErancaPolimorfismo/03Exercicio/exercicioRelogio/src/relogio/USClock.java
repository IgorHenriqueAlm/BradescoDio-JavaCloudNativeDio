package relogio;
public non-sealed class USClock extends Clock {
    
    private String periodIncator;

    public String getPeriodIncator() {
        return periodIncator;
    }

    public void setAfterMidday() {
        this.periodIncator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIncator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidday();
        if ((hour >12) && (hour <24)) { //se der erro colocar parenteses
            setAfterMidday();
            this.hour = hour -12;
        } else if (hour >= 24) {
            this.hour = 0;  
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();
        switch (clock) {
            case USClock usClock ->{
                this.hour = usClock.getHour();
                this.periodIncator = usClock.getPeriodIncator();
            }
            case BLRClock blrClock -> this.setHour(blrClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime() {
        return super.getTime() + " " + this.periodIncator;
    }
}
