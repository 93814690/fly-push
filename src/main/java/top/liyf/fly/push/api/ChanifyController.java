package top.liyf.fly.push.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.liyf.fly.push.api.api.ChanifyApi;
import top.liyf.fly.push.api.domain.ChanifyText;
import top.liyf.fly.push.config.ChanifyConfig;
import top.liyf.fly.push.util.ChanifyUtils;

import java.util.Map;

/**
 * @author liyf
 * Created in 2021-05-13
 */
@RestController
public class ChanifyController implements ChanifyApi {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ChanifyConfig chanifyConfig;

    @Override
    public void text(@RequestBody ChanifyText text) {
        System.out.println("text = " + text);
        String url = chanifyConfig.getHost() + ChanifyUtils.TEXT;
        Map<String, String> map = restTemplate.postForObject(url, text, Map.class);
        System.out.println("map = " + map);

    }
}
