package micronaut.sample;

import io.micronaut.runtime.Micronaut;

import lombok.val;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
  public static void main(String[] args) {
    val config = new MyConfig(33, "test");
    log.info("config.hash: " + config.hashCode());

    val appContext = Micronaut.run(Main.class);
    appContext.registerSingleton(MyConfig.class, config);
    log.info("registered app context");
  }
}
