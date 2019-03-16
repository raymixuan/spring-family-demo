package cn.oldriver.common.exception;

import cn.oldriver.common.log.ILog;
import cn.oldriver.common.log.LogFactory;

/**
 * 基础异常类
 * @Author kejx
 * @Date 2019/3/15 2:00
 */
public class BaseException extends Exception {

    private String errorCode;

    protected BaseException() {
        super();
    }

    public BaseException(String desc) {
        super(desc);

        ILog logger = new LogFactory().getLogger(this.getClass(), false);

        logger.error(desc);
    }


    public BaseException(String desc, Class tar) {
        super(desc);

        ILog logger = new LogFactory().getLogger(tar, false);

        logger.error(desc);
    }

    /**
     * 认为自定义的异常是已知情况，不需要额外打印堆栈日志
     *
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }
}
