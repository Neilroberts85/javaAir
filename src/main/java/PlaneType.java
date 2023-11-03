public enum PlaneType {
    BOEING737(190, 80000),
    AIRBUSA320(160,70000),
    BOEING777(400,300000),
    AIRBUSA380(700,1200000);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
