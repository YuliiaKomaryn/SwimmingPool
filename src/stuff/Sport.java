package stuff;

final public class Sport {
    private final String type;

    public Sport(String type) {
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
