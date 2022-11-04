package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<String> fruits = new ArrayList<>();

        Iterator<String> iter = fruits.iterator();

        while (true){
            System.out.println("1:입력 2:출력 3:삭제 4:종료");
            int select = scan.nextInt();
            // 예외처리
            if(select > 4 || select < 1){
                System.out.println("잘못 입력하셨습니다.");
            }

            if (select == 4){
                System.out.println("종료합니다.");
                break;
            }

            if (select == 1){
                System.out.println("과일 이름을 입력하세요.");
                String fruit = scan.next();
                fruits.add(fruit);
            }

            if (select == 2){
                System.out.println(fruits);
            }

            if (select == 3){
                System.out.println("삭제할 과일의 이름을 입력하세요.");
                String test = scan.next();
                fruits.remove(test);

            }




        }
    }

}
