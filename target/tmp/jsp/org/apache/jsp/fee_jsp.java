/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2017-08-13 07:34:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class fee_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta content=\"\" name=\"description\" />\r\n");
      out.write("    <meta content=\"webthemez\" name=\"author\" />\r\n");
      out.write("    <title>新生注册服务系统</title>\r\n");
      out.write("    <!-- Bootstrap Styles-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- FontAwesome Styles-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Custom Styles-->\r\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Google Fonts-->\r\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />\r\n");
      out.write("    <!-- TABLE STYLES-->\r\n");
      out.write("    <link href=\"assets/js/dataTables/dataTables.bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrapper\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/layouts/nav.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- /. NAV SIDE  -->\r\n");
      out.write("    <div id=\"page-wrapper\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <h1 class=\"page-header\">\r\n");
      out.write("                学费缴纳信息 <small>这儿记录着新生当前缴费信息，如：学费缴纳详情，欠缴费用详情...</small>\r\n");
      out.write("            </h1>\r\n");
      out.write("            <ol class=\"breadcrumb\">\r\n");
      out.write("                <li><a href=\"index.jsp\">控制面板</a></li>\r\n");
      out.write("                <li><a href=\"#\">学费缴纳信息 </a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("            <div class=\"row\" >\r\n");
      out.write("                <div class=\"col-md-12\" style=\"overflow-x: hidden\">\r\n");
      out.write("                    <!-- Advanced Tables -->\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <a class=\"btn btn-primary btn-md pull-right\" role=\"button\">导入数据</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\" style=\"margin-top: 20px\">\r\n");
      out.write("                            <div class=\"table-responsive\" style=\"overflow-x: hidden\">\r\n");
      out.write("                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                    <tr>\r\n");
      out.write("                                        <th>学号</th>\r\n");
      out.write("                                        <th>学费（单位：元）</th>\r\n");
      out.write("                                        <th>住宿费（单位：元）</th>\r\n");
      out.write("                                        <th>代收费（单位：元）</th>\r\n");
      out.write("                                        <th>总费用（单位：元）</th>\r\n");
      out.write("                                        <th>欠缴费（单位：元）</th>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tbody>\r\n");
      out.write("                                    <tr class=\"odd gradeX\">\r\n");
      out.write("                                        <td>1408070206</td>\r\n");
      out.write("                                        <td>9600</td>\r\n");
      out.write("                                        <td>800</td>\r\n");
      out.write("                                        <td class=\"center\">800</td>\r\n");
      out.write("                                        <td class=\"center\">11200</td>\r\n");
      out.write("                                        <td class=\"center\">0</td>\r\n");
      out.write("                                    </tr>\r\n");
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--End Advanced Tables -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- JS Scripts-->\r\n");
      out.write("    <!-- jQuery Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Js -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- Metis Menu Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("    <!-- DATA TABLE SCRIPTS -->\r\n");
      out.write("    <script src=\"assets/js/dataTables/jquery.dataTables.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/dataTables/dataTables.bootstrap.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#dataTables-example').dataTable();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Custom Js -->\r\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
