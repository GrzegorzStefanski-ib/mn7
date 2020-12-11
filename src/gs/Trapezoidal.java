package gs;

import java.util.function.Function;

public class Trapezoidal {

    static double calculate(double leftLimit, double rightLimit, int n, Function<Double, Double> f){

        double h = (rightLimit - leftLimit) / n;

        double x = leftLimit;

        double integral = f.apply(x) * 1/2;

        for (int i = 1; i < n; i++) {
            x += h;
            integral += f.apply(x);
        }

        x += h;
        integral += f.apply(x) * 1/2;
        integral *= h;

        return integral;
    }
}
