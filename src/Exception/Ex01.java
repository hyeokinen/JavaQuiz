package Exception;

public class Ex01 {

    public static void main(String[] args) {
        /**
         * 예외처리(Exception): 예상치 못한 상황에 대한 처리를 하는 것
         * try - catch - finally
         */

        try {
            // NPE
//			String str = null;
//			System.out.println(str.isEmpty());

            // 배열 범위 참조 예외
//			int[] arr = new int[3];
//			for (int i = 0; i <= arr.length; i++) {
//				arr[i] = i;
//				System.out.println(arr[i]);
//			}

            // 캐스팅 예외
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (NullPointerException npe) {
            System.out.println("NPE가 발생했다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 참조 오류 발생했다.");
        } catch (Exception e) {
            System.out.println("모든 예외를 다 잡는다.");
        } finally {
            System.out.println("예외든 아니든 무조건 불려진다.");
        }

        System.out.println("수행 끝");

//        a();
    }

    public static void a() throws Exception {
        b();
    }

    public static void b() throws Exception { // throws: 나를 부른 상위 메소드에게 익셉션을 던져줌(회피)
        // 예외 발생!!!
        // 처리방법 2가지
        // 1. try-catch로 처리한다.(내가 처리 하겠다)
        // 2. 난 모르겠고, 위에서 처리해(회피 - 니가 해라)

        // 예외 발생 시키는 법
        //+ 런타임 익셉션 먼저 설명
        //throw new RuntimeException();  // unchecked Exception이라 바로 프로그램이 종료된다.
        throw new Exception(); // throw: 예외 발생 시키는 코드

    }

}
