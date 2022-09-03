# Enum Strategy

## O que Enum?

> Um enum é uma "classe" especial que representa um grupo de constantes (imutáveis).
> https://www.w3schools.com/java/java_enums.asp


## O que é o padrão stategy?

> O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
> https://refactoring.guru/pt-br/design-patterns/strategy

## Como usar

Basta chamar o endpoint `/get-user?username={usuário do github}` e a API irá retornar a seguinte resposta:

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