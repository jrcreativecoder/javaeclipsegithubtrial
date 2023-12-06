package okul2;

public class QuadraticEquation {
	
	private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }
    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; 
        } else {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);

        double discriminant = equation.getDiscriminant();
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();

        System.out.println("Discriminant: " + discriminant);
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }

}
