# WriteColor

O enum `WriteColor` faz parte do pacote `CPL.style` e representa as cores ANSI utilizadas pela classe `Write`.

Cada constante retorna automaticamente o código ANSI correspondente, permitindo colorir textos no terminal de forma simples.

> **Pacote:** `CPL.style`

---

# Visão Geral

O `WriteColor` é utilizado pelos métodos da classe `Write` e também pode ser usado diretamente com `System.out.print()` ou `System.out.println()`.

Exemplo:

```java
System.out.print(WriteColor.RED);
System.out.println("Texto vermelho");
System.out.print(WriteColor.RESET);
```

Como o método `toString()` foi sobrescrito, não é necessário chamar nenhum método para obter o código ANSI.

---

# Constantes

## `RED`

Define a cor do texto como vermelho.

### Exemplo

```java
Write.write("Erro!", WriteColor.RED);
```

---

## `GREEN`

Define a cor do texto como verde.

### Exemplo

```java
Write.write("Operação realizada com sucesso!", WriteColor.GREEN);
```

---

## `BLUE`

Define a cor do texto como azul.

### Exemplo

```java
Write.write("Informação", WriteColor.BLUE);
```

---

## `RESET`

Restaura a cor original do terminal.

Essa constante normalmente é utilizada automaticamente pela classe `Write`, mas também pode ser usada manualmente.

### Exemplo

```java
System.out.print(WriteColor.RESET);
```

---

# Método sobrescrito

## `toString()`

Retorna o código ANSI correspondente à cor.

Graças à sobrescrita deste método, basta imprimir o enum diretamente:

```java
System.out.print(WriteColor.GREEN);
```

Em vez de:

```java
System.out.print(WriteColor.GREEN.toString());
```

---

# Exemplo completo

```java
import CPL.style.WriteColor;

public class Main {

    public static void main(String[] args) {

        System.out.print(WriteColor.RED);
        System.out.println("Texto em vermelho");

        System.out.print(WriteColor.GREEN);
        System.out.println("Texto em verde");

        System.out.print(WriteColor.BLUE);
        System.out.println("Texto em azul");

        System.out.print(WriteColor.RESET);
        System.out.println("Cor restaurada");
    }

}
```

---

# Observações

- As cores utilizam **ANSI Escape Codes**.
- O suporte às cores depende do terminal utilizado.
- Alguns consoles de IDEs podem não interpretar códigos ANSI corretamente.
- A constante `RESET` deve ser utilizada sempre que desejar retornar à cor padrão do terminal.