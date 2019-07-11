<?PHP


$hostname_localhost ="localhost";
$database_localhost ="viajero_seguro";
$username_localhost ="root";
$password_localhost ="";


$json=array();
				
		
				
		$conexion = mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

		$consulta="select * from capital";
		$resultado=mysqli_query($conexion,$consulta);
		
		while($registro=mysqli_fetch_array($resultado)){
			$result["c1"]=$registro['Nombre'];
			$result["c2"]=$registro['Cod_Postal'];
			$result["c3"]=$registro['Latitud'];
			$result["c4"]=$registro['Longitud'];
			$result["c5"]=$registro['Clima'];
			$result["c6"]=$registro['imagen'];
			$result["c7"]=$registro['N_Si'];
			$result["c8"]=$registro['N_T'];
			$result["c9"]=$registro['N_Dr'];
			$result["c10"]=$registro['N_Ob'];
			$result["c11"]=$registro['N_Si1'];
			$result["c12"]=$registro['N_T1'];
			$result["c13"]=$registro['N_Dr1'];
			$result["c14"]=$registro['N_Ob1'];
			$result["c15"]=$registro['N_Si2'];
			$result["c16"]=$registro['N_T2'];
			$result["c17"]=$registro['N_Dr2'];
			$result["c18"]=$registro['N_Ob2'];
			$result["c19"]=$registro['N_Al'];
			$result["c20"]=$registro['N_Ta'];
			$result["c21"]=$registro['N_Dra'];
			$result["c22"]=$registro['N_Oba'];
			$result["c23"]=$registro['N_Al1'];
			$result["c24"]=$registro['N_Ta1'];
			$result["c25"]=$registro['N_Dra1'];
			$result["c26"]=$registro['N_Oba1'];
			$result["c27"]=$registro['N_Al2'];
			$result["c28"]=$registro['N_Ta2'];
			$result["c29"]=$registro['N_Dra2'];
			$result["c30"]=$registro['N_Oba2'];
			$result["c31"]=$registro['N_Tra'];
			$result["c32"]=$registro['N_Tao'];
			$result["c33"]=$registro['N_Tra1'];
			$result["c34"]=$registro['N_Tao1'];
			$result["ruta_imagen"]=$registro['imagen'];
			$json['usuario'][]=$result;
			//echo $registro['id'].' - '.$registro['nombre'].'<br/>';
		}
		
		//echo $result["c31"];
		mysqli_close($conexion);
		echo json_encode($json);
	/*
		while($registro=mysql_fetch_assoc($resultado)){
	//echo $registro;		
			$result["c1"]=$registro['Nombre'];
			$result["c2"]=$registro['Cod_Postal'];
			$result["c3"]=$registro['Latitud'];
			$result["c4"]=$registro['Longitud'];
			$result["c5"]=$registro['Clima'];
			$result["c6"]=$registro['imagen'];
			/*$result["c7"]=$registro['Nombre_Sitio'];
			$result["c8"]=$registro['Tipo'];
			$result["c9"]=$registro['Direccion'];
			$result["c10"]=$registro['Observacion'];
			$result["c11"]=$registro['Nombre_Aloja'];
			$result["c12"]=$registro['Direcc_Aloja'];
			$result["c13"]=$registro['Telefono_Aloja'];
			$result["c14"]=$registro['Observacion_Aloja'];
			$result["c15"]=$registro['Nom_Trasn1'];
			$result["c16"]=$registro['Observacion_01'];
			$result["c17"]=$registro['Nom_Trasn2'];
			$result["c18"]=$registro['Observacion_02'];
			$result["ruta_imagen"]=$registro['imagen'];
			*/
?>

