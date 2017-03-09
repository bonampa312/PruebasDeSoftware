import org.junit.Test;
import co.edu.udea.files.*;
import static co.edu.udea.files.ReadingFiles.readFileValues;
import java.io.IOException;
import java.util.ArrayList;
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
    
    @Test
    public void testReadFileValues() throws IOException{
        ArrayList datos = new ArrayList();
        datos = readFileValues(",");
        assertTrue(datos != null);
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
