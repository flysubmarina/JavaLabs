package ua.nure.fokin.task2;

public class Circle {
    private int x, y;
    double r;

    public Circle(int x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // передвинуть окружность на dx и dy:
    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    // проверить попадание заданной точки внутрь данной окружности:
    public boolean isInside(double x, double y) {
        return ((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y) <= r * r);
    }
    // проверить попадание другой окружности внутрь данной
    public boolean isInside(Circle c) {
        int x = c.x, y = c.y;
        double r = c.r;
        return (isInside(x, y + r) && isInside(x + r, y) && isInside(x, y - r) && isInside(x - r, y));
    }

    // вывести на экран параметры окружности
    public void print() {
        System.out.format("Circle (%d, %d, %.3f)", x, y, r);
    }
    public static void main(String[] args) {
        System.out.println("~~~ c");
        Circle c = new Circle(0, 0, 1);
        c.print();
        System.out.println("\n~~~ c.move(1, 1)");
        c.move(1, 1);
        c.print();
        System.out.println("\n~~~ c.isInside(1, 1)");
        System.out.println(c.isInside(1, 1));
        System.out.println("~~~ c.isInside(10, 1)");
        System.out.println(c.isInside(10, 1));
        System.out.println("~~~ c2");
        Circle c2 = new Circle(1, 1, 2);
        c2.print();
        System.out.println("\n~~~ c.isInside(c2)");
        System.out.println(c.isInside(c2));
        System.out.println("~~~ c2.isInside(c)");
        System.out.println(c2.isInside(c));
    }
}
