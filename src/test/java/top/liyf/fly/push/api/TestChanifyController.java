package top.liyf.fly.push.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.liyf.fly.push.api.domain.ChanifyText;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author liyf
 * Created in 2021-05-14
 */
@SpringBootTest
class TestChanifyController {

    @Autowired
    ChanifyController chanifyController;

    @Test
    void text() {
        ChanifyText text = new ChanifyText();
        text.setTitle("this is title");
        text.setText("this is text");
        text.setSound(1);
        text.setPriority(10);
        text.setToken("CICy4YgGEiJBREpGVTM3RFpNNEZMRlZaN1FCWDVGSE5BTlY0TVM0RFpNGhRmU0vjxji92dxl8bfsQfWCC4Km-SIECAEQASoiQUhSN1pLV1czUkNRQVFJUlpCNUVDVElFS09WWFBSU05TTQ..sbiZSJu63KdZK1dm2l0Rtljnz-btD3V3tdLX3SeRimA");
        chanifyController.text(text);
    }
}