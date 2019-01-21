package com.qfedu.schoolapp.config;




import com.alibaba.fastjson.JSON;
import com.qfedu.tool.contant.SystemConst;
import com.qfedu.tool.util.JedisUtil;
import com.qfedu.tool.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class TokenFilter implements Filter {

    @Autowired
    private JedisUtil jedisUtil;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        String token=request.getParameter("token");
        if(token!=null && token.length()>0){
            if(jedisUtil.checkFiled(SystemConst.TOKENMAP,"user:"+token)){
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                servletResponse.getWriter().write(JSON.toJSONString(ResultVo.setERROR("系统异常")));
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
