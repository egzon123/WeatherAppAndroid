package com.egzonberisha.weatherappandroid.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {
    public static final String APP_ID ="083b8f24bdfaa2539db1d57ad8e026b8";
    public static Location current_location = null;

    public static String convertUnixToDate(long dt) {
        Date date = new Date( (dt*1000L));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = simpleDateFormat.format(date);
        return formatted;
    }

    public static String convertUnixToHour(long sunrise) {
        Date date = new Date( (sunrise*1000L));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String formatted = simpleDateFormat.format(date);
        return formatted;
    }
}
