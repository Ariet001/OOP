public class House {
    private int number;
    private String adres;
    Parents parents;

    public House(int number, String adres, Parents parents) {
        this.number = number;
        this.adres = adres;
        this.parents = parents;
    }

    @Override
    public String toString() {
        return "House{" +
                "number=" + number +
                ", adres='" + adres + '\'' +
                ", parents=" + parents +
                '}';
    }
}
