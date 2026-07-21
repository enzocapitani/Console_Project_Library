# 📚⚙ CPL Console Project Library | Java 
Biblioteca open source para desenvolvimento em terminal ou console
## 🤔 O que é essa biblioteca? 

Essa biblioteca foi criada pensando na construção de projetos feitos no terminal, principalmente naqueles em que são para iniciantes ou que 
estão iniciando no mundo da programação e querem deixar seus projetos mais estilizados ou com algumas funções úteis para desenvolvimento.

## 💻⬇ Como baixar e usar o CPL?

### ⚙👉 Eclipse

1. Baixe o arquivo `.jar` da biblioteca na página de **Releases** do projeto.
2. No Eclipse, clique com o botão direito sobre o projeto.
3. Selecione **Build Path → Configure Build Path...**
4. Acesse a aba **Libraries**.
5. Clique em **Add External JARs...**
6. Selecione o arquivo `.jar` da CPL.
7. Clique em **Apply and Close**.

---

### ⚙👉 IntelliJ IDEA

1. Baixe o arquivo `.jar` da biblioteca na página de **Releases** do projeto.
2. Abra o projeto no IntelliJ.
3. Vá em **File → Project Structure...** (`Ctrl + Alt + Shift + S`).
4. Selecione **Modules → Dependencies**.
5. Clique no botão **+** e escolha **JARs or Directories**.
6. Selecione o arquivo `.jar` da CPL.
7. Clique em **OK** e depois em **Apply**.

---

### ⚙👉 Visual Studio Code

1. Baixe o arquivo `.jar` da biblioteca na página de **Releases** do projeto.
2. Abra o projeto no VS Code.
3. Crie (caso não exista) uma pasta chamada `lib` na raiz do projeto.
4. Coloque o arquivo `.jar` da CPL dentro dessa pasta.
5. No painel **JAVA PROJECTS**, localize **Referenced Libraries**.
6. Clique no botão **+** (**Add JARs**) e selecione o arquivo `.jar` da pasta `lib`.

Após a importação, a biblioteca estará disponível para uso no projeto.

## Exemplo de código usando o CPL
### Write e CleanConsole
```java
package principal;

import CPL.style.Write;
import CPL.util.CleanConsole;

public class Main {
	public static void main(String[] args) {
		Write.write("Olá mundo!!", 100);
		CleanConsole.clean();
	}
}

```
Escreve letra por letra e após limpa o terminal

# Créditos 👩‍💻
Desenvolvido e publicado por **Enzo Capitani**, desenvolvedor de software e graduando em ciência da computação

# Licença 📃
Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais informações.
