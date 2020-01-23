package micronaut.sample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class MyConfig {

  private final int id;
  private final String prop;
}
