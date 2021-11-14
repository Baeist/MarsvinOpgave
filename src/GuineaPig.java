import java.util.ArrayList;

public class GuineaPig implements Comparable<GuineaPig>{

    private String name;
    private String type;
    private int food; // grams per day

    // ArrayList<GuineaPig> list = new ArrayList<>();

    public GuineaPig(){}

    public GuineaPig(String name, String type, int food){
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public int getFood(){
        return food;
    }
    public String getName(){
        return name;
    }

    /* public int totalAmountFoodInListOfPigs(){
        int totalFood = 0;
        for(int i = 0; i < list.size(); i++){
            totalFood = (list.get(i).getFood() + totalFood);
        }
        return totalFood;
    } */

    @Override
    public int compareTo(GuineaPig p) {

        return this.getName().compareToIgnoreCase(p.name);

    }

    public int compareToFood(GuineaPig p) {

        return this.food - p.food;

    }

    public String toString(){
        return name + " " + type + " " + food;
    }
}
