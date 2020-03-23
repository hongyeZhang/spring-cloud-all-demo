package com.zhq.gateway.zuul.demo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : ZHQ
 * @date : 2020/3/23
 */
public class RequestFilter extends ZuulFilter {

    private Logger logger = LoggerFactory.getLogger(RequestFilter.class);

    /**
     * 请求路由之前被拦截 实现 pre 拦截器
     *
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            logger.warn("need token");
            //过滤请求
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(400);
            return null;
        }
        logger.info("token ={}", token);

        return null;
    }
}
