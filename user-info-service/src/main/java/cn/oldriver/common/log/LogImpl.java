package cn.oldriver.common.log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


/**
 * @Author kejx
 * @Date 2019/3/15 2:37
 */
public class LogImpl implements ILog {

    private File file;

    private String className;

    private SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");

    private SimpleDateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    @Override
    public ILog init(Class clazz, Integer type) {
        ILog logger;

        switch (type) {
            case 1 : logger = this.initWithFile(clazz);break;
            default: logger = this.initWithConsole(clazz);
        }

        return logger;
    }

    /** 日志文件放到classPath下的logs目录
     *
     * @author kejx
     * @date 2019/3/15
     * @description
     */
    private ILog initWithFile(Class clazz) {
        // 这里用requireNonNull()是因为ide报警告比较烦，实际没用
        URL url = Objects.requireNonNull(clazz.getClassLoader().getResource("/"));

        String sb = url.toString() + "/logs" +
                "/" +
                this.getSimpleDate() +
                ".log";
        this.file = new File(sb);
        this.className = this.getClassName(clazz);

        return this;
    }

    /** 日志仅打印到控制台
     * @author kejx
     * @date 2019/3/15
     * @description
     */
    private ILog initWithConsole(Class clazz) {
        this.className = this.getClassName(clazz);

        return this;
    }

    private String getClassName(Class clazz) {
        if (this.className == null) {
            return clazz.getSimpleName();
        } else {
            return this.className;
        }
    }

    private void saveLog(String level, String msg) {
        // 用占位符的形式处理显得更专业，这里拼接就算了:)
        StringBuilder sb = new StringBuilder("[" + level + "] ");
        sb.append(this.getFullDate())
                .append(" -- ")
                .append(this.className)
                .append(" -- ")
                .append(msg);

        if (this.file == null) {
            System.out.println(sb.toString());
        } else {
            Writer writer = null;
            try {
                writer = new FileWriter(this.file);
                writer.write(sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private String getSimpleDate() {
        return this.simpleFormat.format(new Date(System.currentTimeMillis()));
    }

    private String getFullDate() {
        return this.fullFormat.format(new Date(System.currentTimeMillis()));
    }

    @Override
    public void error(String msg) {
        String level = "error";
        this.saveLog(level, msg);
    }

    @Override
    public void debug(String msg) {
        String level = "debug";
        this.saveLog(level, msg);
    }

    @Override
    public void info(String msg) {
        String level = "info";
        this.saveLog(level, msg);
    }

    @Override
    public void warning(String msg) {
        String level = "warning";
        this.saveLog(level, msg);
    }
}
