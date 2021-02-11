import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HotelModelo extends Conector {

	public Hotel ComprobarHotel(int id) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM `hoteles` WHERE id ="+ id);
			if(rs.next()) {
				return new Hotel(rs.getInt("id"),rs.getInt("cif"),rs.getString("nombre"),rs.getString("gerente"),rs.getInt("estrellas"),rs.getString("compañia"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return null;}
	public void CrearHotel(int id, int cif, String nombre, String gerente, int estrellas, String compania) {
		try {
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO `hoteles` (id, cif, nombre, gerente, estrellas, compania) VALUES (?,?,?,?,?,?)");
			ps.setInt(1, id);
			ps.setInt(2, cif);
			ps.setString(3, nombre);
			ps.setString(4, gerente);
			ps.setInt(5, estrellas);
			ps.setString(6, compania);
			
			boolean rs = ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	
	public void EliminarHotel(int id) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			String sql = "DELETE FROM `hoteles` WHERE `id` ="+ id;
			stm.execute(sql);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	}
	public void ModificarHotel(int id, int cif, String nombre, String gerente, int estrellas, String compañia) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			String sql = "UPDATE hoteles SET";
			
			if() {
				
			}
			
			
			stm.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
