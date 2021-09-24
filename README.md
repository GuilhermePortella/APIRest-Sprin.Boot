# APIRest-Sprin.Boot
API Rest construida seguindo a documentação oficial no site Spring.io

https://spring.io/guides/tutorials/rest/



  <h3>Entenda os Metodos Http</h3>
  
  Códigos HTTP:

1XX: Informativo:
a solicitação foi aceita ou o processo continua em andamento;

101 Mudando protocolos:
Isso significa que o solicitante pediu ao servidor para mudar os protocolos, e o servidor está reconhecendo que irá fazê-lo.


2XX: Confirmação:  
a ação foi concluída ou entendida;

200 OK:
Código mais utilizado, e que indica que a requisição foi processada com sucesso.

201 Created:
Indica que a requisição foi bem sucedida e que um novo registro foi criado como resultado. Resposta utilizada em requisições do método POST.


3XX: Redirecionamento:
indica que algo mais precisa ser feito ou precisou ser feito para completar a solicitação;

301 Movido
Esta e todas as solicitações futuras devem ser direcionadas para o URI.

306 Proxy Switch
Mudança de proxy. Deixou de ser usado.


4XX: Erro do cliente:
indica que a solicitação não pode ser concluída ou contém a sintaxe incorreta;

400 Bad Request
Essa resposta significa que o servidor não consegue entender sua requisição, pois existe uma sintaxe ou estrutura inválida.

404 Not Found 
Código que informa que o servidor não encontra o recurso solicitado pelo cliente.

5XX: Erro no servidor
o servidor falhou ao concluir a solicitação.

501 Não implementado (Not implemented)
O servidor ainda não suporta a funcionalidade ativada.

504 Gateway Time-Out
É caracterizado por erros particulares do site em questão. Pode ser que o site esteja em manutenção ou não exista.



<h3>O que é injeção de dependências em Spring?</h3>
Injeção de dependências (ou Dependency Injection – DI) é um tipo de inversão de controle (ou Inversion of Control – IoC) que dá nome ao processo de prover instâncias de classes que um objeto precisa para funcionar.
--
Ajuda a trabalhar com o menor nível de acoplamento.
É um padrão de projeto que ajuda na hora do desacoplamento do código (projeto).
Facilita a manutenção do código e melhora a legibilidade e interpretação do código, melhora tambem a distribuição de responsabilidade entre as classes, também habilita a utilização de mocks para realizar unit testes.



