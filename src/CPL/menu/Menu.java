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
        String separator = Menu.generateSeparator(title, options, '=');

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
    public static void simpleMenu(String title, String options[], int delay){
        String separator = Menu.generateSeparator(title, options, '=');

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
     * Escreve o menu em caixa, cerca o titulo e as opções de caracteres, formando uma caixa
     * 
     * @param title
     * @param options
     */
    public static void boxMenu(String title, String options[]){
        String separator = generateSeparator(title, options, '-');

        System.out.println(separator);
        System.out.println(generateSurroundedTitle(separator, title, biggestElement(title, options)));
        System.out.println(separator);

        writeOptions(options, separator.length());
        System.out.println(separator);
    }

    /**
     * Gera automaticamente a linha separadora do menu.
     *
     * O tamanho da linha é baseado no maior texto encontrado entre
     * o título e as opções do menu.
     *
     * @param title Título do menu.
     * @param options Vetor contendo as opções.
     * @param character o caractere do separador
     * @return Uma String composta apenas pelo caractere '='.
     */
    public static String generateSeparator(String title, String options[], char character){
        int maiorString = biggestElement(title, options);

        // Multiplica o tamanho para gerar uma margem visual maior
        maiorString *= 2;

        StringBuilder sb = new StringBuilder();

        // Cria a linha separadora
        for(int i = 0; i < maiorString; i++){
            sb.append(character);
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

    /**
     * Centraliza o título do menu em relação ao tamanho da linha
     * separadora e adiciona ao seu redor o caractere '|'.
     *
     * @param separator Linha separadora utilizada como referência.
     * @param title Título do menu.
     * @param biggestString Maior string entre as opções e o titulo
     * @return O título centralizado e fechado por '|'.
     */
    private static String generateSurroundedTitle(String separator, String title, int biggestString){
        StringBuilder sb = new StringBuilder();

        int espacoBranco = separator.length()/2 - title.length()/2;

        for(int i = 0; i < espacoBranco; i++){
            if(i == 0){
              sb.append("|");
              continue;   
            }
            sb.append(" ");
        }

        // Adiciona o título
        for(int i = 0; i < title.length(); i++){
            sb.append(title.charAt(i));
        }

        if(biggestString % 2 != 0) espacoBranco -= 1;

        for(int i = 0; i < espacoBranco; i++){
            if(i == espacoBranco - 1){
                sb.append("|");
                continue;
            }
            sb.append(" ");
        }

        return sb.toString();

    }

    /**
     * Procura o maior elemento entre o titulo e as opções
     * 
     * @param title o titulo do menu
     * @param options as opcoes do menu
     * @return o maior elemento entre o titulo e as opçoes
     */
    private static int biggestElement(String title, String[] options){
        int maiorString = title.length();

        // Procura o maior texto entre as opções
        for(int i = 0; i < options.length; i++){
            if(options[i].length() > maiorString) maiorString = options[i].length();
        }

        return maiorString;
    }

    /**
     * Escreve a parte de opções do boxMenu
     * 
     * @param options as opções
     * @param separatorSize o tamanho do separador
     */
    private static void writeOptions(String[] options, int separatorSize){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < options.length; i++){
            for(int j = 0; j < separatorSize; j++){
                
                if(j < 4){
                    switch (j) {
                        case 0:
                            sb.append('|');
                            break;
                        case 1: 
                            sb.append(i+1);
                            break;
                        case 2: 
                            sb.append('-');
                            break;
                        case 3: 
                            sb.append(" ");
                            break;
                    }
                    continue;
                }

                if(j >= 4 && j < options[i].length() + 4){
                    sb.append(options[i].charAt(j - 4));
                    continue;
                }

                if(j < separatorSize - 1){
                    sb.append(" ");
                }else{
                    sb.append('|');
                }

            }
            System.out.println(sb.toString());
            sb.delete(0, separatorSize);
        }
    }

}