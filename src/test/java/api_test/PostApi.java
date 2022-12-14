package api_test;
import helper.PostApiHelper;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PostApi {

    PostApiHelper helper = new PostApiHelper();
    Response response;


    @Test(priority = 0)
    public void postApi()
    {
        JSONObject ob = new JSONObject();
        ob.put("Name", "Akash");
        ob.put("Job", "Software Engineer");
        response = helper.postResponse(ob);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_CREATED);
        System.out.println(response.asPrettyString());
    }
}
