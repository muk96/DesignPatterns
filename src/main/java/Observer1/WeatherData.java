package Observer1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Receivers> receiversList;

    int temperature;
    int humidity;
    int pressure;

    public WeatherData() {
        receiversList = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setValues(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Gets called whenever there is a change in measurements
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Receivers receiver : receiversList){
            receiver.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void register(Receivers receiver) {
        receiversList.add(receiver);
    }

    @Override
    public void deRegister(Receivers receiver) {
        receiversList.remove(receiver);
    }
}
