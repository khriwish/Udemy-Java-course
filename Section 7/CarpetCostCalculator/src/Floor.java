public class Floor {

    private double width;
    private double length;


    public Floor(double width, double height) {

        if (width < 0) {
            this.width = 0;
            this.length = height;
            return;
        } else if (height < 0) {
            this.length = 0;
            this.width = width;
            return;
        } else if (width < 0 && height < 0) {
            this.width = 0;
            this.length = 0;
            return;
        }

        this.width = width;
        this.length = height;
    }

    public double getArea() {
        return width * length;
    }

}
