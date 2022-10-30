import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class yest1 {



    @Test(dataProvider = "dpWithCsv")
    public void testWithCsv(String username, String identifier, String firstName){      System.out.println(username+","+identifier+","+firstName);
    }

}
