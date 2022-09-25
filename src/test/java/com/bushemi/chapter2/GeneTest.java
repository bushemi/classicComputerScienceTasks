package com.bushemi.chapter2;

import com.bushemi.chapter2.one.Codon;
import com.bushemi.chapter2.one.Gene;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GeneTest {
    private static final String geneStr = "ACGTGGCTCTCTAACGTACGTACGTACGGGGTTTATATATACCCTAGGACTCCCTTT";

    @Test
    public void should_create_genes() {
        //given
        //when
        Gene gene = new Gene(geneStr);

        //then
        gene.getCodons().forEach(System.out::println);
        assertThat(gene.getCodons(), is(notNullValue()));
        assertThat(gene.getCodons().size(), is(equalTo(19)));
    }

    @Test
    public void should_find_via_linear_contains() {
        //given
        Gene gene = new Gene(geneStr);
        Codon acg = new Codon("ACG");
        Codon gat = new Codon("GAT");
        //when
        boolean acgContains = gene.linearContains(acg);
        boolean gatContains = gene.linearContains(gat);

        //then
        assertThat(acgContains, is(Boolean.TRUE));
        assertThat(gatContains, is(Boolean.FALSE));
    }
    @Test
    public void should_find_via_binary_contains() {
        //given
        Gene gene = new Gene(geneStr);
        Codon acg = new Codon("ACG");
        Codon gat = new Codon("GAT");
        //when
        boolean acgContains = gene.binaryContains(acg);
        boolean gatContains = gene.binaryContains(gat);

        //then
        assertThat(acgContains, is(Boolean.TRUE));
        assertThat(gatContains, is(Boolean.FALSE));
    }

}