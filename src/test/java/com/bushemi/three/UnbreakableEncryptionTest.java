package com.bushemi.three;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class UnbreakableEncryptionTest {
    private UnbreakableEncryption encryptionService = new UnbreakableEncryption();

    @Test
    public void should() {
        //given
        String original = "Jack Richer";
        KeyPair keyPair = encryptionService.encrypt(original);

        //when
        String decrypted = encryptionService.decrypt(keyPair);

        //then
        assertThat(decrypted, is(equalTo(original)));
    }

}