import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer>  catArrayLIst= new ArrayList<>();
        Cat cat = new Cat("Koshka",2);
        Cat cat2 = new Cat("Koshka",1);

        catArrayLIst.add(cat);
        catArrayLIst.add(cat2);

        findByName(catArrayLIst,"koshka");
        findByAge(catArrayLIst,3);

    }
    private static void FindByName(ArrayList<Cat>cats,String name){
        for (int i = 0; i <cats.size() ; i++) {
            if (cats.get(i).getName() == name){
                System.out.println(cats.get(i));
            }else{
                System.out.println("jok");
            }

        }
    }
    public static void findByAge(ArrayList<Cat> ArrayList,int age){
        for(Cat cat: ArrayList){
            if(cat.getAge()==age){
                System.out.println(age);
            }
        }
    }



}