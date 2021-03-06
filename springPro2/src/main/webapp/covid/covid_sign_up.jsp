<%--
  /**
  * Class Name : 
  * Description : 
  * Modification Information
  *
  *   수정일                   수정자                      수정내용
  *  -------    --------    ---------------------------
  *  2020. 5. 6.            최초 생성
  *
  * author 실행환경 개발팀
  * since 2009.01.06
  *
  * Copyright (C) 2009 by KandJang  All right reserved.
  */
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 
<c:set var="hContext" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
  <title>Bombom</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,300,400,500,600,700,800,900" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/open-iconic-bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/animate.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/owl.carousel.min.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/owl.theme.default.min.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/magnific-popup.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/aos.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/ionicons.min.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/flaticon.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/icomoon.css">
  <link rel="stylesheet" type="text/css" href="${hContext}/resources/css/style.css">
</head>

<body>
    <nav class="navbar navbar-expand-lg navbar-dark ftco_navbar ftco-navbar-light site-navbar-target" id="ftco-navbar">
        <div class="container">
          <a class="navbar-brand" href="index.jsp"><span>B</span>ombom</a>
          <button class="navbar-toggler js-fh5co-nav-toggle fh5co-nav-toggle" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
          </button>

          <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav nav ml-auto">
              <li class="nav-item"><a href="#home-section" class="nav-link"><span>Home</span></a></li>
              <li class="nav-item"><a href="#about-section" class="nav-link"><span>About</span></a></li>
              <li class="nav-item"><a href="#License-section" class="nav-link"><span>License</span></a></li>
              <li class="nav-item"><a href="#Skills-section" class="nav-link"><span>Skills</span></a></li>
              <li class="nav-item"><a href="#Projects-section" class="nav-link"><span>Projects</span></a></li>
            </ul>
          </div>
        </div>
    </nav>
      
    <div>
        <br/>
        <br/>
        <br/>
    </div>   
    <!-- Sign Up -->
        <section class="ftco-about img ftco-section ftco-no-pt ftco-no-pb" id="signup-section">
            <div class="container-fluid px-md-5">
                <div class="row justify-content-center py-5 mt-5">
                    <div class="col-md-12 heading-section text-center ftco-animate">
                         <h2 class="mb-4">COVID-19: User Sign Up</h2>
                         <div align="center">
                            <form action="" name="signUp_form" method="get">
                            <table>
                            <tbody>
                                <tr>
                                
                                    <td>
                                    <input  type="text" class="form-control id" name="memberId" id="memberId" placeholder="Id"  maxlength="15" autofocus>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                    <input type="password" class="form-control pass" name="password" id="password" placeholder="Password">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                    <input type="password" class="form-control pass" name="passwordConfirm" id="passwordConfirm" placeholder="Confirm Password" >
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                    <input type="email" class="form-control email" name="email" id="email" placeholder="Email"  autofocus>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        Phone : <select name="phone1" id="phone1">
                                           <option value="010">010</option>
                                           <option value="011">011</option>
                                           <option value="016">016</option>
                                           <option value="017">017</option>
                                           <option value="019">019</option>
                                         </select>
                                         - <input type="text" name="phone2" id="phone2" size="5" maxlength="4"> - <input type="text" name="phone3" id="phone3" size="5" maxlength="4"><br><br>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                    <button type="submit" class="form-control btn btn-danger btn-sm" id="doInsertBtn"  >Sign Up</button>
                                </td>
                                </tr>
                                </tbody>
                                </table>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </section>



    <footer class="ftco-footer ftco-section">
      <div class="container">
        <div class="row mb-5">
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">About</h2>
              <p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.</p>
              <ul class="ftco-footer-social list-unstyled float-md-left float-lft mt-5">
                <li class="ftco-animate"><a href="#"><span class="icon-twitter"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-facebook"></span></a></li>
                <li class="ftco-animate"><a href="#"><span class="icon-instagram"></span></a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4 ml-md-4">
              <h2 class="ftco-heading-2">Links</h2>
              <ul class="list-unstyled">
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Home</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>About</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Services</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Projects</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Contact</a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
             <div class="ftco-footer-widget mb-4">
              <h2 class="ftco-heading-2">Services</h2>
              <ul class="list-unstyled">
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Web Design</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Web Development</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Business Strategy</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Data Analysis</a></li>
                <li><a href="#"><span class="icon-long-arrow-right mr-2"></span>Graphic Design</a></li>
              </ul>
            </div>
          </div>
          <div class="col-md">
            <div class="ftco-footer-widget mb-4">
                <h2 class="ftco-heading-2">Have a Questions?</h2>
                <div class="block-23 mb-3">
                  <ul>
                    <li><span class="icon icon-map-marker"></span><span class="text">203 Fake St. Mountain View, San Francisco, California, USA</span></li>
                    <li><a href="#"><span class="icon icon-phone"></span><span class="text">+2 392 3929 210</span></a></li>
                    <li><a href="#"><span class="icon icon-envelope"></span><span class="text">info@yourdomain.com</span></a></li>
                  </ul>
                </div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-12 text-center">

            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
  Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart color-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
          </div>
        </div>
      </div>
    </footer>
    
  

  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>





<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery-migrate-3.0.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/popper.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.easing.1.3.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.waypoints.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.stellar.min.js"/>"></script>
<script src="<c:url value="/resources/js/owl.carousel.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.magnific-popup.min.js"/>"></script>
<script src="<c:url value="/resources/js/aos.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.animateNumber.min.js"/>"></script>
<script src="<c:url value="/resources/js/scrollax.min.js"/>"></script>
<script src="<c:url value="/resources/js/main.js"/>"></script>
    
    <script type="text/javascript">
        /* function signUp() {
            console.log("signUp()");
            //var frm = document.signUp_frm;
            //frm.action = "${hContext}/member/signUp.spring";
            //frm.submit();
        } */

        
        //등록
         $("#doInsertBtn").on("click", function() {


             var idRex = /^[a-z0-9]{6,15}$/ // 영문 소문자, 숫자 6~15자
             var pwdRex = /^[a-zA-z0-9]{4,12}$/;
             
             console.log("doInsertBtn()");
            //값 null check
            if ($("#memberId").val() == "" || $("#memberId").val() == false) {
                alert("아이디를 입력 하세요.");
                $("#memberId").focus();
                return;
            }
            
            if(!idRex.test($("#memberId").val())){
                alert("아이디는 영문 소문자 또는 숫자 포함 6~15자리 입니다.");
                return;
            }
            if ($("#password").val() == "" || $("#password").val() == false) {
                alert("패스워드를 입력 하세요.");
                $("#password").focus();
                return;
            } 
            /* if($("password") != $("passwordConfirm")){
                alert("비밀번호가 서로 다릅니다. 비밀번호를 확인해 주세요."); 
                $("#passwordConfirm").focus();
                return; 
            } */
             if ($("#email").val() == "" || $("#email").val() == false) {
                alert("이메일을 입력 하세요.");
                $("#email").focus();
                return;
            }
            //confirm
            if (confirm("등록 하시겠습니까?") == false)return; 

             //ajax
            $.ajax({
                type : "GET",
               // url : "${hContext}/portfolio/SignUp/doInsertMember.spring",
                dataType : "html",
                data : {
                    "memberId" : $("#memberId").val(),
                    "password" : $("#password").val(),
                    "name" : $("#name").val(),
                    "email" : $("#email").val(),
                    "phone": $("#phone1").val()+$("#phone2").val()+$("#phone3").val(),
                    "authority" : "1",
                    "interestOption" : $("#interestPosition").val(),
                    "open" : "1"
                },
                success : function(data) { //성공
                    console.log("data:" + data);
                    var parseData = $.parseJSON(data);
                    if (parseData.msgId == "1") {
                        alert(parseData.msgMsg);
                    } else {
                        alert(parseData.msgMsg);
                    }

                },
                error : function(xhr, status, error) {
                    alert("error:" + error);
                },
                complete : function(data) {

                }

            });//--ajax 

        });

       /*   $("#memberTable>tbody").on("click", "tr", function() {
             //console.log("#memberTable>tbody");
             var trArray =$(this).children();
             var orgNm =  trArray.eq(0).text();
             //console.log("orgNm:"+orgNm);
             var saveNm =  trArray.eq(1).text();
             //console.log("saveNm:"+saveNm);

             var frm = document.fileDown;
             frm.orgNm.value = orgNm;
             frm.saveNm.value = saveNm;
             frm.submit();
             //$("#saveFileNm").val(saveFileNm);
             
        }); */

            
     </script>
    
</body>
</html>