//package TestNg;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class HardAssetMrthods {
//	
//	@Test
//	public void m1() {
//		int act = 10;
//		int exp = 20;
//		Assert.assertEquals(act, exp);
//		System.out.println("Assertion executed");
//	}
//	
//
//	@Test
//	public void m2() {
//		int act = 10;
//		int exp = 10;
//		Assert.assertEquals(act, exp, "not equal, assertion fail");//false then will print inside, assertion fails
//		System.out.println("equal, assertion fail");
//	}
//	
//
//	@Test
//	public void m3() {
//		int act = 10;
//		int exp = 10;
//		Assert.assertNotEquals(act, exp,"it is equal, assertion fail");//false according to statment then print inside, assertion fails
//		System.out.println("not equal , assertion pass");
//	}
//	
//	@Test
//	public void m4() {
//	
//		String s = "Hello";
//		Assert.assertTrue(s.contains("e"),"Assertion fail, not contain");
//		System.out.println("Assert pass , contain");
//	}
//		
//	@Test
//	public void m5() {
//			String s = "hello";
//			String ss = "hellooo";
//			Assert.assertTrue(s.equalsIgnoreCase(ss), "Assert fails, not has.");
//			System.out.println("Assert pass, contains");
//			
//		}
//	
//	
//	@Test
//	public void m6() {
//		int act = 10;
//		int exp = 20;
//		Assert.assertSame(act,exp, "Assert fails, not same.");
//		System.out.println("Assert pass, same");
//		
//	}
//		
//	
//	@Test
//	public void m7() {
//		String s = "hi";
//		Assert.assertNull(s, "Assert fails, not null.");
//		System.out.println("Assert pass, null");
//		
//	}
//	
//	@Test
//	public void m8() {
//		
//		Assert.fail( "Assert fails");//to fail script intentionally 
//		
//		
//	}
//	
//		
//		
//	}
//
//
