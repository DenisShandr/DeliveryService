package converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Client;
import dto.ClientDTO;

import java.io.File;

public class JsonConverter {

    public static ObjectMapper mapper = new ObjectMapper();


    public static void objectToJsonFile(Object object, String objectFilename) {
        try {
            mapper.writeValue(new File("e://" + objectFilename + ".json"), object);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Object jsonFileToObject(String objectFilename, Class className) {
        Object object = new Object();
        try {
            object = mapper.readValue(new File("e://" + objectFilename + ".json"), className);
        } catch (Exception e) {
            e.getMessage();
        }
        return object;
    }

}
