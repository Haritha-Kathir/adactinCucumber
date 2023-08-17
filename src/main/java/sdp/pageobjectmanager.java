package sdp;

import org.openqa.selenium.WebDriver;

import com.pom.bookingpage;
import com.pom.login_page;
import com.pom.logoutpage;
import com.pom.seachpage;
import com.pom.selectpage;

public class pageobjectmanager {

public static WebDriver driver;
	
	private login_page lp;
	
	private seachpage sp;
	
	private selectpage se;
	
	private bookingpage bp;
	
	private logoutpage lo;


	public pageobjectmanager(WebDriver driver1) {
		
		this.driver=driver1;
	}

	public login_page getLp() {
		
	    lp=new login_page(driver);
		return lp;
	}

	public seachpage getSp() {
		
		 sp=new seachpage(driver);
		return sp;
	}

	public selectpage getSe() {
		
	    se=new selectpage(driver);
		return se;
	}

	public bookingpage getBp() {
		
	     bp=new bookingpage(driver);
		return bp;
	}

	public logoutpage getLo() {
		
	    lo=new logoutpage(driver);
		return lo;
	}
	
	
}
