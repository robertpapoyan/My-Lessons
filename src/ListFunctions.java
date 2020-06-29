import java.util.ArrayList;
import java.util.List;

public class ListFunctions {
    public static void main(String[] args) {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();
        Change change = new Change();

        listX.add(12);
        listX.add(13);

        System.out.println(listX);
        System.out.println(listY);

        listY.add(9);
        listY.add(16);

        change.addElements(listX);
        listX.remove(listY);
        System.out.println(listY);


    }
}
