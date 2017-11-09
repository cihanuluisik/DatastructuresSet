package com.xx.set;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

public class SetImplTest {

    private Set set;

    @Before
    public void setUp() throws Exception {
        set = new SetImpl();
    }

    @Test
    public void givenAnewSetSizeMustBe0() throws Exception {
        assertThat(set).hasSize(0);
    }

    @Test
    public void givenAnewSetWithOneElementSizeMustBe1() throws Exception {
        assertThat(set.add("Item1")).isTrue();
        assertThat(set).hasSize(1);
    }

    @Test
    public void givenAnewSetPuttingNullMustGiveSize1() throws Exception {
        assertThat(set.add(null)).isTrue();
        assertThat(set).hasSize(1);
    }

    @Test
    public void givenAnewSetWithOneElementContainsMustReturnTrue() throws Exception {
        String item = "Item1";
        assertThat(set.add(item)).isTrue();
        assertThat(set.contains(item)).isTrue();
    }


    // test isEmpty

    // test remove


    @Test
    public void givenATwoObjectsWithSameHashcodeButDifferentEqualsMustStoreTwoItems() throws Exception {
        Object item = new Object(){
            @Override
            public int hashCode() {
                return 3;
            }
        };

        Object item2 = new Object(){
            @Override
            public int hashCode() {
                return 3;
            }
        };

        assertThat(set.add(item)).isTrue();
        assertThat(set.add(item2)).isTrue();
        assertThat(set.contains(item)).isTrue();
        assertThat(set.contains(item2)).isTrue();
        assertThat(set.size()).isEqualTo(2);
    }


}
