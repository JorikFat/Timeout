package dev.jorik.timeout;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class TimeoutActivity extends AppCompatActivity {

    private static long timeout;

    public static void setTimeout(int year, int month, int day){
        timeout = createCalendar(year, month, day, 0, 0, 0, 0).getTimeInMillis();
    }

    public static void setTimeout(int year, int month, int day, int hour){
        timeout = createCalendar(year, month, day, hour, 0, 0, 0).getTimeInMillis();
    }

    public static void setTimeout(int year, int month, int day, int hour, int minute){
        timeout = createCalendar(year, month, day, hour, minute, 0, 0).getTimeInMillis();
    }

    public static void setTimeout(int year, int month, int day, int hour, int minute, int second){
        timeout = createCalendar(year, month, day, hour, minute, second, 0).getTimeInMillis();
    }

    public static void setTimeout(int year, int month, int day, int hour, int minute, int second, int millis){
        timeout = createCalendar(year, month, day, hour, minute, second, millis).getTimeInMillis();
    }

    public static boolean timeoutExpired(){
        return System.currentTimeMillis() > timeout;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeout);
    }

    private static Calendar createCalendar(int year, int month, int day, int hour, int minute, int second, int millis){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day, hour, minute, second);
        calendar.set(Calendar.MILLISECOND, millis);
        return calendar;
    }
}
