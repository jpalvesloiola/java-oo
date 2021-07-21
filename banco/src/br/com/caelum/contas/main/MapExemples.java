package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.ContaCorrente;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapExemples {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(10000);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(3000);

        /*
        Map
        Suas principais implementações são o HashMap, o TreeMap e o Hashtable
        Apesar do mapa fazer parte do framework, ele não estende a interface Collection
        */

        // cria o mapa
        Map<String, ContaCorrente> mapaDeContas = new HashMap<>();

        // adiciona duas chaves e seus respectivos valores
        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        // qual a conta do diretor? (sem casting!)
        ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());

        /*
        "Properties, que mapeia strings e é muito utilizada para a configuração de aplicações.
        A Properties possui, também, métodos para ler e gravar o mapeamento com base em um arquivo texto,
        facilitando muito a sua persistência."

             Properties config = new Properties();

        config.setProperty("database.login", "scott");
        config.setProperty("database.password", "tiger");
        config.setProperty("database.url","jdbc:mysql:/localhost/teste");

        // muitas linhas depois...


        "não houve a necessidade do casting para String no momento de recuperar os objetos associados.
        Isto porque a classe Properties foi desenhada
        com o propósito de trabalhar com a associação entre Strings."

        String login = config.getProperty("database.login");
        String password = config.getProperty("database.password");
        String url = config.getProperty("database.url");
        try {
            DriverManager.getConnection(url, login, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        */


    }

}
