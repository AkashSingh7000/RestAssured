package helper;

import endpoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.BaseUtils;

public class GetApiHelper {

    BaseUtils baseUtils = new BaseUtils();
    private final String BASE_URL = baseUtils.getBaseUrl();
    public GetApiHelper()
    {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
    }

    public Response getResponse()
    {
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParams("page", "2")
                .when()
                .get(EndPoints.USERS)
                .andReturn();
        return response;

    }
}
