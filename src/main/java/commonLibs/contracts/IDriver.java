package commonLibs.contracts;

public interface CommonDriver implements Driver {
	
	private WebDriver driver;
	
	private int pageLoadTimeout;
	
	private int elementDetectionTimeout;
	
	public CommonDriver(String browserType) throws Exception {
		
		elementDetectionTimeout = 10;
		pageloadTimeout = 20;
		
		browserType = browserType.trim()
	}
	
	public void navigateToFirstUrl(String url) throws Exception;

	public String getTitle() throws Exception;

	public String getCurrentUrl() throws Exception;

	public String getPageSource() throws Exception;

	public void navigateToUrl(String url) throws Exception;

	public void navigateForward() throws Exception;

	public void navigateBackward() throws Exception;

	public void refresh() throws Exception;

	public void closeBrowser() throws Exception;

	public void closeAllBrowsers() throws Exception;
}
