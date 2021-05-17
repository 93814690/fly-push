package top.liyf.fly.push.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.liyf.fly.push.domain.ChanifyText;

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
        text.setToken("CICmzIgGEiJBQzZBUUZGN0hPNFo0QzROTkczSlJRRU5HRFJRWklIN05FGhRmU0vjxji92dxl8bfsQfWCC4Km-SIECAEQASoiQUZXV1pFVVpBWUVTQUVHQkNIRlZMS0FDR1ZDT1dLN0xBNA..4o26JfEubUnYmAX9g2zXdIhDWhDafvserclpdfOm_b8");
        chanifyController.text(text);
    }
}