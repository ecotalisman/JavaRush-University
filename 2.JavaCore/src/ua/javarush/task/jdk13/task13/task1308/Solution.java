package ua.javarush.task.jdk13.task13.task1308;

/* 
The weather is fine
Реалізуй у класі Today інтерфейс Weather.
Подумай, як пов'язаний параметр type з методом getWeatherType().
Зверни увагу, що інтерфейси Weather та WeatherType вже реалізовані в окремих файлах.

Requirements:
1. Інтерфейс Weather потрібно реалізувати в класі Today.
2. У класі Today потрібно реалізувати метод getWeatherType, який оголошено в інтерфейсі Weather.
3. Тип значення, що повертається, методу getWeatherType має бути String.
4. Метод getWeatherType має повертати значення змінної type.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}
