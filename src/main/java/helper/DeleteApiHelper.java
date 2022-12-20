package helper;

import endpoints.EndPoints;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.BaseUtils;

public class DeleteApiHelper {

    BaseUtils baseUtils = new BaseUtils();
    private final String BASE_URL = baseUtils.getBaseUrl();
    public DeleteApiHelper()
    {
        RestAssured.baseURI = BASE_URL;
        RestAssured.useRelaxedHTTPSValidation();
    }

    public Response deleteResponse()
    {
        Response response = RestAssured.given()
                .when()
                .delete(EndPoints.DELETE_USERS)
                .andReturn();
        return response;

    }
}
