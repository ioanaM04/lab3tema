import java.util.ArrayList;
/*Gasiti elementele comune din 2 siruri. E.g.
        a={"java","test","university"}
        b={"car,"university","plane"}
        --> university*/

public class TemaLab3ex1 {
    public static void main(String[] args) {
        ArrayList<String>
                list1 = new ArrayList<String>();

        list1.add("java");
        list1.add("test");
        list1.add("university");


        System.out.println("List1: " + list1);


        ArrayList<String>
                list2 = new ArrayList<String>();


        list2.add("car");
        list2.add("university");
        list2.add("plane");


        System.out.println("List2: " + list2);


        ArrayList<String>
                list3 = new ArrayList<String>(list1);

        list3.retainAll(list2);


        System.out.println("Common elements: " + list3);
    }
}