package yuan.boke.www.activemq;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * @author haoxin.yuan
 * @date 2020/1/8 15:20
 */
@Service("smsAuthenCode")
public class SmsAuthenCode implements MessageListener {
    @Override
    public void onMessage(Message message) {
        MapMessage mapMessage = (MapMessage) message;

        try {

            System.out.println("-----发送消息成功..." + mapMessage.getString("code"));
        } catch (Exception e) {//JMS
            e.printStackTrace();
        }
    }
}
