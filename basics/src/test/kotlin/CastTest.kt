import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import pro.diventa.tutorials.kotlin.Cat
import pro.diventa.tutorials.kotlin.Dog

import org.assertj.core.api.Assertions.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CastTest {

    @Test
    fun `how to check type at runtime`() {

        val mixedTypeList: List<Any> = listOf("I", "am", 5, "feet", 9.5, "inches", "tall")

        // "I"
        assertThat( mixedTypeList[0] is String ).isTrue()
        assertThat( mixedTypeList[0] is Double ).isFalse()
        assertThat( mixedTypeList[0] is Any ).isTrue()

        // 5
        assertThat( mixedTypeList[2] is Double ).isFalse()
        assertThat( mixedTypeList[2] is Int ).isTrue()
        assertThat( mixedTypeList[2] is Any ).isTrue()

        // 9.4
        assertThat( mixedTypeList[4] is String ).isFalse()
        assertThat( mixedTypeList[4] is Double ).isTrue()
        assertThat( mixedTypeList[4] is Any ).isTrue()

    }

    @Test
    fun `how to leverage smartcast`() {

        val values: List<Any> = listOf("Hello World", 7.77, 42, 0XFF)

        val v1 = values[1]
        val v2 = values[2]
        val v3 = values[3]
        if( v1 is Double && v2 is Int && v3 is Int ){

            assertThat( v1 + v2 + v3 ).isEqualTo(304.77)

        }else{
            fail("Not meant to execute this.")
        }

    }

    @Test
    fun `explicit cast`() {
        val obj: Any = "123"
        val str: String = obj as String
        assertThat( str.length ).isEqualTo(3);
    }

}
