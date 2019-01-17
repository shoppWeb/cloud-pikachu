package com.cloud.pikachu.gateway.filter;

import com.cloud.pikachu.gateway.component.exception.RateLimitException;
import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import org.springframework.stereotype.Component;


import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVLET_DETECTION_FILTER_ORDER;

/**
 * 限流
 * zuul限流应控制在优先级最高的地方
 */
@Component
public class RateLimiterFilter extends ZuulFilter {

    private static final RateLimiter TATE_LIMITER = RateLimiter.create(100);

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SERVLET_DETECTION_FILTER_ORDER - 1 ;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run(){

        if(!TATE_LIMITER.tryAcquire()){

            /**
             * 限流可以抛异常 或者 返回错误代码
             */

//            RequestContext requestContext = RequestContext.getCurrentContext();
//            HttpServletRequest request = requestContext.getRequest();
//            requestContext.setSendZuulResponse(false);
//            requestContext.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());

            throw new RateLimitException();
        }
        return null;
    }
}
