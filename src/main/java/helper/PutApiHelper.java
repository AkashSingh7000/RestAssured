package helper;

import endpoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import utils.BaseUtils;

public class PutApiHelper {

    BaseUtils baseUtils = new BaseUtils();
    private final String BASE_URL = baseUtils.getBaseUrl();
    public PutApiHelper()
    {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
    }

    public Response putResponse(JSONObject ob)
    {
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(ob.toJSONString())
                .when()
                .put(EndPoints.PUT_USERS)
                .andReturn();
        return response;

    }
}
