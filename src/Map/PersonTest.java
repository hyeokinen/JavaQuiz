package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        while (true) {
            System.out.println("1:입력 2:출력 3:삭제 4:종료");
            int num = scan.nextInt();

            if (num == 1) {
                // 입력
                System.out.print("이름을 입력하세요: ");
                Person person = new Person();
                person.setName(scan.next());
                System.out.print("생년월일을 입력하세요: ");
                person.setYyyymmdd(scan.nextInt());
                boolean isInsert = personList.add(person);
                System.out.println(isInsert ? "입력 성공" : "입력 실패");
            } else if (num == 2) {
                // 출력
                if (personList.isEmpty()) {
                    System.out.println("비어있습니다.");
                    continue;
                }

                //System.out.println(personList);

                Iterator<Person> iter = personList.iterator();
                while (iter.hasNext()) {
                    Person person = iter.next();
                    // System.out.println("이름: " + person.getName() + ", 생년월일:" + person.getYyyymmdd());

                    // Person의 toString을 오버라이드하면 객체이름만 출력해도 예쁘게 출력된다.
                    System.out.println(person);
                }
            } else if (num == 3) {
                // 삭제
                System.out.print("삭제할 사람의 이름을 입력하세요: ");
                String deleteName = scan.nextLine();
                Iterator<Person> iter = personList.iterator();
                while (iter.hasNext()) {
                    Person person = iter.next();
                    if (person.getName().equals(deleteName)) {
                        iter.remove();
                    }
                }
            } else if (num == 4) {
                // 종료
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }


}
