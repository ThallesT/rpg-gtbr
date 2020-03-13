package com.gtbr.rpg.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestScope
@Component
public class WebInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String uri = request.getRequestURI();

        if (uri.equals("/logar") || uri.equals("/login") || uri.equals("/registra-novo-usuario") ||
                uri.equals("/registro") || uri.equals("/cliente/finalizar") || uri.equals("/validar-login") ||
                uri.contains("assets") || uri.contains("kross-master") ||
                uri.contains("material-dashboard") || uri.contains("static")) return true;

        if (request.getSession().getAttribute("usuarioLogado") != null) {
            if (uri.equals("/logar") || uri.equals("/validar-login")){
                response.sendRedirect("/");
                return false;
            }

            return true;
        }
        response.sendRedirect("/login");
        return false;
    }
}