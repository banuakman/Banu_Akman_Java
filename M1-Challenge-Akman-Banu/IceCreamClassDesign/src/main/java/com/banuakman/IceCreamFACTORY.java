package com.banuakman;


import java.util.Objects;

public class IceCreamFACTORY {

    private boolean addMilk;
    private boolean addCoconutCream;
    private boolean addCream;
    private boolean addSugar;
    private String otherFlavors;
    private boolean mixIngredients;
    private boolean iceCreamReady;


    public void makeStandardIceCream() {
        addMilk = true;
        addCream = true;
        addSugar = true;
        setOtherFlavors(otherFlavors);
        mixIngredients = true;
        iceCreamReady = true;
    }

    public void makeVeganIceCream() {
        addCoconutCream = true;
        addSugar = true;
        setOtherFlavors(otherFlavors);
        mixIngredients = true;
        iceCreamReady = true;
    }

    public String isVegan() {
        if (!addMilk && !addCream) {
            return "This is a Vegan Ice Cream";
        } else {return "Use Coconut Cream instead of Milk & Cream";}
    }

    public String sendToStore() {
        if (!iceCreamReady) {
            return "IceCream is not ready to send the store";
        } else {return "SENT!";}
    }

    public IceCreamFACTORY(boolean addMilk, boolean addCoconutCream, boolean addCream, boolean addSugar, String otherFlavors, boolean mixIngredients, boolean iceCreamReady) {
        this.addMilk = addMilk;
        this.addCoconutCream = addCoconutCream;
        this.addCream = addCream;
        this.addSugar = addSugar;
        this.otherFlavors = otherFlavors;
        this.mixIngredients = mixIngredients;
        this.iceCreamReady = iceCreamReady;
    }

    public boolean isAddMilk() {
        return addMilk;
    }

    public void setAddMilk(boolean addMilk) {
        this.addMilk = addMilk;
    }

    public boolean isAddCoconutCream() {
        return addCoconutCream;
    }

    public void setAddCoconutCream(boolean addCoconutCream) {
        this.addCoconutCream = addCoconutCream;
    }

    public boolean isAddCream() {
        return addCream;
    }

    public void setAddCream(boolean addCream) {
        this.addCream = addCream;
    }

    public boolean isAddSugar() {
        return addSugar;
    }

    public void setAddSugar(boolean addSugar) {
        this.addSugar = addSugar;
    }

    public String getOtherFlavors() {
        return otherFlavors;
    }

    public void setOtherFlavors(String otherFlavors) {
        this.otherFlavors = otherFlavors;
    }

    public boolean isMixIngredients() {
        return mixIngredients;
    }

    public void setMixIngredients(boolean mixIngredients) {
        this.mixIngredients = mixIngredients;
    }

    public boolean isIceCreamReady() {
        return iceCreamReady;
    }

    public void setIceCreamReady(boolean iceCreamReady) {
        this.iceCreamReady = iceCreamReady;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamFACTORY that = (IceCreamFACTORY) o;
        return addMilk == that.addMilk && addCoconutCream == that.addCoconutCream && addCream == that.addCream && addSugar == that.addSugar && mixIngredients == that.mixIngredients && iceCreamReady == that.iceCreamReady && otherFlavors.equals(that.otherFlavors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addMilk, addCoconutCream, addCream, addSugar, otherFlavors, mixIngredients, iceCreamReady);
    }

    @Override
    public String toString() {
        return "IceCreamFACTORY{" +
                "addMilk=" + addMilk +
                ", addCoconutCream=" + addCoconutCream +
                ", addCream=" + addCream +
                ", addSugar=" + addSugar +
                ", otherFlavors='" + otherFlavors + '\'' +
                ", mixIngredients=" + mixIngredients +
                ", iceCreamReady=" + iceCreamReady +
                '}';
    }
}
