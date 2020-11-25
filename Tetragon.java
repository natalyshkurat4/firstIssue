
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tetragon implements Shape{

    List <Double> array = new ArrayList<>();

    @Override
    public String getName() {
        System.out.println("Четырехугольник");
        return null;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
           for (int i = 0; i < array.size(); i++) {
           perimeter += array.get(i);
        }
        return perimeter;
    }

    @Override
    public void setSizes(int a) {

      boolean flag = false;

      while (flag == false) {
          for (int i = 1 ; i <= a; i++) {
              Scanner in = new Scanner(System.in);
              System.out.println("Введи сторону " + i);
              String side = in.nextLine();
              if (side != null) {
                  if (isNumber(side) && Double.parseDouble(side) > 0) {
                      flag = true;
                      array.add(Double.valueOf(side));
                  } else {
                      System.out.println("Введите положительное число");
                      flag = false;
                      i--;
                  }
              }
          }flag = flag;
      }
    }


      @Override
    public void print() {
        System.out.println(calculatePerimeter());
    }


    public static boolean isNumber(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            System.out.println("Вы ввели не числовое значение");
            return false;
        }
        return true;
    }

    // An example of calculation sum of factorials
 public static void sumFactorial () {

     double sum = 0.0;
     boolean flag = false;

     while (flag == false) {
         Scanner in = new Scanner(System.in);
         System.out.println("Введи число факториалов n : ");
         String side = in.nextLine();
         if (isNumber(side) && Double.valueOf(side) > 1) {

             for (double j = 1; j <= Double.valueOf(side); j++) {
                 sum += getFactorial(j);
             }
             System.out.println("Сумма n факториалов (1/n)! : " + sum);
             flag = true;
         } else {
             System.out.println("Введите значение больше 1");
         } flag = flag;
     }
 }

    public static double getFactorial(double f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return (1.0/f * getFactorial(f - 1));
        }
        }
  }


