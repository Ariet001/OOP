import java.security.PrivateKey;
import java.util.List;

public class Chaild {
    private String name;
    private int age;

    public Chaild(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chaild{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
