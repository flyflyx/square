import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.sqrt;

/**
 * Created by admin on 26.05.2017.
 */
public class Square {
    private static final Logger logger= LoggerFactory.getLogger(Square.class);

    public static void main(String[] args) {
        logger.info("qqq");
    }

    public static double[] solve(double a, double b, double c)
    {
        double d=b*b-4*a*c;
        if ( d==0)
        {
            double x = (sqrt(d)-b)/(2*a);
            return new double[]{x};
        }
            if (d>0)
        {
            double x1 = (sqrt(d)-b)/(2*a);
            double x2 = (-sqrt(d)-b)/(2*a);
            return new double[]{x1,x2};
        }
        if(d<0)
            return new double[0];
        return new double[0];
    }
}
