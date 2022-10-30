import Util.CommonUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BaseClass {

    @DataProvider(name = "csvData")
    public Iterator<Object[]> csvDataProvider() throws InterruptedException {
        return CommonUtil.readfromCSV(System.getProperty("user.dir")+"/src/test/resources/TestData");
    }

}
