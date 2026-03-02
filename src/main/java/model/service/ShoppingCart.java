package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] items;  // Поле - массив элементов Food

    // Конструктор с одним параметром - массивом элементов Food
    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double subtotal(){
        double cost = 0;

        //получить общую сумму товаров в корзине без скидки
        for (int i=0; i<items.length; i++){

            cost=cost+items[i].getPrice()*items[i].getAmount();
        }
        return cost;
    }


    public double total() {

        double costWithDiscount = 0.0;
        //получить общую сумму товаров в корзине со скидкой

        for (int i=0; i<items.length; i++){

                costWithDiscount=costWithDiscount+items[i].getPrice()*items[i].getAmount()* (1- items[i].getDiscount()/100);

        }
        return costWithDiscount;
    }

    public double subtotalVegetarian() {

        double costVegetarian = 0.0;

        //получить сумму всех вегетарианских продуктов без скидки.
        for (int i=0; i<items.length; i++){
            if (items[i].isVegetarian()){

                costVegetarian=costVegetarian+items[i].getPrice()*items[i].getAmount();
            }
        }
        return costVegetarian;
    }

}
