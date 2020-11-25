public class MainShapes {

    public static void main(String[] args) {
        System.out.println("Begin calculation");
        Circle circle = new Circle();
        circle.getName();
        circle.setSizes(1);
        circle.calculatePerimeter();
        circle.print();

        Tetragon tetragon = new Tetragon();
        tetragon.getName();
        tetragon.setSizes(4);
        tetragon.calculatePerimeter();
        tetragon.print();

        Rectangle rectangle = new Rectangle();
        rectangle.getName();
        rectangle.setSizes(2);
        rectangle.calculatePerimeter();
        rectangle.print();

        Rhomb rhomb = new Rhomb();
        rhomb.getName();
        rhomb.setSizes(1);
        rhomb.calculatePerimeter();
        rhomb.print();

        Square square = new Square();
        square.getName();
        square.setSizes(1);
        square.calculatePerimeter();
        square.print();

        Triangle triangle = new Triangle();
        triangle.getName();
        triangle.setSizes(3);
        triangle.calculatePerimeter();
        triangle.print();

       /* Tetragon tetragon = new Tetragon();
        tetragon.sumFactorial(); */

    }
}
