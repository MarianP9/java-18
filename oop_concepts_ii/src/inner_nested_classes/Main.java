package inner_nested_classes;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setPrice(1000);

        CPU.Processor processor = cpu.new Processor();
    }
}
