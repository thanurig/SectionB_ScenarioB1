import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomDataProvider {

    //Data-Provider annotation
    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data={{"A","1"},{"B","2"},{"C","3"},{"D","4"}};
        return data;
    }
}