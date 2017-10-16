/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kaat
 */
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int prod[][]=new int[2][3];
        prod[0][0]=Integer.parseInt(request.getParameter("v1x"));
        prod[0][1]=Integer.parseInt(request.getParameter("v1y"));
        prod[0][2]=Integer.parseInt(request.getParameter("v1z"));
        prod[1][0]=Integer.parseInt(request.getParameter("v2x"));
        prod[1][1]=Integer.parseInt(request.getParameter("v2y"));
        prod[1][2]=Integer.parseInt(request.getParameter("v2z"));
        int sumavx=1;
        int sumavy=1;
        int sumavz=1;
        int sumafin;
        try(PrintWriter out = response.getWriter()){
           out.print("<html>");
           out.print("<head><title>niio</title></head>");
           out.print("<body>"); 
           out.print("<p>");
           for(int i=0; i<2; i++){
               for(int j=0; j<3; j++){
                   switch (j){
                       case 0:
                           sumavx=sumavx+prod[i][j];
                       case 1:
                           sumavy=sumavy+prod[i][j];
                       case 2:
                           sumavz=sumavz+prod[i][j];
                   }                   
               }
           }
           sumafin=sumavx+sumavy+sumavz;
            out.print("El resultado es: "); 
            out.print(sumafin);
            out.print("</p>");            
            out.print("</body>");
            out.print("</html>");
        }
    }

}
