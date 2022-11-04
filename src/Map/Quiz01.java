package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Quiz01 {

    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("유재석", "X");
        name.put("박나래", "X");
        name.put("이지은", "X");
        name.put("서장훈", "X");
        name.put("이광수", "X");

        Iterator<String> iterMap = name.keySet().iterator();
        while (iterMap.hasNext()){
            String key = iterMap.next();
            if(key.startsWith("이")){
                name.put(key, "O");
            }
        }
        System.out.println(name);
    }

}
