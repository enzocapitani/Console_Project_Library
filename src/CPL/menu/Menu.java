package CPL.menu;

import CPL.style.Write;

public class Menu {
    
    public static void simpleMenu(String title, String options[]){
        String separator = Menu.generateSeparator(title.length());

        //Gera o titulo do menu :)
        System.out.println(separator);
        System.out.println(Menu.generateCenterTitle(title));
        System.out.println(separator);

        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1)+"- "+options[i]);
        }

        System.out.println(separator);

    }

    public static void simpleTypeMenu(String title, String options[], int delay){
        String separator = Menu.generateSeparator(title.length());

        //Gera o titulo do menu :)
        Write.write(separator, delay);
        Write.write(Menu.generateCenterTitle(title), delay);
        Write.write(separator, delay);

        for(int i = 0; i < options.length; i++){
            Write.write((i + 1)+"- "+options[i], delay);
        }

        Write.write(separator, delay);

    }

    public static String generateSeparator(int size){
        int separatorLenght = size*3;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < separatorLenght; i++){
            sb.append('=');
        }

        return sb.toString();
    }

    public static String generateCenterTitle(String title){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < title.length(); i++){
            sb.append(" ");
        }

        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        return sb.toString();

    }

}
