package inner_nested_classes;

public class CPU {
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public class Processor {
        private double cores;

        public double getCache() {
            return 4;
        }

        public double getCores() {
            if (CPU.this.price == 10)
                return 1;
            else
                return 2;
        }
    }
}
