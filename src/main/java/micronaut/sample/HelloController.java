package micronaut.sample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.context.ApplicationContext;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import javax.inject.Inject;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller("/hello")
public class HelloController {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  @Inject ApplicationContext appContext;

  @Get
  @Produces(MediaType.APPLICATION_JSON)
  public String index() throws JsonProcessingException {
    val config = appContext.getBean(MyConfig.class);
    log.info("config.hash: " + config.hashCode());
    val data = new MyData(config, 1, "bob");
    return MAPPER.writeValueAsString(data);
  }
}
