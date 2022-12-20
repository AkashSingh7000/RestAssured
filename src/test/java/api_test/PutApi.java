package api_test;
import helper.PutApiHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutApi {

    PutApiHelper helper = new PutApiHelper();
    Response response;


    @Test()
    public void putApi()
    {
        JSONObject ob = new JSONObject();
        ob.put("Name", "Akash Singh");
        ob.put("Job", "Software Engineer");
        response = helper.putResponse(ob);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        System.out.println(response.asPrettyString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        Assert.assertTrue(jsonPathEvaluator.get("Job").equals("Software Engineer"));
        Assert.assertTrue(jsonPathEvaluator.get("Name").equals("Akash Singh"));
    }
}
