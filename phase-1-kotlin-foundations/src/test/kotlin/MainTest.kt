import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun testVatCalculation() {
        val result = calculateVat(100.0)
        assertEquals(5.0, result, 0.001)
    }

    @Test
    fun testVatCalculationCustomRate() {
        val result = calculateVat(100.0, 0.10)
        assertEquals(10.0, result, 0.001)
    }
}
