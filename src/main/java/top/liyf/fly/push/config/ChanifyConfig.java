package top.liyf.fly.push.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author liyf
 * Created in 2021-05-14
 */
@Data
@Component
@ConfigurationProperties(prefix = "chanify")
public class ChanifyConfig {

    private String host;
}
