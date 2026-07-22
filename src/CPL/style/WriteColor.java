package CPL.style;

/*
* Enum para as cores no WriteColor, os valores retornam valores em ANSI em que o terminal consegue ler
*/
public enum WriteColor {
    
    //Aqui define-se as cores
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),

    //Esse volta a cor original do terminal
    RESET("\u001B[0m");

    private final String ansi;

    private WriteColor(String ansi){
        this.ansi = ansi;
    }
    
    //Sobreposição do toString para facilitar a escrita do enum
    @Override
    public String toString(){
        return ansi;
    }

}
