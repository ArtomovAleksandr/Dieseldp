/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-08 20:38:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import application.entity.currency.Current;

public final class goods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ru\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<div class=\"container-fluid main-div mt-3\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("              <div class=\"input-group col-md-6 mt-3\">\r\n");
      out.write("                  <div class=\"input-group-prepend\">\r\n");
      out.write("                       <label class=\"input-group-text\" for=\"number\">Поиск товара</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <input type=\"text\" id=\"number\" class=\"form-control\" name=\"number\"\r\n");
      out.write("                          placeholder=\"Введите критерий поиска ...\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"input-group col-md-2 mt-3\">\r\n");
      out.write("                  <div class=\"input-group-prepend\">\r\n");
      out.write("                      <label class=\"input-group-text\" for=\"paginator\">Кол. элем</label>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <select class=\"custom-select\" id=\"paginator\">\r\n");
      out.write("                  </select>\r\n");
      out.write("              </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      <div class=\"row mt-4\">\r\n");
      out.write("          <div class=\"input-group col-md-3\">\r\n");
      out.write("              <div class=\"input-group-prepend mb-3\">\r\n");
      out.write("                  <label class=\"input-group-text\" for=\"factory\">Производитель</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <select class=\"custom-select\" id=\"factory\" name=\"factory\">\r\n");
      out.write("              </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group col-md-3\">\r\n");
      out.write("              <div class=\"input-group-prepend mb-3\">\r\n");
      out.write("                  <label class=\"input-group-text\" for=\"category\" name=\"category\">Категории</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <select class=\"custom-select\" id=\"category\">\r\n");
      out.write("              </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group col-md-3\">\r\n");
      out.write("              <div class=\"input-group-prepend mb-3\">\r\n");
      out.write("                  <label class=\"input-group-text\" for=\"groups\">Группы</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <select class=\"custom-select\" id=\"groups\">\r\n");
      out.write("              </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"input-group col-md-3\">\r\n");
      out.write("              <div class=\"input-group-prepend mb-3\">\r\n");
      out.write("                  <label class=\"input-group-text\" for=\"uzels\">Узлы</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <select class=\"custom-select\" id=\"uzels\">\r\n");
      out.write("              </select>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <table class=\"table table-bordered\">\r\n");
      out.write("          <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("              <th scope=\"col\">#</th>\r\n");
      out.write("              <th scope=\"col\">Касс. номер</th>\r\n");
      out.write("              <th scope=\"col\">Наименование</th>\r\n");
      out.write("              <th scope=\"col\">Катал. номер</th>\r\n");
      out.write("              <th scope=\"col\">Ед. изм.</th>\r\n");
      out.write("              <th scope=\"col\">Маркировка</th>\r\n");
      out.write("              <th scope=\"col\">Входная цена</th>\r\n");
      out.write("              <th scope=\"col\">Валюта</th>\r\n");
      out.write("              <th scope=\"col\">Выч.цена</th>\r\n");
      out.write("             <th scope=\"col\">наценка</th>\r\n");
      out.write("              <th scope=\"col\">Прод.цена</th>\r\n");
      out.write("              <th scope=\"colgroup\">Цена</th>\r\n");
      out.write("              <th scope=\"colgroup\">Производ.</th>\r\n");
      out.write("              <th scope=\"colgroup\">Категории</th>\r\n");
      out.write("              <th scope=\"colgroup\">Группы</th>\r\n");
      out.write("              <th scope=\"colgroup\">Узлы</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("\r\n");
      out.write("          </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("    <div class=\"mt-4 row justify-content-center\">\r\n");
      out.write("              <nav>\r\n");
      out.write("                <ul class=\"pagination\"id=\"pagination\">\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                             ");
      out.write("\r\n");
      out.write("                                 ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                  ");
      out.write("\r\n");
      out.write("                             ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("      <div class=\"mt-4 row\">\r\n");
      out.write("          <div class=\"col-md-12 text-center\">\r\n");
      out.write("              <button type=\"submit\" id=\"create\" class=\"btn btn-outline-danger pl-5 pr-5\">\r\n");
      out.write("                  Создать\r\n");
      out.write("              </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-12 text-center\">\r\n");
      out.write("          <button type=\"submit\" id=\"archive\" class=\"btn btn-outline-danger pl-5 pr-5\">\r\n");
      out.write("              В Архив\r\n");
      out.write("          </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-12 text-center\">\r\n");
      out.write("              <button type=\"submit\" id=\"update\" class=\"btn btn-outline-danger pl-5 pr-5\">\r\n");
      out.write("                  Редактировать\r\n");
      out.write("              </button>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-md-12 text-center\">\r\n");
      out.write("              <button type=\"submit\" id=\"delete\" class=\"btn btn-outline-danger pl-5 pr-5\">\r\n");
      out.write("                  Удалить\r\n");
      out.write("              </button>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      if (_jspx_meth_c_005fimport_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!--Scripts-->\r\n");
      out.write("<script src=\"../../../resources/js/DTO/DTOGoods.js\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/DTO/DTOGoodsTable.js\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/services/AJAXService.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_table.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_delete.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_create_elementspage.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_create_table.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_create_paginator.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"../../../resources/js/goods/table/goods_ajax.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
    // /WEB-INF/views/goods/goods.jsp(8,4) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("../template/head.jsp");
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

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f1.setParent(null);
    // /WEB-INF/views/goods/goods.jsp(13,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f1.setUrl("../template/header.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
      if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f2 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f2.setParent(null);
    // /WEB-INF/views/goods/goods.jsp(197,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f2.setUrl("../template/footer.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f2 = _jspx_th_c_005fimport_005f2.doStartTag();
      if (_jspx_th_c_005fimport_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f2);
    }
    return false;
  }
}
