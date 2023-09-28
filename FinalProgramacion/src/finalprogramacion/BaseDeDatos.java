/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprogramacion;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Santi Cereda
 */
public class BaseDeDatos {

    private List<Cliente1> clientes = new LinkedList<>();

    public BaseDeDatos() {

        clientes.add(new Cliente1(1, "Santiago Cereda", "40271044", "ruta 7 ", "05/03/1997", "2634650561", 1234, "Caja De ahorro", 15));
        clientes.add(new Cliente1(2, "Juan Perez", "26389123", "lavalle 1000", "15/06/1982", "2634855963", 1234, "Caja de Ahorro", 25000));
    }

    public boolean validarDatos(int id, int contraseña) {
         JFrame frame = new JFrame("Verificación de Contraseña");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        for (Cliente1 cliente : clientes) {
            if (cliente.getId() == id && cliente.getContraseña() == contraseña) {
                
                return true;    
            }else if(cliente.getId() != id && cliente.getContraseña() != contraseña){
                JOptionPane.showMessageDialog(frame, "Contraseña incorrecta");
            }
        }

        return false;

    }
    
 
    public void nuevoCliente(int idCliente, String nombreCliente, String dniCliente, String dirCliente, String fechaNacimiento, String telefono, int contraseña, String tipoCuenta, double montoInicial) {
        Cliente1 nuevoCliente = new Cliente1(idCliente, nombreCliente, dniCliente, dirCliente, fechaNacimiento, telefono, contraseña, tipoCuenta, montoInicial);

        boolean success = clientes.add(nuevoCliente);
        System.out.println("Cliente creado" + success);

    }

    public double ingresarDinero(int id, double monto) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 cliente = clientes.get(clienteIndex);
        double ingreso = cliente.getMontoInicial();
        double actualizacion = ingreso + monto;

        cliente.setMontoInicial(actualizacion);

        return cliente.getMontoInicial();

    }

    public double retirarDinero(int id, double monto) {
        JFrame frame = new JFrame("Verificación de Monto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteRetiro = clientes.get(clienteIndex);

        double ingreso = clienteRetiro.getMontoInicial();
        if (ingreso >= monto) {
            double actualizacion = ingreso - monto;
            clienteRetiro.setMontoInicial(actualizacion);
            JOptionPane.showMessageDialog(frame, "Transaccion Exitosa");
        } else {
            JOptionPane.showMessageDialog(frame, "Monto insuficiente");
        }

        return clienteRetiro.getMontoInicial();

    }

    public String imprimirDatos(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.toString();
    }

    public Double consultarMonto(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));
        System.out.println("index" + clienteIndex);
        Cliente1 clienteMonto = clientes.get(clienteIndex);

        return clienteMonto.getMontoInicial();

    }
    
    public Integer imprimirId(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getId();
    }
    public String imprimirNombre(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getNombreCliente();
    }
    public String imprimirDni(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getDniCliente();
    }
    public String imprimirDir(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getDirCliente();
    }
    public String imprimirNac(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getFechaNacimiento();
    }
    public String imprimirTel(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getTelefono();
    }
    public Integer imprimirContraseña(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getContraseña();
    }
    public String imprimirTipo(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getTipoCuenta();
    }
    public Double imprimirMonto(int id) {
        int clienteIndex = clientes.indexOf(new Cliente1(id));

        Cliente1 clienteMuestra = clientes.get(clienteIndex);

        return clienteMuestra.getMontoInicial();
    }
    

}
