import java.util.ArrayList;

public class Collections {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();

        int num=0;
        list.add(num);

        list.add(20);
        list.add(30);

        System.out.println("List: "+list);

        int first=list.get(0);
        System.out.println("First element: "+first);

    }
}
