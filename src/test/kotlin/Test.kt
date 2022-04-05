import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.condition.*

/**
 * @author Jesus Lopez
 * @ 1 DAM TARDE
 * @ Ejercicio test condicionales
 */


internal class TestCondicionales{


    @DisplayName("Establece si el SO es linux o apple")
    @Test
    @EnabledOnOs(OS.LINUX, OS.MAC)
    internal fun SistemaOperativo(){
        println("estamos en windows")
    }

    @DisplayName("Establece si la version de JAVA es la versión 8")
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    internal fun VersionJAVA() {
        println("java version 8")
    }

    @DisplayName("Establece un rango de versiones de JAVA")
    @Test
    @EnabledForJreRange(min=JRE.JAVA_8, max=JRE.JAVA_15)
    internal fun RangoDeJAVA() {
        println("estamos entre la version 8 y 15")
    }

    @DisplayName ("Permite habilitar / deshabilitar un test en base a las properties JVM del sistema")
    @Test
    @EnabledIfSystemProperty(named="Driver", matches = "C")
    internal fun PropiedadesSistema() {
        println("pasa por aqui")
    }

    @DisplayName("Permite habilitar / deshabilitar un test en base a las variables de entorno del S.O.")
    @Test
    @EnabledIfEnvironmentVariable (named="run.import.tests", matches="true")
    internal fun VariiedadesEntorno() {
        println("pasa por aqui")
    }
}