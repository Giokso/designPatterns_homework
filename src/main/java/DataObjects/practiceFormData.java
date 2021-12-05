package DataObjects;
import org.testng.annotations.DataProvider;

public class practiceFormData {
    @DataProvider(name="provider")
    public Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        { "Tommy", "Jerry", "Male", "2319423451" },
                        { "Koba", "Barateli", "Male", "1234560987" },
                        { "Adidas", "Nike", "Male", "4314123451" },
                };

    }
}
