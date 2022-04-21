package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cliente cliente = new Cliente();
        cliente.setEdad(12);
        cliente.setNombre("Daniel Lopez");
        cliente.setTelefono("4681233855");
        cliente.setCredito(2485);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(29);
        trabajador.setNombre("Sergio Ruiz");
        trabajador.setTelefono("442918503");
        trabajador.setSalario(23893);
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSalario());
    }
}
