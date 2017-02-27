package com.servlet;


import com.sun.tools.javac.main.Option;
import org.apache.commons.io.ByteOrderMark;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UTFDataFormatException;
import java.text.ParseException;
import java.util.Optional;

/**
 * Created by dumin on 9/13/16.
 */
public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World 3";
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);

        StringBuffer jb = new StringBuffer();
        String line = null;

            BufferedReader reader = req.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + jb.toString() + "</h1>");

//        Optional.ofNullable(getUser(user));
        String str;

        resp.sendError(404, "Need authentication!!!" );
    }

    enum STATE{
        UT(6.85),
        NV(8.00),
        TX(6.25),
        AL(4.00),
        CA(8.25)
        ;
        private Double tax;
        Double addTax (Double val){
            return val*tax/100;
        }

        STATE(Double tax){
            this.tax=tax;
        }

    }

    private double getDiscount(Double price){
        double retVal = 0;
        if( price >= 1000 && price <5000 ){
            retVal = .03;
        }else if(price >= 5000 && price <7000){
            retVal = .05;
        }else if(price >= 7000 && price <10000){
            retVal = .07;
        }else if(price >= 10000 && price <50000){
            retVal = .1;
        }else if(price >= 50000 ){
            retVal = .15;
        }
        return retVal;
    }


    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

//        http://localhost:8080/HelloWorld?id=12

        Double price = Double.parseDouble(request.getParameter("price"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        String state = request.getParameter("state");

        Double total1 = price*quantity;
        Double total2 = total1-total1*getDiscount(total1);
        Double total3 = total2+STATE.valueOf(state).addTax(total2);


        PrintWriter out = response.getWriter();
        out.println("sum "+total3);
//        out.println("<h1>" + message+pk + "</h1>");
    }

    private Double getTax(Double total2) {
        return null;
    }

    public void destroy() {
        // do nothing.
    }
}
