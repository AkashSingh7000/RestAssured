package helper;

import endpoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import utils.BaseUtils;

import java.util.HashMap;
import java.util.Map;

public class PostApiHelper {

    BaseUtils baseUtils = new BaseUtils();
    private final String BASE_URL = baseUtils.getBaseUrl();
    public PostApiHelper()
    {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
    }

    public Response postResponse(JSONObject ob)
    {
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(ob.toJSONString())
                .when()
                .post(EndPoints.USERS)
                .andReturn();
        return response;

    }
}
