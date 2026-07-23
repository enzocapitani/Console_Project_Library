# Version 0.03
## Features
Adicionada a classe Menu
### Menu
- É possível agora criar menus utilizando a classe MENU

simpleMenu(String title, String options);
simpleTypeMenu(String title, String options, int delay);

Essas novas funções recebem como parâmetro o título do menu, um vetor de opções do menu e, a com efeito de escrita, o delay

exemplo: 
```java
package CPL;

import CPL.menu.Menu;

public class Main {
    public static void main(String[] args) {
        String options[] = {"Login", "About", "Exit"};

        Menu.simpleMenu("PROGRAM", options);
    }
}
```

saida:
```text
==============
    PROGRAM
==============
1- Login
2- About
3- Exit
==============
```

# Version 0.02
## Features
Adicionada a classe Input e novas funções na Write
### Write
- É possível agora escrever colorido no terminal, chamando no parâmetro da função write o enum que indica a cor desejada
```java
public void genericFunction(){
    Write.write("Hello world!", WriteColor.RED, 10);
}
```
Assim como as outras, ela também nao necessita passar o delay como parametro, pois também usa o delay padrão da classe

- Também é possível mudar a cor de todo terminal com a função setWriteColor(), quando chamada, todas as saídas escritas  após elas, sairão com a cor definida pelo usuário. Para voltar a cor original, basta chamar resetWriteColor()

### Input
Essa nova classe tem como objetivo capturar alguns tipos de entrada definidas pelo usuário : boolean, double, int e string.
Exemplo:

```java

public void genericFunction(){
    String phrase = Input.catchString();
    Write.write(phrase, WriteColor.RED);
}

```

# Version 0.01
## Features
Adicionada as primeiras funções do código, CleanTerminal e Write
### Write
Nessa classe, ela possui uma função em que escreve letras por letras de uma palavra com o delaypré definido da classe ou com o parâmetro passado na função write();

### CleanTerminal
Nessa classe, possui apenas uma função, por agora, em que a função dela é limpar o terminal/consoleela não funciona em alguns consoles de ide, como por exemplo o Eclipse.
