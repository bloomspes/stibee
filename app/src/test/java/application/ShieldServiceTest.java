package application;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShieldServiceTest {

    private ShieldService shieldService;

    @BeforeEach
    void setUp() {
        shieldService = new ShieldService();
    }

    @Test
    void transform(){
            assertThat(shieldService.transform("a")).isEqualTo("b");
            assertThat(shieldService.transform("b")).isEqualTo("c");
            assertThat(shieldService.transform("ab")).isEqualTo("bc");
    }

    @Test
    void stage1(){
        for (int i = 0; i < 1_000; i++) {
            assertThat(shieldService.transform("mgean".repeat(1_000)))
                    .isEqualTo("nhfbo".repeat(1_000));
        }
    }

    @Test
    void multiline() {
        assertThat(shieldService.transform("a\nb")).isEqualTo("b\nc");
    }

}