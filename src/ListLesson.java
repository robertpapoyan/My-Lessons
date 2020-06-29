import java.util.ArrayList;
import java.util.List;

public class ListLesson {

    public static void main(String[] args) {

        //List creation syntax:
        List <Integer>  list0 = new ArrayList<>();

        //Adding elements into the list:
        list0.add(1);
        list0.add(2);

        System.out.println(list0);
        System.out.println("Currently the size of the list is " + list0.size());

        //Getting getting value of List element with index 0
        int x = list0.get(0);
        int xIndex = 0;
        System.out.println(x + " is the value of the listItem with index " + xIndex);

        int y = list0.get(1);
        int yIndex = 1;
        System.out.println(y + " is the value of the listItem with index " + yIndex);

        list0.add(x + y);
        int z = list0.get(list0.size() - 1);
        int zIndex = list0.size() - 1;

        System.out.println(z + " is the value of the listItem with index " + zIndex);

        System.out.println("Now the size of the index is " + list0.size());
        System.out.println("The elements of the list are " + list0);
    }
}
