# Calculadora-Simples
Calculadora Simples feito em Java
Calculadora Simples em Java
Este é um projeto de uma calculadora de console simples desenvolvida em Java. Ela permite realizar operações básicas (adição, subtração, multiplicação e divisão) de forma interativa, solicitando valores e o operador ao usuário.

🚀 Tecnologias Utilizadas
Java: Linguagem de programação principal.

java.util.Scanner: Classe utilizada para ler a entrada do usuário via console.

✨ Funcionalidades
O programa executa em um loop contínuo, permitindo múltiplas operações até que o usuário decida sair. As principais características e lógicas implementadas são:

Entrada de Dados:

Utiliza a classe Scanner para capturar números inteiros (nextInt()) e o operador (next()) digitados pelo usuário.

O operador é lido como uma String, pois os símbolos aritméticos (+, -, *, /) são representações textuais neste contexto.

Cálculo de Operações:

As operações de adição, subtração e multiplicação são realizadas diretamente com os valores inteiros.

Divisão Precisa (Casting): Para a operação de divisão, é aplicado um cast explícito ((double)) em pelo menos um dos operandos antes do cálculo. Isso converte os números inteiros para o tipo double, garantindo que o resultado da divisão inclua as casas decimais e seja preciso.

Controle de Fluxo e Comparação de String:

A lógica para determinar qual operação realizar é controlada por uma estrutura if-else if.

A comparação do operador digitado pelo usuário (que é uma String) com os operadores esperados (ex: "+", "-") é feita utilizando o método .equals().

Importante: O operador == não é utilizado para comparar Strings, pois ele verifica se as variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das strings é o mesmo.

Para a multiplicação, foi adicionado .equalsIgnoreCase("x") para permitir que o usuário digite "x" ou "X" como alternativa ao asterisco (*).

Tratamento de Erro (Divisão por Zero):

Uma validação específica foi implementada para a operação de divisão. Antes de dividir, o programa verifica se o segundo número (numb2) é igual a zero.

Caso numb2 seja zero, uma mensagem de erro é exibida, prevenindo uma ArithmeticException e garantindo que o programa não seja encerrado abruptamente.

Loop Interativo:

Todo o processo de solicitação de números, operador e exibição do resultado está encapsulado em um loop while.

Uma variável booleana (iniciarCalculadora) controla a execução do loop. Após cada cálculo, o programa pergunta ao usuário se ele deseja continuar (s/n). Se a resposta não for "s" (ignorando maiúsculas/minúsculas), a variável é definida como false, encerrando o loop.

Gerenciamento de Recursos:

O objeto Scanner é instanciado uma única vez antes do loop e é fechado apenas no final do programa (scanner.close()), garantindo o uso eficiente dos recursos do sistema.

💡 Como Executar
Salve o código como App.java.

Compile o código usando um compilador Java (ex: javac App.java).

Execute o programa (ex: java App).

Siga as instruções no console para digitar os números e o operador.

Este projeto, embora simples, demonstra conceitos fundamentais de Java, como entrada/saída, operadores, estruturas de controle (if/else, while), tratamento de strings e validação básica de dados.
