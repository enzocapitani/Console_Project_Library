# Write

A classe `Write` faz parte do pacote `CPL.style` e fornece métodos para escrever texto no console com um efeito de digitação (typewriter). Além disso, é possível utilizar cores ANSI e personalizar o tempo entre cada caractere.

> **Pacote:** `CPL.style`

---

## Visão Geral

A classe possui métodos estáticos, portanto **não é necessário criar uma instância**.

```java
Write.write("Olá, mundo!");
```

---

# Métodos

## `write(String phrase)`

Escreve uma frase caractere por caractere utilizando o delay padrão da biblioteca (50 ms).

### Parâmetros

| Nome | Tipo | Descrição |
|------|------|-----------|
| `phrase` | `String` | Texto que será exibido no console. |

### Exemplo

```java
Write.write("Bem-vindo ao CPL!");
```

---

## `write(String phrase, int delay)`

Escreve uma frase caractere por caractere utilizando um delay personalizado.

### Parâmetros

| Nome | Tipo | Descrição |
|------|------|-----------|
| `phrase` | `String` | Texto que será exibido. |
| `delay` | `int` | Tempo (em milissegundos) entre cada caractere. |

### Exemplo

```java
Write.write("Carregando...", 100);
```

---

## `write(String phrase, WriteColor color)`

Escreve uma frase utilizando uma cor ANSI e o delay padrão da biblioteca.

Após terminar a escrita, a cor do terminal é restaurada automaticamente.

### Parâmetros

| Nome | Tipo | Descrição |
|------|------|-----------|
| `phrase` | `String` | Texto que será exibido. |
| `color` | `WriteColor` | Cor utilizada durante a escrita. |

### Exemplo

```java
Write.write("Operação concluída!", WriteColor.GREEN);
```

---

## `write(String phrase, WriteColor color, int delay)`

Escreve uma frase utilizando uma cor ANSI e um delay personalizado.

Após terminar a escrita, a cor do terminal é restaurada automaticamente.

### Parâmetros

| Nome | Tipo | Descrição |
|------|------|-----------|
| `phrase` | `String` | Texto que será exibido. |
| `color` | `WriteColor` | Cor utilizada durante a escrita. |
| `delay` | `int` | Tempo entre cada caractere (em milissegundos). |

### Exemplo

```java
Write.write(
    "Inicializando sistema...",
    WriteColor.BLUE,
    75
);
```

---

## `setWriteColor(WriteColor color)`

Define a cor padrão da saída do terminal.

Diferente dos métodos `write(...)`, essa configuração permanece ativa até que `resetWriteColor()` seja chamado.

### Parâmetros

| Nome | Tipo | Descrição |
|------|------|-----------|
| `color` | `WriteColor` | Cor que será aplicada ao terminal. |

### Exemplo

```java
Write.setWriteColor(WriteColor.RED);

System.out.println("Erro!");
System.out.println("Outro erro!");

Write.resetWriteColor();
```

---

## `resetWriteColor()`

Restaura a cor original do terminal.

### Exemplo

```java
Write.resetWriteColor();
```

---

# Delay padrão

A biblioteca utiliza um delay padrão de:

```text
50 ms
```

Esse valor é usado pelos métodos que não recebem um delay como parâmetro.

---

# Enum `WriteColor`

As cores disponíveis são definidas pelo enum `WriteColor`.

Exemplo:

```java
WriteColor.RED
WriteColor.GREEN
WriteColor.BLUE
WriteColor.RESET
```

---

# Observações

- O efeito de digitação é feito utilizando `Thread.sleep()`.
- O delay é informado em **milissegundos**.
- Os métodos `write(...)` sempre quebram a linha ao final da escrita.
- O suporte às cores ANSI depende do terminal utilizado. Alguns consoles de IDEs podem não exibir as cores corretamente.
- Os métodos `write(...)` que recebem uma cor restauram automaticamente a cor original do terminal ao finalizar a escrita.

---

# Exemplo completo

```java
import CPL.style.Write;
import CPL.style.WriteColor;

public class Main {

    public static void main(String[] args) {

        Write.write("Olá!");

        Write.write("Carregando...", 80);

        Write.write(
            "Sucesso!",
            WriteColor.GREEN
        );

        Write.write(
            "Erro!",
            WriteColor.RED,
            100
        );

        Write.setWriteColor(WriteColor.BLUE);

        System.out.println("Texto azul.");
        System.out.println("Outro texto azul.");

        Write.resetWriteColor();

        System.out.println("Cor restaurada.");
    }

}
```