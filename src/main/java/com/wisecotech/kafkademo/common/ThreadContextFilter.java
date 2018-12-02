//package com.wisecotech.kafkademo.common;
//
//import org.apache.logging.log4j.ThreadContext;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import java.io.IOException;
//import java.net.InetAddress;
//
//@Component
//public class ThreadContextFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        try {
//            ThreadContext.put("ip", InetAddress.getLocalHost().getHostAddress());
//            ThreadContext.put("thread-id", String.valueOf(Thread.currentThread().getId()));
//            chain.doFilter(request, response);
//        } finally {
//            //清除ThreadContext,避免内存泄露
//            ThreadContext.clearAll();
//        }
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//}
//
