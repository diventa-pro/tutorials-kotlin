import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import pro.diventa.tutorials.kotlin.Cat
import pro.diventa.tutorials.kotlin.Dog

import org.assertj.core.api.Assertions.*


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PropertiesAndFieldsTest {

    @Test
    fun basicPropertiesSupport() {

        class Address {
            val name: String = "John"
            val street: String = "via Roma, 14"
            var city: String = "Milan"
        }

        val address = Address()

        assertThat( address.name ).isEqualTo( "John" )

        // this cannot be done because the property is declared as immutable (val)
        //address.name = "Gigi"

        address.city = "Milan"


    }

    @Test
    fun customGetterAndSetterForProperty() {

        class Worker {
            var name: String = "no-name"
            get() {
                invocationCOunter = invocationCOunter + 1
                return field
            }
            set(value) {
                this.invocationCOunter = 0
                field = value
            }

            var invocationCOunter = 0

        }


        val worker = Worker()
        worker.name
        worker.name
        worker.name
        assertThat(worker.invocationCOunter).isEqualTo(3)

    }

    @Test
    fun propertiesAreNotDefinedByJavaLikeGettersAndSetters() {

        class Box {
            fun getCode(): String {
                return "ABC"
            }
            fun setCode(newValue: String) {

            }
        }

        val box = Box()

        // that does not work! Kotlin properties are not JavaBeans properties
        // box.code

    }

}
