package api_test;
import helper.PatchApiHelper;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatchApi {

    PatchApiHelper helper = new PatchApiHelper();
    Response response;


    @Test()
    public void patchApi()
    {
        JSONObject ob = new JSONObject();
        ob.put("Name", "Akash Kumar Singh");
        ob.put("Job", "Software Engineer");
        response = helper.patchResponse(ob);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.SC_OK);
        System.out.println(response.asPrettyString());
        JsonPath jsonPathEvaluator = response.jsonPath();
        Assert.assertTrue(jsonPathEvaluator.get("Job").equals("Software Engineer"));
        Assert.assertTrue(jsonPathEvaluator.get("Name").equals("Akash Kumar Singh"));
    }
}
