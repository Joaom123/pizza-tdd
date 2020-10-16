# Pizza TDD
Implementação dos exercícios do curso [Orientação à Objeto com Java](https://www.coursera.org/learn/orientacao-a-objetos-com-java).

## Instruções
### Semana 2
- Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.
- É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.
- Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.
- Crie uma classe Principal com o método main() que faz o seguinte:
    - Cria 3 pizzas com ingredientes diferentes
    - Adiciona essas Pizzas em um CarrinhoDeCompra
    - Imprime o total do CarrinhoDeCompra
    - Imprime a quantidade utilizada de cada ingrediente

### Semana 3
Faça os testes de unidade da classe Pizza e verifique se:
- O valor da Pizza está correto de acordo com a quantidade de ingredientes
- O registro de ingredientes funcionou corretamente

Faça os testes da classe CarrinhoDeCompras verificando se: 
- O preço das pizzas são somados corretamente 
- Impede a adição de uma pizza sem ingredientes

### Semana 4
- Crie uma classe chamada Produto que deve possuir um nome, um código e um preço. Sobrescreva os métodos equals() e hashCode() de Object (veja seção sobre esses métodos), de forma a serem considerados iguais instancias de Produto que possuam o mesmo código.
- Crie uma classe chamada ProdutoComTamanho que estenda a classe Produto. Essa classe deve possuir uma informação adicional de tamanho. Um exemplo seria o tamanho de uma roupa ou a numeração de um calçado. Método equals() e hashCode() devem ser sobrescritos de forma que um produto com mesmo código e tamanhos diferentes são considerados diferentes.
- Crie uma classe CarrinhoDeCompras que armazene em um atributo interno do tipo HashMap cada produto adicionado no carrinho e sua respectiva quantidade. O método adicionaProduto() deve receber a instancia do produto e a quantidade. Caso o produto já exista no HashMap, a quantidade deve ser somada a que já existe no carrinho. Deve haver também um método removeProduto() que também recebe a instancia do produto e a quantidade a ser removida. Observe que produtos de tamanhos diferentes devem ser considerados como produtos diferentes no carrinho. O carrinho deve possuir um método que calcula o valor total da compra.
- Crie testes com Unit para a classe Produto, para a classe ProdutoComTamanho e para a classe CarrinhoDeCompras. Os testes de cada classe devem ser colocados em classes separadas e devem estar em um diretório de código diferente das classes de produção.

#### Métodos equals() e hashCode() 
- O método equals() é utilizado para a comparação de objetos. Ele é definido na classe Object e pode ser sobrescrito em qualquer classe que possua uma lógica diferente.
- O método hashCode() também é definido na classe Object e retorna o código hash de um objeto, que é utilizado em várias classes que implementam estruturas de dados. Ele precisa obedecer a seguinte regra: quando o método equals() retornar true, o retorno de hashCode() desses objetos precisa ser igual. Mas se o retorno do hashCode() for igual, não necessariamente os objetos são iguais, ou seja, o equals() pode retornar true ou false.
