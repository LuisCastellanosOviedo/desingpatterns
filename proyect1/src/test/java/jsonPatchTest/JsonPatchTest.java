package jsonPatchTest;

import org.junit.Assert;
import org.junit.Test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonPatch;

public class JsonPatchTest {




    @Test
    public void JsonOneParam() {
     JsonObject javaVersion =  Json.createObjectBuilder().add("javaVersion","8").build();

       Assert.assertEquals("{\"javaVersion\":\"8\"}",javaVersion.toString());
    }

    @Test
    public void InnerJson() {
        JsonObject javaVersion =  Json.createObjectBuilder().add("javaVersion","8").build();
        JsonObject infrastructure = Json.createObjectBuilder()
                .add("SO","Ubuntu")
                .add("Java",javaVersion)
                .build();

        System.out.println(infrastructure);

    }

    @Test
    public void InnerJson2Levels() {
        JsonObject sub = Json.createObjectBuilder().
                add("name", "EE4J").
                build();

        JsonObject initial = Json.createObjectBuilder().
                add("fact", "Java EE is nice").
                add("myth", "Java EE is heavyweight").
                add("future", sub).
                build();

        JsonPatch patch = Json.createPatchBuilder().
                add("/version", "8").
                replace("/fact", "Java EE rocks").
                replace("/future/name", "Jakarta EE").
                remove("/myth").
                build();

        JsonObject result = patch.apply(initial);
        System.out.println("result = " + result);

    }
}
