/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprogramacion;

/**
 *
 * @author Santi Cereda
 */
public class Cliente1 {

    private int id;
    private String nombreCliente;
    private String dniCliente;
    private String dirCliente;
    private String fechaNacimiento;
    private String telefono;
    private int contraseña;
    private String tipoCuenta;
    private double montoInicial;

    public Cliente1(int id) {
        this.id = id;
    }

    public Cliente1(int id, String nombreCliente, String dniCliente, String dirCliente, String fechaNacimiento, String telefono, int contraseña, String tipoCuenta, double montoInicial) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.dniCliente = dniCliente;
        this.dirCliente = dirCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.tipoCuenta = tipoCuenta;
        this.montoInicial = montoInicial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {
        this.montoInicial = montoInicial;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente1 other = (Cliente1) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Cliente1{" + "idCliente=" + id + ", nombreCliente=" + nombreCliente + ", dniCliente=" + dniCliente + ", dirCliente=" + dirCliente + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", contrase\u00f1a=" + contraseña + ", tipoCuenta=" + tipoCuenta + ", montoInicial=" + montoInicial + '}';
    }

}
