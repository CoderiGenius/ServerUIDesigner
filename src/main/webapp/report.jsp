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
                报道注册信息 <small>这儿记录着新生报道的详细信息，如登记注册，物品领用...</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="index.jsp">控制面板</a></li>
                <li><a href="#">报道注册信息 </a></li>
            </ol>
            <div class="row" >
                <div class="col-md-12" style="overflow-x: hidden">
                    <!-- Advanced Tables -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="btn btn-primary btn-md pull-right" role="button" href="report.jsp">实时刷新</a>
                        </div>
                        <div class="panel-body" style="margin-top: 20px">
                            <div class="table-responsive" style="overflow-x: hidden">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                    <tr>
                                        <th>学号</th>
                                        <th>是否领取一卡通</th>
                                        <th>是否领取军训服</th>
                                        <th>是否领取被褥</th>
                                        <th>是否领取钥匙</th>
                                        <th>欠缴费</th>
                                        <th>是否绿色通道</th>
                                        <th>报道时间</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr class="odd gradeX">
                                        <td>1408070206</td>
                                        <td>是</td>
                                        <td>是</td>
                                        <td class="center">是</td>
                                        <td class="center">是</td>
                                        <td>是</td>
                                        <td class="center">是</td>
                                        <td class="center">2017/08/13 15:46</td>
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
