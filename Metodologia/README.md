# Wesley Ferreira da Silva

## Introdução
Olá, sou o Wesley Ferreira da Silva, graduando do 5º semestre de Banco de Dados pela FATEC - Prof. Jessen Vidal.
Segue descrições dos projetos realizados em cada semestre da faculdade.

<details>  
  <summary> Projeto 1º Semestre </summary>

  ## Introdução
  Segue descrição do projeto realizado para a FATEC no 1º Semestre da faculdade.

  ### Empresa Parceira: FATEC (PROJETO INTERNO)

## Descrição do projeto
O projeto proposto pela facudade, visa analisar os dados oficiais da COVID-19 no Estado de São Paulo e apresentá-los de maneira clara e contextualizada aos usuários, por meio de visualizações gráficas e/ou não-gráficas.
## Técnologias usadas
### Python
Python foi a escolha predominante para o desenvolvimento da aplicação devido à sua sintaxe clara, simplificada e sua vasta gama de bibliotecas e frameworks que suportam diversas áreas, incluindo análise de dados. Sua simplicidade, versatilidade e suporte facilitaram significativamente o processo de criação do projeto. Uma das bibliotecas que mais utilizamos no projeto foi a do Pandas que nos fornece ferramentas para análise e manipulação de dados, que no nosso projeto foi manipulado os dados por csv.

## Contribuições pessoais


<details>
  <summary>Rastreador de dados de um arquivo CSV</summary>

  ```python

  class tracker:
    arquivo = os.path.expanduser('~\Documents\caso_full.csv')  # Local na pasta documentos onde o arquivo estará

    if os.path.isfile(arquivo):
        print("Arquivo encontrado.")
        pass
    else:
        from update import atualizar
        print("Arquivo não encotrado, realizando o download...")
        atualizar()

        """Verifica se o arquivo csv existe, caso a condição seja falsa, irá realizar o download do arquivo."""

    file = pd.read_csv(arquivo)
    """Executa a leitura do arquivo.csv - "file" é apenas o nome que dei a variável."""

    df = pd.DataFrame(data=file,
                      columns=['city', 'date', 'state', 'last_available_deaths', 'place_type',
                               'new_deaths', 'new_confirmed',
                               'ast_available_confirmed'])  # transforma o arquivo csv em um dataframe e seleciona as colunas

    df = df.rename(
        columns={"city": "cidade", 'state': 'estado',
                 'last_available_deaths': 'mortes confirmadas', 'place_type': 'tipo',
                 'new_deaths': 'mortes', 'new_confirmed': 'confirmados', 'date': 'data', 'ast_available_confirmed': 'novos casos'})
    """Renomeia as colunas"""

    df = df.loc[df['estado'] == 'SP'].loc[
        df['tipo'] == 'city']
    """Filtra apenas o estado de SP na coluna 'estado', e apenas o cálculo por tipo "state"""

    df = df.fillna(value="")
    """altera os valores de NaN para valor em branco."""

    df = df.drop_duplicates()  # retira valores duplicados.
    df['data'] = pd.to_datetime(df['data'])  # cria uma coluna de data
    df['ano'] = pd.DatetimeIndex(df['data']).year  # cria uma coluna de ano
    df['mes'] = pd.DatetimeIndex(df['data']).month  # cria uma coluna de mes
    df['mes_nome'] = df['data'].dt.strftime('%B')  # transforma o numero da coluna 'mes' para nome do mes
    df['mes_ano'] = df['mes_nome'].astype(str) + "-" + df['ano'].astype(str)  # concatena mes e ano
    df['dia'] = pd.DatetimeIndex(df['data']).day
    df['chave'] = df['cidade'] + df['mes_nome'] + df['ano'].astype(str)

    '''Variáveis'''

    dia_1 = date.today() - timedelta(days=1)
    dia_1.strftime("%Y-%m-%d")

    total_mortes_sp = df['mortes'].loc[df['estado'] == 'SP'].loc[
        df['data'] == str(dia_1)].sum()  # Soma somente as mortes do estado de SP

    novos_casos = df['novos casos'].loc[df['estado'] == 'SP'].loc[df['data'] == str(dia_1)].sum()  # Soma os casos novos

    total_mortes_dia = df['mortes'].loc[df['mes_nome'] == 'novembro'].sum()

    lista_cidades = df['cidade'].loc[df['estado'] == 'SP'].loc[df['cidade'] != ''].drop_duplicates().sort_values() \
        .tolist()

    lista_ano = ['2020', '2021']

    lista_meses = ['Todos', 'janeiro', 'fevereiro', 'março', 'abril', 'maio', 'junho', 'julho', 'setembro', 'outubro', 'novembro', 'dezembro']

    """Transforma os valores em lista, e coloca em ordem alfabética."""

    total_mortes_cidade = df[['cidade', 'mortes']].groupby('cidade').sum().sort_values(by='mortes', ascending=False) \
        .iloc[:10]

    # Ordena as cidades de forma decrescente e mostra as 10 cidades com maior numero de morte

    lista_mes = df['mes_ano'].drop_duplicates().tolist()
    print(df)


  ```
</details>

<details>
  <summary>Mostrando dados específicos para o usuário</summary>

  ```python

 """Calcula a data atual - 1 para saber a quantidade de novas mortes """

        self.valor_mortes_sp = tracker.df['mortes'].sum()

        """ Total de óbitos no estado de São Paulo"""

        self.valor_total_confirmados = tracker.df['confirmados'].sum()

        """Total de casos confirmados no estado de São Paulo"""

        self.mortes = QLabel("Número total de mortes: " + str(self.valor_cidade), self)
        self.mortes_dia = QLabel("Novas mortes: " + str(self.valor_dia), self)
        self.mortes_sp = QLabel("Total de óbitos no estado de São Paulo: " + str(self.valor_mortes_sp), self)
        self.total_confirmados = QLabel(
            "Total de casos confirmados no estado de São Paulo: " + str(self.valor_total_confirmados), self)

  ```
</details>

## Aprendizado efetivo
<details>
  <summary> Programação </summary>
    - Desenvolvimento de aplicação desktop </br>
    - Manipulação de dados </br>
    - Gerar gráficos </br>
</details>

</details>

<details>  
  <summary> Projeto 2º Semestre </summary>

  ## Introdução
  Segue descrição do projeto realizado para a DOM ROCK no 2º Semestre da faculdade.

  ### Empresa Parceira: DOM ROCK

## Descrição do projeto

## Técnologias usadas
### Java
A aplicação foi desenvolvido utilizando a linguagem Java e desenvolvendo projeto desktop. A escolha do Java permitiu a construção eficiente da aplicação, aproveitando as vantagens e recursos oferecidos.

### PostgreSQL
Utilizamos o PostgreSQL como banco de dados para alocar e gerenciar todos os dados referente as etapas dos processos de cadastros e separação de categoria. Optamos pelo PostgreSQL devido à sua versatilidade, interface simplificada e funcionalidades expostas de forma dedutiva, o que proporcionou uma excelente usabilidade e facilitou o gerenciamento do banco de dados. Além disso, a escolha do PostgreSQL foi impulsionada pela sua alta eficiência e desempenho, permitindo o armazenamento tranquilo e eficaz dos milhões de dados importados. A capacidade do PostgreSQL de lidar com grandes volumes de dados e seu suporte a consultas complexas foram fundamentais para garantir o processamento rápido e preciso das informações.


## Contribuições pessoais


## Aprendizado efetivo

</details>
  
</details>

<details>  
  <summary> Projeto 3º Semestre </summary>

  ## Introdução
  Segue descrição do projeto realizado para a IACIT no 3º Semestre da faculdade.

  ### Empresa Parceira: IACIT Soluções tecnológicas S.A.

## Descrição do projeto
Foi proposto o desenvolvimento de um sistema que atenda aos seguintes requisitos funcionais: cadastro de estações, cadastro de estados e regiões, importação de dados meteorológicos de arquivos CSV fornecidos pela empresa IACIT e geração de relatórios. Além disso, o sistema precisa ser uma aplicação web com interface amigável, implementada em linguagem Java e utilizar um banco de dados relacional.

Para atender aos requisitos não funcionais exigidos, o sistema deve ser capaz de importar e pesquisar os dados disponibilizados pelo Instituto Nacional de Meteorologia (INMET) por meio de seu site, integrando-os ao banco de dados. A aplicação web deve fornecer um mecanismo de filtro para que os usuários possam filtrar os registros por datas, regiões, estados, localidades e tipos de dados. As informações filtradas devem ser apresentadas em gráficos e cards, proporcionando uma visualização clara e intuitiva. Além disso, a aplicação deve permitir a exportação de relatórios com base nas consultas realizadas.
## Técnologias usadas
### Java
O back-end da aplicação foi desenvolvido utilizando a linguagem Java em conjunto com o framework Spring Boot que é uma estrutura projetada para simplificar a criação de aplicativos web em Java, fornecendo um conjunto abrangente de ferramentas e bibliotecas que facilitam o desenvolvimento. A escolha do Java e do Spring Boot permitiu a construção eficiente do back-end da aplicação, aproveitando as vantagens e recursos oferecidos por essa poderosa combinação de tecnologias.

### PostgreSQL
Utilizamos o PostgreSQL como banco de dados para alocar e gerenciar todos os dados meteorológicos, incluindo informações das estações e regiões. Optamos pelo PostgreSQL devido à sua versatilidade, interface simplificada e funcionalidades expostas de forma dedutiva, o que proporcionou uma excelente usabilidade e facilitou o gerenciamento do banco de dados. Além disso, a escolha do PostgreSQL foi impulsionada pela sua alta eficiência e desempenho, permitindo o armazenamento tranquilo e eficaz dos milhões de dados meteorológicos importados. A capacidade do PostgreSQL de lidar com grandes volumes de dados e seu suporte a consultas complexas foram fundamentais para garantir o processamento rápido e preciso das informações meteorológicas.

### HTML, CSS, JavaScript
A criação da interface gráfica da aplicação envolveu a combinação das linguagens de marcação HTML e CSS com a linguagem de programação JavaScript. O HTML desempenhou um papel fundamental ao estabelecer a estrutura básica da página da web, definindo os elementos e a organização dos conteúdos. Por sua vez, o CSS foi responsável por adicionar estilo e aparência à página, definindo cores, fontes, layouts e outros aspectos visuais.

A linguagem de programação JavaScript foi amplamente utilizada para adicionar interatividade à interface. Por meio do JavaScript, os usuários puderam realizar ações como interagir com elementos da página, exibir e ocultar informações dinamicamente, validar dados inseridos e até mesmo enviar requisições assíncronas para atualizar os dados em tempo real.

A combinação dessas três tecnologias permitiu o desenvolvimento de uma interface amigável e intuitiva para os usuários da aplicação. Eles puderam visualizar facilmente os dados meteorológicos, navegar entre diferentes seções e gerar relatórios personalizados de forma eficiente. A interface foi projetada para fornecer uma experiência fluida, com transições suaves e elementos responsivos que se adaptam a diferentes dispositivos e tamanhos de tela.

Além disso, a aplicação fez uso da biblioteca JavaScript chamada Charts, que desempenhou um papel fundamental na apresentação dos dados meteorológicos. Essa biblioteca ofereceu recursos avançados para a criação de gráficos e visualizações, permitindo uma representação visual clara e compreensível dos dados. Os gráficos foram projetados para serem interativos, fornecendo aos usuários uma maneira intuitiva de explorar e analisar os dados meteorológicos em diferentes perspectivas.

## Contribuições pessoais
No projeto em questão fiquei responsável pelo desenvolvimento do front-end da aplicação.

Segue alguns dos códigos que desenvolvi.

<details>
  <summary> Cadastros com JavaScript </summary>
  
  ```javascript
  
  function cadastrar(){
    fetch("http://localhost:8080/usuarios",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            nome: Inome.value,
            email: Iemail.value,
            senha: Isenha.value
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
  };

  function limpar(){
      Inome.value = "";
      Iemail.value = "";
      Isenha.value = "";
  }

  formulario.addEventListener('submit', function(event){
      event.preventDefault();

      cadastrar();
      limpar();
  });
  
  ```
  
 O código apresentado é uma função JavaScript que lida com o cadastro de usuários em um servidor local </br>
    A função cadastrar() é definida para realizar uma requisição POST ao servidor local (http://localhost:8080/usuarios) usando o método fetch(). Essa função possui as seguintes configurações:

Define o cabeçalho da requisição com o tipo de conteúdo aceito (Accept) e o tipo de conteúdo enviado (Content-Type) como JSON.
Define o método da requisição como POST.
Envia os dados do usuário como um objeto JSON no corpo da requisição usando JSON.stringify(). Os dados incluem nome, email e senha.
O resultado da requisição é tratado por meio das funções then() e catch(). Se a requisição for bem-sucedida, o resultado é impresso no console usando console.log(res). Caso contrário, se ocorrer algum erro, também é exibido no console.

A função limpar() é definida para limpar os campos de entrada após o cadastro. Ela define os valores dos campos Inome, Iemail e Isenha como vazios.

Um "ouvinte de evento" é adicionado ao formulário usando addEventListener() para capturar o evento de envio (submit). A função de retorno de chamada é executada quando o evento ocorre. Essa função realiza as seguintes ações:

Chama a função event.preventDefault() para evitar o envio tradicional do formulário.
Chama a função cadastrar() para enviar os dados do usuário ao servidor.
Chama a função limpar() para limpar os campos do formulário após o cadastro.
</details>  


<details>
  <summary> Requisição para obter o IP do cliente com Javascript </summary>

  ```javascript
  
$(function() {
  $.getJSON("https://api.ipify.org?format=jsonp&callback=?",
    function(json) {
      const formulario = document.querySelector("unlog");

      function cadastrarLog(){

        fetch("http://localhost:8080/log",
          {
          headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
          },
          method: "POST",
          body: JSON.stringify({
              email: "email",
              ip: json.ip,
              status: "deslogado"
          })
        })

      .then(function(res) {console.log(res) })
      .catch(function(res) {console.log(res) })
      };


    unlog.addEventListener('submit', function(event){
    event.preventDefault();
    cadastrarLog();
    });
  });
});
  
```

A arquitetura desse código segue uma abordagem funcional, utilizando jQuery para fazer uma requisição assíncrona para obter o endereço IP do cliente por meio da API "https://api.ipify.org".

O código envolve a função "$()" para garantir que o código seja executado somente após o carregamento completo da página. Em seguida, é feita uma chamada à função $.getJSON() para obter o endereço IP.

Dentro da função de retorno de chamada da $.getJSON() o código define uma função chamada cadastrarLog(), que é executada quando o formulário "unlog" é submetido. Essa função realiza uma requisição POST para "http://localhost:8080/log" para registrar o evento de deslogamento do usuário.

Os dados são enviados como um objeto JSON no corpo da requisição, contendo o email, o endereço IP obtido anteriormente e o status "deslogado".

Após a requisição POST, são tratadas as respostas da promessa utilizando os métodos .then() e .catch(), que registram o resultado no console.

Por fim, o código adiciona um evento de escuta ao formulário "unlog", que é acionado quando o formulário é submetido. O evento é prevenido de realizar a ação padrão e, em vez disso, chama a função cadastrarLog().

A arquitetura desse código é relativamente simples, fazendo uso de bibliotecas externas (jQuery) e APIs para obter informações do cliente e registrar eventos no servidor. O objetivo é registrar o deslogamento do usuário, capturando o email e o endereço IP, e enviando esses dados para o servidor por meio de uma requisição POST.  
</details>

## Aprendizado efetivo
<details>
  <summary> Spring </summary>
    - Desenvolvimento de aplicações web </br>
    - Integração com banco de dados </br>
    - Injeção de dependências </br>
</details>
<details>  
  <summary> Programação </summary>
    - Programação orientada a objetos </br>
    - Consumo de API Rest </br>
    - Funções em JavaScript </br>
    - Manipulação de variáveis com JavaScript </br>
</details>


</details>

<details>  
  <summary> Projeto 4º Semestre </summary>

   ## Introdução
  Segue descrição do projeto realizado para a EMBRAER no 4º Semestre da faculdade.

  ### Empresa Parceira: EMBRAER

## Descrição do projeto

## Técnologias usadas
### Java
### Vue.js
### Oracle Cloud


## Contribuições pessoais


## Aprendizado efetivo

</details>

