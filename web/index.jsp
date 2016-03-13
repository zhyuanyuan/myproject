<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <script type="text/javascript" src="./lib/jquery-1.10.2.js"></script>
  </head>
  <body>
  <button id="btn">btn</button>

    <script type="text/javascript">

      $(function(){

        $("#btn").on("click", function (ev) {
          $.get("pages/testpage.do?command=search",{}, function (ev) {
            alert("over");
          });
        });


      });

    </script>
  </body>
</html>
