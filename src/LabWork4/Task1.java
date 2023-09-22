package LabWork4;

public class Task1 {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;

        favoriteSeason(myFavoriteSeason);

        System.out.println("Мое любимое время года: " + myFavoriteSeason.getName());
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание времени года: " + myFavoriteSeason.getDescription());

        System.out.println("\nИнформация о всех временах года:");
        for (Season season : Season.values()) {
            System.out.println(season.getName());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание времени года: " + season.getDescription());
            System.out.println();
        }
    }

    public static void favoriteSeason(Season season) {
        switch (season){
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            default:
                System.out.println("Передано не время года");
        }
    }
}

enum Season {
    AUTUMN("Осень", 15),
    WINTER("Зима", -12),
    SPRING("Весна", 19),
    SUMMER("Лето", 25);

    private String name;
    private int averageTemperature;

    Season(String name, int averageTemperature) {
        this.name = name;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "Жаркое время года";
        }
        return "Холодное время года";
    }
}
