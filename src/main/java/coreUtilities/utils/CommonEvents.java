package coreUtilities.utils;

import org.openqa.selenium.WebDriver;

/***
 * @author Yaksha
 * This class is responsible to perform all generic or commonly used operations
 *
 */
public class CommonEvents 
{
	public WebDriver driver;

	public CommonEvents(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	/***
	 * This method is useful to navigate to the desired application url
	 * @param url
	 * @return {@link CommonEvents}
	 * @throws Exception 
	 */
	public CommonEvents navigateTo(String url) throws Exception
	{
		
		return null;
	}
	
	
}
