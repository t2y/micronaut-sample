package micronaut.sample;

import io.micronaut.context.ApplicationContext;

import javax.inject.Inject;

public class AbstractController {

  @Inject protected ApplicationContext appContext;

  protected MyConfig getConfig() {
    return appContext.getBean(MyConfig.class);
  }
}
