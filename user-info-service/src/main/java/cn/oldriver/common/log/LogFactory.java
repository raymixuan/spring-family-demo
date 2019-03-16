package cn.oldriver.common.log;

/**
 * @Author kejx
 * @Date 2019/3/15 2:32
 */
public class LogFactory {

    public static int SAVE_TO_FILE = 1;

    public static int SAVE_TO_DB = 2;

    public static int ONLY_CONSOLE = 3;

    public ILog getLogger(Class clazz, boolean saveToFile) {
        ILog logger = new LogImpl();
        return saveToFile ? logger.init(clazz, SAVE_TO_FILE) : logger.init(clazz, ONLY_CONSOLE);
    }

}
