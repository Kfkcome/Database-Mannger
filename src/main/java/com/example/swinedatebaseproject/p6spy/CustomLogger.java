package com.example.swinedatebaseproject.p6spy;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;

/**
 * @作者 DD
 * @创建时间 2023/6/26
 */
public class CustomLogger implements MessageFormattingStrategy {
    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category,
                                String prepared, String sql, String url) {
        return StringUtils.isNotBlank(sql) ? " Consume Time：" + elapsed + " ms " + now +
                "\n Execute SQL：" + sql.replaceAll("[\\s]+", " ") + "\n" : "";
    }
}
