package argha.filefinder;

public class ScriptModel {

    public static String VIDEO_SCRIPT = "+(mkv|mp4|avi|mov|mpg|wmv) -inurl:(jsp|pl|php|html|aspx|htm|cf|shtml) intitle:index.of -inurl:(listen77|mp3raid|mp3toss|mp3drug|index_of|wallywashis)";
    public static String AUDIO_SCRIPT = "+(mp3|wav|ac3|ogg|flac|wma|m4a) -inurl:(jsp|pl|php|html|aspx|htm|cf|shtml) intitle:index.of -inurl:(listen77|mp3raid|mp3toss|mp3drug|index_of|wallywashis)";
    public static String IMAGE_SCRIPT = "+(jpg|png|bmp|gif|tif|tiff|psd) -inurl:(jsp|pl|php|html|aspx|htm|cf|shtml) intitle:index.of -inurl:(listen77|mp3raid|mp3toss|mp3drug|index_of|wallywashis)";
    public static String APPLICATION_SCRIPT = "+(exe|iso|tar|rar|zip|apk) -inurl:(jsp|pl|php|html|aspx|htm|cf|shtml) intitle:index.of -inurl:(listen77|mp3raid|mp3toss|mp3drug|index_of|wallywashis)";
    public static String DOCUMENT_SCRIPT = "+(MOBI|CBZ|CBR|CBC|CHM|EPUB|FB2|LIT|LRF|ODT|PDF|PRC|PDB|PML|RB|RTF|TCR|DOC|DOCX) -inurl:(jsp|pl|php|html|aspx|htm|cf|shtml) intitle:index.of -inurl:(listen77|mp3raid|mp3toss|mp3drug|index_of|wallywashis)";

    private String title;
    private String script;

    public ScriptModel(String title, String script) {
        this.title = title;
        this.script = script;
    }

    public String getTitle() {
        return title;
    }

    public String getScript() {
        return script;
    }
}
