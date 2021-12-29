package com.database;

public class BancoDados {

    /*
    Bancos relacionais são para sistemas que precisam de uma confiabilidade muito grande de dados.
        Exemplos: SQL Server; Oracle; MySQL.
    Os bancos NoSQL são para sistemas focados em performance e conseguem trabalhar com um grande volume de dados
    de forma mais simples.
        Exemplos: MongoDB; Neo4j; Firebase.
     */

    //Comandos em Linha
    /*
    getdate() -> retorna data e hora do banco de dados.
    use master, acessa o banco de dados principal do servidor.
    select * from sys.tables -> acessa as tabelas do banco máster.
    create database nomeBancoDados -> Novo Banco de Dados.
    use nomeBancoDados -> Para selecionar o BD desejado.
    drop table NomeTabela -> Para apagar a tabela.

    Criando uma tabela:
        create table NomeTabela
        (
	        NomeColuna tipoColuna(?)
        )
    Exemplo:
        create table Teste
        (
            Nome varchar(20) null,
            Idade int not null
        )

    Tipos de Colunas de Dados:
    •	int -> Números inteiros ou negativos
    •	bigint -> Números inteiros maiores
    •	varchar() -> Dados alfanuméricos. O tamanho da coluna deve ser indicado entre parênteses (máximo 4000).
    •	char -> Dados alfanuméricos. O tamanho da coluna deve ser indicado entre parênteses.
    •	bit -> booleano. Aceita 0 ou 1.
    •	float -> números com casas decimais.
    •	datatime -> Tipo especial para armazenar datas.
    Null e Not null escrito logo após a declaração da coluna informa se a coluna aceita nulos ou não.
     */

    //INSERT, SELECT, UPDATE, DELETE
    /*
    select ColunasTabela from NomeTabela
        * indica que está selecionando todas as colunas.
        Exemplo: select * from Clientes

    insert into NomeTabela (colunas) values (valores)
        Exemplo: insert Clientes (Codigo, Nome, TipoPessoa) values (1, "João", "CPF");

    update NomeTabela set Coluna = Valor, Coluna = Valor where Coluna = Valor
        Exemplo: update Clientes set Nome = "Jose", TipoPessoa = "CPF" where Codigo = 2

    delete * from Tabelas where Coluna = Valor
        Exemplo: delete * from Clientes where TipoPessoa = "CNPJ"

    Se usar upadate/delete sem o comando where, atualizará/excluirá todos os itens da tabela.
     */

    //Operadores Lógicos
    /*
    Exemplos:
    select  *
    from    Clientes
    where   Codigo = 1
    AND     TipoPessoa = "CPF"

    select  *
    from    Clientes
    where   Codigo = 1
    OR      TipoPessoa = "CNPJ"
     */

    //Boas práticas:
    /*
    •	No geral, SGBDs são case insensitive, mas é comum usar caracteres maiúsculos para criação de tabelas e colunas.
    •	Utilize underline para separar as palavras.
    •	Utilize os nomes de tabelas sempre no plural.
    •	Evite rotinas dentro do banco de dados como por exemplo, auto incremento (prefira fazer na programação).
     */
}
