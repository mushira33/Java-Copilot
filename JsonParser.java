import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonParser {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("path/to/json/file.json");
            MyObject myObject = objectMapper.readValue(file, MyObject.class);
            System.out.println(myObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyObject {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}