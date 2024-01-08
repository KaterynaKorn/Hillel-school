import org.example.QuadraticEquations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquationsTest
{

    @Test
    public void twoRootsTest(){
        double firstRoot = 1;
        double secondRoot = -3;

        List<Double> expectedRoots = new ArrayList<>();
        expectedRoots.add(firstRoot);
        expectedRoots.add(secondRoot);
        System.out.println(expectedRoots);

        QuadraticEquations roots = new QuadraticEquations(1, 2, -3);
        List<Double> actualResult = roots.quadraticEquations();

        Assert.assertEquals(expectedRoots, actualResult);

    }

    @Test
    public void oneRootTest(){
        double firstRoot = -1;

        List<Double> expectedRoots = new ArrayList<>();
        expectedRoots.add(firstRoot);
        System.out.println(expectedRoots);

        QuadraticEquations roots = new QuadraticEquations(1, 2, 1);
        List<Double> actualResult = roots.quadraticEquations();

        Assert.assertEquals(expectedRoots, actualResult);
    }

    @Test
    public void noRootTest(){
        QuadraticEquations roots = new QuadraticEquations(1, 2, 14);
        List<Double> actualResult = roots.quadraticEquations();
        Assert.assertTrue(actualResult.isEmpty());
    }


}
