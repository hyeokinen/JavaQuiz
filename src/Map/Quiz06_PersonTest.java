package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Quiz06_PersonTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Quiz06_Person> personList = new ArrayList<>();

        while (true){
            System.out.println("1:입력 2:출력 3:삭제 4:종료");
            int select = scan.nextInt();


            if(select == 1){
                Quiz06_Person person = new Quiz06_Person();

                System.out.println("이름을 입력하세요.");
                person.setName(scan.next());
                System.out.println("생년월일을 입력하세요.");
                person.setBirth(scan.nextInt());
                boolean test = personList.add(person);
                System.out.println(test ? "입력성공" : "입력실패");

            }
            else if(select == 2){
                if (personList.isEmpty()){
                    System.out.println("비어있습니다.");
                    continue;
                }
                Iterator<Quiz06_Person> iter = personList.iterator();
                Quiz06_Person person = iter.next();
//                System.out.println("이름: " + person.getName()+ " 생일: " + person.getBirth());
                System.out.println(person);
            }

            if(select == 3){

            }
            if(select == 4){
                System.out.println("종료합니다.");
                break;

            }

        }




    }
}
