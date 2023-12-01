package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * Esta classe contém definições Cucumber para testes de aceitação relacionados a operações de saque em contas.
 * Os cenários incluem clientes especiais e comuns, com diferentes saldos, simulando solicitações de saque.
 * O código para cada passo está atualmente marcado como pendente e deve ser implementado conforme necessário.
 *
 * @author João Victor
 * @version 1.0
 */
public class conta {
    /**
     * Configura um cenário com um cliente especial e um saldo inicial específico.
     *
     * @param int1 O saldo atual do cliente especial.
     */
    @Given("um cliente especial com saldo atual de {int} reais")
    public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Simula a solicitação de um saque por um cliente especial.
     *
     * @param int1 O valor do saque solicitado.
     */
    @When("for solicitado um saque no valor de {int} reais")
    public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Verifica se o saque foi efetuado corretamente e atualiza o saldo da conta.
     *
     * @param int1 O novo saldo esperado após o saque.
     */
    @Then("deve efetuar o saque e atualizar o saldo da conta para {int} reais")
    public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Configura um cenário com um cliente comum e um saldo inicial específico.
     *
     * @param int1 O saldo atual do cliente comum.
     */
    @Given("um cliente comum com saldo atual de {int} reais")
    public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Simula a solicitação de um saque por um cliente comum.
     *
     * @param int1 O valor do saque solicitado.
     */
    @When("solicitar um saque de {int} reais")
    public void solicitar_um_saque_de_reais(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**
     * Verifica se o saque não foi efetuado e se a mensagem de saldo insuficiente foi retornada.
     */
    @Then("não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente")
    public void não_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
