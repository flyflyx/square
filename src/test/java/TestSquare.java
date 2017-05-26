import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin on 26.05.2017.
 */
public class TestSquare {
    @Test
    public void test0(){
        double [] x=Square.solve(1,0,1);
        Assert.assertEquals(x.length,0);
    }
    @Test
    public void test1(){
        double [] x=Square.solve(1,-2,1);
        double [] expected = {1};
        Assert.assertArrayEquals(x,expected,1e-8);
    }
    @Test
    public void test2(){
        double [] x=Square.solve(1,-5,6);
        double [] expected = {3,2};
        Assert.assertArrayEquals(x,expected,1e-8);
    }

}
