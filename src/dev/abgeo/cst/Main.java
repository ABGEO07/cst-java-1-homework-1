package dev.abgeo.cst;

public class Main {

    public static void main(String[] args) {
        HomeWork01 homeWork01 = new HomeWork01();

        double km1 = 1;
        double mile1 = homeWork01.mile2Km(km1);
        double mile2 = 1;
        double km2 = homeWork01.km2Mile(mile2);

        System.out.println(String.format("%.3f Km in Miles is %.3f.", km1, mile1));
        System.out.println(String.format("%.3f Mile in Km is %.3f.", mile2, km2));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        double c1 = 1;
        double f1 = homeWork01.celsius2Fahrenheit(c1);
        double f2 = 1;
        double c2 = homeWork01.fahrenheit2Celsius(f2);

        System.out.println(String.format("%.3f°C is %.3f°F", c1, f1));
        System.out.println(String.format("%.3f°F is %.3f°C", f2, c2));

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        double kg1 = 1;
        double lbs1 = homeWork01.kg2Lbs(kg1);
        double lbs2 = 1;
        double kg2 = homeWork01.lbs2Kg(lbs2);

        System.out.println(String.format("%.3f Kg is %.3f Lbs.", kg1, lbs1));
        System.out.println(String.format("%.3f Lbs is %.3f Kg.", lbs2, kg2));
    }
}
