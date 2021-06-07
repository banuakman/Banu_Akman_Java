package com.banuakman;

import java.util.Objects;

public class IceCreamSHOP {

    private String flavors;
    private double priceOfAScoop;
    private int scoops;
    private int toppings;
    private double priceOfATopping;
    private boolean isCone;

    public IceCreamSHOP(String flavors, double priceOfAScoop, int scoops, int toppings, double priceOfATopping, boolean isCone) {
        this.flavors = flavors;
        this.priceOfAScoop = priceOfAScoop;
        this.scoops = scoops;
        this.toppings = toppings;
        this.priceOfATopping = priceOfATopping;
        this.isCone = isCone;
    }

    public double priceOfScoops() {
        priceOfAScoop = 2.75;
        scoops = this.getScoops();
        return priceOfAScoop * scoops;
    }

    public double priceOfToppings() {
        priceOfATopping = 3.50;
        toppings = this.getToppings();
        return priceOfATopping * toppings;
    }

    public double totalPrice() {
        return priceOfScoops() + priceOfToppings();
    }



    public String getFlavors() {
        return flavors;
    }

    public void setFlavors(String flavors) {
        this.flavors = flavors;
    }

    public double getPriceOfAScoop() {
        return priceOfAScoop;
    }

    public void setPriceOfAScoop(double priceOfAScoop) {
        this.priceOfAScoop = priceOfAScoop;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public double getPriceOfATopping() {
        return priceOfATopping;
    }

    public void setPriceOfATopping(double priceOfATopping) {
        this.priceOfATopping = priceOfATopping;
    }

    public boolean isCone() {
        return isCone;
    }

    public void setCone(boolean cone) {
        isCone = cone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamSHOP that = (IceCreamSHOP) o;
        return Double.compare(that.priceOfAScoop, priceOfAScoop) == 0 && scoops == that.scoops && toppings == that.toppings && Double.compare(that.priceOfATopping, priceOfATopping) == 0 && isCone == that.isCone && flavors.equals(that.flavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavors, priceOfAScoop, scoops, toppings, priceOfATopping, isCone);
    }

    @Override
    public String toString() {
        return "IceCreamSHOP{" +
                "flavors='" + flavors + '\'' +
                ", priceOfAScoop=" + priceOfAScoop +
                ", scoops=" + scoops +
                ", toppings=" + toppings +
                ", priceOfATopping=" + priceOfATopping +
                ", isCone=" + isCone +
                '}';
    }
}
