/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-07 05:22:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ru\">\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        <div class=\"row mt-2 ml-1 mr-1\" id=\"top\">\r\n");
      out.write("            <div class=\"col text-right\">\r\n");
      out.write("                <i class=\"fa fa-phone\"></i>\r\n");
      out.write("                <span class=\"d-none d-inline style-fa\">+038 067 564-88-88</span>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span class=\"d-none d-lg-inline style-fa\">Мой профиль</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"/user/bascket\">\r\n");
      out.write("                    <div class=\"fa fa-shopping-cart  basket\" aria-hidden=\"true\">\r\n");
      out.write("                        <div id=\"goods-basket\" class=\"display-off\">2</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <span class=\"d-none d-lg-inline style-fa\">Корзина</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <i class=\"fa fa-share\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span class=\"d-none d-lg-inline style-fa\">Выход</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row mt-2 mr-1 ml-1\" id=\"logo\" >\r\n");
      out.write("        <div  style=\"width: 181px\" >\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <img src=\"../../../resources/images/logo2.png\" alt=\"diselexpert.com.ua\">\r\n");
      out.write("        </div>\r\n");
      out.write("            <div class=\"col\" id=\"repead-images\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        <nav id=\"menu\" class=\"navbar navbar-expand-lg navbar-light mt-2\">\r\n");
      out.write("            <a class=\"navbar-brand color_white\" href=\"/user/allcategory/1\">Меню</a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                <ul class=\"navbar-nav mr-auto color_white\">\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link color_white_hover\" href=\"#\">Отзывы</a>\r\n");
      out.write("                        <!--<span class=\"sr-only\">(current)</span>-->\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link color_white_hover\" href=\"#\">Доставка</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link color_white_hover\" href=\"#\">Контакты</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"nav-item\">\r\n");
      out.write("                        <a class=\"nav-link color_white_hover\" href=\"#\">О сервисе</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container mt-3\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row justify-content-md-center\">\r\n");
      out.write("        <div class=\"col col-lg-8 col-sm-12 col-md-12 col-xl-8\">\r\n");
      out.write("            <div class=\"image mb-2\">Благодарим Вас за выбор товара</div>\r\n");
      out.write("            <div class=\"header  product-border\">\r\n");
      out.write("                <div class=\"select-all\">\r\n");
      out.write("                    <!--<form>-->\r\n");
      out.write("                    <div class=\"custom-control custom-checkbox\">\r\n");
      out.write("                        <input type=\"checkbox\" class=\"custom-control-input\" id=\"customCheck\" checked>\r\n");
      out.write("                        <label class=\"custom-control-label\" for=\"customCheck\">Выбрать все доступные товары</label>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <!--</form>-->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"delete-position\">\r\n");
      out.write("                    <button>\r\n");
      out.write("                        <i class=\"fa fa-trash\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"conteiner-product\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"buy product-border\">\r\n");
      out.write("                <div class=\"buy-totalpaiment-infoclient\">\r\n");
      out.write("                    <div class=\"total-paiment\">\r\n");
      out.write("                        <div class=\"total-paiment-title\">К оплате</div>\r\n");
      out.write("                        <div class=\"total-paiment-price\">00</div>\r\n");
      out.write("                        <div class=\"price-unit\">гр.</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"info-client\">\r\n");
      out.write("                        <div class=\"info-client-fone\">\r\n");
      out.write("                            <div class=\"client-fone\">Введите номер телефона</div>\r\n");
      out.write("                            <div class=\"client-fone-data\">\r\n");
      out.write("                                <input type=\"tel\"  pattern=\"[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}\" placeholder=\"050-567-88-88\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"info-client-name\">\r\n");
      out.write("                            <div class=\"client-name\">Введите свое имя</div>\r\n");
      out.write("                            <div class=\"client-name-data\">\r\n");
      out.write("                                <input type=\"text\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button id=\"create-order\">Оформить заказ</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script src=\"../../../resources/js/DTO/DTOUzel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/services/AJAXService.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/user/user_basket.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/user/user_create_order.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /WEB-INF/views/user/basket.jsp(6,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("../template/userhead.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }
}
