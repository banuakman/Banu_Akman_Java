package com.banuakman;

public class App {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("BadKarma");
        Constable constable = new Constable("HairyPoppins");
        Warrior warrior = new Warrior("BreadPitt");

        System.out.println("FARMER");
        System.out.println(farmer);
        System.out.println("============================================================================");
        // Abilities
        farmer.run();
        farmer.plow();
        farmer.harvest();
        farmer.attack();
        farmer.heal();
        farmer.decreaseHealth(90);
        farmer.increaseStamina(85);
        farmer.decreaseStamina(70);

        System.out.println(" ");

        System.out.println("CONSTABLE");
        System.out.println(constable);
        System.out.println("============================================================================");
        // Abilities
        constable.run();
        constable.arrest();
        constable.attack();
        constable.heal();
        constable.decreaseHealth(90);
        constable.increaseStamina(80);
        constable.decreaseStamina(75);

        System.out.println(" ");

        System.out.println("WARRIOR");
        System.out.println(warrior);
        System.out.println("============================================================================");
        // Abilities
        warrior.run();
        warrior.attack();
        warrior.heal();
        warrior.decreaseHealth(90);
        warrior.decreaseStamina(90);
        warrior.increaseStamina(100);
        warrior.decreaseShieldStrength();

    }
}
