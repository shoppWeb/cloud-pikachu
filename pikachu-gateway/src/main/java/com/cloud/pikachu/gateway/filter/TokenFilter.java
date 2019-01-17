package com.cloud.pikachu.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * token过滤校验
 * 前置过滤器
 *
 */
@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        /**
         * filterType 过滤器类型
         *
         * ERROR_TYPE : 报错时过滤
         * POST_TYPE : 发送错误调用
         * PRE_TYPE : 路由之前
         * ROUTE_TYPE : 路由之时
         *
         */
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        /**
         *     public static final int SERVLET_DETECTION_FILTER_ORDER = -3;     ServletDetectionFilter
         *     public static final int SERVLET_30_WRAPPER_FILTER_ORDER = -2;    Servlet30WrapperFilter
         *     public static final int FORM_BODY_WRAPPER_FILTER_ORDER = -1;     FormBodyWrapperFilter
         *     public static final int DEBUG_FILTER_ORDER = 1;                  DebugFilter
         *     public static final int PRE_DECORATION_FILTER_ORDER = 5;         PreDecorationFilter
         *     public static final int RIBBON_ROUTING_FILTER_ORDER = 10;        RibbonRoutingFilter
         *     public static final int SEND_ERROR_FILTER_ORDER = 0;             SendErrorFilter
         *     public static final int SEND_FORWARD_FILTER_ORDER = 500;         SendForwardFilter
         *     public static final int SEND_RESPONSE_FILTER_ORDER = 1000;       SendResponseFilter
         *     public static final int SIMPLE_HOST_ROUTING_FILTER_ORDER = 100;  SimpleHostRoutingFilter

         */
        return PRE_DECORATION_FILTER_ORDER -1 ;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
        }
        return null;
    }
}
