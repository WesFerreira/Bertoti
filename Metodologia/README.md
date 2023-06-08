# Wesley Ferreira da Silva

## Introdução
Olá, sou o Wesley Ferreira da Silva, graduando do 4º semestre de Banco de Dados pela FATEC - Prof. Jessen Vidal.
Segue descrição do projeto realizado para a IACIT no 3º Semestre da faculdade.

## Projeto 3º Semestre

### Empresa Parceira: IACIT Soluções tecnológicas S.A.

## Descrição do projeto
Foi proposto o desenvolvimento de um sistema que atenda aos seguintes requisitos funcionais: cadastro de estações, cadastro de estados e regiões, importação de dados meteorológicos de arquivos CSV fornecidos pela empresa IACIT e geração de relatórios. Além disso, o sistema precisa ser uma aplicação web com interface amigável, implementada em linguagem Java e utilizar um banco de dados relacional.

Para atender aos requisitos não funcionais exigidos, o sistema deve ser capaz de importar e pesquisar os dados disponibilizados pelo Instituto Nacional de Meteorologia (INMET) por meio de seu site, integrando-os ao banco de dados. A aplicação web deve fornecer um mecanismo de filtro para que os usuários possam filtrar os registros por datas, regiões, estados, localidades e tipos de dados. As informações filtradas devem ser apresentadas em gráficos e cards, proporcionando uma visualização clara e intuitiva. Além disso, a aplicação deve permitir a exportação de relatórios com base nas consultas realizadas.
## Técnologias usadas
### Java
O back-end da aplicação foi desenvolvido utilizando a linguagem Java em conjunto com o framework Spring Boot que é uma estrutura projetada para simplificar a criação de aplicativos web em Java, fornecendo um conjunto abrangente de ferramentas e bibliotecas que facilitam o desenvolvimento. A escolha do Java e do Spring Boot permitiu a construção eficiente do back-end da aplicação, aproveitando as vantagens e recursos oferecidos por essa poderosa combinação de tecnologias.

### PostgreSQL
### HTML, CSS, JavaScript

## Contribuições pessoais
<details>
  <summary> Cadastros com JavaScript </summary>
    Código javascript com as funções para cadastrar um usuário na aplicação </br>
  
  
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
  
</details>  


<details>
  <summary> Recuperar senha com Javascript </summary>
    Código javascript com as funções para recuperar um usuário na aplicação </br>

  ```javascript
  
  function cadastrar(){
    $(document).ready(function(){
                $.getJSON("/usuarios",function(data){
                    const inventory = data;
                        function isCherries(fruit){
                            return fruit.email === Iemail.value;
                        }
                        console.log(Iemail.value)
                        var usuario = inventory.find(isCherries);
                        senha = usuario.senha
                        nome = usuario.nome
                    console.log(usuario)

    fetch("https://hook.us1.make.com/89g4gdx7rejvtsa6xcfwnmq0ixcjz5ee",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify({
            email: Iemail.value,
            nome: nome,
            senha: senha
        })
    })
    .then(function(res) {console.log(res) })
    .catch(function(res) {console.log(res) })
    limpar();
    });
                });
};

function limpar(){
    Iemail.value = "";
}

formulario.addEventListener('submit', function(event){
    event.preventDefault();

    cadastrar();
    window.location.href("localhost:8080/login.html")
});
  
```

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


