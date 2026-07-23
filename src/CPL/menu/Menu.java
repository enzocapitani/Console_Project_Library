package CPL.menu;

import CPL.style.Write;

/**
 * Classe responsável pela criação de menus simples para aplicações
 * executadas no terminal.
 *
 * Todos os métodos são estáticos, portanto não é necessário criar
 * uma instância desta classe para utilizá-los.
 */
public class Menu {
    
    /**
     * Exibe um menu simples no terminal.
     *
     * O menu é composto por um título centralizado, uma lista numerada
     * de opções e linhas separadoras.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções que serão exibidas.
     */
    public static void simpleMenu(String title, String options[]){
        String separator = Menu.generateSeparator(title, options);

        // Gera o cabeçalho do menu
        System.out.println(separator);
        System.out.println(Menu.generateCenterTitle(separator, title));
        System.out.println(separator);

        // Exibe todas as opções numeradas
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1)+"- "+options[i]);
        }

        // Fecha o menu com uma linha separadora
        System.out.println(separator);

    }

    /**
     * Exibe um menu utilizando o efeito de digitação da classe Write.
     *
     * Cada caractere é exibido com um intervalo definido pelo parâmetro
     * delay.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções do menu.
     * @param delay Tempo, em milissegundos, entre cada caractere exibido.
     */
    public static void simpleTypeMenu(String title, String options[], int delay){
        String separator = Menu.generateSeparator(title, options);

        // Gera o cabeçalho do menu utilizando efeito de escrita
        Write.write(separator, delay);
        Write.write(Menu.generateCenterTitle(separator, title), delay);
        Write.write(separator, delay);

        // Exibe todas as opções numeradas com efeito de escrita
        for(int i = 0; i < options.length; i++){
            Write.write((i + 1)+"- "+options[i], delay);
        }

        // Fecha o menu
        Write.write(separator, delay);

    }

    /**
     * Gera automaticamente a linha separadora do menu.
     *
     * O tamanho da linha é baseado no maior texto encontrado entre
     * o título e as opções do menu.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções.
     * @return Uma String composta apenas pelo caractere '='.
     */
    public static String generateSeparator(String title, String options[]){
        int maiorString = title.length();

        // Procura o maior texto entre as opções
        for(int i = 0; i < options.length; i++){
            if(options[i].length() > maiorString) maiorString = options[i].length();
        }

        // Multiplica o tamanho para gerar uma margem visual maior
        maiorString *= 2;

        StringBuilder sb = new StringBuilder();

        // Cria a linha separadora
        for(int i = 0; i < maiorString; i++){
            sb.append('=');
        }

        return sb.toString();
    }

    /**
     * Centraliza o título do menu em relação ao tamanho da linha
     * separadora.
     *
     * @param separator Linha separadora utilizada como referência.
     * @param title Título do menu.
     * @return O título centralizado.
     */
    public static String generateCenterTitle(String separator, String title){

        StringBuilder sb = new StringBuilder();

        // Calcula a quantidade de espaços necessários
        int espacoBranco = separator.length()/2 - title.length()/2;

        // Adiciona os espaços antes do título
        for(int i = 0; i < espacoBranco; i++){
            sb.append(" ");
        }

        // Adiciona o título
        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        return sb.toString();

    }

}