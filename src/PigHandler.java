import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PigHandler {

    GuineaPig pigs = new GuineaPig();
    ArrayList<GuineaPig> list = new ArrayList<>();

    public void addGuineaPigFromFile(){
        try {
            Scanner scanner = new Scanner(new File("guineapig.txt"));
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();
                Scanner lineRead = new Scanner(line);

                GuineaPig pig = new GuineaPig(lineRead.next(), lineRead.next(), lineRead.nextInt());
                // System.out.println(pig);
                list.add(pig);
            }
        }catch (Exception e){
            System.out.println("Failure to find file..");
        }
    }

    public int totalAmountFoodInListOfPigs(){
        int totalFood = 0;
        for(int i = 0; i < list.size(); i++){
            totalFood = (list.get(i).getFood() + totalFood);
        }
        return totalFood;
    }


}
