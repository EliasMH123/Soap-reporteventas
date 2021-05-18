package pe.edu.pupeu.soap.ws.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.jws.WebService;

import pe.edu.pupeu.soap.ws.dao.ClienteDao;
import pe.edu.pupeu.soap.ws.entity.Cliente;
import pe.edu.pupeu.soap.ws.util.Conexion;

@WebService(endpointInterface = "pe.edu.pupeu.soap.ws.dao.ClienteDao")
public class ClienteDaoImp implements ClienteDao {
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection cx;

	@Override
	public ArrayList<Cliente> readCliente(String fechaini, String fechafin, int idcliente) {
		ArrayList<Cliente> arrayCliente = new ArrayList<>();
		// TODO Auto-generated method stub
		try {
			cx = Conexion.getConexion();
			ps = cx.prepareStatement("SELECT * from cliente c JOIN venta v ON (c.idcliente = v.idcliente) JOIN detalle d ON (v.idventa = d.idventa) JOIN producto p ON (p.idproducto = d.idproducto) WHERE v.fecha BETWEEN ? AND ? AND c.idcliente = ?");
			ps.setString(1, fechaini);
			ps.setString(2, fechafin);
			ps.setInt(3, idcliente);
			rs = ps.executeQuery();
			while (rs.next()) {
				Cliente cliente=new Cliente();
				cliente.setNombres(rs.getString("nombres"));
				cliente.setApellidos(rs.getString("apellidos"));
				cliente.setNomprod(rs.getString("nomprod"));
				cliente.setCantidad(rs.getInt("cantidad"));
				cliente.setPrecio(rs.getDouble("precio"));
				arrayCliente.add(cliente);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return arrayCliente;
	}

}
