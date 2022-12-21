package api_test;

import helper.GetApiHelper;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetApi {

    GetApiHelper helper = new GetApiHelper();
    Response response;


    @Test()
    public void getApi()
    {
        response = helper.getResponse();
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        System.out.println(response.asPrettyString());
    }

}
