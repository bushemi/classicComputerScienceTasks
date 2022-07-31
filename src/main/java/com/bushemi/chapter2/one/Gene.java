package com.bushemi.chapter2.one;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Gene {
    private final List<Codon> codons = new ArrayList<>();

    public Gene(String geneStr) {
        for (int i = 0; i < geneStr.length(); i += 3) {
//            from every 3 symbols in string create codon
            codons.add(new Codon(geneStr.substring(i, i + 3)));
        }
    }
}
