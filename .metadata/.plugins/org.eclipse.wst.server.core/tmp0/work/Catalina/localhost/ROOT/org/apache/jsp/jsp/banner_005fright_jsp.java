/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-07-19 09:05:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Collections;
import java.util.Arrays;
import java.net.URLDecoder;
import java.util.ArrayList;
import com.spring.biz.vo.ItemVO;
import java.util.List;
import java.net.URLEncoder;

public final class banner_005fright_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/JAVA/workspace_Spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ShoppingMall/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1552007909666L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Arrays");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.net.URLDecoder");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("com.spring.biz.vo.ItemVO");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<HTML lang=\"KO\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>우측 고정배너 </title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t// 기존 css에서 플로팅 배너 위치(top)값을 가져와 저장한다.\r\n");
      out.write("\tvar floatPosition = parseInt($(\"#floatMenu\").css('top'));\r\n");
      out.write("\t// 250px 이런식으로 가져오므로 여기서 숫자만 가져온다. parseInt( 값 );\r\n");
      out.write("\t$(window).scroll(function() {\r\n");
      out.write("\t\t// 현재 스크롤 위치를 가져온다.\r\n");
      out.write("\t\tvar scrollTop = $(window).scrollTop() ;\r\n");
      out.write("\t\tvar newPosition = scrollTop  + floatPosition + \"px\";\r\n");
      out.write("\t\t$(\"#floatMenu\").stop().animate({\r\n");
      out.write("\t\t\t\"top\" : newPosition\r\n");
      out.write("\t\t}, 500);\r\n");
      out.write("\t}).scroll();\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".side {\r\n");
      out.write("\tposition:absolute;  \r\n");
      out.write("\r\n");
      out.write("\ttop:300px; \r\n");
      out.write("\tright:50px; \r\n");
      out.write("\tz-index:3; \r\n");
      out.write("\twidth:100px; \r\n");
      out.write("\theight : 400px; \r\n");
      out.write("\tbackground: #F5F5F5;\r\n");
      out.write("\toverflow: auto;\r\n");
      out.write("\tborder-radius: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".style-2::-webkit-scrollbar-track\r\n");
      out.write("{\r\n");
      out.write("\t-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\tbackground-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".style-2::-webkit-scrollbar\r\n");
      out.write("{\r\n");
      out.write("\twidth: 12px;\r\n");
      out.write("\tbackground-color: #F5F5F5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".style-2::-webkit-scrollbar-thumb\r\n");
      out.write("{\r\n");
      out.write("\tborder-radius: 10px;\r\n");
      out.write("\t-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);\r\n");
      out.write("\tbackground-color: #ed6161;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<!--자바 소스  -->\r\n");

//오른쪽 배너 쿠키 
		ItemVO itemVO = new ItemVO();
		Cookie[] cookieArray = request.getCookies();
		List<ItemVO> itemVOList = new ArrayList<>();
		if (cookieArray != null) {
			for (int i = 0; i < cookieArray.length; i++) {
				if (cookieArray[i].getName().startsWith("itemCode")) {
					String itemThumbnail  = (URLDecoder.decode(cookieArray[i].getValue(), "UTF-8"));
					String itemCode  = (cookieArray[i].getName());
					itemVO = new ItemVO();
					String [] itemCodeSplit = itemCode.split("itemCode");
					itemVO.setItemCode(Integer.parseInt(itemCodeSplit[1]));
					itemVO.setItemThumbnail(itemThumbnail);
					itemVOList.add(itemVO);
				}
			}
			itemVO.setItemVOList(itemVOList);
		}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\" class=\"side style-2\" id=\"floatMenu\" >\r\n");
      out.write("\t\t<div style=\"height: 10px;\"></div>\r\n");
      out.write("\t\t<label style=\"font-size: small;\">최근 본 상품</label>\r\n");
      out.write("\t\t<div style=\"height: 10px;\"></div>\r\n");
      out.write("\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /jsp/banner_right.jsp(96,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems(itemVO.getItemVOList() );
        // /jsp/banner_right.jsp(96,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVarStatus("index");
        // /jsp/banner_right.jsp(96,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("list");
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t<img alt=\"\" src=\"../img/");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.itemThumbnail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("\" onclick=\"location.href='itemInfo.do?itemCode=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${list.itemCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
              out.write("'\" style=\"width: 50px; height: 50px;\">\r\n");
              out.write("\t\t\t<hr>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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