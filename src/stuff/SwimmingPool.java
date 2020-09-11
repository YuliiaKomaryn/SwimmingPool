package stuff;

final public class SwimmingPool {
    private final String name;
    private final int depth;
    private final int width;
    private final int length;

    public SwimmingPool(String name,
                        int depth,
                        int width,
                        int length){

        this.name = name;
        this.depth = depth;
        this.width = width;
        this.length = length;
    }


    @Override
    public String toString() {
        return "SwimmingPool{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }
}
