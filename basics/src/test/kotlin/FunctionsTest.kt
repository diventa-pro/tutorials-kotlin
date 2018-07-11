import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import pro.diventa.tutorials.kotlin.Cat
import pro.diventa.tutorials.kotlin.Dog

import org.assertj.core.api.Assertions.*

fun double(x: Int): Int {
    return 2 * x
}

fun defaultArgs(a: Int = 1, b: Int = 2, c: Int = 4): Int {
    return a + b + c;
}

fun concatenate(vararg strings: String): String {
    var result = ""
    for (string in strings) result += string
    return result
}

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FunctionsTest {

    @Test
    fun plainFunction() {
        assertThat( double(3) ).isEqualTo( 6 )
    }

    @Test
    fun functionWithDefaultArgs() {
        assertThat( defaultArgs() ).isEqualTo( 7 )
        assertThat( defaultArgs(10) ).isEqualTo( 16 )
        assertThat( defaultArgs(10, 20) ).isEqualTo( 34 )
        assertThat( defaultArgs(10, 20, 40) ).isEqualTo( 70 )
    }

    @Test
    fun functionWithNamedArgs() {
        assertThat( defaultArgs(a = 10, b = 20, c = 42) ).isEqualTo( 72 )
        assertThat( defaultArgs(c = 42, b = 20, a = 10) ).isEqualTo( 72 )
        assertThat( defaultArgs(a = 10, c = 20) ).isEqualTo( 32 )
    }

    @Test
    fun callVararg() {
        assertThat( concatenate("hello", " ", "world") ).isEqualTo("hello world")
    }

    @Test fun callVarargsWithSpread() {
        assertThat( concatenate(strings =  *arrayOf("hello", "my", "beauty")) ).isEqualTo("hellomybeauty")
    }

    @Test fun functionInOneLine() {
        fun square(x: Int) = x*x
        assertThat( square(2) ).isEqualTo(4)
    }

    @Test fun infix() {

        infix fun Int.xyz(n: Int): Int {
            return this + n;
        }

        assertThat( 4 xyz 3 ).isEqualTo( 7 )

    }

    @Test fun recursive() {

        fun factorial(n: Int): Int {
            return if (n > 1)  n*factorial(n-1) else 1
        }

        assertThat( factorial(3) ).isEqualTo( 6 )

    }

}
