package com.banuakman;

public class Warrior extends Character {

    private int shieldStrength = 100;

    public Warrior(String name){
        super(name, 75, 100, 100, 50, 10);
    }

    public Warrior() {
    }

    public void decreaseShieldStrength() {
        System.out.println(this.getName() + " loses some shield strength");
    }

    @Override
    public void run() {
        System.out.println(this.name + " runs the fastest !");
    }

    @Override
    public void attack() {
        System.out.println(this.name + " loses some shield strength...");
    }

    @Override
    public void heal() {
        System.out.println(this.name + " is dreaming about the future and healing");
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.println(this.name + " is betrayed and and decreases in health ! New health is " + value);
    }

    @Override
    public void decreaseStamina(int value) {
        System.out.println(this.name + " decreases in stamina ! New stamia is " + value);
    }

    @Override
    public void increaseStamina(int value) {
        System.out.println(this.name + " increases in stamina ! New stamia is " + value);
    }
}
