package Map;

public class Person {
    private String name;
    private int yyyymmdd;

    public String getName() {
        return name;
    }
    public int getYyyymmdd() {
        return yyyymmdd;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYyyymmdd(int yyyymmdd) {
        this.yyyymmdd = yyyymmdd;
    }

    @Override
    public String toString() {
        return "이름: " + this.name + ", 생년월일:" + this.yyyymmdd;
    }
}
