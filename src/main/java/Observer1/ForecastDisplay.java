package Observer1;

public class ForecastDisplay implements Receivers, Display{
    private int temperature;
    private int humidity;
    private int pressure;

    WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.register(this);
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println( "ForecastDisplay{" +
                "temperature=" + temperature*2 +
                ", humidity=" + humidity*2 +
                ", pressure=" + pressure*2 +
                '}');
    }

}
