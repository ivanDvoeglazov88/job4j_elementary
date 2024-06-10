package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 88;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 96; /* формула перевода рублей в доллары. */
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(57);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("57 rubles are " + dollar + " dollar.");
    }
}