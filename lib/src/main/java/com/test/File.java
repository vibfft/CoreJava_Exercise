package com.test;

/**
 * Demonstrates polymorphism
 */
class File {

    protected String fullName;

    public File(String fullName) {
        this.fullName = fullName;
    }

    public void printFileInfo() {
        String info = this.getFileInfo(); // here is polymorphic behavior!!!
        System.out.println(info);
    }


    protected String getFileInfo() {
        return "File: " + fullName;
    }
}

class ImageFile extends File {

    //protected String fullName;
    protected int width;
    protected int height;
    protected byte[] content;

    ImageFile(String fullName, int width, int height) {
        super(fullName);

        this.width = width;
        this.height = height;
    }

    // getters and setters

    @Override
    protected String getFileInfo() {
        return String.format("Image: %s, width: %d, height: %d", fullName, width, height);
    }
}

class ImageFileTest {
    public static void main(String[] args) {

        File testFile = new File("superClass");
        testFile.printFileInfo();
        File img = new ImageFile("/path/to/file/img.png", 480, 640); // assigning an object
        img.printFileInfo();

    }
}
