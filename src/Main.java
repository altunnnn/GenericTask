import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyGeneric<Integer> myGeneric = new MyGeneric<>();

        myGeneric.add(23);

        System.out.println(myGeneric.getObj());

        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("AUDIO");
        list.add("Mercedes");
        list.add("Lada");

        Iterator<String> itr = list.iterator();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(itr.next());
        }

        String s = list.remove(0);
        list.get(0);
        System.out.println(s);

        //https://www.digitalocean.com/community/tutorials/java-annotations

    }
}
