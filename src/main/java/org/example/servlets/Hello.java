package org.example.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hello extends HttpServlet {
  private static final long serialVersionUID = 1L;
  private static final Logger LOGGER = LogManager.getLogger();

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    LOGGER.debug("enter doGet");
    response.getWriter().write("Hello there. I'm logging this.");
    LOGGER.debug("leave doGet");
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    LOGGER.debug("enter doPost");
    doGet(request, response);
    LOGGER.debug("leave doPost");
  }

}
