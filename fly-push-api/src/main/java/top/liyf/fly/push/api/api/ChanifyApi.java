package top.liyf.fly.push.api.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import top.liyf.fly.push.api.domain.ChanifyText;

/**
 * @author liyf
 * Created in 2021-05-26
 */
@RequestMapping("/chanify")
public interface ChanifyApi {

    @PostMapping("/text")
    void text(@RequestBody ChanifyText text);
}
