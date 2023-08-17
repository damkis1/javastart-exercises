package zadania.dziedziczenie.zadaniejeden;

class Tire extends Part {
    private int width;
    private int size;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()  + "Tire{" +
                "width=" + width +
                ", size=" + size +
                '}';
    }
}
