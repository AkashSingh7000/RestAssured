package api_test;
import helper.DeleteApiHelper;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteApi {

    DeleteApiHelper helper = new DeleteApiHelper();
    Response response;


    @Test()
    public void deleteApi()
    {
        response = helper.deleteResponse();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_NO_CONTENT);
    }
}
