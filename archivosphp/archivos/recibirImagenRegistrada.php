<?PHP


$hostname_localhost ="localhost";
$database_localhost ="viajero_seguro";
$username_localhost ="root";
$password_localhost ="";



$json['img']=array();

	//if(true){)
	if(isset($_POST["btn"])){
		
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);
		
		$ruta="imagenes";
		$archivo=$_FILES['imagen']['tmp_name'];
		echo 'Archivo';
		echo '<br>';
		echo $archivo;
		$nombreArchivo=$_FILES['imagen']['name'];
		echo 'Nombre Archivo';
		echo '<br>';
		echo $nombreArchivo;
		move_uploaded_file($archivo,$ruta."/".$nombreArchivo);
		$ruta=$ruta."/".$nombreArchivo;
		$pais=$_POST['pais'];
		$codigo=$_POST['codigo'];
		$idioma=$_POST['idioma'];
		$moneda=$_POST['moneda'];
		$requisitos=$_POST['requisitos'];
		$aloja=$_POST['aloja'];
		$sitios=$_POST['sitios'];
		$trasnporte=$_POST['trasnporte'];
		$capital=$_POST['capital'];
		
		echo '<br>';
		echo 'Documento: ';
		echo $pais;
		echo '<br>';
		echo 'Nombre: ';
		echo $codigo;
		echo '<br>';
		echo 'Profesion: ';
		echo $idioma;
		echo '<br>';
		echo 'ruta :';
		echo $ruta;
		echo '<br>';
		echo 'Tipo Imagen: ';
		echo ($_FILES['imagen']['type']);
		echo '<br>';
		echo '<br>';
		echo "Imagen: <br><img src='$ruta'>";
		echo '<br>';
		echo '<br>';
		echo 'imagen en Bytes: ';
		echo '<br>';
		echo '<br>';
		//echo $bytesArchivo=file_get_contents($ruta);
		echo '<br>';
		
		$bytesArchivo=file_get_contents($ruta);
		$sql="INSERT INTO pais(Pais,Cod_Pais,Idioma,Moneda,Requsitos,Imagen,ruta_imagen,Id_Alojamiento,Id_Sitios,Id_Transporte,Id_Capital) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
		$stm=$conexion->prepare($sql);
		$stm->bind_param('sssssssssss',$pais,$codigo,$idioma,$moneda,$requisitos,$bytesArchivo,$ruta,$aloja,$sitios,$trasnporte,$capital);
		
		if($stm->execute()){
			echo 'imagen Insertada Exitosamente ';
			$consulta="select * from pais where Cod_Pais='{$codigo}'";
			$resultado=mysqli_query($conexion,$consulta);
			echo '<br>';
			while ($row=mysqli_fetch_array($resultado)){
				echo $row['pais'].' - '.$row['pais'].'<br/>';
				array_push($json['img'],array('pais'=>$row['pais'],'codigo'=>$row['Cod_Pais'],'idioma'=>$row['Idioma'],'photo'=>base64_encode($row['nombre']),'ruta'=>$row['ruta_imagen']));
			}
			mysqli_close($conexion);
			
			echo '<br>';
			echo 'Objeto JSON 2';
			echo '<br>';
			echo json_encode($json);
		}
	}
?>