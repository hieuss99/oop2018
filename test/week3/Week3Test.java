package week3;
import static org.junit.Assert.*;
import org.junit.Test;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        Assert.assertEquals(4, Week3.max(2,4));
        Assert.assertEquals(27, Week3.max(10,27));
        Assert.assertEquals(270, Week3.max(30,270));
        Assert.assertEquals(6789, Week3.max(1245,6789));
        Assert.assertEquals(2730, Week3.max(10,2730));    
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinofarray(){
        int a1[]={2,4,3,1},a2[]={10,27,30},a3[]={18,57,30,65,78};
        int a4[]={12,35,3,13,7}, a5[]={52,102,27,28};
        Assert.assertEquals(1,Week3.MinOfArray(a1));
        Assert.assertEquals(10,Week3.MinOfArray(a2));
        Assert.assertEquals(18,Week3.MinOfArray(a3));
        Assert.assertEquals(3,Week3.MinOfArray(a4));
        Assert.assertEquals(27,Week3.MinOfArray(a5));        
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMU(){
        Assert.assertEquals("Thieu can", Week3.calculateBMI(36.2,1.45));
        Assert.assertEquals("Binh thuong", Week3.calculateBMI(52,1.63));
        Assert.assertEquals("Thua can", Week3.calculateBMI(57.5,1.53));
        Assert.assertEquals("Beo phi", Week3.calculateBMI(80,1.67));
        Assert.assertEquals("Thieu can", Week3.calculateBMI(47.2,1.65));        
    }
}
