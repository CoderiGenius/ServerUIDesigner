<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta content="" name="description" />
    <meta content="webthemez" name="author" />
    <title>新生注册服务系统</title>
	<!-- Bootstrap Styles-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FontAwesome Styles-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
        <!-- Custom Styles-->
    <link href="assets/css/custom-styles.css" rel="stylesheet" />
     <!-- Google Fonts-->
   <link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
    <!-- TABLE STYLES-->
    <link href="assets/js/dataTables/dataTables.bootstrap.css" rel="stylesheet" />
</head>
<body>
    <div id="wrapper">
        <jsp:include page="/layouts/nav.jsp"/>

        <!-- /. NAV SIDE  -->
        <div id="page-wrapper">
		  <div class="header">
                        <h1 class="page-header">
                           新生基本信息 <small>这儿记录着新生的入学的基本信息，如姓名，考号，学籍...</small>
                        </h1>
						<ol class="breadcrumb">
					  <li><a href="index.jsp">控制面板</a></li>
					  <li><a href="#">新生基本信息 </a></li>
					</ol>
              <div class="row" >
                  <div class="col-md-12" style="overflow-x: hidden">
                      <!-- Advanced Tables -->
                      <div class="panel panel-default">
                          <div class="panel-heading">
                              <a class="btn btn-primary btn-md pull-right" role="button">导入数据</a>
                          </div>
                          <div class="panel-body" style="margin-top: 20px">
                              <div class="table-responsive" style="overflow-x: hidden">
                                  <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                      <thead>
                                      <tr>
                                          <th>Rendering engine</th>
                                          <th>Browser</th>
                                          <th>Platform(s)</th>
                                          <th>Engine version</th>
                                          <th>CSS grade</th>
                                      </tr>
                                      </thead>
                                      <tbody>
                                      <tr class="odd gradeX">
                                          <td>Trident</td>
                                          <td>Internet Explorer 4.0</td>
                                          <td>Win 95+</td>
                                          <td class="center">4</td>
                                          <td class="center">X</td>
                                      </tr>
                                      <tr class="even gradeC">
                                          <td>Trident</td>
                                          <td>Internet Explorer 5.0</td>
                                          <td>Win 95+</td>
                                          <td class="center">5</td>
                                          <td class="center">C</td>
                                      </tr>

                                      </tbody>
                                  </table>
                              </div>

                          </div>
                      </div>
                      <!--End Advanced Tables -->
                  </div>
              </div>
		</div>

        </div>
     <!-- /. WRAPPER  -->
    <!-- JS Scripts-->
    <!-- jQuery Js -->
    <script src="assets/js/jquery-1.10.2.js"></script>
      <!-- Bootstrap Js -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Metis Menu Js -->
    <script src="assets/js/jquery.metisMenu.js"></script>
            <!-- DATA TABLE SCRIPTS -->
            <script src="assets/js/dataTables/jquery.dataTables.js"></script>
            <script src="assets/js/dataTables/dataTables.bootstrap.js"></script>
            <script>
                $(document).ready(function () {
                    $('#dataTables-example').dataTable();
                });
            </script>
            <!-- Custom Js -->
    <script src="assets/js/custom-scripts.js"></script>
 
</body>
</html>
