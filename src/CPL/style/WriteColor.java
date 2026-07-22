package CPL.style;

public enum WriteColor {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    RESET("\u001B[0m");

    private final String ansi;

    private WriteColor(String ansi){
        this.ansi = ansi;
    }

    public String getAnsi() {
        return ansi;
    }

    @Override
    public String toString(){
        return ansi;
    }

}
