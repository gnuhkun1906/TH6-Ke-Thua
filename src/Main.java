import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("<-----SHAPE------>");
        Shape shape = new Shape();
        System.out.println(shape);
        shape=new Shape("red",false);
        System.out.println(shape);

        System.out.println("<------Circle------->");
        Circle circle=new Circle();
        System.out.println(circle);

        circle=new Circle(3.5);
        System.out.println(circle);

        circle=new Circle("indigo",false,3.5);
        System.out.println(circle);

        System.out.println("<------Rectangle------->");
        Rectangle rec=new Rectangle();
        System.out.println(rec);

        rec=new Rectangle(2.3,5.8);
        System.out.println(rec);

        rec=new Rectangle("orange",true,2.3,5.8);
        System.out.println(rec);

        System.out.println("<-----Square------>");
        Square square=new Square();
        System.out.println(square);

        square =new Square(2.3);
        System.out.println(square);

        square=new Square("yellow",true,5.8);
        System.out.println(square);
    }
}
