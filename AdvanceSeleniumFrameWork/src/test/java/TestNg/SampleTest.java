//package TestNg;
//
//import org.testng.annotations.Test;
//
//public class SampleTest {
////	@Test(priority = -1)
//	//@Test
//	@Test(invocationCount = 2)
//	public void contactCreated() {
//		System.out.println("contactCreated");
//		
//	}
//
////	@Test(priority = 0)
//	@Test(dependsOnMethods = "contactCreated")
//	//@Test(enabled = false)
//	public void contactDeleted() {
//		System.out.println("contactDeleted");
//		
//	}
//	
////	@Test(priority = 1)
//	@Test(dependsOnMethods = "contactCreated")
//	public void contactModified() {
//		System.out.println("contactDeleted");
//		
//	}
//}



//to execute a single class in maven
//mvn -Dtest=createCampaignTest test