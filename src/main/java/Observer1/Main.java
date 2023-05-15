package Observer1;

public class Main {
    public static void main(String... args){
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setValues(10, 11,12);

        weatherData.setValues(20, 21, 22);
    }
}
