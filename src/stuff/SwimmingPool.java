package stuff;

final public class SwimmingPool {
    private final String name;
    private final int depth;
    private final int width;
    private final int length;
    private final String adress;

    public SwimmingPool(String name,
                        int depth,
                        int width,
                        int length,
                        String adress){

        this.name = name;
        this.depth = depth;
        this.width = width;
        this.length = length;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\tSwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", adress=" + adress +
                '}';
    }
}
