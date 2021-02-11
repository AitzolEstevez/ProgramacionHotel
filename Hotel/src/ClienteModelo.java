import java.sql.*;

public class ClienteModelo extends Conector {

	
	public void CrearCliente(int dni, String nombre, String apellidos, String direccion, String localidad){
		
		try {
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO `clientes` (dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?)");
			ps.setInt(1, dni);
			ps.setString(2, nombre);
			ps.setString(3, apellidos);
			ps.setString(4, direccion);
			ps.setString(5, localidad);
			
			boolean rs = ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
}
	public Cliente ComprobarCliente(int dni) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM `clientes` WHERE dni ="+ dni);
			if(rs.next()) {
				return new Cliente(rs.getInt("dni"),rs.getString("nombre"),rs.getString("apellidos"), rs.getString("direccion"), rs.getString("localidad"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	return null;
	}
	
	public void EliminarCliente(int dni) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			String sql = "DELETE FROM `clientes` WHERE `dni` ="+ dni;
			stm.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
}