package micronaut.sample;

import com.fasterxml.jackson.annotation.JsonGetter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MyData {
  public final MyConfig config;
  public final int id;

  private final String name;

  @JsonGetter("name")
  public String getName() {
    return "update-" + name;
  }
}
