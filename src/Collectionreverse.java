import java.util.Arrays;
import java.util.List;

public class Collectionreverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        System.out.println(list);
        System.out.println(reverse(list));

    }
    public static List<Integer> reverse(List<Integer>myList){
        for(int i=0;i<=myList.size()/2;i++){
            Integer num1 = myList.get(i);
            Integer num2 = myList.get(myList.size()-1-i);
            Integer num3 = num1;
            num1 =num2;
            num2 = num3;
        }
return myList;

    }
}
