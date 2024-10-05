public class Wall {


    private double width;
    private double height;

    public double getArea(){
        return width * height;
    }

    public Wall() {
        this(0.0, 0.0);
    }

    public Wall(double width, double height) {
        if (width < 0 && height < 0) {
            this.width = 0;
            this.height = 0;
            return;
        } else if (width < 0) {
            this.width = 0;
            this.height = height;
            return;
        } else if (height < 0) {
            this.height = 0;
            this.width = width;
            return;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

}
