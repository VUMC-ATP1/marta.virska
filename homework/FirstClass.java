package homework;

public class FirstClass {
    public static void main(String[] args) {
        String countryName = "Latvija";
        System.out.println(countryName);
        int countryPopulation = 1907675;
        System.out.println(countryPopulation);
        int countryArea = 64589;
        System.out.println(countryArea);
        String countryCapital = "Rīga";
        System.out.println(countryCapital);
        String countryLanguage = "latviešu";
        System.out.println(countryLanguage);
        boolean isCountryInES = true;
        System.out.println(isCountryInES);
        char countryCurrency = '€';
        System.out.println(countryCurrency + "\n");

        System.out.printf("%ss  iedzīvotāju skaits ir %d, tās platība ir %d km2. \n", countryName, countryPopulation, countryArea);
        System.out.println(countryName + "s galvaspilsēta ir " + countryCapital + ", tās valsts valoda ir " + countryLanguage + " un valsts valūta ir " + countryCurrency + "\n");

        byte result;
        double result2;
        int result3;

        System.out.println("saskaitīšana");
        result = 7 + 8;
        System.out.println("7+8=" + result);
        result2 = 125.89 + 59.9;
        System.out.println("125.89+59.9=" + result2);
        result3 = 20000 + 36589;
        System.out.println("20000+36589=" + result3 + "\n");

        System.out.println("atņemšana");
        result = 89 - 65;
        System.out.println("89-65=" + result);
        result2 = 125.89 - 369.9;
        System.out.println("125.89-369.9=" + result2);
        result3 = 20000 - 36589;
        System.out.println("20000-36589=" + result3 + "\n");

        System.out.println("reizināšana");
        result = 5 * 14;
        System.out.println("5*14=" + result);
        result2 = 125.89 * -59.9;
        System.out.println("125.89*-59.9=" + result2);
        result3 = 32000 * 12589;
        System.out.println("32000*12589=" + result3 + "\n");

        System.out.println("dalīšana");
        result = 100 / 4;
        System.out.println("100/4=" + result);
        result2 = 125.89 / 59.9;
        System.out.println("125.89/59.9=" + result2);
        result3 = 20000 / -4;
        System.out.println("20000/-4=" + result3 + "\n");

        System.out.println("atlikums");
        result = 6 % 3;
        System.out.println("6%3=" + result);
        result2 = 125.89 % 59.9;
        System.out.println("125.89%59.9=" + result2);
        result3 = 20000 % 36589;
        System.out.println("20000%36589=" + result3);
    }
}
