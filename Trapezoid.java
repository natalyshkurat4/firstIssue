import java.util.Scanner;

public class Trapezoid extends Tetragon {



    @Override
    public String getName() {
        System.out.println("Трапеция");
        return null;
    }

    @Override
    public double calculatePerimeter() {
       return super.calculatePerimeter();
    }

    @Override
    public void setSizes(int a) {
     super.setSizes(a);
    }

    @Override
    public void print() {
        System.out.println(calculatePerimeter());
    }
}
