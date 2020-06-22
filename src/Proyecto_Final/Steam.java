
package Proyecto_Final;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author YaSabesQuienSoy =D
 */

public class Steam {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        leer.useDelimiter("\n");
        BufferedReader leer1 = new BufferedReader(new InputStreamReader(System.in));
        ListaArraysConsola listaConsola = new ListaArraysConsola();
        ListaArraysVideojuegos listaVideojuegos = new ListaArraysVideojuegos();
        ListaArraysComplementos listaComplementos = new ListaArraysComplementos();
        ListaArraysDispositivo listaHardware = new ListaArraysDispositivo();
        Fisico Fis;
        Envio Env;
        Direccion Dir;
        Videojuegos Juegos;
        Consola consolas;
        Complemento complementos;
        Hardware dispositivos;
        int op, op1;
        boolean b = true;
        do {
            System.out.println("\n\n\t\t___________________________________________________\n\n");
            System.out.println("\n\t\t\t\tMENU PRINCIPAL: ");
            System.out.println("\n\n\t\t___________________________________________________\n\n");
            System.out.println("\n\t\t\t1.-Steam");
            System.out.println("\n\t\t\t2.-Usuarios");
            System.out.println("\n\t\t\t3.-Salir. ");
            System.out.println("\n ESCOJA UNA OPCION: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    do{
                    System.out.println("\n\n\t\t___________________________________________________\n\n");
                    System.out.println("\n\t\t\t\t\tSTEAM: ");
                    System.out.println("\n\n\t\t___________________________________________________\n\n");
                    System.out.println("\n\t\t\t1.-Registrar Juegos");
                    System.out.println("\n\t\t\t2.-Registrar Consolas");
                    System.out.println("\n\t\t\t3.-Registrar Complementos");
                    System.out.println("\n\t\t\t4.-Registrar Dispositivos Gamer");
                    System.out.println("\n\t\t\t5.-Inventario");
                    System.out.println("\n\t\t\t6.-Salir al Menu Principal");
                    System.out.println("\n ESCOJA UNA OPCION: ");
                    op1 = leer.nextInt();
                    switch (op1) {
                        case 1:
                            Juegos = new Videojuegos();
                            System.out.println("Ingresa el codigo");
                            int codigo = leer.nextInt();
                            Juegos.setCodigoV(codigo);
                            
                            System.out.println("Ingresa el nombre:\n");
                            String nombre = leer.next();
                            Juegos.setNombre(nombre);

                            System.out.println("Ingresa el precio");
                            int precio = leer.nextInt();

                            System.out.println("Ingresa la fecha de Ingreso: dd/mm/aaaa");
                            Date fecha = new Date (leer.next());
                            Juegos.setFechaIngreso(fecha);
                            
                            System.out.println("Ingresa la plataforma");
                            String plat = leer.next();
                            Juegos.setPlat(plat);
                            
                            System.out.println("Ingresa la edicion");
                            String edicion = leer.next();
                            Juegos.setEdicion(edicion);

                            System.out.println("Tiene descuento?");
                            String desc = leer.next();
                            if (b == desc.equalsIgnoreCase("no")) {
                                Juegos.setPrecio(precio);
                            } else {
                            System.out.println("De cuanto es el descuento? ");
                            float descuent = leer.nextFloat();
                            float d = descuent / 100;
                            float total = (float) precio * d;
                            float tot = precio - total;
                            Juegos.setPrecio(tot);
                            }
                            System.out.println("Ingresa la sinopsis");
                            String sinopsis = leer.next();
                            Juegos.setSinopsis(sinopsis);
                            listaVideojuegos.add(Juegos);
                            
                            System.out.println("El juego es digital o fisico?");
                            String eleccion= leer.next();
                           String dig= new String("digital");
                                                                            
                            if(dig.equals(eleccion) ){
                            System.out.println("Ingresa la key del juego");
                            int K =  leer.nextInt(); 
                            Juegos.settipo(eleccion);
                            Juegos.setkeyProducto(K);
                           
                            } else{
                                
                            System.out.println("Producto Registrado");
                                                            
                                 Juegos.settipo(eleccion);
                                                           
                             }
                            
                            break;

                        case 2:
                            consolas = new Consola();
                            System.out.println("Ingresa el codigo");
                            int codigo1 = leer.nextInt();
                            consolas.setCodigo(codigo1);
                            
                            System.out.println("Ingresa la marca");
                            String marca = leer.next();
                            consolas.setMarca(marca);
                            
                            System.out.println("Ingresa el precio");
                            int precio2 = leer.nextInt();
                            System.out.println("Tiene descuento?");
                            String desc1 = leer.next();
                            if (b == desc1.equalsIgnoreCase("no")) {
                                consolas.setPrecio(precio2);
                            } else {
                            System.out.println("De cuanto es el descuento? ");
                            float descuent1 = leer.nextFloat();
                            float d1 = descuent1 / 100;
                            float total1 = (float) precio2 * d1;
                            float tot1 = precio2 - total1;
                            consolas.setPrecio(tot1);
                            }
                            
                            System.out.println("Ingresa el modelo");
                            String modelo = leer.next();
                            consolas.setModelo(modelo);
                            
                            System.out.println("Ingresa la edicion");
                            String edicion1 = leer.next();
                            consolas.setNumEdicion(edicion1);
                            
                            System.out.println("Ingresa la capacidad");
                            String capacidad = leer.next();
                            consolas.setCapacidad(capacidad);
                            listaConsola.add(consolas);
                            break;

                        case 3:
                            complementos = new Complemento();
                            System.out.println("Ingresa el codigo");
                            int codigo2 = leer.nextInt();
                            complementos.setCodigo(codigo2);
                            
                            System.out.println("Ingresa el nombre:");
                            String nombre3 = leer.next();
                            complementos.setNombre(nombre3);
                            
                            System.out.println("Ingresa el precio:");
                            float precio3 = leer.nextFloat();
                                System.out.println("Tiene descuento?");
                            String desc3 = leer.next();
                            if (b == desc3.equalsIgnoreCase("no")) {
                                complementos.setPrecio(precio3);
                            } else {
                                System.out.println("De cuanto es el descuento? ");
                                float descuent3 = leer.nextFloat();
                                float d4 = descuent3 / 100;
                                float total3 = precio3 * d4;
                                float tot3 = precio3 - total3;
                                complementos.setPrecio(tot3);
                            }
                            
                            System.out.println("Ingresa la Marca");
                            String marca3 = leer.next();
                            complementos.setMarca(marca3);
                            
                            System.out.println("Ingresa la descripcion");
                            String des1 = leer.next();
                            complementos.setDescripcion(des1);
                            listaComplementos.add(complementos);
                            break;

                        case 4:
                            dispositivos = new Hardware(); 
                            System.out.println("Ingresa el codigo");
                            int codigo4 = leer.nextInt();
                            dispositivos.setCodigoProducto(codigo4);
                            
                            System.out.println("Ingresa el nombre:");
                            String nombre4 = leer.next();
                            dispositivos.setNombre(nombre4);
                            
                            System.out.println("Ingresa el precio:");
                            float precio4 = leer.nextFloat();
                            System.out.println("Tiene descuento?");
                            String desc4 = leer.next();
                            if (b == desc4.equalsIgnoreCase("no")) {
                                dispositivos.setPrecio(precio4);
                            } else {
                                System.out.println("De cuanto es el descuento? ");
                                float descuent4 = leer.nextFloat();
                                float d4 = descuent4 / 100;
                                float total4 = precio4 * d4;
                                float tot4 = precio4 - total4;
                                dispositivos.setPrecio(tot4);
                            }
 
                            System.out.println("Ingresa el modelo:");
                            String modelo4 = leer.next();
                            dispositivos.setModelo(modelo4);
                            
                            System.out.println("Ingresa la descripcion:");
                            String descripcion4 = leer.next();
                            dispositivos.setDescripcion(descripcion4);
                            listaHardware.add(dispositivos);
                            break;

                        case 5:
                            System.out.println("\n\n\t\t___________________________________________________\n\n");
                            System.out.println("\n\t\t\t\t\tINVENTARIO: ");
                            System.out.println("\n\n\t\t___________________________________________________\n\n");
                            System.out.println("\n\t\t\t\t\tJUEGOS: ");
                            System.out.println("Codigo\tPlataforma\tNombre\tPrecio\tEdicion\t\tSinopsis\t\t\tFecha Ingreso\t  tipo \t key");
                            listaVideojuegos.imprimeLista();
                            System.out.println("\n\t\t\t\t\tCONSOLAS: ");
                            System.out.println("Codigo\tPrecio\tModelo\tMarca\tEdicion\tCapacidad");
                            listaConsola.imprimeLista();
                            System.out.println("\n\t\t\t\t\tCOMPLEMENTOS: ");
                            System.out.println("Codigo\tNombre\t\tMarca\t\tDescripcion");
                            listaComplementos.imprimeLista();
                            System.out.println("\n\t\t\tDISPOSITVOS GAMER: ");
                            System.out.println("Codigo\t\tNombre\t\tModelo\t\tPrecio\t\tDescripcion");
                            listaHardware.imprimeLista();
                            break;
                            
                         case 6:
                            System.out.println("Esta regresando al Menu Principal");
                            break;
                    }
               }while(op1!=7);

                case 2:
                        System.out.println("\n\n\t\t___________________________________________________\n\n");
                        System.out.println("\n\t\t\t\t\tCatalogo:");
                        System.out.println("\n\n\t\t___________________________________________________\n\n");
                        listaVideojuegos.imprimeLista();
                        listaConsola.imprimeLista();
                        listaComplementos.imprimeLista();
                        listaHardware.imprimeLista();

                    break;

                case 3:
                    System.out.println("GRACIAS POR USAR EL SISTEMA");
                    break;

                default:
                    System.out.println("---" + "Escoja una opción correcta. " + "---");
                    break;

            } //fin de switch

        } while (op != 3);

    }//fin de main

}//fin de clase

