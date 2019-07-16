<?PHP


$hostname_localhost ="localhost";
$database_localhost ="viajero_seguro";
$username_localhost ="root";
$password_localhost ="";



$json=array();
				
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		$consulta="select * from pais";
		$resultado=mysqli_query($conexion,$consulta);
		
		while($registro=mysqli_fetch_array($resultado)){
			//echo $registro;
			$result["pais"]=$registro['Pais'];
			$result["cod"]=$registro['Cod_Pais'];
			$result["idioma"]=$registro['Idioma'];
			$result["moneda"]=$registro['Moneda'];
			$result["requisitos"]=$registro['Requisitos'];
			//$result["imagen"]=base64_encode($registro['imagen']);
			$result["ruta_imagen"]=$registro['ruta_imagen'];
			$result["ida"]=$registro['Id_Alojamiento'];
			$result["ids"]=$registro['Id_Sitios'];
			$result["idt"]=$registro['Id_Transporte'];
			$result["idc"]=$registro['Id_Capital'];
			$json['usuario'][]=$result;
			//echo $registro['id'].' - '.$registro['nombre'].'<br/>';
		}
		mysqli_close($conexion);
		echo json_encode($json);
?>

