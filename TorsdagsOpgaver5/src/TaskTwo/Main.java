package TaskTwo;

public class Main {

    public static void main(String[] args){
    Cafe cafe = new Cafe();
    cafe.loadMenuData();
        System.out.println(cafe.getCoffeeMenu());
    }
}
