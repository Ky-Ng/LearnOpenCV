import org.opencv.core.Core;


import static org.opencv.core.Core.NATIVE_LIBRARY_NAME;


public class TestImport {
    public static void main(String[] args) {
        System.loadLibrary(NATIVE_LIBRARY_NAME);
        System.out.println("After many struggles, I have finally loaded in OpenCV version: " + Core.VERSION);
    }}
