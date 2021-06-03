package me.weekbelt.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClubbedTroll implements Troll {

    private final Troll decorated;

    public ClubbedTroll(Troll decorated) {
        this.decorated = decorated;
    }

    @Override
    public void attack() {
        decorated.attack();
        log.info("The troll swings ay you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
