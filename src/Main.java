public class Main {
    public static void main(String[] args) {
   // Заданиние 1
        byte c = 2;
        short d = 5;
        int p = 25;
        long y = 365L;
        float saltWeight = 23.2f;
        double peppersWeight = 15.7;
        boolean catIsAduIt = c > 12;
        char g = 37;
        System.out.println(catIsAduIt);
// Задание 2
        double oneBoxerWeight = 78.2;
        double twoBoxerWeight = 82.7;
        double totalBoxersWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println(" Общий вес боксеров " + totalBoxersWeight + " кг ");
        double boxerWeightDifference = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница весов между боксерами " + boxerWeightDifference + " кг");

        //Задание 3
        byte bananas = 5;
        byte oneBananasWeight = 80;
        int allBananas = (bananas * oneBananasWeight);
        System.out.println("Общий вес всех бананов " + allBananas + " гр");
       short milk = 200;
       double oneHundredOfMilkInGrams = 1.05;
        double allMilk = (oneHundredOfMilkInGrams * milk);
        System.out.println("Общий вес молока " + allMilk + " гр");
        byte iceCream = 2;
        byte oneIceCream = 100;
        int allIceCreamWeight = oneIceCream * iceCream;
        System.out.println("Общий вес мороженого "+ allIceCreamWeight + " гр");
        byte eggs = 4;
        byte oneEggsWeight = 70;
        int allEggsWeight = eggs * oneEggsWeight;
        System.out.println("Общий вес яиц " + allEggsWeight + " гр");
       Double totalBreakfastWeight = allMilk + allBananas + allEggsWeight + allIceCreamWeight;
        System.out.println("Общий вес спорт-завтрака в граммах " + totalBreakfastWeight +" гр");
        short oneKgGr = 1000;
        double conversationKg = totalBreakfastWeight / oneKgGr;
        System.out.println("Вес переведенной еды из граммов в килограммы " + conversationKg + " кг");
//Задание 4










    }
}