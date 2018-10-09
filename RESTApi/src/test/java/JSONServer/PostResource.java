package JSONServer;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostResource {
    @Test
    public void postTest() {

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 82);
        jsonObject.put("title", "Huckleberry Fin");
        jsonObject.put("author", "Mark Twain");

        request.body(jsonObject.toJSONString());
        Response response = request.post("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
    @Test
    public void deletePost() {
        RequestSpecification request = RestAssured.given();

        Response response = request.delete("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 405);
    }
    @Test
    public void putPost() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 75);
        jsonObject.put("title", "Huckleberry Fin");
        jsonObject.put("author", "Homer Simpson");
        request.body(jsonObject.toJSONString());
        Response response = request.put("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 405);
    }
    @Test
    public void putNullPost() {
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", 999);
        jsonObject.put("title", "Huckleberry Fin");
        jsonObject.put("author", "Homer Simpson");

        request.body(jsonObject.toJSONString());
        Response response = request.put("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 405);
    }
}

