/*package com.teste;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RuleTest {

    //Indicamos uma pasta temporária que será criada antes da execução do teste.
    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    //Dentro da pasta temporária, será criado um arquivo: "file.txt".
    @Test
    public void shouldCreateNewFileInTemporaryFolder() throws IOException {
        File created = tmpFolder.newFile("file.txt");

        assertTrue(created.isFile());   //Verifica se o arquivo foi criado
        assertEquals(tmpFolder.getRoot(), created.getParentFile());
        //verifica se o arquivo criado está mesmo dentro da pasta temporário
    }

}*/
