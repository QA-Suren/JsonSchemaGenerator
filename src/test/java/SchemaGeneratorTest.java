
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.reinert.jjschema.JsonSchemaGenerator;
import com.github.reinert.jjschema.SchemaGeneratorBuilder;
import lombok.SneakyThrows;
import model.Address;
import model.Challenge;
import model.ChallengeResponse;
import org.testng.annotations.Test;


public class SchemaGeneratorTest {
    private static ObjectMapper mapper = new ObjectMapper();
    public static final String JSON_$SCHEMA_DRAFT7_VALUE = "http://json-schema.org/draft-07/schema#";
    public static final String JSON_$SCHEMA_ELEMENT = "$schema";

    static {
        // required for pretty printing
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    @Test
    @SneakyThrows
    public void schemaGeneratorTest() throws JsonProcessingException {

        // get the draft 4 schema builder
        JsonSchemaGenerator v4generator = SchemaGeneratorBuilder.draftV4Schema().build();

        // use the schema builder to generate JSON schema from Java class
        JsonNode schemaNode = v4generator.generateSchema(ChallengeResponse.class);

        // add the $schema node to the schema. By default, JJSchema v0.6 does not add it
        ((ObjectNode) schemaNode).put(JSON_$SCHEMA_ELEMENT, JSON_$SCHEMA_DRAFT7_VALUE);

        // print the generated schema
        prettyPrintSchema(schemaNode);
    }

    /////// HELPER METHOD //////
    private  void prettyPrintSchema(JsonNode schema) throws JsonProcessingException{
        System.out.println(mapper.writeValueAsString(schema));
    }
}
