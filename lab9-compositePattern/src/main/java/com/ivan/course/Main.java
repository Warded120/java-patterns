package com.ivan.course;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Folder folder1 = new Folder("Documents");
        folder1.add(file1);
        folder1.add(file2);

        Folder folder2 = new Folder("Downloads");
        folder2.add(file3);

        Folder rootFolder = new Folder("Root");
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        rootFolder.showDetails();    }
}