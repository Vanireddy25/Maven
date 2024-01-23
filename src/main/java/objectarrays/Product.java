package objectarrays;
public class Product {
        private double weight;
        private double price;
        private int id;

        public Product(double weight, double price, int id) {
            this.weight = weight;
            this.price = price;
            this.id = id;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }

        public int getId() {
            return id;
        }
        public int compareTo(Product otherProduct) {
            // Compare products based on their prices
            return Double.compare(this.price, otherProduct.price);
        }
        @Override
        public String toString() {
            return "Product{id=" + id + ", weight=" + weight + ", price=" + price + '}';
        }
        public static void main(String[] args) {
            // Create some sample products
            Product product1 = new Product(1.5, 25.59, 101);
            Product product2 = new Product(4.0, 19.99, 102);
            Product product3 = new Product(1.8, 32.49, 103);

            int result = product1.compareTo(product2);

            if (result < 0) {
                System.out.println(product1 + " is cheaper than " + product2);
            } else if (result > 0) {
                System.out.println(product1 + " is more expensive than " + product2);
            } else {
                System.out.println(product1 + " and " + product2 + " have the same price");
            }
        }
    }

