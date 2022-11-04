package RAJA;

public class AngleBetwenhourandMinutehand {
    public static int findAngle(int hh, int mm)
    {
        // handle 24-hour notation
        hh = hh % 12;

        // find the position of the hour's hand
        int h = (hh * 360) / 12 + (mm * 360) / (12 * 60);
        // 60 minutes is 1 hour and that is 30 degrees
        // so 1 minute is 0.5 degree

        // find the position of the minute's hand
        int m = (mm * 360) / (60);
        // 60 minutes is 360 degrees
        // 1 minute is 6 degrees


        // calculate the angle difference
        int angle = Math.abs(h - m);


        // consider the shorter angle and return it
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) {
        int hour=23;
        int minute=15;

        System.out.println(findAngle(hour, minute));

    }
}
