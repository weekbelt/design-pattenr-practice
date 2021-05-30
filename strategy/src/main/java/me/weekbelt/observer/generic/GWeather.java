package me.weekbelt.observer.generic;

import lombok.extern.slf4j.Slf4j;
import me.weekbelt.observer.WeatherType;

@Slf4j
public class GWeather extends Observable<GWeather, Race, WeatherType> {

    private WeatherType currentWeather;

    public GWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        log.info("The weather changed to {}.", currentWeather);
        notifyObservers(currentWeather);
    }
}
