public abstract class Staff extends Person{

    private RankType rankType;

    public Staff(String name, RankType rankType) {
        super(name);
        this.rankType = rankType;
    }

    public RankType getRankType() {
        return rankType;
    }
}
