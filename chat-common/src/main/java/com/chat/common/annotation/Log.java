package com.chat.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义日志操作
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
}
