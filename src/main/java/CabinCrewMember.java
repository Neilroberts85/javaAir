public class CabinCrewMember extends Crew {


    public CabinCrewMember(String name, RankType rankType) {
        super(name, rankType);
    }
    public String speak(){
        return "Hello, Im " + getName() + " and ill be your " + getRankType().getRank();
    }
}

