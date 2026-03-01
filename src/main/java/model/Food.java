package model;

public abstract class Food implements Discountable{
    //количество продукта в килограммах
    protected int amount;

    //цена за единицу
    protected double price;

    //флаг, который показывает, вегетарианский ли продукт
    protected boolean isVegetarian;

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
