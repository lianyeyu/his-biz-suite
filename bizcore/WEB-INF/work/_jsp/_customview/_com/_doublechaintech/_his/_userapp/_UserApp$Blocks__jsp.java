/*
 * JSP generated by Resin-resin-3.1.15 (built Mon, 13 Oct 2014 03:54:20 PDT)
 */

package _jsp._customview._com._doublechaintech._his._userapp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.util.*;
import com.doublechaintech.his.*;

public class _UserApp$Blocks__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/plain; charset=utf-8");
    request.setCharacterEncoding("UTF-8");
    com.caucho.jstl.rt.SetLocaleTag _jsp_SetLocaleTag_0 = null;
    com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_0 = null;
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      if (_jsp_SetLocaleTag_0 == null) {
        _jsp_SetLocaleTag_0 = new com.caucho.jstl.rt.SetLocaleTag();
        _jsp_SetLocaleTag_0.setPageContext(pageContext);
        _jsp_SetLocaleTag_0.setParent((javax.servlet.jsp.tagext.Tag) null);
        _jsp_SetLocaleTag_0.setValue("zh_CN");
      }

      _jsp_SetLocaleTag_0.doStartTag();
      out.write('\n');
      pageContext.defaultSetOrRemove("ignoreListAccessControl", java.lang.Boolean.TRUE);
      out.write(_jsp_string1, 0, _jsp_string1.length);
      _jsp_SetLocaleTag_0.doStartTag();
      out.write(_jsp_string2, 0, _jsp_string2.length);
      BaseEntity result=(BaseEntity)request.getAttribute("result");
      out.write(_jsp_string3, 0, _jsp_string3.length);
      if (_caucho_expr_0.evalBoolean(_jsp_env)) {
        out.write(_jsp_string4, 0, _jsp_string4.length);
        if (_jsp_loop_0 == null)
          _jsp_loop_0 = new com.caucho.jsp.IteratorLoopSupportTag();
        java.lang.Object _jsp_items_9 = _caucho_expr_1.evalObject(_jsp_env);
        java.util.Iterator _jsp_iter_9 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_9);
        _jsp_loop_0.init(0, Integer.MAX_VALUE, 1);
        Object _jsp_oldVar_9 = pageContext.getAttribute("item");
        while (_jsp_iter_9.hasNext()) {
          Object _jsp_i_9 = _jsp_iter_9.next();
          pageContext.setAttribute("item", _jsp_i_9);
          _jsp_loop_0.setCurrent(_jsp_i_9, _jsp_iter_9.hasNext());
          out.write(_jsp_string5, 0, _jsp_string5.length);
          _caucho_expr_2.print(out, _jsp_env, false);
          out.write(_jsp_string6, 0, _jsp_string6.length);
          _caucho_expr_3.print(out, _jsp_env, false);
          out.write(_jsp_string7, 0, _jsp_string7.length);
          _caucho_expr_4.print(out, _jsp_env, false);
          out.write(_jsp_string8, 0, _jsp_string8.length);
        }
        pageContext.pageSetOrRemove("item", _jsp_oldVar_9);
        out.write(_jsp_string9, 0, _jsp_string9.length);
      }
      out.write(_jsp_string10, 0, _jsp_string10.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      if (_jsp_SetLocaleTag_0 != null)
        _jsp_SetLocaleTag_0.release();
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 3802963613949670813L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
    manager.addTaglibFunctions(_jsp_functionMap, "fmt", "http://java.sun.com/jsp/jstl/fmt");
    manager.addTaglibFunctions(_jsp_functionMap, "fn", "http://java.sun.com/jsp/jstl/functions");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${not empty result.userAppList}");
    _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${result.userAppList}");
    _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${item.id}");
    _caucho_expr_3 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${item.appIcon}");
    _caucho_expr_4 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${item.title}");
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("customview/com/doublechaintech/his/userapp/UserApp$Blocks.jsp"), 7566299489037016230L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    depend = new com.caucho.vfs.Depend(mergePath.lookup("jar:file:/opt/resin-3.1.12/lib/resin.jar!/com/caucho/jstl/fmt.tld"), 8594578285720415164L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, new com.caucho.make.ClassDependency(com.caucho.jstl.rt.SetLocaleTag.class, -5807438068488217094L));
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;
  private static com.caucho.el.Expr _caucho_expr_3;
  private static com.caucho.el.Expr _caucho_expr_4;

  private final static char []_jsp_string4;
  private final static char []_jsp_string10;
  private final static char []_jsp_string9;
  private final static char []_jsp_string2;
  private final static char []_jsp_string6;
  private final static char []_jsp_string0;
  private final static char []_jsp_string7;
  private final static char []_jsp_string1;
  private final static char []_jsp_string5;
  private final static char []_jsp_string3;
  private final static char []_jsp_string8;
  static {
    _jsp_string4 = "\n\n\n\n\n\n ".toCharArray();
    _jsp_string10 = "\n\n\n\n".toCharArray();
    _jsp_string9 = "\n\n\n 	\n\n\n</div>       <!-- /.row -->\n        \n\n\n</div>".toCharArray();
    _jsp_string2 = "\n\n\n".toCharArray();
    _jsp_string6 = "/\"> \n                <i class=\"icon fa fa-".toCharArray();
    _jsp_string0 = "\n\n\n\n\n\n\n\n\n".toCharArray();
    _jsp_string7 = " fa-5x\" ></i> <br/> ".toCharArray();
    _jsp_string1 = "\n\n".toCharArray();
    _jsp_string5 = "\n				\n	 <span class=\" col-xs-6 col-xm-6 col-sm-6 col-md-4 col-lg-3  text-center align-middle  icon-effect-1 icon-effect-1b\">\n	  			<br/><br/>\n                 <a href=\"./secUserManager/selectApp/".toCharArray();
    _jsp_string3 = "\n\n\n    ".toCharArray();
    _jsp_string8 = " \n                </a>\n                \n                \n      </span>			\n	\n		\n".toCharArray();
  }
}
