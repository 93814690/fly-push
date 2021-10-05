package top.liyf.fly.push.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author liyf
 * Created in 2021-05-13
 */
@Data
public class Chanify {

    /**
     * 通知消息的标题
     */
    private String title;

    /**
     * 1 启用声音提示, 其他情况会静音推送
     */
    private int sound;

    /**
     * 10 正常优先级, 5 较低优先级
     */
    private int priority;

    /**
     * 令牌Token
     */
    private String token;

    /**
     * active: 点亮屏幕并可能播放声音。
     * passive: 不点亮屏幕或播放声音。
     * time-sensitive: 点亮屏幕并可能播放声音； 可能会在“请勿打扰”期间展示。
     */
    @JsonProperty("interruption-level")
    private String interruptionLevel;
}
