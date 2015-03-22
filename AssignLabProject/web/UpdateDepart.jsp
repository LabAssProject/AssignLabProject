<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Update Department</title>
        <!--get All Active department from request --> 
        <c:set var="deptlist" value="${requestScope.allactiveDepart}"/>
        
        <meta charset="utf-8">
        <link rel="stylesheet" href="./css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="./css/style.css" type="text/css" media="all">
        <script type="text/javascript" src="./js/jquery-1.4.2.min.js" ></script>
        <script type="text/javascript" src="./js/cufon-yui.js"></script>
        <script type="text/javascript" src="./js/cufon-replace.js"></script>
        <script type="text/javascript" src="./js/Myriad_Pro_300.font.js"></script>
        <script type="text/javascript" src="./js/Myriad_Pro_400.font.js"></script>
      <!--  <script type="text/javascript" src="./js/script.js"></script>-->

        <script>

        </script>
</head>
<body id="page2">
    <iframe  name="iframe_ab"  style=" z-index: -1; border:none ; position:absolute; top:0; left:0; right:0; bottom:0; width:100%; height:100%" ></iframe>
    <!-- START PAGE SOURCE -->
    <div class="wrap">
        <header>
            <div class="container">
                <h1><a href="#">Student's site</a></h1>
                <nav>
                    <ul>
                        <li><a href="index.html" class="m1">Home</a></li>
                        <li><a href="Group.html" class="m2">Group</a></li>
                        <li class="current"><a href="Department.html" class="m3">Department</a></li>
                        <li><a href="Course.html" class="m4">Course</a></li>
                        <li><a href="User.html" class="m5">User</a></li>
                        <li class="last"><button type="button" class="btn btn-logout block full-width m-b">Log Out</button></li>

                    </ul>
                </nav>
                <form action="#" id="search-form">
                    <fieldset>
                        <div class="rowElem">
                            <input type="text" class="form-control" placeholder="Search" required="">
                            <button type="button" class="btn btn-search block full-width m-b">Search</button>
                    </fieldset>
                </form>
            </div>
        </header>
        <div class="container">
            <aside>
                <h3>Categories</h3>
                <ul class="categories">
                    <li><span><a href="createGroup.html" >Create Department</a></span></li>
                    <li><span><a href="updateGroup.html" >Update Department</a></span></li>
                    <li><span><a href="deleteGroup.html" >Delete Department</a></span></li>
                    <li class="last"><span><a href="deactivateGroup.html" >Deactivate Department</a></span></li>
                </ul>

                <h2>Fresh <span>News</span></h2>
                <ul class="news">
                    <li><strong>June 30, 2010</strong>
                        <h4><a href="#">Sed ut perspiciatis unde</a></h4>
                        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque. </li>
                    <li><strong>June 14, 2010</strong>
                        <h4><a href="#">Neque porro quisquam est</a></h4>
                        Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit consequuntur magni. </li>
                    <li><strong>May 29, 2010</strong>
                        <h4><a href="#">Minima veniam, quis nostrum</a></h4>
                        Uis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae. </li>
                </ul>
            </aside>
            <section id="content">
                <div class="inside" id="inside_form">
                    <form class="m-t" role="form"  method="get" action="ValidUpdateDepart">
                        <table class="form_table">
                            <tr>
                                <td colspan="2">
                                    <div id="form_header">Update Department</div>
                                </td>
                                <td></td>

                            </tr>
                            <tr>
                                <td>
                                    <h3>Select Department</h3>
                                </td>
                                <td>
                                    <div>
                                        <select class="form-control" name="AllDepart" id="deptsall">
                                            <option selected="selected" value="${null}" selected="selected">Choose...</option>
                                            <c:forEach var="fieldItem" items="${deptlist}">
                                                <option value="${fieldItem}">${fieldItem.name}</option>             
                                            </c:forEach>
                                        </select>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <button type="button" class="btn btn-create block full-width m-b" ><a id="link_btn" href="#openModal">Update</a></button>
                                </td>
                                <td></td>
                            </tr>
                        </table>
                    </form>
                    <!--Modal Dialog for Update group  -->
                    <div id="openModal" class="modalDialog">
                        <div>

                            <a href="#close" title="Close" class="close">X</a>
                            <form class="m-t" role="form" action="index.html">
                                <table class="popup-form">
                                    <tr>
                                        <td colspan="2">
                                            <div id="popup_form_header">Update Department</div>
                                        </td>
                                        <td></td>

                                    </tr>
                                    <tr>
                                        <td>
                                            <h3>Department Name</h3>
                                        </td>
                                        <td>
                                            <div class="form-group">
                                                <input type="text" class="form-control" name="name"  id="popup_txt1" placeholder="Department Name" required="">
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <h3>Department Description</h3>
                                        </td>
                                        <td>
                                            <div class="form-group">
                                                <textarea class="form-control" name="description" id="popup_txt2" placeholder="Department Description" required=""> </textarea>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2">
                                            <button type="submit" class="btn btn-create block full-width m-b" id="popup_btn1">Apply</button>
                                            <button type="submit" class="btn btn-create block full-width m-b" id="popup_btn2"><a id="link_btn" href="#close" >Cancel</a></button> 
                                        </td>
                                        <td>

                                        </td>
                                    </tr>
                                </table>
                            </form>

                        </div>
                    </div>
                </div>
            </section>
        </div>
    </div>
    <footer>
        <div class="footerlink">
            <p class="lf">Copyright &copy; 2010 <a href="#">Lab Management</a> - All Rights Reserved</p>
            <div style="clear:both;"></div>
        </div>
    </footer>
</html>

