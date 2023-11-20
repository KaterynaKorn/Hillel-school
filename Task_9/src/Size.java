public enum Size {

 s("s", 10,10), m("m", 15,15), l("l", 20,20), xl("xl",25,25);
   private String shortName;
   private int width;
   private int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "shortName='" + shortName + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
