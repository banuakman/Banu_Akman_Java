package com.banuakman;

public class Farmer extends Character  {

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
    }

    public Farmer() {
    }

    public void plow() {
        System.out.println(this.getName() + " is plowing.");
    }

    public void harvest() {
        System.out.println(this.getName() + " is harvesting.");
    }

    @Override
    public void run() {
        System.out.println(this.name + " runs slowly");
    }

    @Override
    public void attack() {
        System.out.println(this.name + " attacks with shovel");
    }

    @Override
    public void heal() {
        System.out.println(this.name + " enjoying the sunshine and healing");
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.println(this.name + " is tired and decreases in health !  New health is " + value);
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
