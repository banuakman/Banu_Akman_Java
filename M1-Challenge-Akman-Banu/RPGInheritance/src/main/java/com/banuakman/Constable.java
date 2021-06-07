package com.banuakman;

import java.util.Objects;

public class Constable extends Character {

    private String jurisdiction;

    public Constable(String name) {
        super(name, 60, 100, 60, 20, 5);
    }

    public Constable() {
    }

    @Override
    public void run() {
        System.out.println(this.name + " runs pretty fast");
    }

    public void arrest(){
        System.out.println(this.name + " arrests someone !");
    }

    @Override
    public void attack() {
        System.out.println(this.name + " attacks with a taser !");
    }

    @Override
    public void heal() {
        System.out.println(this.name + " takes day off and heals");
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.println(this.name + " feels depressed and decreases in health ! New health is " + value);
    }

    @Override
    public void decreaseStamina(int value) {
        System.out.println(this.name + " decreases in stamina ! New stamia is " + value);
    }

    @Override
    public void increaseStamina(int value) {
        System.out.println(this.name + " increases in stamina ! New stamia is " + value);

    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return jurisdiction.equals(constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
