package stuff;

final public class SwimmingPool {
    private final int depth;
    private final int width;
    private final int length;

    public SwimmingPool(int depth,
                        int width,
                        int length){
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
