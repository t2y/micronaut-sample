package micronaut.sample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import lombok.val;

@Controller("/hello")
public class HelloController {

  private static ObjectMapper MAPPER = new ObjectMapper();

  @Get
  @Produces(MediaType.APPLICATION_JSON)
  public String index() throws JsonProcessingException {
    val data = new MyData(1, "bob");
    return MAPPER.writeValueAsString(data);
  }
}
