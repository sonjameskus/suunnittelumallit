package assignments.visitor;

public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory documents = new Directory("documents");
        Directory pictures = new Directory("pictures");

        File file1 = new File("document.txt", 2);
        File file2 = new File("notes.txt", 1);
        File file3 = new File("photo.jpg", 5);

        documents.addElement(file1);
        documents.addElement(file2);
        pictures.addElement(file3);

        root.addElement(documents);
        root.addElement(pictures);

        SizeCalculatorVisitor sizeVisitor =
                new SizeCalculatorVisitor();

        root.accept(sizeVisitor);

        System.out.println("Total file size: "
                + sizeVisitor.getTotalSize() + " MB");

        SearchVisitor searchVisitor =
                new SearchVisitor(".txt");

        root.accept(searchVisitor);

        System.out.println("\nFound .txt files:");

        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(file.getName()
                    + " - " + file.getSize() + " MB");
        }
    }
}