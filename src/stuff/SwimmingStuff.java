package stuff;

final public class SwimmingStuff {
    private final String type;

    public SwimmingStuff(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "SwimmingStuff{" +
                "type=" + type +
                '}';
    }
}
