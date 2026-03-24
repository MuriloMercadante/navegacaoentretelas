Commit:Passagem de parâmetros obrigatórios na tela de Perfil

A alteração feita no código introduz a passagem obrigatória do parâmetro nome para a tela de Perfil,
e isso foi implementado em três pontos diretos.

Primeiro, na navegação, a rota da tela de perfil deixou de ser fixa ("perfil")
e passou a ser dinâmica ("perfil/{nome}"). Isso significa que agora não é mais possível
acessar essa tela sem informar um valor para nome.

Em seguida, foi adicionada a lógica para recuperar esse parâmetro dentro do NavHost,
utilizando it.arguments?.getString("nome"). Essa é a função responsável por capturar o valor
que foi enviado na navegação. Após isso, o valor recuperado é passado como argumento para a tela
de perfil.

Também foi alterada a chamada de navegação. Antes era apenas navController.navigate("perfil"),
e agora foi modificada para navController.navigate("perfil/$nome"),
ou seja, passou a enviar o parâmetro junto com a rota.

Por fim, a função PerfilScreen foi modificada para receber esse novo dado. Foi adicionado
o parâmetro obrigatório nome: String na sua assinatura, e ele passou a ser utilizado 
diretamente na interface, sendo exibido na tela.


Commit:Passagem de parâmetros opcionais na tela de Pedidos
A principal mudança começa na definição da rota dentro do NavHost. Antes,
a tela de pedidos era acessada apenas com "pedidos", sem receber nenhum dado.
Agora, foi criada uma rota dinâmica "pedidos?cliente={cliente}", permitindo
o envio de um parâmetro chamado cliente. Junto com isso, foi adicionada a função
navArgument("cliente"), que define esse argumento dentro da navegação e já estabelece
um valor padrão ("Cliente Genérico"), evitando problemas caso nada seja enviado.

Além disso, foi incluída a captura desse parâmetro diretamente na chamada da tela,
utilizando it.arguments?.getString("cliente"). Esse é o ponto onde o valor passado na navegação
é recuperado e encaminhado para a função da tela.

Na função PedidosScreen, houve uma alteração na assinatura: foi adicionado o parâmetro cliente:
String. Com isso, a tela passa a depender desse dado para funcionar. Essa é a mudança estrutural
mais importante da função.

Por fim, a interface foi ajustada para usar esse novo valor. O texto fixo "PEDIDOS" foi
substituído por "PEDIDOS - $cliente", fazendo com que o nome do cliente seja 
dinamicamente na tela.


Commit: Inserindo valor ao parâmetro opcional na tela de Pedidos

A alteração realizada na tela de Perfil está relacionada à forma como o componente passa
a receber seus parâmetros. Houve uma atualização no valor enviado para o método onConfirmLoading,
que agora utiliza uma nova identificação ("perfilSemImagem 2"), indicando uma evolução
ou variação do estado anteriormente utilizado.

Com isso, o componente passa a trabalhar com parâmetros mais específicos e alinhados às regras
atuais da aplicação, garantindo maior clareza no controle de estados da tela. Além disso,
o trecho atualizado segue um padrão mais consistente com o restante do código,
adotando definições de layout como largura dinâmica baseada em MediaQuery e altura fixa

Commit:Passagem de múltiplos parâmetros

A rota do perfil passou a ser configurada para receber explicitamente os parâmetros nome e idade,
garantindo que esses dados sempre sejam enviados e tratados durante a navegação.

Com isso, a tela de perfil agora foi ajustada para receber esses parâmetros diretamente
em sua definição, tornando seu funcionamento dependente dessas informações. Além disso,
os valores são recuperados já com um tratamento adequado, incluindo definição de valor padrão
para evitar inconsistências.

A navegação a partir de outras telas, como o menu, também foi atualizada para enviar corretamente
esses dados na rota, garantindo alinhamento entre quem envia e quem recebe as informações.

Por fim, a interface da tela de perfil foi ajustada para refletir melhor esses dados recebidos,
deixando de ser apenas estática e passando a considerar o contexto das informações fornecidas.