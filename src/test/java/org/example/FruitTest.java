package org.example;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class FruitTest {

    @ConfigProperty(name = "quarkus.mydb.invoked")
    String invoked;

    @Test
    @DisplayName("test: do not invoke db resource")
    public void test() {
        assertThat(invoked, is("false"));
    }

    @Test
    public void shouldNotInvokeResource(){
        String s = given()
                .when()
                .get("/example/something/invoked").then().statusCode(200).extract().body().asString();
        assertThat(s, is("false"));
    }


}
