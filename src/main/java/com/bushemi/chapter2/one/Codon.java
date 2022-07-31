package com.bushemi.chapter2.one;

import lombok.ToString;

import java.util.Comparator;

@ToString
public class Codon implements Comparable<Codon> {
    private final Nucleotide first;
    private final Nucleotide second;
    private final Nucleotide third;
    @ToString.Exclude
    private final Comparator<Codon> comparator =
            Comparator.comparing((Codon c) -> c.first)
                    .thenComparing((Codon c) -> c.second)
                    .thenComparing((Codon c) -> c.third);

    public Codon(String codonStr) {
        first = Nucleotide.valueOf(codonStr.substring(0, 1));
        second = Nucleotide.valueOf(codonStr.substring(1, 2));
        third = Nucleotide.valueOf(codonStr.substring(2, 3));
    }

    @Override
    public int compareTo(Codon other) {
        return comparator.compare(this, other);
    }
}
