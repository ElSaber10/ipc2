package ipc2;

import java.util.Scanner;

import ipc2.Menus.Menu;

/**
 * Incio del proyecto
 *
 */
public class App 
{
    public static Scanner entrada = new Scanner(System.in);
    public static void main( String[] args )
    {
        Menu.menuInicio(entrada);
    }
}
