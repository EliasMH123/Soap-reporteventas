package pe.edu.pupeu.soap.ws.cliente;

import java.util.List;

import pe.edu.pupeu.soap.ws.daoImp.ClienteDao;
import pe.edu.pupeu.soap.ws.daoImp.ClienteDaoImpService;
import pe.edu.pupeu.soap.ws.dao.Cliente;

public class ClienteService {
	public static void main(String[] args) {
		ClienteDaoImpService cds=new ClienteDaoImpService();
		ClienteDao cd=cds.getClienteDaoImpPort();
		System.out.println("Cliente:");
		List<Cliente>clientes=cd.readCliente("2021-05-02","2021-05-15",1);
		for (int i =0; i<clientes.size(); i++) {
			System.out.println("Cliente: "+clientes.get(i).getNombres()+" "+clientes.get(i).getApellidos());
			System.out.println("Producto: "+clientes.get(i).getNomprod());
			System.out.println("Cantidad: "+clientes.get(i).getCantidad());
			System.out.println("Precio: "+clientes.get(i).getPrecio());
		}
	}
}
