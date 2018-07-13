import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import pro.diventa.tutorials.kotlin.Cat
import pro.diventa.tutorials.kotlin.Dog

import org.assertj.core.api.Assertions.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AnimalsTest {

    @Test
    fun dogSpeak() {
        val dog = Dog("Angus")
        assertThat(dog.describe()).isEqualTo( "a dog called Angus talks like that: bark" );
    }

    @Test
    fun catSpeak() {
        val cat = Cat("Sylvester")
        assertThat(cat.describe()).isEqualTo( "a cat called Sylvester talks like that: meoow" );
    }
}
