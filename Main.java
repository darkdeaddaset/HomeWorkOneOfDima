import com.savin.one.book.Author;
import com.savin.one.book.Book;
import com.savin.one.circle.Circle;
import com.savin.two.ball.Ball;
import com.savin.two.ball.Container;
import com.savin.two.complex.MyComplex;
import com.savin.one.employee.Employee;
import com.savin.one.mypoint.MyPoint;
import com.savin.one.rectangle.Rectangle;
import com.savin.one.triangle.Triangle;
import com.savin.two.polinom.MyPolynomial;

public class Main {
    public static void main(String[] args){
        /*testCircle();
        testRectangle();
        testEmployee();
        testBook();
        testPoint();
        testTriangle();
        testComplex();
        testPolynomial();
        testBall();*/
    }

    private static void testCircle(){
        System.out.println("===Circle===");

        Circle circle = new Circle();
        Circle circle1 = new Circle(5d);

        System.out.println("Radius: " + circle.getRadius());
        circle.setRadius(10d);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Color: " + circle.getColor());
        circle.setColor("Black");
        System.out.println("Color: " + circle.getColor());
        System.out.println(circle.toString());

        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Color: " + circle1.getColor());
        circle1.setColor("White");
        System.out.println("Color: " + circle1.getColor());
        System.out.println(circle1.toString());
        System.out.println("=========================");
    }
    private static void testRectangle(){
        System.out.println("===Rectangle===");

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());
        rectangle.setLength(5f);
        rectangle.setWidth(10f);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        System.out.println("=========================");
    }
    private static void testEmployee(){
        System.out.println("===Employee===");

        Employee employee = new Employee(1, "Test", "Testovich", 5000);
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(15));
        System.out.println(employee.toString());

        System.out.println("=========================");

    }
    private static void testBook(){
        System.out.println("===Book===");

        Author[] authors = {new Author("Dima", "jsadkjal", 'm'),
                new Author("Dmitri", "jdaks", 'm'),
                new Author("Ditrich", "tkmorm", 'm')};

        Author author = new Author("Test", "test@testing.com", 'm');
        Book book = new Book("Alice in the Strange World", authors, 15, 5);

        System.out.println(book.getAuthorNames());
        System.out.println(book.getAuthors());
        System.out.println(book.getName());
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        book.setPrice(1000);
        book.setQty(9);
        System.out.println(book.getPrice());
        System.out.println(book.getQty());
        System.out.println(book.toString());

        System.out.println("===Author===");

        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setName("Alex");
        author.setEmail("alex@testing.com");
        author.setGender('m');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());

        System.out.println("=========================");
    }
    private static void testPoint(){
        System.out.println("===MyPoint===");

        MyPoint point = new MyPoint();
        point.setXY(2,2);

        int[] mas = point.getXY();
        for (int i : mas){
            System.out.println(i);
        }

        MyPoint point1 = new MyPoint(5,5);
        int[] mas1 = point1.getXY();
        for (int i : mas1){
            System.out.println(i);
        }

        System.out.println(point.distance(2,3));
        System.out.println(point.distance(point1));
        System.out.println(point.distance());

        System.out.println("=========================");
    }
    private static void testTriangle(){
        System.out.println("===Triangle===");

        com.savin.one.triangle.MyPoint myPoint = new com.savin.one.triangle.MyPoint(10,2);
        System.out.println(myPoint.getX());
        System.out.println(myPoint.getY());

        com.savin.one.triangle.MyPoint myPoint1 = new com.savin.one.triangle.MyPoint(3,46);
        com.savin.one.triangle.MyPoint myPoint2 = new com.savin.one.triangle.MyPoint(57,6);

        Triangle triangle = new Triangle(1,1,1,2,2,2);
        System.out.println(triangle.toString());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());

        Triangle triangle1 = new Triangle(myPoint, myPoint1, myPoint2);
        System.out.println(triangle1.toString());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());

        Triangle triangle2 = new Triangle(1,1,1,1,1,1);
        System.out.println(triangle2.getType());

        System.out.println("=========================");
    }
    private static void testComplex(){
        System.out.println("===Complex===");

        MyComplex myComplex = new MyComplex(2, 7);
        MyComplex myComplex1 = new MyComplex(0,0);

        MyComplex myComplex2 = myComplex.addNew(myComplex1);
        System.out.println(myComplex2.toString());
        MyComplex myComplex3 = myComplex.subtractNew(myComplex1);
        System.out.println(myComplex3.toString());

        System.out.println(myComplex.equals(myComplex1));
        System.out.println(myComplex.equals(2,7));

        System.out.println(myComplex1.toString());
        System.out.println(myComplex1.magnitude());
        System.out.println(myComplex1.argument());

        myComplex1 = myComplex1.add(myComplex);
        System.out.println(myComplex1.toString());
        myComplex1.multiply(myComplex);
        System.out.println(myComplex.toString());
        System.out.println(myComplex.conjugate());

        System.out.println("=========================");
    }
    private static void testPolynomial(){
        System.out.println("===Polynomial===");

        MyPolynomial myPolynomial = new MyPolynomial(1,2,3,4,5,6,7,8,9);
        MyPolynomial myPolynomial1 = new MyPolynomial(9,8,7,6,5,4,3,2,1);
        MyPolynomial myPolynomial2 = new MyPolynomial();
        System.out.println(myPolynomial.toString());
        System.out.println(myPolynomial1.toString());

        myPolynomial2 = myPolynomial.add(myPolynomial1);
        System.out.println(myPolynomial2.toString());
        myPolynomial2 = myPolynomial.multiply(myPolynomial1);
        System.out.println(myPolynomial2.toString());

        System.out.println("=========================");
    }
    private static void testBall(){
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        System.out.println(box.toString());

        for (int i = 0; i < 100; ++i) {
            ball.move();
            System.out.println(ball);
            System.out.println(box.collides(ball));
        }
    }
}
