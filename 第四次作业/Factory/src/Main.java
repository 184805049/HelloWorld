
import tv.*;
import tvfactory.*;
import xml.*;

public class Main {
	public static void main(String args[]) {
		Tv tv;
		String brandName = XMLUtilTV.getBrandName();
		tv = TVFactory.produceTv(brandName);
		tv.play();
	}
}