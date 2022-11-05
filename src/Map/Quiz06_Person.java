package Map;

public class Quiz06_Person {
    String name;
    int birth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Quiz06_Person{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}


