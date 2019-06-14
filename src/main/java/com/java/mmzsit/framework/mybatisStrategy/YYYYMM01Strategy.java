package com.java.mmzsit.framework.mybatisStrategy;

import com.java.mmzsit.framework.mybatisStrategy.framework.util.DateUtil;

import java.text.ParseException;
/**
 * @author ：mmzsit
 * @description：按月分表策略
 * @date ：2019/6/13 10:29
 */
public class YYYYMM01Strategy implements Strategy{

    @Override
    public String returnTableName(String tableName, String param) {
        try {
            // 结果类似 20190601
            return tableName+"_"+ DateUtil.get_MM01Str(param);
        } catch (ParseException e) {
            e.printStackTrace();
            return tableName;
        }
    }

}

