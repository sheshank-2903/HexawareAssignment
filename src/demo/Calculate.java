package demo;
public class Calculate implements SInterest, AreaOfCircle, AreaOfRectangle, PerimeterOfCircle 
{
    double sI, arC, arR, prC, p, r, l, b;

    public void si(double p,double r,double t) 
    {
        sI = (p * r * t) / 100;
        System.out.println("Simple Interest Is = "+ sI);
    }

    public void aoc(double r) 
   {
        arC = 3.14 * r * r;
        System.out.println("Area of Circle Is = "+ arC);
    }

    public void aor(double l,double b) 
   {
       arR = l * b;
       System.out.println("Area of Rectangle Is = "+ arR);
    }

    public void poc(double r) 
   {
        prC = 2 * 3.14 * r;
        System.out.println("Perimeter of Circle Is = "+ prC);
    }

    public static void main(String args[]) 
    {
        Calculate c = new Calculate();

        System.out.println("Press 1 for Simple Interest");
        System.out.println("Press 2 for Area of Circle");
        System.out.println("Press 3 for Area of Rectangle");
        System.out.println("Press 4 for Perimeter of Circle");

        int n = Integer.parseInt(args[0]);  

        if (n == 1) {
            c.si(Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]));
        } else if (n == 2) {
            c.aoc(Double.parseDouble(args[1]));
        } else if (n == 3) {
            c.aor(Double.parseDouble(args[1]),Double.parseDouble(args[2]));
        } else if (n == 4) {
            c.poc(Double.parseDouble(args[0]));
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
