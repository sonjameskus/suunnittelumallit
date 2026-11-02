package assignments.visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    private double totalSize;
    public double getTotalSize() {
        return totalSize;
    }

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {

    }
}
