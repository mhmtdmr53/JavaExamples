package com.company;
import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.*;
public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
       int a= getDurationString(65,45);
       if (a==-1)
           System.out.println("Invalid value");
       getDurationString(3945);
    }
    public static int getDurationString(int minutes,int seconds)
    {
        if (minutes>=0 && seconds >=0) {
            int hour =minutes/60;
            minutes+=seconds/60;
            minutes=minutes%60;

            seconds=seconds%60;
            System.out.println(hour+"h "+minutes+"m "+seconds+"s ");
            return 10;
        }
        else
            return -1;
    }public static int getDurationString(int seconds)
    {
        if (seconds >=0) {
            int minutes=seconds/60;
            int remaininSeconds = seconds%60;
            System.out.println(seconds+" seconds in "+minutes+" minutes");
            return getDurationString(minutes,remaininSeconds);
        }
        else
            return -1;
    }

}
