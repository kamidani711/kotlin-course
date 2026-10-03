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

    @Test
    fun gradeAt85IsA(){
        assertEquals("A", grade(85))
    }
    @Test
    fun gradeAt84IsB(){
        assertEquals("B", grade(84))
    }
    @Test
    fun gradeAt70IsC(){
        assertEquals("C", grade(70))
    }
    @Test
    fun gradeAt55IsD(){
        assertEquals("D", grade(55))
    }
    @Test
    fun gradeAt54IsF(){
        assertEquals("F", grade(54))
    }
    @Test
    fun gradeAt0IsF(){
        assertEquals("F", grade(0))
    }

    @Test
    fun gradeUnitTest(){
        for (grade in 1..100){
            if (grade <= 54){
                assertEquals("F",grade(grade))
            }else if (grade <= 64){
                assertEquals("D", grade(grade))
            }else if(grade <= 74){
                assertEquals("C", grade(grade))
            }else if(grade <= 84){
                assertEquals("B", grade(grade))
            }else {
                assertEquals("A", grade(grade))
            }
        }

    }
}
