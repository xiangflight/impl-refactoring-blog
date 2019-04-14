package chapter6.introduceexplainingvariable;

/**
 * @author xiang.zhao@woqutech.com
 * @version 1.0
 * @date 2019-04-14 16:58
 */

public class IntroduceExplainingVariableSummary {

    void introduceExplainingVariable(String platform, String browser) {
        int resize = 1;
        final boolean isMacOs = platform.toUpperCase().contains("MAC");
        final boolean isIEBrowser = browser.toUpperCase().contains("IE");
        final boolean wasResized = resize > 0;

        if (isMacOs && isIEBrowser && wasInitialized() && wasResized) {
            // do something
        }
    }

    private boolean wasInitialized() {
        return false;
    }


}
