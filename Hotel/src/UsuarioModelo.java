import java.sql.*;



public class UsuarioModelo extends Conector{

	public Usuario InicioSesion(String user, String pass) {
		try {
			Statement stm;
			stm = conexion.createStatement();
			ResultSet rs = stm.executeQuery("SELECT FROM `usuarios` WHERE user ="+ user);
			if(rs.next()) {
				return new Usuario(rs.getString("user"),rs.getString("pass"));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		return null;
	}
}
