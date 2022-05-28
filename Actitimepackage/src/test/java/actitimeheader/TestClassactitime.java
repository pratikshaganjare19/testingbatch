package actitimeheader;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassactitime {
	public class TestClass {
		@BeforeClass
		public void beforeClass() {
			System.out.println("beforeClass");
		} 
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforemethod");
		}
		@Test
		public void testA() {
			System.out.println("testclass1 A");
		}
		@Test(priority =2)
		public void testB() {
			System.out.println("testclass1 B");
		}
			@Test
			public void testC() {
				System.out.println("testclass1 c");
			}
			//@AfterMethod
			//public void afterMethod() {
				//System.out.println("afterMethod");
			}
			@AfterClass
			public void afterClass() {
				System.out.println("afterClass");
			}
		}



