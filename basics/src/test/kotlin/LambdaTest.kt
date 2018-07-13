import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LambdaTest {

    @Test
    fun lambda() {

        // given
        val numbers = listOf(1,2,3,4,5)

        // when
        var sum = 0
        numbers.forEach { n -> sum += n }

        // then
        assertThat(sum).isEqualTo( 15 )
    }

}
