<html>

<head>
	<title>Cargar Imagenes</title>
</head>

	<body>
		<form method='POST' action="recibirImagenRegistrada.php" enctype="multipart/form-data">
		
			
			
		  <label>Pais</label>
			<input type='text' name="pais" id="pais"/>
			<br/><br/>
		
		  <label>Codigo</label>
			<input type='text' name="codigo" id="codigo"/>
			<br/><br/>
			
		  <label>Idioma</label>
			<input type='text' name="idioma" id="idioma"/>
			<br/><br/>
            
            
		  <label>Moneda</label>
			<input type='text' name="moneda" id="moneda"/>
			<br/><br/>
		
		  <label>Requisitos</label>
			<input type='text' name="requisitos" id="requisitos"/>
			<br/><br/>
		
        <label>Ingresa Imagen</label>
			<input type='file' name="imagen"/>
			<br/><br/>	
            
            
			
		  <label>IdAloja</label>
			<input type='text' name="aloja" id="aloja"/>
			<br/><br/>
            
            
			
		  <label>Idsitios</label>
			<input type='text' name="sitios" id="sitios"/>
			<br/><br/>
            
            
			
		  <label>Idtransporte</label>
			<input type='text' name="trasnporte" id="trasnporte"/>
			<br/><br/>
            
            
			
		  <label>Idcapital</label>
			<input type='text' name="capital" id="capital"/>
			<br/><br/>
        
		  <button type="submit" name="btn"> Agregar </button>
		
		</form>
	</body>
</html>


