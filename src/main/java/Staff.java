public abstract class Staff extends Person{

    private String rank;

    public Staff(String name, String rank) {
        super(name);
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
