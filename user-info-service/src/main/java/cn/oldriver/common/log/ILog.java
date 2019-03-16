package cn.oldriver.common.log;

/**
 * @Author kejx
 * @Date 2019/3/15 2:33
 */
public interface ILog {

    ILog init(Class clazz, Integer type);

    void error(String msg);

    void debug(String msg);

    void info(String msg);

    void warning(String msg);

}
