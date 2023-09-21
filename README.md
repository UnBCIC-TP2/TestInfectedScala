## TestInfected (scala version)

Parte inicial da implementação do artigo TestInfected 
em Scala. Nesta versão, temos duas classes para representar 
valores monetários. A classe `Money` lida com valores monetários 
de uma moeda; enquanto que a classe `MoneyBag` mantém uma 
coleção de valores monetários de diferentes moedas. 

### Compilação

A versão atual está compilando. 

```
$ sbt compile
```

### Testes

Os testes da versão atual não estão passando. 
Quando executamos: 

```
$ sbt test
``` 

A compilação do *código de testes* falha. 

```
[error] 29 |      assert(expected == mb.add(m3))
[error]    |                         ^^^^^^
[error]    |                         value add is not a member of br.unb.cic.money.MoneyBag
[error] one error found
```

### Tarefa

   * [] Corrigir o código do programa para que o teste compile
   * [] Conceber novos casos de testes e adaptar o código do programa
   * [] Avaliar a solução proposta no artigo original
