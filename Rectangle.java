import java.util.Scanner;

public class Rectangle extends Tetragon{

    @Override
    public String getName() {
        System.out.println("Прямоугольник");
        return null;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter() *2;
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
