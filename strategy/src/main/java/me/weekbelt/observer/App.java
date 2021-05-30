package me.weekbelt.observer;

import lombok.extern.slf4j.Slf4j;
import me.weekbelt.observer.generic.GHobbits;
import me.weekbelt.observer.generic.GOrcs;
import me.weekbelt.observer.generic.GWeather;

@Slf4j
public class App {

    public static void main(String[] args) {
        var weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // Generic observer inspired by Java Generics and Collection by Naftalin & Wadler
        log.info("--Running generic version--");
        var genericWeather = new GWeather();
        genericWeather.addObserver(new GOrcs());
        genericWeather.addObserver(new GHobbits());

        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();

    }
}
