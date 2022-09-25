import java.util.*;

public class hw1_1 {
    public static void main(String[] args) {
        Random random = new Random();
        TreeSet<Integer> array = new TreeSet<>();

        while (array.size() < 10) { // 總共10個數字
            int number = random.nextInt(100) + 1; // 1~100
            if(array.contains(number))
                continue;
            array.add(number);
            System.out.printf("第%02d個號碼為: %02d%n",array.size(), number);
        }
        System.out.println("物件內元素個數為: "+ array.size());
        System.out.println("物件內元素的內容: "+ array);
        System.out.println("第一個元素內容為: "+ array.first());
        System.out.println("第十個元素內容為: "+ array.last());
        System.out.print("數字介於30~70者: ");

        SortedSet<Integer> Inrange= new TreeSet<>();
        for(int a:array){
            if(a>=30 && a<=70){
                Inrange.add(a);
            }
        }
        System.out.println(Inrange);
    }
}
