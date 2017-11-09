package com.xx.set;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetImplTest {


    @Test
    public void givenAnewSetSizeMustBe0() throws Exception {
        Set set = new SetImpl();
        assertThat(set).hasSize(0);

    }

}
