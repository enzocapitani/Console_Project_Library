# Input Class
## Utilidades
Capturar dados inseridos no terminal pelo usuário utilizando o Scanner, ela possui função para 4 tipos de valores: String, double, int e boolean.

Atenção! Essa classe não possui tratamento de erros para a entrada de dados, essa tarefa é designado ao próprio programador 
## Funções

### catchBoolean()
Essa função tem como objetivo capturar o próximo valor booleano digitado no terminal pelo usuário, a função analisa o valor e retorna esse valor, exemplo prático:
```java
public void genericFunction(){
    boolean userValue = Input.catchBoolean();
    System.out.println(userValue);
}
```
Saída: 

true
true

ou

false
false

### catchString()
A partir da primeira função citada ela vai seguir um padrão, ou seja, a função vai esperar um dado em String analisa e retorna esse valor, exemplo prático:

```java
public void genericFunction(){
    String userValue = Input.catchString();
    System.out.println(userValue);
}
```
Saída:
CPL é muito útil!<br>
CPL é muito útil!

### catchInt()
A função vai esperar um dado em int analisa e retorna esse valor, exemplo prático:

```java
public void genericFunction(){
    int userValue = Input.catchInt();
    System.out.println(userValue);
}
```
Saída:
100
100

### catchDouble()
A função vai esperar um dado em double analisa e retorna esse valor, exemplo prático:

```java
public void genericFunction(){
    double userValue = Input.catchDouble();
    System.out.println(userValue);
}
```
Saída:
5.94<br>
5.94

## Exemplo detalhado em soma simples
```java
public void sum(){
    System.out.println("What is the first value?");
    int value1 = Input.catchInt();
    
    System.out.println("What is the second value?");
    int value2 = Input.catchInt();

    int sum = value1 + value2;
    System.out.println(sum);
}
```