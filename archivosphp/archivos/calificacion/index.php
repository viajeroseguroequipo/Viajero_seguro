<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Calificación </title>
</head>

<body>

<style type="text/css">
body
{
	color:#174DC2;
}
.enlaceboton {    font-family: verdana, arial, sans-serif; 
   font-size: 10pt; 
   font-weight: bold; 
   padding: 4px; 
   background-color: #174DC2; 
   color: #FFFFFF; 
   text-decoration: none; 
} 
.enlaceboton:link, 
.enlaceboton:visited { 
   border-top: 1px solid #cccccc; 
   border-bottom: 2px solid #666666; 
   border-left: 1px solid #cccccc; 
   border-right: 2px solid #666666; 
} 
.enlaceboton:hover { 
    border-bottom: 1px solid #cccccc; 
   border-top: 2px solid #666666; 
   border-right: 1px solid #cccccc; 
   border-left: 2px solid #666666; 
}
form{ width:250px; margin:0 auto; padding:10px; border: 1px solid #d9d9d9;}
form p, form input[type = "submit"]{text-align:center; font-size:20px;}


input[type = "radio"]{ display:none;/*position: absolute;top: -1000em;*/}
label{ color:grey;}

.clasificacion{
    direction: rtl;
    unicode-bidi: bidi-override;
}

label:hover,
label:hover ~ label{color:orange;}
input[type = "radio"]:checked ~ label{color:orange;}

</style>
</head>

<body>
<div id="wrapper">


<form action="" method="post">
  <p>Tu Calificación es muy importante para nosotros </p>
<p class="clasificacion">
<input id="radio1" type="radio" name="estrellas" value="5"><label for="radio1">&#9733;</label><input id="radio2" type="radio" name="estrellas" value="4"><label for="radio2">&#9733;</label><input id="radio3" type="radio" name="estrellas" value="3"><label for="radio3">&#9733;</label><input id="radio4" type="radio" name="estrellas" value="2"><label for="radio4">&#9733;</label><input id="radio5" type="radio" name="estrellas" value="1"><label for="radio5">&#9733;</label>
</p>
<p><input type="submit" value="Calificar" name="Calificar" /></p>
</form>
</div>
<div>

<p>Conoce Más en nuestro Blog </p>
<p></p><a href="https://viajeroseguro2019.blogspot.com/" title="https://viajeroseguro2019.blogspot.com/" target="_blank" class="enlaceboton">https://viajeroseguro2019.blogspot.com/</a>

</div>


</body>
</html>