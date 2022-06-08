package in.co.gorest.testbase;


import in.co.gorest.constants.Path;
import in.co.gorest.utilis.PropertyReader;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Jay
 */
public class TestBase {
    public static PropertyReader propertyReader;

    @BeforeClass
    public static void init() {
        propertyReader = PropertyReader.getInstance();
        RestAssured.baseURI = propertyReader.getProperty("baseUrl");
       // RestAssured.port = Integer.parseInt(propertyReader.getProperty("port"));
       // RestAssured.basePath = Path.Public;
    }

}
