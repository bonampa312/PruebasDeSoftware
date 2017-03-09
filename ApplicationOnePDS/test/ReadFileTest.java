import org.junit.Test;
import co.edu.udea.files.*;
import static org.junit.Assert.*;
/**
 *
 * @author santiago.romero
 */
public class ReadFileTest {
    
    ReadingFiles rf;
    
    public ReadFileTest() {
    }
    
    @Test
    public void testGetFilePath(){
        String filePath = ReadingFiles.getFilePath();
        assertTrue(filePath != null);
    }
    
//     Tests para readFileValues:
//          -> filePath vacío
//          -> archivo de formato raro
//          -> datos en el archivo que no sean floats
//          -> El arrayList que retorna está vacío
    
//    Tests para readFloatsFile:
//          -> retorna ArrayList null
//          -> retorna ArrayList vacía
//          -> No sé qué más
    
}
