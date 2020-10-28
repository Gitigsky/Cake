package cn.dangao.servlet;

import cn.dangao.entity.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoodsDeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Order o = (Order) request.getSession().getAttribute("order");
        int goodsid = Integer.parseInt(request.getParameter("goodsid"));
        o.delete(goodsid);
        response.getWriter().print("ok");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
