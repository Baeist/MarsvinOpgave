import java.util.Collections;

public class Main {
    public static void main(String[] args){

        PigHandler file = new PigHandler();


        file.addGuineaPigFromFile();

        System.out.println(file.list);

        System.out.println("Total amount of food needed: " + file.totalAmountFoodInListOfPigs());

        Collections.sort(file.list);

        System.out.println(file.list);

        file.list.sort(GuineaPig::compareToFood);

        System.out.println(file.list);

    }
}
