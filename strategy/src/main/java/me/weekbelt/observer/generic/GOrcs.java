package me.weekbelt.observer.generic;

import lombok.extern.slf4j.Slf4j;
import me.weekbelt.observer.WeatherType;

@Slf4j
public class GOrcs implements Race {

    @Override
    public void update(GWeather weather, WeatherType weatherType) {
        log.info("The orcs are facing " + weatherType.getDescription() + " weather now");
    }
}
