package model;

public final class Training {
    private final int length;

    Training(int length) {
        this.length = length;
    }

    public int getType() {
        return length;
    }

    @Override
    public String toString() {
        return "Training{" +
                "length=" + length +
                '}';
    }
}
