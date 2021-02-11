import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int opcion;
		/*boolean inicio = false;
		String user;
		String pass;
		int i = 0;
		do {
			System.out.println("Sartu erabiltzailea: ");
			user = input.next();
			System.out.println("Sartu pasahitza: ");
			pass = input.next();
			
			
			i++;
		}
		while (inicio =! false || i > 3); */
	
		boolean inicio = true;
	if(inicio = true) {	
		do {
			MenuPrincipal();
			opcion = input.nextInt();
			switch(opcion) {
			case 1:{ MenuUsuarios();
			opcion = input.nextInt();
			switch(opcion) {
			case 1: {
			int dni = 0;
			ClienteModelo cm = new ClienteModelo();
			System.out.println("Sartu zure DNI-a: ");
			dni = input.nextInt();
			Cliente cliente = cm.ComprobarCliente(dni);
			System.out.println(cliente);
			}break;
			case 2:{
			ClienteModelo cm = new ClienteModelo();
			int dni;
			String nombre, apellidos, direccion, localidad;
			System.out.println("Sartu dni-a: ");
			dni = input.nextInt();
			System.out.println("Sartu zure izena: ");
			nombre = input.next();
			System.out.println("Sartu zure abizena: ");
			apellidos = input.next();
			System.out.println("Sartu zure helbidea: ");
			direccion = input.next();
			System.out.println("Sartu zure kokapena: ");
			localidad = input.next();
			cm.CrearCliente(dni, nombre, apellidos, direccion, localidad);
			}break;
			case 3:{
			ClienteModelo cm = new ClienteModelo();
			int dni;
			System.out.println("Sartu ezabatu nahi duzun bezeroaren dni-a: ");
			dni = input.nextInt();
			cm.EliminarCliente(dni);
			}
			break;
			default: System.out.println("Numero invalido");
			}
			}break;
			case 2:{ MenuHotel();
			opcion = input.nextInt();
			switch(opcion) {
			case 1:{
				HotelModelo hm = new HotelModelo();
				int id;
				System.out.println("Sartu hotelaren id-a");
				id = input.nextInt();
				Hotel hotel = hm.ComprobarHotel(id);
				System.out.println(hotel);
			}
			break;
			case 2:{
				HotelModelo hm = new HotelModelo();
				int id, cif, estrellas;
				String nombre, gerente, compania;
				System.out.println("Sartu hotelaren id-a: ");
				id = input.nextInt();
				System.out.println("Sartu hotelaren cif-a: ");
				cif = input.nextInt();
				System.out.println("Sartu hotelaren izena: ");
				nombre = input.next();
				System.out.println("Sartu hotelaren gerentea: ");
				gerente = input.next();
				System.out.println("Sartu hotelaren izarrak: ");
				estrellas = input.nextInt();
				System.out.println("Sartu hotelaren compañia: ");
				compania = input.next();
				hm.CrearHotel(id, cif, nombre, gerente, estrellas, compania);
			}
			break;
			case 3:{
				HotelModelo hm = new HotelModelo();
				int id;
				System.out.println("Sartu ezabatu nahi duzun hotelaren id-a: ");
				id = input.nextInt();
				hm.EliminarHotel(id);
			}
			break;
			case 4:{
				HotelModelo hm = new HotelModelo();
				int id, cif, estrellas;
				String nombre, gerente, compañia;
				System.out.println("Id-a aldatu: ");
				id = input.nextInt();
				System.out.println("Cif-a aldatu: ");
				cif = input.nextInt();
				System.out.println("Izena aldatu: ");
				nombre = input.next();
				System.out.println("Gerentea aldatu: ");
				gerente = input.next();
				System.out.println("Izarrak aldatu: ");
				estrellas = input.nextInt();
				System.out.println("Compañia aldatu: ");
				compañia = input.next();
				hm.ModificarHotel(id, cif, nombre, gerente, estrellas, compañia);
			}
			break;
			default: System.out.println("Numero invalido");
			}
			}break;
			case 3:{ MenuReservas();
			opcion = input.nextInt();
			switch(opcion) {
			case 1: ;
			break;
			case 2: ;
			break;
			case 3: ;
			break;
			default: System.out.println("Numero invalido");
			}
			}break;
			}
			}while(opcion!= 0);
		
	}else {
		System.out.println("Hirutan txarto sartu duzu");
	}
}
	public static void MenuPrincipal() {
		System.out.println("1. Apartado para gestionar usuarios del hotel.\r\n"
				+ "2. Apartado para gestionar hoteles y habitaciones del hotel\r\n"
				+ "3. Apartado de reservas del hotel");
	}
	
	public static void MenuUsuarios() {
		System.out.println("1. Comprobar usuario.\r\n"
				+ "2. Añadir usuario.\r\n"
				+ "3. Borrar usuario");
	}
	public static void MenuHotel() {
		System.out.println("1. Comprobar hotel.\r\n"
				+ "2. Añadir hotel.\r\n"
				+ "3. Borrar hotel\r\n"
				+ "4. Modificar hotel\r\n");
	}
	
	public static void MenuReservas() {
		System.out.println("1. Comprobar fecha\r\n"
				+ "2. Hacer reserva\r\n"
				+ "3. Cancelar reserva");
	}
}
