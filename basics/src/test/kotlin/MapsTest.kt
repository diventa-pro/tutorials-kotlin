import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import pro.diventa.tutorials.kotlin.Cat
import pro.diventa.tutorials.kotlin.Dog

import org.assertj.core.api.Assertions.*


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MapsTest {

    @Test
    fun gettingMissingKeyFromMapThrowsException() {

        var cityToPopulation = mapOf<String, Long>(
                Pair("Milan", 1_000_000),
                Pair("Londin", 12_000_000),
                Pair("Tokyo", 15_000_000)
        )

        assertThatThrownBy { cityToPopulation.getValue("Nairobi") }
                .hasSameClassAs( NoSuchElementException("") )

    }

    @Test
    fun mutableMap() {

        var cityToPopulation = mutableMapOf<String, Long>(
        Pair("Milan", 1_000_000),
        Pair("Londin", 12_000_000),
        Pair("Tokyo", 15_000_000)
        )

        cityToPopulation.put("Nairobi", 5_000_000)

    }


}
