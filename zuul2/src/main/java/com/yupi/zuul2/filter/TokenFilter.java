package com.yupi.zuul2.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Yupi Li
 * @Date: Created in 21:45 2018/10/2
 * @Description:
 * @Modified By:
 */
@Component
public class TokenFilter extends ZuulFilter {

    @Value("${server.port}")
    private String port;

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
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        if (StringUtils.isEmpty(request.getParameter("token"))) {
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            context.setResponseBody("no token");
        }
        System.out.println(port);
        return null;
    }
}
