import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//import java.beans.Transient;

import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com", "some-thing.html");
        assertEquals(expected, links);
        
    }

    @Test
    public void test2() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file2.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://google.com", "some-thing.html");
        assertEquals(expected, links);
    }

    @Test
    public void test3() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file3.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test4() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file4.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test5() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file5.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test6() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file6.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test7() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file7.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();
        assertEquals(expected, links);
    }

    @Test
    public void test8() throws IOException{
        Path filePath = Path.of("/Users/Michelle/Documents/GitHub/markdown-parser-1/test-file8.md");
        String content = Files.readString(filePath);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("a link on the first line");
        assertEquals(expected, links);
    }

}