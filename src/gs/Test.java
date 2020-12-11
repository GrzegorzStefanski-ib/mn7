package gs;

import static org.junit.jupiter.api.Assertions.*;

class Test {

    double epsilon = 1E-8;

    @org.junit.jupiter.api.Test
    void trapezoidal() {
        double o = Trapezoidal.calculate(0, Math.PI, 100000, (Double x) -> Math.sin(x));
        System.out.println(o);
        assertTrue(Math.abs(o - 2) < epsilon);
    }

    @org.junit.jupiter.api.Test
    void simpson() {
        double o = Simpson.calculate(0, Math.PI, 100000, (Double x) -> Math.sin(x));
        System.out.println(o);
        assertTrue(Math.abs(o - 2) < epsilon);
    }
}