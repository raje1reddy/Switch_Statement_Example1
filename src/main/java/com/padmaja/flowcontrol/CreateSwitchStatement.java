package com.padmaja.flowcontrol;

public class CreateSwitchStatement {
    public int getRankBaseOfScore(int day) {
        //marks =20;
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("default");
                break;
        }
        return day;
    }
}

/*
 public String WeekDays(String day) {
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
                break;
            case "FRI":
                System.out.println("Nearing Weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day?");
                break;
        }
        return day;
    }
 */