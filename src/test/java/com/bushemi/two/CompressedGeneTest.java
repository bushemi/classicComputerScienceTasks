package com.bushemi.two;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class CompressedGeneTest {

    @Test
    public void should_decompress() {
        //given
        final String original = "TAGGGGCCAATGCCCAAAAGGGTTTCCCAAACACGGATTCGGGAGGGCTCCCCCTTTCGCTGGCAAAAAAAAAAACCGTAGC";

        //when
        final CompressedGene compressedGene = new CompressedGene(original);

        //then
        assertThat(compressedGene.decompress(), is(equalTo(original)));
    }
}