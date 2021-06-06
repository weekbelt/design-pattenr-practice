package me.weekbelt.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args) {
        // Lets go to war with Orc weapons
        var app = new App(new OrcBlacksmith());
        app.manufactureWeapons();

        // Lets go to war with Elf weapons
        app = new App(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        var weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        log.info(weapon.toString());
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        log.info(weapon.toString());
    }
}
