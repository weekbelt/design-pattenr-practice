package me.weekbelt.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        // GoF Strategy pattern
        log.info("Green dragon spotted ahead!");
        var dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        log.info("Green dragon spotted ahead!");
        dragonSlayer = new DragonSlayer(
            () -> log.info("With your Excalibur you severe the dragon's head!"));
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(() -> log.info(
            "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(() -> log.info(
            "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!"));
        dragonSlayer.goToBattle();

        // Java 8 lambda implementation with enum Strategy pattern
        log.info("Green dragon spotted ahead!");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        log.info("Red dragon emerges.");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        log.info("Black dragon lands before you.");
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();

    }
}
