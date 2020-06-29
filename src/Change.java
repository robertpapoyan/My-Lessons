import java.util.ArrayList;
import java.util.List;

public class Change {


    private List <Integer> listA,listR,list2;


//    public Removve(List<Integer> listX) {
//        this.listX = listX;
//    }

    public void addElements(List<Integer> listA) {
        for (int i = 0; i < 10; i++) {
            int a = i * i;
            listA.add(a);
        }

        System.out.println(listA);
    }

//    public void removeElements(List<Integer> listR, List<Integer> list2){
//
//        if (listR.contains(list2)){
//            listR.removeAll(list2);
//            System.out.println(listR);
//            System.out.println("a");
//        } else {
//            System.out.println(listR);
//        }
//    }

}
