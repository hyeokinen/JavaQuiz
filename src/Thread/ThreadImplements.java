package Thread;

public class ThreadImplements implements Runnable {
    private String resource;

    public ThreadImplements(String resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        // resource를 10번 출력하기
        for (int i = 0; i < 10; i++) {
            try {
                // 0.5초씩 쉬면서 찍는다.
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.resource);
        }
    }

}