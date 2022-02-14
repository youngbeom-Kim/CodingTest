package question17;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour + (int) (minute / 60);
        this.minute = minute % 60;
        this.second = second;
    }

    public Time(int minute, int second) {
        this.hour = (int) (minute / 60);
        this.minute = minute % 60;
        this.second = second;
    }

    public Time(int second) {
        this.hour = (int) (second / 60 / 60);
        this.minute = (int) (second / 60 % 60);
        this.second = second % 60;
    }

    public String info() {

        return String.format("%d : %d : %d\n"
                , this.hour
                , this.minute
                , this.second);
    }

}
