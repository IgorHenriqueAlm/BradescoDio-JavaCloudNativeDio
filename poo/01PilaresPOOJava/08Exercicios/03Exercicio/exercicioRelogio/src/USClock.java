public class USClock extends Clock {
    
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
        if (hour >12 && hour <24) { //se der erro colocar parenteses
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
        return null;
    }

}
