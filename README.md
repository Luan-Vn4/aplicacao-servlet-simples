# aplicacao-servlet-simples
Este repositório será utilizado apenas para aprender conceitos básicos de desenvolvimento back-end através 
de Servlets. Também serão utilizadas ferramentas de gerência de configuração para entender melhor o controle 
de mudanças, versões e releases.

# 1 Descrição da aplicação
Será feita uma aplicação web simples que servirá como uma pokédex e fornecerá informações sobre pokémons.
Os treinadores deverão ser capazes de registrar pokémons novos, além de poderem visualizar aqueles já 
registrados na pokédex. Caso alguma informação esteja incorreta, eles também poderão atualizar as informações
para manter a consistência dos dados. No caso de haver algum erro e registrarem algo que não seja um pokémon,
um professor pokémon (moderador) poderá deletar aquele registro.  
A pokédex deverá fornecer as seguintes informações sobre os pokémons: imagem, nome, descrição, tipo(s)
altura e peso.

# 2 Requisitos Funcionais
## 2.1 [RF001] Adição na pokédex
Como treinador, desejo ser capaz de adicionar pokémons à pokédex para que eu possa consultar suas informações
posteriormente e outros jogadores possam tomar conhecimento deles.

## 2.2 [RF002] Consulta da pokédex
Como treinador, desejo ser capaz de consultar a pokédex para que eu possa obter informações sobre pokémons já
registrados.

## 2.3 [RF003] Consulta por nome na pokédex
Como treinador, desejo ser capaz de consultar a pokédex para que eu possa obter informações sobre pokémons
específicos com base em seu nome.

## 2.4 [RF004] Filtro de consultas na pokédex
Como treinador, desejo ser capaz de filtrar consultas na pokédex para que eu possa buscar por pokémons
mais eficientemente, com base em suas características.

## 2.5 [RF005] Atualização da pokédex
Como treinador, desejo ser capaz de atualizar informações sobre pokémons para caso elas estejam incorretas.

## 2.6 [RF006] Deleção na pokédex
Como professor pokémon, desejo ser capaz de remover registros na pokédex para casos de não registrarem algo
que não represente um pokémon.