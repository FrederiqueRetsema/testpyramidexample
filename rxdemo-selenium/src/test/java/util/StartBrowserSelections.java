package util;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by cindyleffler on 6/6/17.
 */
public class StartBrowserSelections {
    public static Collection<Object[]> startALocalBrowser(String inItems)
    {

        // [FR] Yet another try: add something from the Pluralsight training... 
        // System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
        // --didn work---
        
        List<Object[]> retVal = new ArrayList<Object[]>();
        retVal.add( new Object[]
                {

                        "Chrome", RxConstants.SELENIUM_SERVER_FOR_L_CHROME,
                        DesiredCapabilities.chrome(), inItems
                });

        return retVal;

    }
}
