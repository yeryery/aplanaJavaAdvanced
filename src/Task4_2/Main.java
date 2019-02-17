package Task4_2;

/* Задание №4
Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.) У каждой сладости
есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей. Найти общий вес подарка,
общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */
public class Main {
    public static void main(String[] args) {
        Present candy = new Present("Candy", 25, 2000, "wrapped");
        Present jellybean = new Present("Jellybean", 50, 3000, "jelly");
        Present cookie = new Present("Cookie", 45, 2400, "baked");
        Present chocolate = new Present("Chocolate", 15, 1800, "cacao");

        Present presents[] = new Present[]{candy, jellybean, cookie, chocolate};

        int totalWeight = getTotalWeight(presents);
        System.out.println("Total weight: " + totalWeight);

        int totalPrice = getTotalPrice(presents);
        System.out.println("Total price: " + totalPrice);

        System.out.println("------------------------");

        for (Present present : presents) {
            System.out.println(present.toString());
        }
    }

    private static int getTotalPrice(Present[] presents) {
        int totalPrice = 0;
        for (Present present : presents) {
            totalPrice += present.getPrice();
        }
        return totalPrice;
    }

    private static int getTotalWeight(Present[] presents) {
        int totalWeight = 0;
        for (Present present : presents) {
            totalWeight += present.getWeight();
        }
        return totalWeight;
    }
}
