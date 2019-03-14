package design;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author kejx
 * @Date 2019/3/14 1:13
 */
public class Proxy {

    interface IMsg {

        void sendMsg();

        String getMsg(String msg);
    }

    class MsgToA implements IMsg {

        @Override
        public void sendMsg() {
            System.out.println("消息发送给A");
        }

        @Override
        public String getMsg(String msg) {
            return "获得消息:" + msg + " from A";
        }
    }

    class MsgToB implements IMsg {

        @Override
        public void sendMsg() {
            System.out.println("消息发送给B");
        }

        @Override
        public String getMsg(String msg) {
            return "获得消息:" + msg + " from B";
        }
    }

    class MsgFactory {

        IMsg createMsgHandler(int type) {
            return type - 1 == 0 ? new MsgToA() : new MsgToB();
        }

        IMsg createProxyMsgHandler(int type) {
            Class<IMsg> targetClass = IMsg.class;

            Object obj = java.lang.reflect.Proxy.newProxyInstance(targetClass.getClassLoader(),
                    new Class[] {targetClass},
                    new MsgHandler(this.createMsgHandler(type)));

            return (IMsg) obj;
        }
    }

    class MsgHandler implements InvocationHandler {

        private IMsg msg;

        public MsgHandler(IMsg msg) {
            this.msg = msg;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            String methodName = "send";

            if (method.getName().startsWith(methodName)) {
                System.out.println("发送前");
                Object obj = method.invoke(this.msg, args);
                System.out.println("发送后");

                return obj;
            }

            return method.invoke(this.msg, args);
        }
    }

    public void run() {
        MsgFactory factory = new MsgFactory();
        IMsg msgObj = factory.createMsgHandler(1);
        msgObj.sendMsg();
        System.out.println(msgObj.getMsg("yahaha"));

        IMsg proxyMsgObj = factory.createProxyMsgHandler(2);
        proxyMsgObj.sendMsg();
        System.out.println(proxyMsgObj.getMsg("hello"));
    }

    public static void main(String[] args) {
        new Proxy().run();
    }
}
