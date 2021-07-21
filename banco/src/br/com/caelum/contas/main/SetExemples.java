package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.*;

public abstract class SetExemples implements Set {
    public static void main(String[] args) {
        /*
        Um conjunto é representado pela interface Set e tem como suas
        principais implementações as classes
        HashSet, LinkedHashSet e TreeSet.
         */

        Set<String> cargos = new HashSet<>();
        /*interface Set(busca rápida) e List(busca por ídice e
        aceita elementos repetidos) extendem de interface Collection
        Sempre considere usar um Set se não houver a necessidade
        de guardar os elementos em determinada ordem
        e buscá-los através de um índice.
        */
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretária");
        cargos.add("Funcionário");
        cargos.add("Diretor"); // repetido!

        // imprime na tela todos os elementos
        System.out.println(cargos);

        Set<String> conjunto = new HashSet<>();

        conjunto.add("java");
        conjunto.add("vraptor");
        conjunto.add("scala");

        //foreach ou enhanced-for percorre qualquer collection
        for (String palavra : conjunto) {
            System.out.println(palavra);
        }

        //Set<String> conjunto = new HashSet<>();
        conjunto = new LinkedHashSet<>();
        conjunto.add("item 1");
        conjunto.add("item 2");
        conjunto.add("item 3");



        // retorna o iterator
        Iterator<String> i = conjunto.iterator();
        while (i.hasNext()) {
            // recebe a palavra
            String palavra = i.next();
            System.out.println(palavra);
        }
        /*
        (opcional, avançado) Crie uma classe de teste e verifique se sua classe Conta
        funciona agora corretamente em um HashSet, isto é,
        que ela não guarda contas com número e agência repetidos.
        Depois, remova o método hashCode. Continua funcionando?
         */
        Collection<Conta> contas = new HashSet<Conta>();

        ContaCorrente c1 = new ContaCorrente();
        c1.setNumero(1);//Repetido
        c1.setAgencia("1000");//Repetido
        c1.setTitular("Batman");

        ContaCorrente c2 = new ContaCorrente();
        c2.setNumero(1);//Repetido
        c2.setAgencia("1000");//Repetido
        c2.setTitular("Robin");

        ContaCorrente c3 = new ContaCorrente();
        c3.setNumero(2);
        c3.setAgencia("1000");
        c3.setTitular("Coringa");

        contas.add(c1);
        contas.add(c3);
        contas.add(c2);
        /*
        Sem o hashCode, sobreescrito na classe conta, o critério para definir o que são contas iguais
        e o que são contas diferentes se perde e, assim,
        o HashSet não consegue garantir a aparição única de uma conta.
         */
        System.out.println("Total de contas no HashSet: " + contas.size());
    }

}
