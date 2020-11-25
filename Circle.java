import java.util.Scanner;

public class Circle implements Shape{

    private double radiusOfCircle;

    @Override
    public String getName() {
        System.out.println("Окружность");
        return null;
    }

    @Override
    public double calculatePerimeter() {
        return  2 * 3.14 * radiusOfCircle;
     }

    @Override
    public void setSizes(int a) {

        Scanner in = new Scanner(System.in);
        boolean flag = false;

              while (flag == false) {
                System.out.println("Введи радиус: ");
                String radius = in.nextLine();
                if (radius != null) {
                    if (Tetragon.isNumber(radius) && Double.valueOf(radius) > 0) {
                        flag = true;
                       radiusOfCircle = Double.valueOf(radius);
                    } else {
                        System.out.println("Введите положительное число");
                        flag = false;
                    }
                }

                flag = flag;
            }

    }
    @Override
    public void print() {
        System.out.println(calculatePerimeter());
    }
}
