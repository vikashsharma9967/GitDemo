import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.asynchttpclient.Response;
import org.testng.annotations.Test;

public class testcase {

    @Test
    public void getRequest(){
        RestAssured.baseURI = "https://reqres.in/";
        RequestSpecification req= RestAssured.given();
//        Response res = req.get("users?page=
    }
}
