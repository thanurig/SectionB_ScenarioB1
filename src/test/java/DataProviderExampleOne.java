import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleOne {

    //Data-provider annotation
    @DataProvider(name="LoginDataProvider")
    public Object[][] getData(){
        Object[][] data={{"A","1"},{"B","2"},{"C","3"},{"D","4"}};
        return data;
    }

    //when Data-provider annotation is in same class
    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String password){
        System.out.println("UserName:"+" "+email);
        System.out.println("Password:"+" "+password);

    }


}