package com.yuxin.cn.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

//@Component
public class RequestOriginParserDefinition implements RequestOriginParser {

    /**
     * 定义区分来源：本质作用使通过requset来获取来源标识
     * @param request
     * @return
     * app、pc
     */
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String serviceName = request.getParameter("serviceName");
        if(StringUtils.isEmpty(serviceName)){
            throw new RuntimeException("serviceName is empty");
        }
        return serviceName;
    }
}
