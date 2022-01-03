package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AlgoProblem1Test {

    @Test
    public void testOne(){
        AlgoProblem1 algoProblem1 = new AlgoProblem1();

        String expected = "1\n2\n3\n4\n5\n";
        String actual = algoProblem1.count(5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem1 algoProblem1 = new AlgoProblem1();

        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        String actual = algoProblem1.count(10);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem1 algoProblem1 = new AlgoProblem1();

        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n16\n17\n18\n19\n20\n21\n22\n23\n24\n25\n26\n27\n28\n29\n30\n31\n32\n33\n34\n35\n36\n37\n38\n39\n40\n";
        String actual = algoProblem1.count(40);

        Assertions.assertEquals(expected,actual);
    }



}
