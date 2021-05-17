package top.liyf.fly.push.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.liyf.fly.push.config.ChanifyConfig;
import top.liyf.fly.push.domain.ChanifyText;
import top.liyf.fly.push.util.ChanifyUtils;

import java.util.Map;

/**
 * @author liyf
 * Created in 2021-05-13
 */
@RestController("/chanify")
public class ChanifyController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ChanifyConfig chanifyConfig;

    @PostMapping("/text")
    public void text(ChanifyText text) {
        String url = chanifyConfig.getHost() + ChanifyUtils.TEXT;
        Map<String, String> map = restTemplate.postForObject(url, text, Map.class);
        System.out.println("map = " + map);

    }
}
