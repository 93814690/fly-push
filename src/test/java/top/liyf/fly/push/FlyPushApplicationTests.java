package top.liyf.fly.push;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.liyf.fly.push.api.ChanifyController;
import top.liyf.fly.push.api.domain.ChanifyText;

import java.util.Collections;

@SpringBootTest
class FlyPushApplicationTests {

    @Autowired
    ChanifyController controller;

    @Test
    void contextLoads() {
        ChanifyText text = new ChanifyText();
        text.setTitle("title");
        text.setText("text");
        text.setToken("CICy4YgGEiJBREpGVTM3RFpNNEZMRlZaN1FCWDVGSE5BTlY0TVM0RFpNGhRmU0vjxji92dxl8bfsQfWCC4Km-SIECAEQASoiQUhSN1pLV1czUkNRQVFJUlpCNUVDVElFS09WWFBSU05TTQ..sbiZSJu63KdZK1dm2l0Rtljnz-btD3V3tdLX3SeRimA");
        text.setActions(Collections.singletonList("查看|sinaweibo://searchall?q=%23%E8%8B%B1%E9%9B%84%E6%9C%BA%E9%95%BF%E5%88%98%E4%BC%A0%E5%81%A5%E8%8E%B7%E5%85%A8%E5%9B%BD%E4%BC%98%E7%A7%80%E5%85%B1%E4%BA%A7%E5%85%9A%E5%91%98%23"));
        controller.text(text);
    }

}
