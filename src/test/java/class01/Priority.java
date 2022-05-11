package class01;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {
    @BeforeClass
    public void beforeAll(){
        System.out.println("First Hw");
    }
    @Test(priority = 3)
    public void FirstTest(){
        System.out.println("1st");
    }

    @Test(priority = 2)
    public void SecondTest(){
        System.out.println("2nd");
    }

    @Test(priority = 1)
    public void ThirdTest(){
        System.out.println("3rd");
    }


}
