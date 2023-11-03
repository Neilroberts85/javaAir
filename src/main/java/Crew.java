public abstract class Crew extends Person{

    private RankType rankType;

    public Crew(String name, RankType rankType) {
        super(name);
        this.rankType = rankType;
    }

    public RankType getRankType() {
        return rankType;
    }
}
