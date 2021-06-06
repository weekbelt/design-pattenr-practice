package me.weekbelt.factorymethod;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class OrcWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "Orcish " + weaponType;
    }
}
