package br.com.alura.teste

import br.com.alura.modelo.Cliente
import br.com.alura.modelo.Conta
import br.com.alura.modelo.ContaCorrente
import br.com.alura.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(titular = Cliente(nome = "joao", cpf = "233.2.222.2.2", senha = 123123), numero = 3213)
    var contaMaria = ContaPoupanca(titular = Cliente(nome = "Maria", cpf = "2323.232.2332.22", senha = 32133), numero = 1111)

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}