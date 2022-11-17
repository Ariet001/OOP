import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Chaild chaild = new Chaild("asko", 10);
        Chaild chaild1 = new Chaild("kiku", 465);
        Chaild chaild2 = new Chaild("xaxa", 54);
        Chaild chaild3 = new Chaild("kola", 37);
        Chaild[] a = {chaild, chaild1, chaild2, chaild3};
        Parents parents = new Parents("syr", a.length, List.of(a));
        House house = new House(40,"puchkina",parents);

        System.out.println(house);
    }
}