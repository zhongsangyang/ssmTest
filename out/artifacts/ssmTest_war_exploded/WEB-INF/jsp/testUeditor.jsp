<%--
  Created by IntelliJ IDEA.
  User: 钟桑扬
  Date: 2018/1/4
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path=request.getContextPath();
%>
<script src="<%=path%>/utf8-jsp/ueditor.config.js"></script>
<script src="<%=path%>/utf8-jsp/ueditor.all.js"></script>
<script src="<%=path%>/bootstrap-3.3.7-dist/jquery/jquery-3.2.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>

<body>

<button onclick="getContent();">
        获得文本内容
</button>
    <textarea id="myEditor" name="EditorInfo">

    </textarea>
<script>
    var ue=UE.getEditor("myEditor");
    function  getContent() {

        var content=ue.getContent();
        console.log(content+"我是在线编辑器的内容");

        $.ajax({
           url:"<%=path%>/ueditor/testUeditor",
           type:"POST",
           async:false,
           data:{
              "content": content
           },
           success:function () {
               alert("成功");
           },
           error:function () {
               alert("失败");
           }
       });

    }
</script>
</body>
</html>
