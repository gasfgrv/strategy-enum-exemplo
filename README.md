# Enum Strategy

## O que Enum?

> Um enum é uma "classe" especial que representa um grupo de constantes (imutáveis).

https://www.w3schools.com/java/java_enums.asp


## O que é o padrão stategy?

> O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.

https://refactoring.guru/pt-br/design-patterns/strategy

## Como usar

Baixar a imagem ou fazer o build dela:

```shell
# Baixar
docker pull gustosilva/enum-strategy

# Fazer o build
mvn clean package -DskipTests # Caso não exista o jar pronto
docker build -t gustosilva/enum-strategy .
```

Subir o container da API:

```shell
docker run -p 8080:8080 gustosilva/enum-strategy
```

Basta chamar o endpoint `/v1/users?username={usuário do github}` ou `/v2/users/{username}` e a API irá retornar a seguinte resposta:

````json
{
  "login": "user",
  "url": "https://api.github.com/users/user",
  "repos_url": "https://api.github.com/users/user/repos",
  "name": "Lorem Ipsum",
  "company": "Dolor Sit Amet",
  "location": "São Paulo - SP",
  "email": "loremipsum@email.com",
  "bio": "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
  "twitter_username": "@username"
}
````