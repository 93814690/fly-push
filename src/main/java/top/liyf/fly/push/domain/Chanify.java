package top.liyf.fly.push.domain;

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
}
