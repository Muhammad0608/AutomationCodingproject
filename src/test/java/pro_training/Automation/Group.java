package pro_training.Automation;

import org.testng.annotations.Test;

public class Group {
  @Test(groups= {"Function"})
  public void test1() {
	  System.out.println("This is belongs test1");
  }
  @Test(groups= {"Regression","Sdanit"})
  public void test2() {
	  System.out.println("This belongs to regression and sdanit");
  }
  @Test(groups= {"Regression"})
  public void test3() {
	  System.out.println("This belongs to regression");
  }
  @Test(groups= {"Sdanit"})
  public void test4() {
	  System.out.println("This belongs to Sdanit");
  }
}
