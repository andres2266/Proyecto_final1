package Ejercicios06;

import java.util.Scanner;
public class ProyectoFernanStarter {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        //Las variables empezadas con R son el reemplazo de usuario o contraseña

        //Variables para usar en el menú

        //************************

//VARIABLES ADMIN

        //*************************
        int e = 1;
        int intentos = 2;
        int desbloqueo = 0;

        String contraseñaadmin = "1234";
        String usuarioadmin = "Sergi";
        int acceso = 0;


        //************************

//VARIABLES GESTOR

        //*************************
        String contraseñagestor = "1234";
        String usuariogestor = "Marcos";
        int intentoPassGestor = 0;
        int opcionGestor = 0;
        int volverGestor = 0;
        int bloqueoExcGestor = 0;
        int proyecto1 = 1;
        int proyecto2 = 2;
        int proyecto3 = 3;
        int proyecto4 = 4;
        int numeroProyecto = 1;
        int verProyecto1 = 0;
        int verProyecto2 = 0;
        int verProyecto3 = 0;
        int opcionVerProyectoGestor = 0;

        String nombreProyecto = "";
        String descripcion = "";
        String categoria = "";
        int cantidadTotal = 0;
        int aporteInversor1 = 0;
        int aporteInversor2 = 0;
        String fechaAperturaInversion = "";
        String fechaCierreInversion = "";
        int porcentajeRecompensa = 0;

        String nombreProyecto2 = "";
        String descripcion2 = "";
        String categoria2 = "";
        int cantidadTotal2 = 0;
        int aporteInversor12 = 0;
        int aporteInversor22 = 0;
        String fechaAperturaInversion2 = "";
        String fechaCierreInversion2 = "";
        int porcentajeRecompensa2 = 0;

        String nombreProyecto3 = "";
        String descripcion3 = "";
        String categoria3 = "";
        int cantidadTotal3 = 0;
        int aporteInversor13 = 0;
        int aporteInversor23 = 0;
        String fechaAperturaInversion3 = "";
        String fechaCierreInversion3 = "";
        int porcentajeRecompensa3 = 0;
        //************************

//VARIABLES INVERSOR1

        //*************************
        String contraseñainversor1 = "1234";
        String usuarioinversor1 = "Andres";
        int intentoPassInversor1 = 0;
        int bloqueoExcInversor1 = 0;
        int volverInversor1 = 0;
        int opcionInversor1 = 0;
        int saldoCarteraDigital1 = 0;
        int carteraInv1 = 0;

        //************************

//VARIABLES INVERSOR2

        //*************************
        String contraseñainversor2 = "1234";
        String usuarioinversor2 = "EladioApruebame";
        int intentoPassInversor2 = 0;
        int bloqueoExcInversor2 = 0;
        int volverInversor2 = 0;
        int opcionInversor2 = 0;
        int saldoCarteraDigital2 = 0;
        int carteraInv2 = 0;


        //Menú principal
        System.out.println("Como quieres acceder al sistema?");
        System.out.println("1. Administrador");
        System.out.println("2. Gestor");
        System.out.println("3. Inversor 1");
        System.out.println("4. Inversor 2");
        int opcion = Integer.parseInt(S.next());


        if (opcion > 4 || opcion < 1) {
            System.out.println("Error 404");
            return;
        }
        //Bucle infinito para el switch principal
        for (int encendido = 0; encendido == 0; ) {
            //Condición para que no se salga de los parámetros

            if (opcion == 2 && intentoPassGestor == 3) {
                System.out.println("Usuario bloqueado");

            } else if (opcion == 3 && intentoPassInversor1 == 3) {
                System.out.println("Usuario bloqueado");
            }
            if (opcion == 4 && intentoPassInversor2 == 3) {
                System.out.println("Usuario bloqueado");
            }
            for (int p = 1; p < 2;) {


                switch (opcion) {

                    case 1: //Caso Administrador
                        System.out.println("Bienvenido al modo Administrador, Introduce el usuario y la contraseña");
                        System.out.println("Usuario");
                        String usuario = S.next();
                        System.out.println("Contraseña");
                        String contraseña = S.next();
                        for (int i = 0; i < e; i++) {
                            if (usuario.equals(usuarioadmin) && contraseña.equals(contraseñaadmin)) {
                                System.out.println(" bienvenido al modo administrador ;)");
                                System.out.println("=======================");
                                System.out.println("¿Qué desea hacer?");
                                System.out.println("1.Panel de Control");
                                System.out.println("2.Proyectos ");
                                System.out.println("3.Cambio de Credenciales");
                                System.out.println("4.Cerrar Sesión");

                                int opcionAdmin = Integer.parseInt(S.next());

                                switch (opcionAdmin) {
                                    case 1:
                                        System.out.println("Oprime 1 para desbloquear un usuario Oprime 2 para Bloquear un usuario ");
                                        acceso = Integer.parseInt(S.next());
                                        switch (acceso) {
                                            case 1:
                                                System.out.println("Que usuario deseas desbloquear oprime 1 para el Gestor , 2 para inversor1 3 para inversor3");
                                                desbloqueo = Integer.parseInt(S.next());
                                                if (desbloqueo == 1) {
                                                    intentoPassGestor = 0;
                                                    System.out.println("El usuario gestor a sido desbloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volverAmenu = Integer.parseInt(S.next());
                                                    if (volverAmenu == 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                    }
                                                } else if (desbloqueo == 2) {
                                                    intentoPassInversor1 = 0;
                                                    System.out.println("El usuario inversor1 a sido desbloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volver = Integer.parseInt(S.next());
                                                    if (volver >= 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                    }
                                                } else if (desbloqueo == 3) {
                                                    intentoPassInversor2 = 0;
                                                    System.out.println("El usuario inversor2 a sido desbloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volverAmenu = Integer.parseInt(S.next());
                                                    if (volverAmenu == 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                        System.out.println(opcion);

                                                    }
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Que usuario deseas bloquear oprime 1 para el Gestor , 2 para inversor1 3 para inversor3");
                                                desbloqueo = Integer.parseInt(S.next());
                                                if (desbloqueo == 1) {
                                                    intentoPassGestor = 3;
                                                    System.out.println("El usuario gestor a sido bloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volver = Integer.parseInt(S.next());
                                                    if (volver == 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                    }
                                                } else if (desbloqueo == 2) {
                                                    intentoPassInversor1 = 3;
                                                    System.out.println("El usuario inversor1 a sido bloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volver = Integer.parseInt(S.next());
                                                    if (volver == 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                    }
                                                } else if (desbloqueo == 3) {
                                                    intentoPassInversor2 = 3;
                                                    System.out.println("El usuario inversor2 a sido bloqueado");
                                                    System.out.println("operime 2 para volver al menu principal");
                                                    int volver = Integer.parseInt(S.next());
                                                    if (volver == 2) {
                                                        System.out.println("Como quieres acceder al sistema?");
                                                        System.out.println("1. Administrador");
                                                        System.out.println("2. Gestor");
                                                        System.out.println("3. Inversor 1");
                                                        System.out.println("4. Inversor 2");
                                                        opcion = Integer.parseInt(S.next());
                                                    }
                                                    break;
                                                }
                                        }
                                    case 2:

                                        break;
                                    //Proyectos
                                    case 3:
                                        System.out.println("Dime el nombre de usuario por el cual quieras reemplazar");
                                        String R_usuario_Adm = S.next();
                                        usuarioadmin = R_usuario_Adm;

                                        System.out.println("Dime la contraseña por la cual quieras reemplazar");
                                        String R_contra_Adm = S.next();
                                        contraseñaadmin = R_contra_Adm;

                                        System.out.println("Ahora tu Usuario es: " + usuarioadmin + " y tu contraseña es: " + contraseñaadmin);

                                        System.out.println("Pulsa 2 para volver al menú de Administrador");
                                        int volverAdmin = Integer.parseInt(S.next());
                                        do {
                                            if (volverAdmin == 2) {
                                                System.out.println(" sistema reiniciado ");
                                                System.out.println("***");
                                                System.out.println("Como quieres acceder al sistema?");
                                                System.out.println("1. Administrador");
                                                System.out.println("2. Gestor");
                                                System.out.println("3. Inversor 1");
                                                System.out.println("4. Inversor 2");
                                                opcion = Integer.parseInt(S.next());

                                            }
                                            if (opcion < 1 || opcion > 4) {
                                                System.out.println("Error 404");
                                            }
                                        } while (opcion < 1 || opcion > 4);
                                        break;
                                    case 4:
                                        System.out.println("Cerrando sesión");

                                        System.out.println("Como quieres acceder al sistema?");
                                        System.out.println("1. Administrador");
                                        System.out.println("2. Gestor");
                                        System.out.println("3. Inversor 1");
                                        System.out.println("4. Inversor 2");
                                        opcion = Integer.parseInt(S.next());

                                }
                            } else {
                                System.out.println(" El nombre de usuario o la contraseña son incorrectos, vuelve a intentarlo ");
                            }
                        }
                        break;

                    case 2: //GESTOR
                        // BUCLE PARA LOS INTENTOS DE CREDENCIALES
                        for (int i = 0; i < 3; i++) {
                            if (intentoPassGestor == 3) {
                                if (bloqueoExcGestor == 1) {
                                    System.out.println("Usuario bloqueado");
                                }
                                bloqueoExcGestor = 1;

                                do {
                                    System.out.println("Pulsa 2 para volver al menu principal");
                                    volverGestor = Integer.parseInt(S.next());
                                    if (volverGestor < 2 || volverGestor > 2) {
                                        System.out.println("Valores no permitidos");

                                    }
                                } while (volverGestor != 2);


                                if (volverGestor == 2) {
                                    System.out.println("Como quieres acceder al sistema?");
                                    System.out.println("1. Administrador");
                                    System.out.println("2. Gestor");
                                    System.out.println("3. Inversor 1");
                                    System.out.println("4. Inversor 2");
                                    opcion = Integer.parseInt(S.next());

                                }
                            }
                            if (intentoPassGestor != 3) {
                                System.out.println("Bienvenido al modo Gestor, Introduce el usuario y la contraseña");
                                System.out.println("Usuario");
                                String usuarioCredencialGes = S.next();
                                System.out.println("Contraseña");
                                String contraseñaCredencialGes = S.next();
                                if (usuarioCredencialGes.equals(usuariogestor) && contraseñaCredencialGes.equals(contraseñagestor)) {
                                    System.out.println("Bienvenido al modo Gestor");
                                    System.out.println("**");
                                    System.out.println("1. Mis proyectos");
                                    System.out.println("2. Cambio de Credenciales");
                                    System.out.println("3. Cerrar sesión");
                                    opcionGestor = Integer.parseInt(S.next());
                                    i = 3;
                                } else {
                                    intentoPassGestor++;
                                    System.out.println(" Error usuario o contraseña erronea te quedan " + intentos-- + " intentos");

                                }
                                if (intentoPassGestor == 3) {
                                    System.out.println("Usuario bloqueado");

                                    do {
                                        System.out.println("Pulsa 2 para volver al menu principal");
                                        volverGestor = Integer.parseInt(S.next());
                                        if (volverGestor < 2 || volverGestor > 2) {
                                            System.out.println("Valores no permitidos");
                                        }
                                    } while (volverGestor != 2);

                                    if (volverGestor == 2) {
                                        System.out.println("Como quieres acceder al sistema?");
                                        System.out.println("1. Administrador");
                                        System.out.println("2. Gestor");
                                        System.out.println("3. Inversor 1");
                                        System.out.println("4. Inversor 2");
                                        opcion = Integer.parseInt(S.next());

                                    }
                                }
                            }
                        }


                        for (int q = 0; q < 1; ) {

                            switch (opcionGestor) {
                                case 1:

                                    System.out.println("Bienvenido al apartado de creación de proyectos:");
                                    System.out.println("---------------------------------------");
                                    System.out.println("1.Crear nuevo proyecto");
                                    System.out.println("2.Ver proyecto existente");
                                    System.out.println("3.Salir");
                                    int opcionProyectoGestor = Integer.parseInt(S.next());

                                    proyecto1 = 1;
                                    proyecto2 = 2;
                                    proyecto3 = 3;
                                    proyecto4 = 4;
                                    numeroProyecto = 1;
                                    verProyecto1 = 0;
                                    verProyecto2 = 0;
                                    verProyecto3 = 0;
                                    opcionVerProyectoGestor = 0;

                                    nombreProyecto = "";
                                    descripcion = "";
                                    categoria = "";
                                    cantidadTotal = 0;
                                    aporteInversor1 = 0;
                                    aporteInversor2 = 0;
                                    fechaAperturaInversion = "";
                                    fechaCierreInversion = "";
                                    porcentajeRecompensa = 0;

                                    nombreProyecto2 = "";
                                    descripcion2 = "";
                                    categoria2 = "";
                                    cantidadTotal2 = 0;
                                    aporteInversor12 = 0;
                                    aporteInversor22 = 0;
                                    fechaAperturaInversion2 = "";
                                    fechaCierreInversion2 = "";
                                    porcentajeRecompensa2 = 0;

                                    nombreProyecto3 = "";
                                    descripcion3 = "";
                                    categoria3 = "";
                                    cantidadTotal3 = 0;
                                    aporteInversor13 = 0;
                                    aporteInversor23 = 0;
                                    fechaAperturaInversion3 = "";
                                    fechaCierreInversion3 = "";
                                    porcentajeRecompensa3 = 0;


                                    for (int i = 0; i <= 5; ) {
                                        switch (opcionProyectoGestor) {
                                            case 1:
                                                System.out.println("Crear nuevo proyecto");

                                                if (proyecto1 == numeroProyecto) {
                                                    System.out.println("Introduce el nombre del proyecto ");
                                                    nombreProyecto = S.next();
                                                    System.out.println("Introduce una breve descripción");
                                                    descripcion = S.next();
                                                    System.out.println("Introduce la categoría (arte, tecnología, cine, música, juegos, comida, moda...)");
                                                    categoria = S.next();
                                                    System.out.println("Introduce la cantidad necesaría");
                                                    cantidadTotal = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 1");
                                                    aporteInversor1 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 2");
                                                    aporteInversor2 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la fecha de inicio de apertura de inversiones");
                                                    fechaAperturaInversion = S.next();
                                                    System.out.println("Introduce la fecha de cierre de las inversiones");
                                                    fechaCierreInversion = S.next();
                                                    System.out.println("Introduce el porcentaje de la recompensa");
                                                    porcentajeRecompensa = Integer.parseInt(S.next());

                                                    System.out.println("¡¡Felicidades proyecto creado!!");
                                                    numeroProyecto = 2;
                                                    verProyecto1 = 1;
                                                    System.out.println("¿Que quieres hacer?");
                                                    System.out.println("---------------------------------------");
                                                    System.out.println("1.Crear nuevo proyecto");
                                                    System.out.println("2.Ver proyecto existente");
                                                    System.out.println("3.Salir");
                                                    opcionProyectoGestor = Integer.parseInt(S.next());


                                                } else if (proyecto2 == numeroProyecto) {
                                                    System.out.println("Introduce el nombre del proyecto");
                                                    nombreProyecto2 = S.next();
                                                    System.out.println("Introduce una breve descripción");
                                                    descripcion2 = S.next();
                                                    System.out.println("Introduce la categoría (arte, tecnología, cine, música, juegos, comida, moda...)");
                                                    categoria2 = S.next();
                                                    System.out.println("Introduce la cantidad necesaría");
                                                    cantidadTotal2 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 1");
                                                    aporteInversor12 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 2");
                                                    aporteInversor22 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la fecha de inicio de apertura de inversiones");
                                                    fechaAperturaInversion2 = S.next();
                                                    System.out.println("Introduce la fecha de cierre de las inversiones");
                                                    fechaCierreInversion2 = S.next();
                                                    System.out.println("Introduce el porcentaje de la recompensa");
                                                    porcentajeRecompensa2 = Integer.parseInt(S.next());

                                                    System.out.println("¡¡Felicidades proyecto creado!!");
                                                    numeroProyecto = 3;
                                                    verProyecto2 = 2;
                                                    System.out.println("¿Que quieres hacer?");
                                                    System.out.println("---------------------------------------");
                                                    System.out.println("1.Crear nuevo proyecto");
                                                    System.out.println("2.Ver proyecto existente");
                                                    System.out.println("3.Salir");
                                                    opcionProyectoGestor = Integer.parseInt(S.next());

                                                } else if (proyecto3 == numeroProyecto) {
                                                    System.out.println("Introduce el nombre del proyecto");
                                                    nombreProyecto3 = S.next();
                                                    System.out.println("Introduce una breve descripción");
                                                    descripcion3 = S.next();
                                                    System.out.println("Introduce la categoría (arte, tecnología, cine, música, juegos, comida, moda...)");
                                                    categoria3 = S.next();
                                                    System.out.println("Introduce la cantidad necesaría");
                                                    cantidadTotal3 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 1");
                                                    aporteInversor13 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la cantidad financiada por inversor 2");
                                                    aporteInversor23 = Integer.parseInt(S.next());
                                                    System.out.println("Introduce la fecha de inicio de apertura de inversiones");
                                                    fechaAperturaInversion3 = S.next();
                                                    System.out.println("Introduce la fecha de cierre de las inversiones");
                                                    fechaCierreInversion3 = S.next();
                                                    System.out.println("Introduce el porcentaje de la recompensa");
                                                    porcentajeRecompensa3 = Integer.parseInt(S.next());

                                                    System.out.println("¡¡Felicidades proyecto creado!!");
                                                    numeroProyecto = 4;
                                                    verProyecto3 = 3;
                                                    System.out.println("¿Que quieres hacer?");
                                                    System.out.println("---------------------------------------");
                                                    System.out.println("1.Crear nuevo proyecto");
                                                    System.out.println("2.Ver proyecto existente");
                                                    System.out.println("3.Salir");
                                                    opcionProyectoGestor = Integer.parseInt(S.next());

                                                } else if (proyecto4 == numeroProyecto) {
                                                    System.out.println("Has llegado al máximo de proyectos posibles, borra uno para continuar");
                                                    System.out.println("1.Crear nuevo proyecto");
                                                    System.out.println("2.Ver proyecto existente");
                                                    System.out.println("3.Salir");
                                                    opcionProyectoGestor = Integer.parseInt(S.next());

                                                }
                                                break;

                                            case 2:
                                                System.out.println("Ver proyecto existente");
                                                System.out.println("¿Que proyecto deseas ver?");
                                                System.out.println("1. Proyecto 1");
                                                System.out.println("2. Proyecto 2");
                                                System.out.println("3. Proyecto 3");
                                                System.out.println("4. Salir");
                                                opcionVerProyectoGestor = Integer.parseInt(S.next());

                                                switch (opcionVerProyectoGestor) {

                                                    case 1:

                                                        if (verProyecto1 == 0) {
                                                            System.out.println("El proyecto 1 esta vacio");
                                                            break;
                                                        } else {

                                                            System.out.println("Nombre del proyecto: " + nombreProyecto);
                                                            System.out.println("Descripción: " + descripcion);
                                                            System.out.println("Categoría: " + categoria);
                                                            System.out.println("Cantidad necesaria: " + cantidadTotal + " €");
                                                            System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor1 + " €");
                                                            System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor2 + " €");
                                                            System.out.println("Grafico:");

                                                            int porcentaje = 10;
                                                            aporteInversor1 = (aporteInversor1 * 100) / cantidadTotal;
                                                            aporteInversor2 = (aporteInversor2 * 100) / cantidadTotal;

                                                            int aporteTotal = aporteInversor1 + aporteInversor2;


                                                            System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                            System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                            System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                            System.out.print("  \u001B[32m");

                                                            System.out.print("\n\u001B[35m|\n");

                                                            System.out.print("|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                                System.out.print("\033[33m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                                System.out.print("\u001B[34m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");

                                                            for (int j = 0; j < (aporteTotal - 2); j++) {
                                                                System.out.print("\u001B[32m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int r = 0; r < 10; r++) {
                                                                System.out.print("\u001B[35m");
                                                                System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                                porcentaje = porcentaje + 10;

                                                            }
                                                            System.out.println();
                                                            System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                            System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                            System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                            System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                            System.out.println();

                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                            opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                            for (int r = 0; r == 1; ) {
                                                                if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                                    System.out.println("Parametros incorrectos");
                                                                    System.out.println();
                                                                    System.out.println("¿Que proyecto deseas ver?");
                                                                    System.out.println("1. Proyecto 1");
                                                                    System.out.println("2. Proyecto 2");
                                                                    System.out.println("3. Proyecto 3");
                                                                    System.out.println("4. Salir");
                                                                } else {
                                                                    r++;
                                                                }
                                                            }

                                                        }


                                                    case 2:

                                                        if (verProyecto2 == 0) {
                                                            System.out.println("El proyecto 1 esta vacio");
                                                            break;
                                                        } else {

                                                            System.out.println("Nombre del proyecto: " + nombreProyecto2);
                                                            System.out.println("Descripción: " + descripcion2);
                                                            System.out.println("Categoría: " + categoria2);
                                                            System.out.println("Cantidad necesaria: " + cantidadTotal2 + " €");
                                                            System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor12 + " €");
                                                            System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor22 + " €");
                                                            System.out.println("Grafico:");

                                                            int porcentaje = 10;
                                                            aporteInversor1 = (aporteInversor12 * 100) / cantidadTotal2;
                                                            aporteInversor2 = (aporteInversor22 * 100) / cantidadTotal2;

                                                            int aporteTotal = aporteInversor12 + aporteInversor22;


                                                            System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                            System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                            System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                            System.out.print("  \u001B[32m");

                                                            System.out.print("\n\u001B[35m|\n");

                                                            System.out.print("|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                                System.out.print("\033[33m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                                System.out.print("\u001B[34m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");

                                                            for (int j = 0; j < (aporteTotal - 2); j++) {
                                                                System.out.print("\u001B[32m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int r = 0; r < 10; r++) {
                                                                System.out.print("\u001B[35m");
                                                                System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                                porcentaje = porcentaje + 10;

                                                            }
                                                            System.out.println();
                                                            System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion2);
                                                            System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion2);
                                                            System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor12 * (porcentajeRecompensa2 / 100)));
                                                            System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor22 * (porcentajeRecompensa2 / 100)));
                                                            System.out.println();

                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                            opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                            for (int r = 0; r == 1; ) {
                                                                if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                                    System.out.println("Parametros incorrectos");
                                                                    System.out.println();
                                                                    System.out.println("¿Que proyecto deseas ver?");
                                                                    System.out.println("1. Proyecto 1");
                                                                    System.out.println("2. Proyecto 2");
                                                                    System.out.println("3. Proyecto 3");
                                                                    System.out.println("4. Salir");
                                                                } else {
                                                                    r++;
                                                                }
                                                            }

                                                        }


                                                    case 3:

                                                        if (verProyecto3 == 0) {
                                                            System.out.println("El proyecto 1 esta vacio");
                                                            break;
                                                        } else {

                                                            System.out.println("Nombre del proyecto: " + nombreProyecto3);
                                                            System.out.println("Descripción: " + descripcion3);
                                                            System.out.println("Categoría: " + categoria3);
                                                            System.out.println("Cantidad necesaria: " + cantidadTotal3 + " €");
                                                            System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor13 + " €");
                                                            System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor23 + " €");
                                                            System.out.println("Grafico:");

                                                            int porcentaje = 10;
                                                            aporteInversor13 = (aporteInversor13 * 100) / cantidadTotal3;
                                                            aporteInversor23 = (aporteInversor23 * 100) / cantidadTotal3;

                                                            int aporteTotal = aporteInversor13 + aporteInversor23;


                                                            System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                            System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                            System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                            System.out.print("  \u001B[32m");

                                                            System.out.print("\n\u001B[35m|\n");

                                                            System.out.print("|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                                System.out.print("\033[33m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                                System.out.print("\u001B[34m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");

                                                            for (int j = 0; j < (aporteTotal - 2); j++) {
                                                                System.out.print("\u001B[32m■\u001B[0m");

                                                            }
                                                            System.out.print("\n\u001B[35m|\u001B[0m");
                                                            for (int r = 0; r < 10; r++) {
                                                                System.out.print("\u001B[35m");
                                                                System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                                porcentaje = porcentaje + 10;

                                                            }
                                                            System.out.println();
                                                            System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                            System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                            System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                            System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                            System.out.println();

                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                            opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                            for (int r = 0; r == 1; ) {
                                                                if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                                    System.out.println("Parametros incorrectos");
                                                                    System.out.println();
                                                                    System.out.println("¿Que proyecto deseas ver?");
                                                                    System.out.println("1. Proyecto 1");
                                                                    System.out.println("2. Proyecto 2");
                                                                    System.out.println("3. Proyecto 3");
                                                                    System.out.println("4. Salir");
                                                                } else {
                                                                    r++;
                                                                }
                                                            }

                                                        }


                                                    case 4:

                                                        System.out.println("Volviendo al menu anterior");
                                                        break;

                                                    default:

                                                        System.out.println("Parametros incorrectos");
                                                        System.out.println();
                                                        System.out.println("¿Que proyecto deseas ver?");
                                                        System.out.println("1. Proyecto 1");
                                                        System.out.println("2. Proyecto 2");
                                                        System.out.println("3. Proyecto 3");
                                                        System.out.println("4. Salir");
                                                        opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                }


                                            case 3:

                                                System.out.println("Bienvenido al modo Gestor");
                                                System.out.println("**");
                                                System.out.println("1. Mis proyectos");
                                                System.out.println("2. Cambio de Credenciales");
                                                System.out.println("3. Cerrar sesión");
                                                opcionGestor = Integer.parseInt(S.next());
                                                opcionProyectoGestor = 0;
                                                i = 6;

                                            default:
                                                if (opcionProyectoGestor >= 1 || opcionProyectoGestor <= 3) {
                                                    break;
                                                } else {
                                                    System.out.println("Parametros incorrectos");
                                                    System.out.println();
                                                    System.out.println("Bienvenido al apartado de creación de proyectos:");
                                                    System.out.println("---------------------------------------");
                                                    System.out.println("1.Crear nuevo proyecto");
                                                    System.out.println("2.Ver proyecto existente");
                                                    System.out.println("3.Salir");
                                                    opcionProyectoGestor = Integer.parseInt(S.next());
                                                }


                                        }
                                        i=1;
                                    }

                                case 2:
                                    if (opcionGestor != 2) {
                                        break;

                                    } else {

                                        System.out.println("Dime el nombre de usuario por el cual quieras reemplazar");
                                        String R_usuario_gest = S.next();
                                        usuariogestor = R_usuario_gest;

                                        System.out.println("Dime la contraseña por la cual quieras reemplazar");
                                        String R_contra_Ges = S.next();
                                        contraseñagestor = R_contra_Ges;

                                        System.out.println("Ahora tu Usuario es: " + usuariogestor + " y tu contraseña es: " + contraseñagestor);

                                        System.out.println("Pulsa 2 para volver al menú de Gestor");
                                        volverGestor = Integer.parseInt(S.next());


                                        do {
                                            if (volverGestor == 2) {
                                                if (intentoPassGestor == 3) {
                                                    if (bloqueoExcGestor == 1) {
                                                        System.out.println("Usuario bloqueado");
                                                    }
                                                    bloqueoExcGestor = 1;

                                                    do {
                                                        System.out.println("Pulsa 2 para volver al menu principal");
                                                        volverGestor = Integer.parseInt(S.next());
                                                        if (volverGestor < 2 || volverGestor > 2) {
                                                            System.out.println("Valores no permitidos");

                                                        }
                                                    } while (volverGestor != 2);


                                                }
                                                System.out.println(" sistema reiniciado ");
                                                System.out.println("***");
                                                System.out.println("Como quieres acceder al sistema?");
                                                System.out.println("1. Administrador");
                                                System.out.println("2. Gestor");
                                                System.out.println("3. Inversor 1");
                                                System.out.println("4. Inversor 2");
                                                opcion = Integer.parseInt(S.next());

                                            }
                                            if (opcion < 1 || opcion > 4) {
                                                System.out.println("Valores no permitidos");
                                            }
                                        } while (opcion < 1 || opcion > 4);
                                        break;

                                    }

                                case 3:
                                    if (opcionGestor != 3){
                                        break;
                                    }else {
                                        System.out.println("Cerrando sesión");
                                        q++;

                                        System.out.println("Como quieres acceder al sistema?");
                                        System.out.println("1. Administrador");
                                        System.out.println("2. Gestor");
                                        System.out.println("3. Inversor 1");
                                        System.out.println("4. Inversor 2");
                                        opcion = Integer.parseInt(S.next());
                                    }


                            }

                        }


                    case 3://Inversor1

                        if (opcion != 3) {
                            break;
                        } else {

                            for (int i = 0; i < 3; i++) {
                                if (intentoPassInversor1 == 3) {
                                    if (bloqueoExcInversor1 == 1) {
                                        System.out.println("Usuario bloqueado");
                                    }
                                    bloqueoExcInversor1 = 1;

                                    do {
                                        System.out.println("Pulsa 2 para volver al menu principal");
                                        volverInversor1 = Integer.parseInt(S.next());
                                        if (volverInversor1 < 2 || volverInversor1 > 2) {
                                            System.out.println("Valores no permitidos");

                                        } else {
                                            if (volverInversor1 == 2) {
                                                System.out.println("Como quieres acceder al sistema?");
                                                System.out.println("1. Administrador");
                                                System.out.println("2. Gestor");
                                                System.out.println("3. Inversor 1");
                                                System.out.println("4. Inversor 2");
                                                opcion = Integer.parseInt(S.next());

                                            }
                                        }
                                    } while (volverInversor1 == 2);


                                }
                                if (intentoPassInversor1 != 3) {
                                    System.out.println("Bienvenido al modo Inversor1, Introduce el usuario y la contraseña");
                                    System.out.println("Usuario");
                                    String usuarioCredencialInv1 = S.next();
                                    System.out.println("Contraseña");
                                    String contraseñaCredencialInv1 = S.next();
                                    if (usuarioCredencialInv1.equals(usuarioinversor1) && contraseñaCredencialInv1.equals(contraseñainversor1)) {
                                        System.out.println("Bienvenido al modo Inversor1");
                                        System.out.println("**");
                                        System.out.println("1. Mis inversiones");
                                        System.out.println("2. Proyectos");
                                        System.out.println("3. Cartera digital");
                                        System.out.println("4. Invita a un amigo");
                                        System.out.println("5. Cambio de Credenciales");
                                        System.out.println("6. Cerrar sesión");
                                        opcionInversor1 = Integer.parseInt(S.next());
                                        i = 3;
                                    } else {
                                        intentoPassInversor1++;
                                        System.out.println(" Error usuario o contraseña erronea te quedan " + intentos-- + " intentos");

                                    }
                                    if (intentoPassInversor1 == 3) {
                                        System.out.println("Usuario bloqueado");

                                        do {
                                            System.out.println("Pulsa 2 para volver al menu principal");
                                            volverInversor1 = Integer.parseInt(S.next());
                                            if (volverInversor1 < 2 || volverInversor1 > 2) {
                                                System.out.println("Valores no permitidos");
                                            }
                                            else {
                                                if (volverInversor1 == 2) {
                                                    System.out.println("Como quieres acceder al sistema?");
                                                    System.out.println("1. Administrador");
                                                    System.out.println("2. Gestor");
                                                    System.out.println("3. Inversor 1");
                                                    System.out.println("4. Inversor 2");
                                                    opcion = Integer.parseInt(S.next());

                                                }
                                            }
                                        } while (volverInversor1 == 2);


                                    }
                                }
                            }
                            for (int i = 0; i < 1; ) {
                                switch (opcionInversor1) {
                                    case 1:
                                    case 2:
                                        System.out.println("Ver proyecto existente");
                                        System.out.println("¿Que proyecto deseas ver?");
                                        System.out.println("1. Proyecto 1");
                                        System.out.println("2. Proyecto 2");
                                        System.out.println("3. Proyecto 3");
                                        System.out.println("4. Salir");
                                        opcionVerProyectoGestor = Integer.parseInt(S.next());

                                        switch (opcionVerProyectoGestor) {

                                            case 1:

                                                if (verProyecto1 == 0) {
                                                    System.out.println("El proyecto 1 esta vacio");
                                                    break;
                                                } else {

                                                    System.out.println("Nombre del proyecto: " + nombreProyecto);
                                                    System.out.println("Descripción: " + descripcion);
                                                    System.out.println("Categoría: " + categoria);
                                                    System.out.println("Cantidad necesaria: " + cantidadTotal + " €");
                                                    System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor1 + " €");
                                                    System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor2 + " €");
                                                    System.out.println("Grafico:");

                                                    int porcentaje = 10;
                                                    aporteInversor1 = (aporteInversor1 * 100) / cantidadTotal;
                                                    aporteInversor2 = (aporteInversor2 * 100) / cantidadTotal;

                                                    int aporteTotal = aporteInversor1 + aporteInversor2;


                                                    System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                    System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                    System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                    System.out.print("  \u001B[32m");

                                                    System.out.print("\n\u001B[35m|\n");

                                                    System.out.print("|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                        System.out.print("\033[33m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                        System.out.print("\u001B[34m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");

                                                    for (int j = 0; j < (aporteTotal - 2); j++) {
                                                        System.out.print("\u001B[32m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int r = 0; r < 10; r++) {
                                                        System.out.print("\u001B[35m");
                                                        System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                        porcentaje = porcentaje + 10;

                                                    }
                                                    System.out.println();
                                                    System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                    System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                    System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                    System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                    System.out.println();

                                                    System.out.println("¿Que proyecto deseas ver?");
                                                    System.out.println("1. Proyecto 1");
                                                    System.out.println("2. Proyecto 2");
                                                    System.out.println("3. Proyecto 3");
                                                    System.out.println("4. Salir");
                                                    opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                    for (int r = 0; r == 1; ) {
                                                        if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                            System.out.println("Parametros incorrectos");
                                                            System.out.println();
                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                        } else {
                                                            r++;
                                                        }
                                                    }

                                                }


                                            case 2:

                                                if (verProyecto2 == 0) {
                                                    System.out.println("El proyecto 1 esta vacio");
                                                    break;
                                                } else {

                                                    System.out.println("Nombre del proyecto: " + nombreProyecto2);
                                                    System.out.println("Descripción: " + descripcion2);
                                                    System.out.println("Categoría: " + categoria2);
                                                    System.out.println("Cantidad necesaria: " + cantidadTotal2 + " €");
                                                    System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor12 + " €");
                                                    System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor22 + " €");
                                                    System.out.println("Grafico:");

                                                    int porcentaje = 10;
                                                    aporteInversor1 = (aporteInversor12 * 100) / cantidadTotal2;
                                                    aporteInversor2 = (aporteInversor22 * 100) / cantidadTotal2;

                                                    int aporteTotal = aporteInversor12 + aporteInversor22;


                                                    System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                    System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                    System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                    System.out.print("  \u001B[32m");

                                                    System.out.print("\n\u001B[35m|\n");

                                                    System.out.print("|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                        System.out.print("\033[33m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                        System.out.print("\u001B[34m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");

                                                    for (int j = 0; j < (aporteTotal - 2); j++) {
                                                        System.out.print("\u001B[32m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int r = 0; r < 10; r++) {
                                                        System.out.print("\u001B[35m");
                                                        System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                        porcentaje = porcentaje + 10;

                                                    }
                                                    System.out.println();
                                                    System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion2);
                                                    System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion2);
                                                    System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor12 * (porcentajeRecompensa2 / 100)));
                                                    System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor22 * (porcentajeRecompensa2 / 100)));
                                                    System.out.println();

                                                    System.out.println("¿Que proyecto deseas ver?");
                                                    System.out.println("1. Proyecto 1");
                                                    System.out.println("2. Proyecto 2");
                                                    System.out.println("3. Proyecto 3");
                                                    System.out.println("4. Salir");
                                                    opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                    for (int r = 0; r == 1; ) {
                                                        if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                            System.out.println("Parametros incorrectos");
                                                            System.out.println();
                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                        } else {
                                                            r++;
                                                        }
                                                    }

                                                }


                                            case 3:

                                                if (verProyecto3 == 0) {
                                                    System.out.println("El proyecto 1 esta vacio");
                                                    break;
                                                } else {

                                                    System.out.println("Nombre del proyecto: " + nombreProyecto3);
                                                    System.out.println("Descripción: " + descripcion3);
                                                    System.out.println("Categoría: " + categoria3);
                                                    System.out.println("Cantidad necesaria: " + cantidadTotal3 + " €");
                                                    System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor13 + " €");
                                                    System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor23 + " €");
                                                    System.out.println("Grafico:");

                                                    int porcentaje = 10;
                                                    aporteInversor13 = (aporteInversor13 * 100) / cantidadTotal3;
                                                    aporteInversor23 = (aporteInversor23 * 100) / cantidadTotal3;

                                                    int aporteTotal = aporteInversor13 + aporteInversor23;


                                                    System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                    System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                    System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                    System.out.print("  \u001B[32m");

                                                    System.out.print("\n\u001B[35m|\n");

                                                    System.out.print("|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                        System.out.print("\033[33m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                        System.out.print("\u001B[34m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");

                                                    for (int j = 0; j < (aporteTotal - 2); j++) {
                                                        System.out.print("\u001B[32m■\u001B[0m");

                                                    }
                                                    System.out.print("\n\u001B[35m|\u001B[0m");
                                                    for (int r = 0; r < 10; r++) {
                                                        System.out.print("\u001B[35m");
                                                        System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                        porcentaje = porcentaje + 10;

                                                    }
                                                    System.out.println();
                                                    System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                    System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                    System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                    System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                    System.out.println();

                                                    System.out.println("¿Que proyecto deseas ver?");
                                                    System.out.println("1. Proyecto 1");
                                                    System.out.println("2. Proyecto 2");
                                                    System.out.println("3. Proyecto 3");
                                                    System.out.println("4. Salir");
                                                    opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                    for (int r = 0; r == 1; ) {
                                                        if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                            System.out.println("Parametros incorrectos");
                                                            System.out.println();
                                                            System.out.println("¿Que proyecto deseas ver?");
                                                            System.out.println("1. Proyecto 1");
                                                            System.out.println("2. Proyecto 2");
                                                            System.out.println("3. Proyecto 3");
                                                            System.out.println("4. Salir");
                                                        } else {
                                                            r++;
                                                        }
                                                    }

                                                }


                                            case 4:

                                                System.out.println("Volviendo al menu anterior");
                                                break;

                                            default:

                                                System.out.println("Parametros incorrectos");
                                                System.out.println();
                                                System.out.println("¿Que proyecto deseas ver?");
                                                System.out.println("1. Proyecto 1");
                                                System.out.println("2. Proyecto 2");
                                                System.out.println("3. Proyecto 3");
                                                System.out.println("4. Salir");
                                                opcionVerProyectoGestor = Integer.parseInt(S.next());
                                        }
                                    case 3:
                                        System.out.println("Bienvenido a tu carteraInv1 digital tu saldo actual es de " + saldoCarteraDigital1);
                                        while (carteraInv1 != 1) {
                                            System.out.println("para ingresar dinero pulsa 1 ");
                                            carteraInv1 = Integer.parseInt(S.next());
                                            if (carteraInv1 != 1) {
                                                System.out.println("Error parametro no valido");
                                            }
                                        }
                                        System.out.println("¿Cuanto dinero quieres depositar?");
                                        int depositar = Integer.parseInt(S.next());
                                        saldoCarteraDigital1 += depositar;
                                        System.out.println("Tu saldo actual es de " + saldoCarteraDigital1 + "€");
                                        System.out.println("para volver  al menu oprime 2");
                                        int volver3 = Integer.parseInt(S.next());
                                        if (volver3 == 2) {
                                            System.out.println(opcion);
                                            System.out.println("Bienvenido al modo Inversor1");
                                            System.out.println("**");
                                            System.out.println("1. Mis inversiones");
                                            System.out.println("2. Proyectos");
                                            System.out.println("3. Cartera digital");
                                            System.out.println("4. Invita a un amigo");
                                            System.out.println("5. Cambio de Credenciales");
                                            System.out.println("6. Cerrar sesión");
                                            opcionInversor1 = Integer.parseInt(S.next());
                                        }
                                    case 4:

                                        break;
                                    case 5:
                                        System.out.println("Dime el nombre de usuario por el cual quieras reemplazar");
                                        String R_usuario_Inv1 = S.next();
                                        usuarioinversor1 = R_usuario_Inv1;

                                        System.out.println("Dime la contraseña por la cual quieras reemplazar");
                                        String R_contra_Inv1 = S.next();
                                        contraseñainversor1 = R_contra_Inv1;

                                        System.out.println("Ahora tu Usuario es: " + usuarioinversor1 + " y tu contraseña es: " + contraseñainversor1);

                                        System.out.println("Pulsa 2 para volver al menú de Inversor 1");
                                        volverInversor1 = Integer.parseInt(S.next());
                                        do {
                                            if (volverInversor1 == 2) {
                                                if (intentoPassInversor1 == 3) {
                                                    if (bloqueoExcInversor1 == 1) {
                                                        System.out.println("Usuario bloqueado");
                                                    }
                                                    bloqueoExcInversor1 = 1;

                                                    do {
                                                        System.out.println("Pulsa 2 para volver al menu principal");
                                                        volverInversor1 = Integer.parseInt(S.next());
                                                        if (volverInversor1 < 2 || volverInversor1 > 2) {
                                                            System.out.println("Valores no permitidos");

                                                        }
                                                    } while (volverInversor1 != 2);
                                                }
                                                System.out.println(" sistema reiniciado ");
                                                System.out.println("***");
                                                System.out.println("Como quieres acceder al sistema?");
                                                System.out.println("1. Administrador");
                                                System.out.println("2. Gestor");
                                                System.out.println("3. Inversor 1");
                                                System.out.println("4. Inversor 2");
                                                opcion = Integer.parseInt(S.next());
                                            }
                                            if (opcion < 1 || opcion > 4) {
                                                System.out.println("Valores no permitidos");
                                            }
                                        } while (opcion < 1 || opcion > 4);
                                        break;
                                    case 6:
                                        System.out.println("Cerrando sesión");

                                        System.out.println("Como quieres acceder al sistema?");
                                        System.out.println("1. Administrador");
                                        System.out.println("2. Gestor");
                                        System.out.println("3. Inversor 1");
                                        System.out.println("4. Inversor 2");
                                        opcion = Integer.parseInt(S.next());
                                        opcionInversor1 = 0;
                                        i = 1;
                                }
                            }
                            break;

                        }

                    case 4://Inversor2
                        for (int i = 0; i < 3; i++) {
                            if (intentoPassInversor2 == 3) {
                                if (bloqueoExcInversor2 == 1) {
                                    System.out.println("Usuario bloqueado");
                                }
                                bloqueoExcInversor2 = 1;
                                do {
                                    System.out.println("Pulsa 2 para volver al menu principal");
                                    volverInversor2 = Integer.parseInt(S.next());
                                    if (volverInversor2 < 2 || volverInversor2 > 2) {
                                        System.out.println("Valores no permitidos");
                                    }
                                } while (volverInversor2 != 2);

                                if (volverInversor2 == 2) {
                                    System.out.println("Como quieres acceder al sistema?");
                                    System.out.println("1. Administrador");
                                    System.out.println("2. Gestor");
                                    System.out.println("3. Inversor 1");
                                    System.out.println("4. Inversor 2");
                                    opcion = Integer.parseInt(S.next());

                                }
                            }
                            if (intentoPassInversor2 != 3) {
                                System.out.println("Bienvenido al modo Gestor, Introduce el usuario y la contraseña");
                                System.out.println("Usuario");
                                String usuarioCredencialInv2 = S.next();
                                System.out.println("Contraseña");
                                String contraseñaCredencialInv2 = S.next();
                                if (usuarioCredencialInv2.equals(usuarioinversor2) && contraseñaCredencialInv2.equals(contraseñainversor2)) {
                                    System.out.println("Bienvenido al modo Inversor2");
                                    System.out.println("**");
                                    System.out.println("1. Mis inversiones");
                                    System.out.println("2. Proyectos");
                                    System.out.println("3. Cartera digital");
                                    System.out.println("4. Invita a un amigo");
                                    System.out.println("5. Cambio de Credenciales");
                                    System.out.println("6. Cerrar sesión");
                                    opcionInversor2 = Integer.parseInt(S.next());
                                    i = 3;
                                } else {
                                    intentoPassInversor2++;
                                    System.out.println(" Error usuario o contraseña erronea te quedan " + intentos-- + " intentos");

                                }
                                if (intentoPassInversor2 == 3) {
                                    System.out.println("Usuario bloqueado");

                                    do {
                                        System.out.println("Pulsa 2 para volver al menu principal");
                                        volverInversor2 = Integer.parseInt(S.next());
                                        if (volverInversor2 < 2 || volverInversor2 > 2) {
                                            System.out.println("Valores no permitidos");
                                        }
                                    } while (volverInversor2 != 2);

                                    if (volverInversor2 == 2) {
                                        System.out.println("Como quieres acceder al sistema?");
                                        System.out.println("1. Administrador");
                                        System.out.println("2. Gestor");
                                        System.out.println("3. Inversor 1");
                                        System.out.println("4. Inversor 2");
                                        opcion = Integer.parseInt(S.next());
                                    }
                                }
                            }
                        }
                        for (int i = 0; i < 1; ) {
                            switch (opcionInversor2) {
                                case 1:
                                case 2:
                                    System.out.println("Ver proyecto existente");
                                    System.out.println("¿Que proyecto deseas ver?");
                                    System.out.println("1. Proyecto 1");
                                    System.out.println("2. Proyecto 2");
                                    System.out.println("3. Proyecto 3");
                                    System.out.println("4. Salir");
                                    opcionVerProyectoGestor = Integer.parseInt(S.next());

                                    switch (opcionVerProyectoGestor) {

                                        case 1:

                                            if (verProyecto1 == 0) {
                                                System.out.println("El proyecto 1 esta vacio");
                                                break;
                                            } else {

                                                System.out.println("Nombre del proyecto: " + nombreProyecto);
                                                System.out.println("Descripción: " + descripcion);
                                                System.out.println("Categoría: " + categoria);
                                                System.out.println("Cantidad necesaria: " + cantidadTotal + " €");
                                                System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor1 + " €");
                                                System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor2 + " €");
                                                System.out.println("Grafico:");

                                                int porcentaje = 10;
                                                aporteInversor1 = (aporteInversor1 * 100) / cantidadTotal;
                                                aporteInversor2 = (aporteInversor2 * 100) / cantidadTotal;

                                                int aporteTotal = aporteInversor1 + aporteInversor2;


                                                System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                System.out.print("  \u001B[32m");

                                                System.out.print("\n\u001B[35m|\n");

                                                System.out.print("|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                    System.out.print("\033[33m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                    System.out.print("\u001B[34m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");

                                                for (int j = 0; j < (aporteTotal - 2); j++) {
                                                    System.out.print("\u001B[32m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int r = 0; r < 10; r++) {
                                                    System.out.print("\u001B[35m");
                                                    System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                    porcentaje = porcentaje + 10;

                                                }
                                                System.out.println();
                                                System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                System.out.println();

                                                System.out.println("¿Que proyecto deseas ver?");
                                                System.out.println("1. Proyecto 1");
                                                System.out.println("2. Proyecto 2");
                                                System.out.println("3. Proyecto 3");
                                                System.out.println("4. Salir");
                                                opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                for (int r = 0; r == 1; ) {
                                                    if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                        System.out.println("Parametros incorrectos");
                                                        System.out.println();
                                                        System.out.println("¿Que proyecto deseas ver?");
                                                        System.out.println("1. Proyecto 1");
                                                        System.out.println("2. Proyecto 2");
                                                        System.out.println("3. Proyecto 3");
                                                        System.out.println("4. Salir");
                                                    } else {
                                                        r++;
                                                    }
                                                }

                                            }


                                        case 2:

                                            if (verProyecto2 == 0) {
                                                System.out.println("El proyecto 1 esta vacio");
                                                break;
                                            } else {

                                                System.out.println("Nombre del proyecto: " + nombreProyecto2);
                                                System.out.println("Descripción: " + descripcion2);
                                                System.out.println("Categoría: " + categoria2);
                                                System.out.println("Cantidad necesaria: " + cantidadTotal2 + " €");
                                                System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor12 + " €");
                                                System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor22 + " €");
                                                System.out.println("Grafico:");

                                                int porcentaje = 10;
                                                aporteInversor1 = (aporteInversor12 * 100) / cantidadTotal2;
                                                aporteInversor2 = (aporteInversor22 * 100) / cantidadTotal2;

                                                int aporteTotal = aporteInversor12 + aporteInversor22;


                                                System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                System.out.print("  \u001B[32m");

                                                System.out.print("\n\u001B[35m|\n");

                                                System.out.print("|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                    System.out.print("\033[33m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                    System.out.print("\u001B[34m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");

                                                for (int j = 0; j < (aporteTotal - 2); j++) {
                                                    System.out.print("\u001B[32m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int r = 0; r < 10; r++) {
                                                    System.out.print("\u001B[35m");
                                                    System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                    porcentaje = porcentaje + 10;

                                                }
                                                System.out.println();
                                                System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion2);
                                                System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion2);
                                                System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor12 * (porcentajeRecompensa2 / 100)));
                                                System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor22 * (porcentajeRecompensa2 / 100)));
                                                System.out.println();

                                                System.out.println("¿Que proyecto deseas ver?");
                                                System.out.println("1. Proyecto 1");
                                                System.out.println("2. Proyecto 2");
                                                System.out.println("3. Proyecto 3");
                                                System.out.println("4. Salir");
                                                opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                for (int r = 0; r == 1; ) {
                                                    if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                        System.out.println("Parametros incorrectos");
                                                        System.out.println();
                                                        System.out.println("¿Que proyecto deseas ver?");
                                                        System.out.println("1. Proyecto 1");
                                                        System.out.println("2. Proyecto 2");
                                                        System.out.println("3. Proyecto 3");
                                                        System.out.println("4. Salir");
                                                    } else {
                                                        r++;
                                                    }
                                                }

                                            }


                                        case 3:

                                            if (verProyecto3 == 0) {
                                                System.out.println("El proyecto 1 esta vacio");
                                                break;
                                            } else {

                                                System.out.println("Nombre del proyecto: " + nombreProyecto3);
                                                System.out.println("Descripción: " + descripcion3);
                                                System.out.println("Categoría: " + categoria3);
                                                System.out.println("Cantidad necesaria: " + cantidadTotal3 + " €");
                                                System.out.println("Cantidad financiada por el inversor 1: " + aporteInversor13 + " €");
                                                System.out.println("Cantidad financiada por el inversor 2: " + aporteInversor23 + " €");
                                                System.out.println("Grafico:");

                                                int porcentaje = 10;
                                                aporteInversor13 = (aporteInversor13 * 100) / cantidadTotal3;
                                                aporteInversor23 = (aporteInversor23 * 100) / cantidadTotal3;

                                                int aporteTotal = aporteInversor13 + aporteInversor23;


                                                System.out.println("Aporte inversor 1 -> \033[33m■\u001B[0m");
                                                System.out.println("Aporte inversor 2 -> \u001B[34m■\u001B[0m");
                                                System.out.println("Aporte total -> \u001B[32m■\u001B[0m");
                                                System.out.print("  \u001B[32m");

                                                System.out.print("\n\u001B[35m|\n");

                                                System.out.print("|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor1 - 2); j++) {
                                                    System.out.print("\033[33m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int j = 0; j < (aporteInversor2 - 2); j++) {
                                                    System.out.print("\u001B[34m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");

                                                for (int j = 0; j < (aporteTotal - 2); j++) {
                                                    System.out.print("\u001B[32m■\u001B[0m");

                                                }
                                                System.out.print("\n\u001B[35m|\u001B[0m");
                                                for (int r = 0; r < 10; r++) {
                                                    System.out.print("\u001B[35m");
                                                    System.out.print("_______" + porcentaje + "%\u001B[0m");
                                                    porcentaje = porcentaje + 10;

                                                }
                                                System.out.println();
                                                System.out.println("Fecha de inicio de apertura de inversiones: " + fechaAperturaInversion);
                                                System.out.println("Fecha de cierre de inversiones: " + fechaCierreInversion);
                                                System.out.println("Porcentaje de recompensa inversor 1: " + (aporteInversor1 * (porcentajeRecompensa / 100)));
                                                System.out.println("Porcentaje de recompensa inversor 2: " + (aporteInversor2 * (porcentajeRecompensa / 100)));
                                                System.out.println();

                                                System.out.println("¿Que proyecto deseas ver?");
                                                System.out.println("1. Proyecto 1");
                                                System.out.println("2. Proyecto 2");
                                                System.out.println("3. Proyecto 3");
                                                System.out.println("4. Salir");
                                                opcionVerProyectoGestor = Integer.parseInt(S.next());
                                                for (int r = 0; r == 1; ) {
                                                    if (opcionVerProyectoGestor <= 1 || opcionVerProyectoGestor >= 4) {
                                                        System.out.println("Parametros incorrectos");
                                                        System.out.println();
                                                        System.out.println("¿Que proyecto deseas ver?");
                                                        System.out.println("1. Proyecto 1");
                                                        System.out.println("2. Proyecto 2");
                                                        System.out.println("3. Proyecto 3");
                                                        System.out.println("4. Salir");
                                                    } else {
                                                        r++;
                                                    }
                                                }

                                            }


                                        case 4:

                                            System.out.println("Volviendo al menu anterior");
                                            break;

                                        default:

                                            System.out.println("Parametros incorrectos");
                                            System.out.println();
                                            System.out.println("¿Que proyecto deseas ver?");
                                            System.out.println("1. Proyecto 1");
                                            System.out.println("2. Proyecto 2");
                                            System.out.println("3. Proyecto 3");
                                            System.out.println("4. Salir");
                                            opcionVerProyectoGestor = Integer.parseInt(S.next());
                                    }
                                case 3:
                                    System.out.println("Bienvenido a tu carteraInv1 digital tu saldo actual es de " + saldoCarteraDigital2);
                                    while (carteraInv2 != 1) {
                                        System.out.println("para ingresar dinero pulsa 1 ");
                                        carteraInv2 = Integer.parseInt(S.next());
                                        if (carteraInv2 != 1) {
                                            System.out.println("Error parametro no valido");
                                        }
                                    }
                                    System.out.println("¿Cuanto dinero quieres depositar?");
                                    int depositarInv2 = Integer.parseInt(S.next());
                                    saldoCarteraDigital2 += depositarInv2;
                                    System.out.println("Tu saldo actual es de " + saldoCarteraDigital2 + "€");
                                    System.out.println("para volver  al menu oprime 2");
                                    int volver4 = Integer.parseInt(S.next());
                                    if (volver4 == 2) {
                                        System.out.println(opcion);
                                        System.out.println("Bienvenido al modo Inversor2");
                                        System.out.println("**");
                                        System.out.println("1. Mis inversiones");
                                        System.out.println("2. Proyectos");
                                        System.out.println("3. Cartera digital");
                                        System.out.println("4. Invita a un amigo");
                                        System.out.println("5. Cambio de Credenciales");
                                        System.out.println("6. Cerrar sesión");
                                        opcionInversor2 = Integer.parseInt(S.next());
                                    }
                                    break;
                                case 4:
                                case 5:
                                    System.out.println("Dime el nombre de usuario por el cual quieras reemplazar");
                                    String R_usuario_Inv2 = S.next();
                                    usuarioinversor2 = R_usuario_Inv2;

                                    System.out.println("Dime la contraseña por la cual quieras reemplazar");
                                    String R_contra_Inv2 = S.next();
                                    contraseñainversor2 = R_contra_Inv2;

                                    System.out.println("Ahora tu Usuario es: " + usuarioinversor2 + " y tu contraseña es: " + contraseñainversor2);

                                    System.out.println("Pulsa 2 para volver al menú de Inversor2");
                                    volverInversor2 = Integer.parseInt(S.next());
                                    do {
                                        if (volverInversor2 == 2) {
                                            if (intentoPassInversor2 == 3) {
                                                if (bloqueoExcInversor2 == 1) {
                                                    System.out.println("Usuario bloqueado");
                                                }
                                                bloqueoExcInversor2 = 1;

                                                do {
                                                    System.out.println("Pulsa 2 para volver al menu principal");
                                                    volverInversor2 = Integer.parseInt(S.next());
                                                    if (volverInversor2 < 2 || volverInversor2 > 2) {
                                                        System.out.println("Valores no permitidos");

                                                    }
                                                } while (volverInversor2 != 2);

                                            }
                                            System.out.println(" sistema reiniciado ");
                                            System.out.println("***");
                                            System.out.println("Como quieres acceder al sistema?");
                                            System.out.println("1. Administrador");
                                            System.out.println("2. Gestor");
                                            System.out.println("3. Inversor 1");
                                            System.out.println("4. Inversor 2");
                                            opcion = Integer.parseInt(S.next());

                                        }
                                        if (opcion < 1 || opcion > 4) {
                                            System.out.println("Valores no permitidos");
                                        }
                                    } while (opcion < 1 || opcion > 4);
                                    break;
                                case 6:
                                    System.out.println("Cerrando sesión");

                                    System.out.println("Como quieres acceder al sistema?");
                                    System.out.println("1. Administrador");
                                    System.out.println("2. Gestor");
                                    System.out.println("3. Inversor 1");
                                    System.out.println("4. Inversor 2");
                                    opcion = Integer.parseInt(S.next());
                                    i=2;
                            }

                        }

                }

            }
        }
    }
}
