import java.util.ArrayList;
import java.util.Collection;
public class Listler {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList1.add("Laman");
        arrayList1.add("Mikayilova");
        arrayList2.add(16);
        arrayList2.add(9);
        ArrayList<?> arrayList3 = new ArrayList<>();
        arrayList3=Together(arrayList1,arrayList2);
        System.out.println(arrayList3);
    }
public static ArrayList<?> Together(ArrayList<?> arrayList1,ArrayList<?> arrayList2){
        ArrayList<Object> List3=new ArrayList<>();
        List3.addAll((Collection<?>)arrayList1);
        List3.addAll((Collection<?>)arrayList2);
        return List3;
}}