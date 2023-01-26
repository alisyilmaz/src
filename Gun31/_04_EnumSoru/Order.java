package Gun31._04_EnumSoru;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Pizza> pizzas;

    public Order() {
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void showOrder() {
        for (PizzaSize size : PizzaSize.values()) {
            long count = pizzas.stream()

                    .count();
            if (count > 0) {
                System.out.println(size + ": " + count);
            }
        }
    }
}
