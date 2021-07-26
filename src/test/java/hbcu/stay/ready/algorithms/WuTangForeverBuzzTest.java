package hbcu.stay.ready.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class WuTangForeverBuzzTest {

    @Test
    public void wuTangClanTestOne(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n";
        String actual = wuTangForeverBuzz.wuTangClan(15);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wuTangClanTestTwo(){
        WuTangForeverBuzz wuTangForeverBuzz = new WuTangForeverBuzz();

        String expected = "1\n2\nWu\n4\nTang\nWu\n7\n8\nWu\nTang\n11\nWu\n13\n14\nWuTang Forever\n16\n17\nWu\n19\nTang\nWu\n22\n23\nWu\nTang\n26\nWu\n28\n29\nWuTang Forever\n31\n32\nWu\n34\nTang\nWu\n37\n38\nWu\nTang\n";
        String actual = wuTangForeverBuzz.wuTangClan(40);

        Assert.assertEquals(expected,actual);
    }

}
