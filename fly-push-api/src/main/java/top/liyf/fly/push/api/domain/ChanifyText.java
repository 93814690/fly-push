package top.liyf.fly.push.api.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author liyf
 * Created in 2021-05-13
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class ChanifyText extends Chanify {

    /**
     * 文本消息内容
     */
    private String text;

    /**
     * 可选的复制文本
     */
    private String copy;

    /**
     * 是否自动复制文本
     */
    private int autocopy;

    /**
     * 动作
     */
    private List<String> actions;
}
