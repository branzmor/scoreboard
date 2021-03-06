package com.branzmor.scoreboard.properties;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "scoreboard")
public class ScoreBoardProperties {
  private String systemUsername;
  private String systemPassword;
}
