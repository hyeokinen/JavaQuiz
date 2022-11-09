package Thread;

public class ThreadTest {

    public static void main(String[] args) throws InterruptedException {
        /**
         * 쓰레드 만들기(1): Thread 클래스를 상속받아서 사용한다.
         * 단점: 자바는 단일상속이므로 Thread를 상속받으면 다른 클래스를 함께 상속받을 수 없다.
         */
        ThreadExtends te1 = new ThreadExtends("●");
        ThreadExtends te2 = new ThreadExtends("○");

        // Single Thread : 순차적으로 수행
        //te1.run();
        //te2.run();

        // Multi Thread : 각각의 쓰레드가 동시에 수행 (start 메소드를 써야 한다.)
        // 속도가 빨라서 싱글쓰레드처럼 보임. sleep을 추가해야 한다.
        //te1.start();
        //te2.start();

        /**
         * 쓰레드 만들기(2): Runnable 인터페이스를 구현해서 사용한다.
         * 다중 상속이 가능해진다.
         * 단점: 멀티쓰레드를 위해서 Thread 객체에 담아서 사용해야 한다.
         */
        ThreadImplements ti1 = new ThreadImplements("★");
        ThreadImplements ti2 = new ThreadImplements("☆");

        // Single Thread
        //ti1.run();
        //ti2.run();

        // Multi Thread
        Thread th1 = new Thread(ti1);
        Thread th2 = new Thread(ti2);
        th1.start();
        //th1.join(); // th1 쓰레드가 끝날 때까지 (메인쓰레드가) 기다린다.
        th2.start();
        System.out.println("메인쓰레드");

        /**
         * join을 사용하는 이유
         * 메인쓰레드를 출력하는 것은 쓰레드와 관련없이 바로 출력하고
         * 메인쓰레드2는 쓰레드가 모두 수행된 후에 수행되도록 하고 싶으면 join을 건다.
         */
        th2.join();   // th2 쓰레드가 끝날 때까지 (메인쓰레드가) 기다린다.
        System.out.println("메인쓰레드2");
    }

}