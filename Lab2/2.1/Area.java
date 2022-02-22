public class Area {
    public static void rectangle(){

        int width = 5;
        int height = 4;
        int area;

        area = width * height;

        System.out.println(area);

    }
    public static void triangle(){

        double base = 10.5;
        double height = 8;
        double area;

        area = 0.5 * base * height;

        System.out.println(area);

    }
    public static void circle(){

        final double pi = 3.14;
        double diameter = 25;
        double radius;
        double area;

        radius = diameter / 2;

        area = pi * Math.pow(radius, 2);

        System.out.println(area);

    }
    public static void main(String[] args) {
        rectangle();
        triangle();
        circle();
    }
}
