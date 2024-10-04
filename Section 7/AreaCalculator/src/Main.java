public class Main {

    public static void main(String[] args) {
        area(5,4);



    }

    public static double area(double radius) {
        double area;
        if(radius < 0){
            System.out.println("radius is negative");
            return -1;
        }
        area = Math.PI * radius * radius;
        System.out.println("area of the circle is " + area);
        return area;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0){
            return  -1;
        }
        double area = x*y;
        System.out.println("area of the rectangle is " + area);
        return area;
    }


}
