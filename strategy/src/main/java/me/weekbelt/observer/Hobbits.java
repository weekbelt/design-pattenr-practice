package me.weekbelt.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Hobbits implements WeatherObserver {

    @Override
    public void update(WeatherType currentWeather) {
        log.info("The hobbits are facing " + currentWeather.getDescription() + " weather now");
    }
}
