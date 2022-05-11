package class02;

import org.testng.annotations.*;

public class Testing {

@BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuitttt");
    }
@AfterSuite
    public void afterSuit(){
        System.out.println("AfterSuittttt");
    }

    @BeforeTest
       public void beforeTest(){ System.out.println("Before Test :)");}
    @AfterTest
       public void afterTest(){
     System.out.println("After Test :)");
 }


        @BeforeClass
          public void beforeClass(){ System.out.println("I am before class method");}

        @AfterClass
          public void afterClass(){System.out.println("I am after class method");}

    @BeforeMethod
    public void before(){
        System.out.println("This is my before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("This is my after method");
    }

    @Test(groups = "smoke")
    public void Test(){
        System.out.println("driver me crazy, drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("driver me to sanity, driver me to hell");
    }
}
