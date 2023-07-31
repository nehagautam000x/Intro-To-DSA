package Conditionals_Loops_switch;
import java.util.*;
public class basicProgram {
    public static void main(String[] args) {
        System.out.println("1. Area Of Circle Java Program\r\n" + //
                "2. Area Of Triangle\r\n" + //
                "3. Area Of Rectangle Program\r\n" + //
                "4. Area Of Square \r\n" + //
                "5. Area Of Parallelogram\r\n" + //
                "6. Area Of Rhombus\r\n" + //
                "7. Area Of Equilateral Triangle\r\n" + //
                "8. Perimeter Of Circle\r\n" + //
                "9. Perimeter Of Equilateral Triangle\r\n" + //
                "10. Perimeter Of Parallelogram\r\n" + //
                "11. Perimeter Of Rectangle\r\n" + //
                "12. Perimeter Of Square\r\n" + //
                "13. Perimeter Of Rhombus\r\n" + //
                "14. Volume Of Cone Java Program\r\n" + //
                "15. Volume Of Prism\r\n" + //
                "16. Volume Of Cylinder\r\n" + //
                "17. Volume Of Sphere\r\n" + //
                "18. Volume Of Pyramid\r\n" + //
                "19. Curved Surface Area Of Cylinder\r\n" + //
                "20. Total Surface Area Of Cube\r\n");
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.print("Enter your choice from above list:- ");
        int num = sc.nextInt();
        switch(num){
            case 1 -> circleArea(sc);
            case 2 -> triangleArea(sc);
            case 3 -> rectArea(sc);
            case 4 -> squareArea(sc);
            case 5 -> ParallelogramArea(sc);
            case 6 -> rhombusArea(sc);
            case 7 -> equilateralArea(sc);
            case 8 -> circlePerimeter(sc);
            case 9 -> equilateralPerimeter(sc);
            case 10 -> parallelogramPeri(sc);
            case 11 -> rectPeri(sc);
            case 12 -> squarePeri(sc);
            case 13 -> rhombusPeri(sc);
            case 14 -> coneVol(sc);
            case 15 -> prismVol(sc);
            case 16 -> cylinderVol(sc);
            case 17 -> sphereVol(sc);
            case 18 -> pyramidVol(sc);
            case 19 -> csaCylinder(sc);
            case 20 -> tsaCube(sc);   
        }
    }
    }
    public static void circleArea(Scanner sc)
    {
        System.out.println("Enter the radius of circle:- ");
        float r = sc.nextFloat();
        System.out.println("Area of circle is:- "+ (Math.PI*r*r));
    }
    public static void triangleArea(Scanner sc)
    {
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        System.out.println("Area of triangle is:- "+(0.5*base*height));
    }
    public static void rectArea(Scanner sc)
    {
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Area of Rectangle is:- " + (l*b));
    }
    public static void squareArea(Scanner sc)
    {
        float side = sc.nextFloat();
        System.out.println("Area of Square is:- " + (side*side));
    }
    public static void ParallelogramArea(Scanner sc)
    {
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Area of Parallelogram is:- "+ (b*h));
    }
    public static void rhombusArea(Scanner sc)
    {
        float d1 = sc.nextFloat();
        float d2 = sc.nextFloat();
        System.out.println("Area of rhombus is: - " + ((1/2)*d1*d2));
    }
    public static void equilateralArea(Scanner sc)
    {
        float a = sc.nextInt();
        System.out.println("Area of Equilateral Triangle is:- "+ ((Math.sqrt(3)/4)*a*a));
    }
    public static void circlePerimeter(Scanner sc)
    {
        float r = sc.nextFloat();
        System.out.println("Perimeter of circle is: -" + (2*Math.PI*r));
    }
    public static void equilateralPerimeter(Scanner sc)
    {
        float side = sc.nextFloat();
        System.out.println("Perimeter of equilateral triangle is:- "+ (3*side));
    }
    public static void parallelogramPeri(Scanner sc)
    {
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of parallelogram is:- " + (2*(b+h)));
    }
    public static void rectPeri(Scanner sc)
    {
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("Perimeter of rectangle is:- " + (2*(l+b)));
    }
    public static void squarePeri(Scanner sc)
    {
        float side = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (4*side));
    }
    public static void rhombusPeri(Scanner sc)
    {
        float side = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (4*side));
    }
    public static void coneVol(Scanner sc)
    {
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (Math.PI*r*r*(h/3)));
    }
    public static void prismVol(Scanner sc)
    {
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (b*h));
    }
    public static void cylinderVol(Scanner sc)
    {
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (Math.PI*r*r*h));
    }
    public static void sphereVol(Scanner sc)
    {
        float r = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (Math.PI*r*r*r*(4/3)));
    }
    public static void pyramidVol(Scanner sc)
    {
        float l = sc.nextFloat();
        float w = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ ((l*w*h)/3));
    }
    public static void csaCylinder(Scanner sc)
    {
        float r = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (2*Math.PI*r*h));
    }
    public static void tsaCube(Scanner sc)
    {
        float a = sc.nextFloat();
        System.out.println("Perimeter of square is:- "+ (6*a*a));
    }
}
