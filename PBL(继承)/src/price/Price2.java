//
//public abstract class Price {
//		abstract int getPriceCode();
//		//子类都可能用到这个方法，那么在变量定义的时候就定成这个抽象类，就都可以使用这个getCharge方法了。
//		abstract double getCharge(int daysRented);//
//}
//
//class ChildrensPrice extends Price{
//	
//	int getPriceCode(){
//		
//		return Movie.CHILDRENS;
//	}
//    double getCharge(int daysRented){
//		
//		double result=1.5;
//		 if(daysRented>3)
//			  result+=(daysRented-3)*1.5;
//		 return result;
//	}
//	
//	
//}
//
//class NewReleasePrice extends Price{
//	
//	int getPriceCode(){
//		return Movie.NEW_RELEASE;
//	}
//	
//    double getCharge(int daysRented){
//		
//		return daysRented*3;
//	}
//}
//
//class RegularPrice extends Price{
//	int getPriceCode(){
//		return Movie.REGULAR;
//	}
//	
//	double getCharge(int daysRented){
//		
//		double result=2;
//		 if(daysRented>2)
//			  result+=(daysRented-2)*1.5;
//		 return result;
//	}
//}
