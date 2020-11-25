import java.util.Scanner;

public class Rhomb extends Tetragon {

    double rhombSide = 0;

    @Override
    public String getName() {
        System.out.println("Ромб");
        return null;
    }

    @Override
    public double calculatePerimeter() {
        return super.calculatePerimeter()*4;
    }

    @Override
    public void setSizes(int a) {
       super.setSizes(a);
    }


     @Override
     public void print () {
        System.out.println(calculatePerimeter());
     }
    }

