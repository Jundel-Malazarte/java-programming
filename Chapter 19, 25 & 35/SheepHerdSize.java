//Chapter 24 - Exercise 1

import java.lang.Math;

class SheepHerdSize
{
    public static void main(String[] args)
    {

        for (double t = 0; t <= 25; t++)
        {
            double N = 220 / (1 + 10 * (Math.pow(.83, t)));
            System.out.println(
                "for t=" + t + " result is " + N + 
                " check: " + computeYears(N));
        }

        System.out.println(computeYears(80));
    }

    public static double computeYears(double N)
    {
        double a = Math.log(22.0 / N - 0.1);
        double b = Math.log(100.0 / 83.0);
        return -a / b;
    }
}