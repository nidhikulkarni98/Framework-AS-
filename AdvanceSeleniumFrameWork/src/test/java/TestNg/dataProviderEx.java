//package TestNg;
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class dataProviderEx {
//	
//	
//	    @Test(dataProvider = "readData")
//		public void bookTickets(String src , String dest, int numppl) {
//			System.out.println("Book ticets from "+src+" to " +dest+ " "+numppl);
//		}
//		
//		@DataProvider
//		public Object[][] readData(){
//			
//			Object[][] objarr = new Object[2][3];
//			objarr[0][0] = "bangalore";
//			objarr[0][1] = "goa";
//			objarr[0][2] = 5;
//			
//			objarr[1][0] = "Mysore";
//			objarr[1][1] = "bangalore";
//			objarr[1][2] = 4;
//			
//			return objarr;
//			
//		}
//
//	}
//
//
