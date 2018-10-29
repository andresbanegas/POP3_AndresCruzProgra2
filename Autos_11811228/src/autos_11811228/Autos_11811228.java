package autos_11811228;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Autos_11811228 {

    static Scanner s = new Scanner(System.in);
    static ArrayList<Cliente> ListaClientes = new ArrayList();
    static ArrayList<Empleado> ListaEmpleados = new ArrayList();
    static ArrayList<Carro> ListaCarros = new ArrayList();

    public static void main(String[] args) {
        int opc = 0;
        while (opc != 5) {
            System.out.println("Menu\n"
                    + "1-Menu de Carros\n"
                    + "2-Menu de Empleados\n"
                    + "3-Menu de Clientes\n"
                    + "4-Compra de Vehiculo\n"
                    + "5-Salir\n"
                    + "Ingrese su opcion: ");
            String option = s.next();
            espacio();
            while (validacion(option) == false) {
                System.out.println("Menu\n"
                        + "1-Menu de Carros\n"
                        + "2-Menu de Empleados\n"
                        + "3-Menu de Clientes\n"
                        + "4-Compra de Vehiculo\n"
                        + "5-Salir\n"
                        + "Ingrese una opcion valida: ");
                option = s.next();
                espacio();
            }
            opc = Integer.parseInt(option);
            switch (opc) {
                case 1:
                    opc1();
                    break;
                case 2:
                    opc2();
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    public static void opc1() {
        int opc = 0;
        while (opc != 5) {
            System.out.println("Menu de Carros\n"
                    + "1-Agregar Carro\n"
                    + "2-Modificar Carro\n"
                    + "3-Listar Carros\n"
                    + "4-Eliminar Carro\n"
                    + "5-Regresar\n"
                    + "Ingrese su opcion: ");
            String option = s.next();
            espacio();
            while (validacion(option) == false) {
                System.out.println("Menu de Carros\n"
                        + "1-Agregar Carro\n"
                        + "2-Modificar Carro\n"
                        + "3-Listar Carros\n"
                        + "4-Eliminar Carro\n"
                        + "5-Regresar\n"
                        + "Ingrese una opcion valida: ");
                option = s.next();
                espacio();
            }
            opc = Integer.parseInt(option);
            switch (opc) {
                case 1: {
                    System.out.println("Carros\n"
                            + "1- Maybach\n"
                            + "2- Morgan Aero 8\n"
                            + "3- Fisker Automotive\n"
                            + "4- Tramontana\n"
                            + "Ingrese que modelo desea: ");
                    option = s.next();
                    espacio();
                    while (validacion(option) == false) {
                        System.out.println("Carros\n"
                                + "1- Maybach\n"
                                + "2- Morgan Aero 8\n"
                                + "3- Fisker Automotive\n"
                                + "4- Tramontana\n"
                                + "Ingrese que modelo desea: ");
                        option = s.next();
                        espacio();
                    }
                    int opcCar = Integer.parseInt(option);
                    System.out.println("Ingrese el dia de ensamblaje: ");
                    int dia = s.nextInt();
                    System.out.println("Ingrese el mes de ensamblaje: ");
                    int mes = s.nextInt();
                    System.out.println("Ingrese el anio de ensamblaje: ");
                    int anio = s.nextInt();
                    Date fecha = new Date();
                    fecha.setDate(dia);
                    fecha.setMonth(mes);
                    fecha.setYear(anio);
                    System.out.println("Ingrese el color del vehiculo: ");
                    String color = s.next();
                    System.out.println("Ingrese la marca de las llantas: ");
                    String marca = s.next();
                    System.out.println("El vehiculo es polarizado? ");
                    String polarizado = s.next();
                    switch (opcCar) {
                        case 1: {
                            System.out.println("Con cuantas llantas de repuesto se vende: ");
                            int llantas = s.nextInt();
                            while (llantas <= 0 || llantas > 2) {
                                System.out.println("Con cuantas llantas de repuesto se vende: ");
                                llantas = s.nextInt();
                            }
                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                            double vel = s.nextDouble();
                            while (vel < 155 || vel > 160) {
                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                vel = s.nextDouble();
                            }
                            System.out.println("Ingrese los km/gal del vehiculo: ");
                            double km = s.nextDouble();
                            while (km < 50 || km > 55) {
                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                km = s.nextDouble();
                            }
                            System.out.println("Ingrese el precio de venta: ");
                            double precio = s.nextDouble();
                            while (precio < 400000 || precio > 600000) {
                                System.out.println("Ingrese el precio de venta: ");
                                precio = s.nextDouble();
                            }
                            ListaCarros.add(new Maybach(llantas, fecha, color, marca, polarizado, vel, km, precio));
                            break;
                        }
                        case 2: {
                            System.out.println("Es convertible? ");
                            String convertible = s.next();
                            System.out.println("Cantidad de cabinas: ");
                            int cab = s.nextInt();
                            while (cab < 1 || cab > 2) {
                                System.out.println("Cantidad de cabinas: ");
                                cab = s.nextInt();
                            }
                            String cabina;
                            if (cab == 1) {
                                cabina = "Cabina Unica";
                            } else {
                                cabina = "Cabina Doble";
                            }
                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                            double vel = s.nextDouble();
                            while (vel < 140 || vel > 145) {
                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                vel = s.nextDouble();
                            }
                            System.out.println("Ingrese los km/gal del vehiculo: ");
                            double km = s.nextDouble();
                            while (km < 35 || km > 40) {
                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                km = s.nextDouble();
                            }
                            System.out.println("Ingrese el precio de venta: ");
                            double precio = s.nextDouble();
                            while (precio < 500000 || precio > 700000) {
                                System.out.println("Ingrese el precio de venta: ");
                                precio = s.nextDouble();
                            }
                            ListaCarros.add(new Morgan_Aero_8(convertible, cabina, fecha, color, marca, polarizado, vel, km, precio));
                            break;
                        }
                        case 3: {
                            System.out.println("Es convertible? ");
                            String convertible = s.next();
                            System.out.println("Es camioneta o turismo? ");
                            String Cam_Tur = s.next();
                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                            double vel = s.nextDouble();
                            while (vel < 160 || vel > 165) {
                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                vel = s.nextDouble();
                            }
                            System.out.println("Ingrese los km/gal del vehiculo: ");
                            double km = s.nextDouble();
                            while (km < 55 || km > 60) {
                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                km = s.nextDouble();
                            }
                            System.out.println("Ingrese el precio de venta: ");
                            double precio = s.nextDouble();
                            while (precio < 450000 || precio > 650000) {
                                System.out.println("Ingrese el precio de venta: ");
                                precio = s.nextDouble();
                            }
                            ListaCarros.add(new Fisker_Automotive(Cam_Tur, convertible, fecha, color, marca, polarizado, vel, km, precio));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el peso: ");
                            double peso = s.nextDouble();
                            while (peso < 1276 || peso > 1376) {
                                System.out.println("Ingrese el peso: ");
                                peso = s.nextDouble();
                            }
                            System.out.println("Ingrese la cantidad de velocidades de la transmision: ");
                            int transmision = s.nextInt();
                            while (transmision < 6 || transmision > 7) {
                                System.out.println("Ingrese la cantidad de velocidades de la transmision: ");
                                transmision = s.nextInt();
                            }
                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                            double vel = s.nextDouble();
                            while (vel < 175 || vel > 180) {
                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                vel = s.nextDouble();
                            }
                            System.out.println("Ingrese los km/gal del vehiculo: ");
                            double km = s.nextDouble();
                            while (km < 50 || km > 55) {
                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                km = s.nextDouble();
                            }
                            System.out.println("Ingrese el precio de venta: ");
                            double precio = s.nextDouble();
                            while (precio < 800000 || precio > 1000000) {
                                System.out.println("Ingrese el precio de venta: ");
                                precio = s.nextDouble();
                            }
                            ListaCarros.add(new Tramontana(peso, transmision, fecha, color, marca, polarizado, vel, km, precio));
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Ingres la posicion del carro que desea modificar: ");
                    int posicion = s.nextInt();
                    while (posicion < 0 || posicion > ListaCarros.size() - 1) {
                        System.out.println("Ingres la posicion del carro que desea modificar: ");
                        posicion = s.nextInt();
                    }
                    espacio();
                    if (ListaCarros.get(posicion) instanceof Maybach) {
                        System.out.println("1-Fecha\n"
                                + "2-Color\n"
                                + "3-Marca Llantas\n"
                                + "4-Polarizado\n"
                                + "5-Velocidad Maxima\n"
                                + "6-Kilometro por galon\n"
                                + "7-Precio\n"
                                + "8-Llantas Repuesto\n"
                                + "Ingrese que desea modificar: ");
                        int opcMod = s.nextInt();
                        switch (opcMod) {
                            case 1:
                                System.out.println("Ingrese el dia de ensamblaje: ");
                                int dia = s.nextInt();
                                System.out.println("Ingrese el mes de ensamblaje: ");
                                int mes = s.nextInt();
                                System.out.println("Ingrese el anio de ensamblaje: ");
                                int anio = s.nextInt();
                                Date fecha = new Date();
                                fecha.setDate(dia);
                                fecha.setMonth(mes);
                                fecha.setYear(anio);
                                ListaCarros.get(posicion).setFecha(fecha);
                                break;
                            case 2:
                                System.out.println("Ingrese el Color: ");
                                String color = s.next();
                                ListaCarros.get(posicion).setColor(color);
                                break;
                            case 3:
                                System.out.println("Ingrese la marca de llantas: ");
                                String marca = s.next();
                                ListaCarros.get(posicion).setMarca_Llantas(marca);
                                break;
                            case 4:
                                System.out.println("Ingrese si es polarizado: ");
                                String polarizado = s.next();
                                ListaCarros.get(posicion).setPolarizado(polarizado);
                                break;
                            case 5:
                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                double vel = s.nextDouble();
                                while (vel < 155 || vel > 160) {
                                    System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                    vel = s.nextDouble();
                                }
                                ListaCarros.get(posicion).setVel_max(vel);
                                break;
                            case 6:
                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                double km = s.nextDouble();
                                while (km < 50 || km > 55) {
                                    System.out.println("Ingrese los km/gal del vehiculo: ");
                                    km = s.nextDouble();
                                }
                                ListaCarros.get(posicion).setKil_gal(km);
                                break;
                            case 7:
                                System.out.println("Ingrese el precio de venta: ");
                                double precio = s.nextDouble();
                                while (precio < 400000 || precio > 600000) {
                                    System.out.println("Ingrese el precio de venta: ");
                                    precio = s.nextDouble();
                                }
                                break;
                            case 8:
                                System.out.println("Con cuantas llantas de repuesto se vende: ");
                                int llantas = s.nextInt();
                                while (llantas <= 0 || llantas > 2) {
                                    System.out.println("Con cuantas llantas de repuesto se vende: ");
                                    llantas = s.nextInt();
                                }
                                ((Maybach) ListaCarros.get(posicion)).setLlantas(llantas);
                                break;
                        }
                    } else {
                        if (ListaCarros.get(posicion) instanceof Morgan_Aero_8) {
                            System.out.println("1-Fecha\n"
                                    + "2-Color\n"
                                    + "3-Marca Llantas\n"
                                    + "4-Polarizado\n"
                                    + "5-Velocidad Maxima\n"
                                    + "6-Kilometro por galon\n"
                                    + "7-Precio\n"
                                    + "8-Cabina\n"
                                    + "9-Convertible\n"
                                    + "Ingrese que desea modificar: ");
                            int opcMod = s.nextInt();
                            switch (opcMod) {
                                case 1:
                                    System.out.println("Ingrese el dia de ensamblaje: ");
                                    int dia = s.nextInt();
                                    System.out.println("Ingrese el mes de ensamblaje: ");
                                    int mes = s.nextInt();
                                    System.out.println("Ingrese el anio de ensamblaje: ");
                                    int anio = s.nextInt();
                                    Date fecha = new Date();
                                    fecha.setDate(dia);
                                    fecha.setMonth(mes);
                                    fecha.setYear(anio);
                                    ListaCarros.get(posicion).setFecha(fecha);
                                    break;
                                case 2:
                                    System.out.println("Ingrese el Color: ");
                                    String color = s.next();
                                    ListaCarros.get(posicion).setColor(color);
                                    break;
                                case 3:
                                    System.out.println("Ingrese la marca de llantas: ");
                                    String marca = s.next();
                                    ListaCarros.get(posicion).setMarca_Llantas(marca);
                                    break;
                                case 4:
                                    System.out.println("Ingrese si es polarizado: ");
                                    String polarizado = s.next();
                                    ListaCarros.get(posicion).setPolarizado(polarizado);
                                    break;
                                case 5:
                                    System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                    double vel = s.nextDouble();
                                    while (vel < 140 || vel > 145) {
                                        System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                        vel = s.nextDouble();
                                    }
                                    ListaCarros.get(posicion).setVel_max(vel);
                                    break;
                                case 6:
                                    System.out.println("Ingrese los km/gal del vehiculo: ");
                                    double km = s.nextDouble();
                                    while (km < 35 || km > 40) {
                                        System.out.println("Ingrese los km/gal del vehiculo: ");
                                        km = s.nextDouble();
                                    }
                                    ListaCarros.get(posicion).setKil_gal(km);
                                    break;
                                case 7:
                                    System.out.println("Ingrese el precio de venta: ");
                                    double precio = s.nextDouble();
                                    while (precio < 500000 || precio > 700000) {
                                        System.out.println("Ingrese el precio de venta: ");
                                        precio = s.nextDouble();
                                    }
                                    break;
                                case 8:
                                    System.out.println("Cantidad de cabinas: ");
                                    int cab = s.nextInt();
                                    while (cab < 1 || cab > 2) {
                                        System.out.println("Cantidad de cabinas: ");
                                        cab = s.nextInt();
                                    }
                                    String cabina;
                                    if (cab == 1) {
                                        cabina = "Cabina Unica";
                                    } else {
                                        cabina = "Cabina Doble";
                                    }
                                    ((Morgan_Aero_8) ListaCarros.get(posicion)).setCabina(cabina);
                                    break;
                                case 9:
                                    System.out.println("Es convertible? ");
                                    String convertible = s.next();
                                    ((Morgan_Aero_8) ListaCarros.get(posicion)).setConvertible(convertible);
                                    break;
                            }
                        } else {
                            if (ListaCarros.get(posicion) instanceof Fisker_Automotive) {
                                System.out.println("1-Fecha\n"
                                        + "2-Color\n"
                                        + "3-Marca Llantas\n"
                                        + "4-Polarizado\n"
                                        + "5-Velocidad Maxima\n"
                                        + "6-Kilometro por galon\n"
                                        + "7-Precio\n"
                                        + "8-Camioneta o Turismo\n"
                                        + "9-Convertible\n"
                                        + "Ingrese que desea modificar: ");
                                int opcMod = s.nextInt();
                                switch (opcMod) {
                                    case 1:
                                        System.out.println("Ingrese el dia de ensamblaje: ");
                                        int dia = s.nextInt();
                                        System.out.println("Ingrese el mes de ensamblaje: ");
                                        int mes = s.nextInt();
                                        System.out.println("Ingrese el anio de ensamblaje: ");
                                        int anio = s.nextInt();
                                        Date fecha = new Date();
                                        fecha.setDate(dia);
                                        fecha.setMonth(mes);
                                        fecha.setYear(anio);
                                        ListaCarros.get(posicion).setFecha(fecha);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el Color: ");
                                        String color = s.next();
                                        ListaCarros.get(posicion).setColor(color);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la marca de llantas: ");
                                        String marca = s.next();
                                        ListaCarros.get(posicion).setMarca_Llantas(marca);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese si es polarizado: ");
                                        String polarizado = s.next();
                                        ListaCarros.get(posicion).setPolarizado(polarizado);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                        double vel = s.nextDouble();
                                        while (vel < 160 || vel > 165) {
                                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                            vel = s.nextDouble();
                                        }
                                        ListaCarros.get(posicion).setVel_max(vel);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese los km/gal del vehiculo: ");
                                        double km = s.nextDouble();
                                        while (km < 55 || km > 60) {
                                            System.out.println("Ingrese los km/gal del vehiculo: ");
                                            km = s.nextDouble();
                                        }
                                        ListaCarros.get(posicion).setKil_gal(km);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese el precio de venta: ");
                                        double precio = s.nextDouble();
                                        while (precio < 450000 || precio > 650000) {
                                            System.out.println("Ingrese el precio de venta: ");
                                            precio = s.nextDouble();
                                        }
                                        break;
                                    case 8:
                                        System.out.println("Es camioneta o turismo? ");
                                        String Cam_Tur = s.next();
                                        ((Fisker_Automotive) ListaCarros.get(posicion)).setCam_Tur(Cam_Tur);
                                        break;
                                    case 9:
                                        System.out.println("Es convertible? ");
                                        String convertible = s.next();
                                        ((Fisker_Automotive) ListaCarros.get(posicion)).setConvertible(convertible);
                                        break;
                                }
                            } else {
                                if (ListaCarros.get(posicion) instanceof Tramontana) {
                                    System.out.println("1-Fecha\n"
                                            + "2-Color\n"
                                            + "3-Marca Llantas\n"
                                            + "4-Polarizado\n"
                                            + "5-Velocidad Maxima\n"
                                            + "6-Kilometro por galon\n"
                                            + "7-Precio\n"
                                            + "8-Peso\n"
                                            + "9-Transmision\n"
                                            + "Ingrese que desea modificar: ");
                                    int opcMod = s.nextInt();
                                    switch (opcMod) {
                                        case 1:
                                            System.out.println("Ingrese el dia de ensamblaje: ");
                                            int dia = s.nextInt();
                                            System.out.println("Ingrese el mes de ensamblaje: ");
                                            int mes = s.nextInt();
                                            System.out.println("Ingrese el anio de ensamblaje: ");
                                            int anio = s.nextInt();
                                            Date fecha = new Date();
                                            fecha.setDate(dia);
                                            fecha.setMonth(mes);
                                            fecha.setYear(anio);
                                            ListaCarros.get(posicion).setFecha(fecha);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el Color: ");
                                            String color = s.next();
                                            ListaCarros.get(posicion).setColor(color);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la marca de llantas: ");
                                            String marca = s.next();
                                            ListaCarros.get(posicion).setMarca_Llantas(marca);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese si es polarizado: ");
                                            String polarizado = s.next();
                                            ListaCarros.get(posicion).setPolarizado(polarizado);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                            double vel = s.nextDouble();
                                            while (vel < 175 || vel > 180) {
                                                System.out.println("Ingrese la velocidad maxima del vehiculo: ");
                                                vel = s.nextDouble();
                                            }
                                            ListaCarros.get(posicion).setVel_max(vel);
                                            break;
                                        case 6:
                                            System.out.println("Ingrese los km/gal del vehiculo: ");
                                            double km = s.nextDouble();
                                            while (km < 50 || km > 55) {
                                                System.out.println("Ingrese los km/gal del vehiculo: ");
                                                km = s.nextDouble();
                                            }
                                            ListaCarros.get(posicion).setKil_gal(km);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese el precio de venta: ");
                                            double precio = s.nextDouble();
                                            while (precio < 800000 || precio > 1000000) {
                                                System.out.println("Ingrese el precio de venta: ");
                                                precio = s.nextDouble();
                                            }
                                            break;
                                        case 8:
                                            System.out.println("Ingrese el peso: ");
                                            double peso = s.nextDouble();
                                            while (peso < 1276 || peso > 1376) {
                                                System.out.println("Ingrese el peso: ");
                                                peso = s.nextDouble();
                                            }
                                            ((Tramontana) ListaCarros.get(posicion)).setPeso(peso);
                                            break;
                                        case 9:
                                            System.out.println("Ingrese la cantidad de velocidades de la transmision: ");
                                            int transmision = s.nextInt();
                                            while (transmision < 6 || transmision > 7) {
                                                System.out.println("Ingrese la cantidad de velocidades de la transmision: ");
                                                transmision = s.nextInt();
                                            }
                                            ((Tramontana) ListaCarros.get(posicion)).setTransmision(transmision);
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                case 3:
                    for (int i = 0; i < ListaCarros.size(); i++) {
                        System.out.println(ListaCarros.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la posicion del vehiculo que desea eliminar: ");
                    int posicion = s.nextInt();
                    while (posicion < 0 || posicion > ListaCarros.size() - 1) {
                        System.out.println("Ingrese la posicion del vehiculo que desea eliminar: ");
                        posicion = s.nextInt();
                    }
                    ListaCarros.remove(posicion);
                    break;
            }
            espacio();
        }
    }
    
    public static void opc2(){
       int opc=0;
       while(opc!=5){
        System.out.println("Menu de Empleados\n"
                + "1-Crear Empleados\n"
                + "2-Modificar Empleados\n"
                + "3-Listar Empleados\n"
                + "4-Eliminar Empleado\n"
                + "5-Regresar\n"
                + "Ingrese su opcion: ");
        String option=s.next();
        while(validacion(option)==false){
        System.out.println("Menu de Empleados\n"
                + "1-Crear Empleados\n"
                + "2-Modificar Empleados\n"
                + "3-Listar Empleados\n"
                + "4-Eliminar Empleado\n"
                + "5-Regresar\n"
                + "Ingrese una opcion valida: ");
        option=s.next();
        }
        opc=Integer.parseInt(option);
        espacio();
        switch(opc){
            case 1:
                System.out.println("Ingrese el nombre del empleado: ");
                s.nextLine();
                String nombre=s.nextLine();
                System.out.println("Ingrese el numero de identidad del empleado: ");
                String Identidad=s.next();
                while(validacion(Identidad)==false){
                System.out.println("Ingrese el numero de identidad del empleado: ");
                Identidad=s.next();
                }
                System.out.println("Ingrese la edad del empleado: ");
                int edad=s.nextInt();
                while(edad<18||edad>150){
                System.out.println("Ingrese la edad del empleado: ");
                edad=s.nextInt();
                }
                System.out.println("Ingrese la altura del empleado: ");
                double altura=s.nextDouble();
                while(altura<1.55||altura>4.00){
                System.out.println("Ingrese la altura del empleado: ");
                altura=s.nextDouble();
                }
                System.out.println("Ingrese el peso del empleado: ");
                double peso=s.nextDouble();
                while(peso<120){
                System.out.println("Ingrese el peso del empleado: ");
                peso=s.nextDouble();
                }
                System.out.println("Ingrese la cantida de horas de trabajo del empleado: ");
                double horas=s.nextDouble();
                while(horas<=0||horas>=24){
                System.out.println("Ingrese la cantida de horas de trabajo del empleado: ");
                horas=s.nextDouble();
                }
                ListaEmpleados.add( new Empleado(horas, nombre, Identidad, edad, altura, peso));
                break;
            case 2:{
                System.out.println("Ingrese la posicion del empleado a modificar: ");
                int posicion=s.nextInt();
                while(posicion<0||posicion>ListaEmpleados.size()-1){
                System.out.println("Ingrese la posicion del empleado a modificar: ");
                posicion=s.nextInt();
                }
                System.out.println("1-Nombre\n"
                        + "2-Identidad\n"
                        + "3-Edad\n"
                        + "4-Altura\n"
                        + "5-Peso\n"
                        + "6-Horas\n"
                        + "Ingrese que desea modificar: ");
                int opcMod=s.nextInt();
                while(opcMod<1||opcMod>6){
                System.out.println("1-Nombre\n"
                        + "2-Identidad\n"
                        + "3-Edad\n"
                        + "4-Altura\n"
                        + "5-Peso\n"
                        + "6-Horas\n"
                        + "Ingrese que desea modificar: ");
                opcMod=s.nextInt();                
                }
                switch(opcMod){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                }
                break;}
            case 3:
                for (int i = 0; i < ListaEmpleados.size(); i++) {
                    System.out.println(ListaEmpleados.get(i));
                }
                espacio();
                break;
            case 4:{
                System.out.println("Ingrese la posicion del empleado a eliminar: ");
                int posicion=s.nextInt();
                while(posicion<0||posicion>ListaEmpleados.size()-1){
                System.out.println("Ingrese la posicion del empleado a eliminar: ");
                posicion=s.nextInt();
                }
                ListaEmpleados.remove(posicion);
                espacio();
                break;}
        }
       }
       espacio();
    }

    public static void espacio() {
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print("---");
        }
        System.out.println("");
    }

    public static boolean validacion(String temp) {
        int cont = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i))) {
                cont++;
            }
        }
        if (cont == temp.length()) {
            return true;
        } else {
            return false;
        }
    }

}
