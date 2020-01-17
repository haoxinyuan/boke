package yuan.boke.www.mail;

/**
 * Created by wly on 2018/3/7.
 */

public class MailExample {

    public static void main(String args[]) throws Exception {
        String email = "741076752@qq.com";
        String validateCode = "23123";
        SendEmail.sendEmailMessage(email, validateCode);

    }
}
