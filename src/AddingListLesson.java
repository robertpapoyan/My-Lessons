import java.util.ArrayList;
import java.util.List;

public class AddingListLesson {
    public static void main(String[] args) {

        //Creating empty list and printing the result
        List<Integer> listX = new ArrayList<>();
        System.out.println(listX);

        listX.add(12);
        listX.add(13);

        //Creating not empty List
        List<Integer> listY = new ArrayList<>(listX);

        System.out.println(listY);
    }
}
