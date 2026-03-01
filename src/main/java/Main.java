import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.colorGreen;
import static model.constants.Colour.colorRed;

public class Main {
    public static void main(String[] args){
        //Мясо в количестве 5 кг по цене 100 рублей за кг
        Meat meat = new Meat(5,100.0);

        //Яблоки красные в количестве 10 кг по цене 50 рублей
        Apple appleRed = new Apple(10, 50.0, colorRed);

        //Яблоки зелёные в количестве 8 кг по цене 60 рублей
        Apple appleGreen = new Apple(8, 60.0, colorGreen);

        //массив продуктов
        Food[] items = {meat, appleRed, appleGreen};

        //Инициализация корзины
        ShoppingCart cart = new ShoppingCart(items);

        //общая сумма товаров без скидки
        System.out.println("Стоимость товаров в корзине без скидки "+cart.subtotal()+" руб.");

        //общая сумма товаров со скидкой
        System.out.println("Стоимость товаров в корзине сщ скидкой "+cart.total()+" руб.");

        //общая сумма вегетарианских товаров без скидки
        System.out.println("Стоимость вегетарианских товаров в корзине без скидки "+cart.subtotalVegetarian()+" руб.");

    }



}
