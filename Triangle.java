

public class Triangle extends Tetragon{

    @Override
    public String getName() {
        System.out.println("Треугольник");
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
