/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-03-05 15:05:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clothInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>衣服添加</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/staticfile/css/addclothcss/shouye.css\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.Xcontent06 {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\twidth:400px;\r\n");
      out.write("\t\theight: 500px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t.Xcontent13 {\r\n");
      out.write("\t\tmargin: 100px ;\r\n");
      out.write("\t}\r\n");
      out.write("\t.Xcontent24,.Xcontent25 {\r\n");
      out.write("\t\theight: 30px;\r\n");
      out.write("\t\tline-height: 30px;\r\n");
      out.write("\t\tfont-size: 1.6em;\r\n");
      out.write("\t}\r\n");
      out.write("\tinput {\r\n");
      out.write("\t\theight: 30px;\r\n");
      out.write("\t\tline-height: 30px;\r\n");
      out.write("\t\tfont-size: 20px;;\r\n");
      out.write("\t}\r\n");
      out.write("\tselect {\r\n");
      out.write("\t\twidth:100px;\r\n");
      out.write("\t\theight: 30px;\r\n");
      out.write("\t\tfont-size: 20px; \r\n");
      out.write("\t}\r\n");
      out.write("\toption {\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#upload {\r\n");
      out.write("\t\twidth: 300px;\r\n");
      out.write("\t\tmargin-left: 20px;\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\t#cvs {\r\n");
      out.write("\t\twidth: 600px;\r\n");
      out.write("\t\theight: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t.Xcontent {\r\n");
      out.write("\t\tmargin: 100px auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t#save {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tbottom: 350px;\r\n");
      out.write("\t\tleft: 950px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#back {\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tbottom: 350px;\r\n");
      out.write("\t\tleft: 1150px;\r\n");
      out.write("\t}\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\tbackground: url(\"/staticfile/images/addcloth.jpg\") no-repeat center center;\r\n");
      out.write("\t\tbackground-size: cover;\r\n");
      out.write("\t\tmin-width: 1010px;\r\n");
      out.write("\t\tmin-height: 850px;     \r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"Xcontent\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<ul class=\"Xcontent01\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"Xcontent06\">\r\n");
      out.write("\t\t\t\t\t<img style=\"margin-top:100px;margin-left:150px;width:300px;height:300px;\" src=\"http://");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.url }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<ol class=\"Xcontent13\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"Xcontent17\"> -->\r\n");
      out.write("\t\t\t\t\t\t<!-- <p class=\"Xcontent18\">售价</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent19\">￥<span>69.00</span></p> -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"uId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"Xcontent24\">名称：</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"Xcontent25\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"Xcontent24\">季节：</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"Xcontent25\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.season}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t   <!-- </div> -->\r\n");
      out.write("\t\t\t\t\t   <div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t    <p class=\"Xcontent24\">风格：</p>\r\n");
      out.write("\t\t\t\t\t\t    <p class=\"Xcontent25\">\r\n");
      out.write("\t\t\t\t\t\t    \t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.style}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t    </p>\r\n");
      out.write("\t\t\t\t\t   </div>\r\n");
      out.write("\t\t\t\t\t    &nbsp;\r\n");
      out.write("\t\t\t\t\t    <div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent24\">分类：</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent25\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.category}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t    &nbsp;\r\n");
      out.write("\t\t\t\t\t      <div class=\"Xcontent23\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent24\">说明：</p>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"Xcontent25\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cloth.remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</ol>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"back\">\r\n");
      out.write("\t\t<a href=\"toclothUpList.action?userId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.userId.value }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"><img alt=\"\" src=\"/staticfile/images/back.png\"></a>\r\n");
      out.write("\t</div>\r\n");
      out.write("<script type=\"text/javascript\" class=\"autoinsert\" src=\"staticFile/js/jquery-1.2.6.min.js\"></script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("//获取上传按钮\r\n");
      out.write("var input1 = document.getElementById(\"upload\"); \r\n");
      out.write(" \r\n");
      out.write("if(typeof FileReader==='undefined'){ \r\n");
      out.write("     //result.innerHTML = \"抱歉，你的浏览器不支持 FileReader\"; \r\n");
      out.write("     input1.setAttribute('disabled','disabled'); \r\n");
      out.write("}else{ \r\n");
      out.write("     input1.addEventListener('change',readFile,false); \r\n");
      out.write("     /*input1.addEventListener('change',function (e){\r\n");
      out.write("     \tconsole.log(this.files);//上传的文件列表\r\n");
      out.write("     },false); */\r\n");
      out.write("}\r\n");
      out.write("function readFile(){ \r\n");
      out.write("\tvar file = this.files[0];//获取上传文件列表中第一个文件\r\n");
      out.write("\tif(!/image\\/\\w+/.test(file.type)){\r\n");
      out.write("\t//图片文件的type值为image/png或image/jpg\r\n");
      out.write("\t\talert(\"文件必须为图片！\");\r\n");
      out.write("\t\treturn false; \r\n");
      out.write("\t} \r\n");
      out.write("\t// console.log(file);\r\n");
      out.write("\tvar reader = new FileReader();//实例一个文件对象\r\n");
      out.write("\treader.readAsDataURL(file);//把上传的文件转换成url\r\n");
      out.write("\t//当文件读取成功便可以调取上传的接口\r\n");
      out.write("\treader.onload = function(e){ \r\n");
      out.write("\t\t// console.log(this.result);//文件路径\r\n");
      out.write("\t\t// console.log(e.target.result);//文件路径\r\n");
      out.write("\t\t/*var data = e.target.result.split(',');\r\n");
      out.write("\t\tvar tp = (file.type == 'image/png')? 'png': 'jpg';\r\n");
      out.write("\t\tvar imgUrl = data[1];//图片的url，去掉(data:image/png;base64,)\r\n");
      out.write("\t\t//需要上传到服务器的在这里可以进行ajax请求\r\n");
      out.write("\t\t// console.log(imgUrl);\r\n");
      out.write("\t\t// 创建一个 Image 对象 \r\n");
      out.write("\t\tvar image = new Image();\r\n");
      out.write("\t\t// 创建一个 Image 对象 \r\n");
      out.write("\t\t// image.src = imgUrl;\r\n");
      out.write("\t\timage.src = e.target.result;\r\n");
      out.write("\t\timage.onload = function(){\r\n");
      out.write("\t\t\tdocument.body.appendChild(image);\r\n");
      out.write("\t\t}*/\r\n");
      out.write("\r\n");
      out.write("\t\tvar image = new Image();\r\n");
      out.write("\t\t// 设置src属性 \r\n");
      out.write("\t\timage.src = e.target.result;\r\n");
      out.write("\t\tvar max=200;\r\n");
      out.write("\t\t// 绑定load事件处理器，加载完成后执行，避免同步问题\r\n");
      out.write("\t\timage.onload = function(){ \r\n");
      out.write("\t\t\t// 获取 canvas DOM 对象 \r\n");
      out.write("\t\t\tvar canvas = document.getElementById(\"cvs\"); \r\n");
      out.write("\t\t\t// 如果高度超标 宽度等比例缩放 *= \r\n");
      out.write("\t\t\t/*if(image.height > max) {\r\n");
      out.write("\t\t\t\timage.width *= max / image.height; \r\n");
      out.write("\t\t\t\timage.height = max;\r\n");
      out.write("\t\t\t} */\r\n");
      out.write("\t\t\t// 获取 canvas的 2d 环境对象, \r\n");
      out.write("\t\t\tvar ctx = canvas.getContext(\"2d\"); \r\n");
      out.write("\t\t\t// canvas清屏 \r\n");
      out.write("\t\t\tctx.clearRect(0, 0, canvas.width, canvas.height); \r\n");
      out.write("\t\t\t// 重置canvas宽高\r\n");
      out.write("\t\t\t/*canvas.width = image.width;\r\n");
      out.write("\t\t\tcanvas.height = image.height;\r\n");
      out.write("\t\t\tif (canvas.width>max) {canvas.width = max;}*/\r\n");
      out.write("\t\t\t// 将图像绘制到canvas上\r\n");
      out.write("\t\t\t// ctx.drawImage(image, 0, 0, image.width, image.height);\r\n");
      out.write("\t\t\tctx.drawImage(image, 0, 0, 200, 200);\r\n");
      out.write("\t\t\t// 注意，此时image没有加入到dom之中\r\n");
      out.write("\t\t};  \r\n");
      out.write("\t}\r\n");
      out.write("};</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}