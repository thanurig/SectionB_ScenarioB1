import org.testng.annotations.Test;

public class DataProviderExampleTwo {

    //when Data-provider annotation is in different class
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email,String password){
        System.out.println("UserName:"+" "+email);
        System.out.println("Password:"+" "+password);

    }

}
