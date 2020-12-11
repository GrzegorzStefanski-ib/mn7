package gs;

import java.util.function.Function;

public class Simpson {

    static double calculate(double leftLimit, double rightLimit, int n,
                            Function<Double, Double> f){

        double h = (rightLimit - leftLimit) / n;

        double x = leftLimit;

        double integral = f.apply(x);
        double integralTemp = 0;

        x += h;
        for (int i = 1; i < n / 2; i++) {
            x += 2 * h;
            integralTemp += f.apply(x);
        }

        integral += 4 * integralTemp;

        integralTemp = 0;
        x = leftLimit + 2 * h;

        for (int i = 1; i < n / 2; i++) {
            x += 2 * h;
            integralTemp += f.apply(x);
        }

        integral += 2 * integralTemp;

        x += h;
        integral += f.apply(x);
        integral *= h/3;

        return integral;
    }
}
