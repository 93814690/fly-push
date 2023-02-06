package top.liyf.fly.push.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import top.liyf.fly.push.api.domain.ChanifyText;

/**
 * @author liyf
 * Created in 2021-05-26
 */
@FeignClient(value = "fly-push", path = "/chanify")
public interface ChanifyClient {

    @PostMapping("/text")
    void text(@RequestBody ChanifyText text);
}
