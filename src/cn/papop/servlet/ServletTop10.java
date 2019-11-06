package cn.papop.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
@WebServlet(urlPatterns = "/top10")
public class ServletTop10 extends HttpServlet {
    private List<String> xian;
    private List<String> beijing;

    @Override
    public void init() throws ServletException {

        xian=new ArrayList<String>(2);
        xian.add("huxian");
        xian.add("changan");
        beijing=new ArrayList<String>(2);
        beijing.add("qinghua");
        beijing.add("beida");

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("===============");
        String city = request.getParameter("city");
        if(city!=null && (city.equals("beijing")||city.equals("xian"))){
            showAttractions(request,response,city);
        }else {
            showMainPage(request,response);
        }

    }
    private void showMainPage(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head>" +
                "<title> Top Tourist Attractions</title>" +
                "</head><body>" +
                "please select a city:" +
                "<br/><a href='?city=xian'>xian</a>"+
                "<br/><a href='?city=beijing'>beijing</a>"+
                "</body></html>");
    }
    private void showAttractions(HttpServletRequest request, HttpServletResponse response,String city)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("欢迎来到"+city);
    }
}
