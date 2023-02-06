package top.liyf.fly.push.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.liyf.fly.push.api.domain.ChanifyText;
import top.liyf.fly.push.config.ChanifyConfig;
import top.liyf.fly.push.util.ChanifyUtils;

import java.util.Map;

/**
 * @author liyf
 * Created in 2021-05-13
 */
@RestController
@RequestMapping("/chanify")
public class ChanifyController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ChanifyConfig chanifyConfig;

    @PostMapping("/text")
    public void text(@RequestBody ChanifyText text) {
        System.out.println("text = " + text);
        String url = chanifyConfig.getHost() + ChanifyUtils.TEXT;
        Map<String, String> map = restTemplate.postForObject(url, text, Map.class);
        System.out.println("map = " + map);

    }
}
