<?PHP


$hostname_localhost ="localhost";
$database_localhost ="viajero_seguro";
$username_localhost ="root";
$password_localhost ="";




$conexion=mysqli_connect($hostname_localhost,$username_localhost,$password_localhost,$database_localhost);

	$nombre = $_POST["nombre"];
	$email = $_POST["email"];
	$nacionalidad = $_POST["nacionalidad"];
	$imagen = $_POST["imagen"];
	$tipo = "Usuario";

	
	$path = "imagenes/$nombre.jpg";

	//$url = "http://$hostname_localhost/ejemploBDRemota/$path";
	$url = "imagenes/".$nombre.".jpg";

	file_put_contents($path,base64_decode($imagen));
	$bytesArchivo=file_get_contents($path);

	$sql="INSERT INTO usuario (Nombre,Email,Nacionalidad,Imagen,ruta_imagen,Tipo_Usuario) VALUES (?,?,?,?,?,?)";
	$stm=$conexion->prepare($sql);
	$stm->bind_param('ssssss',$nombre,$email,$nacionalidad,$bytesArchivo,$url,$tipo);


	if($stm->execute()){
		echo "registra";
	}else{
		echo "noRegistra";
	}
	
	mysqli_close($conexion);
	
	
	
?>

