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
        System.out.println("/////////////");

        //Changing value of list element(with  particular index)
        listY.set(0, listX.get(1));
        listY.set(1, listX.get(0));

        System.out.println(listX);
        System.out.println(listY);

        //Mixing 2 lists into new one
        System.out.println("Session of Z list");
        List<Integer> listZ = new ArrayList<>();
        System.out.println(listZ);
        listZ.addAll(listY);
        System.out.println(listZ);
        listZ.add(listX.get(0) + listY.get(1));
        System.out.println(listZ);

        if (listY.contains(4)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        listX.clear();
        System.out.println("listX is " + listX);


        System.out.println(listZ.size());
        listZ.remove(listZ.size() - 1);
        System.out.println(listZ.size());

    }
}
