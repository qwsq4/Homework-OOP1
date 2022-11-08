package Cooking;

import java.util.HashSet;
import java.util.Set;

public class ProductList {

    public static class Product {
        private String name;
        private double cost;
        private double weight;

        public Product(String name, double cost, double weight) {
            this.name = checkNulity(name, "Не указано");
            this.cost = checkZero(cost, 0.0);
            this.weight = checkZero(weight, 0.0);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = checkNulity(name, "Не указано");
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = checkZero(cost, 0.0);
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = checkZero(weight, 0.0);
        }

        @Override
        public boolean equals(Object o) {
            if (hashCode() != o.hashCode()) {
                return false;
            } else return o == this;
        }

        @Override
        public int hashCode() {
            int hashWeight = (int) weight;
            int hashCost = (int) cost;
            return (name.length() * hashWeight * hashCost) * 31;
        }
    }

    private Set<Product> productList = new HashSet<>();

    public ProductList(Product... products) {
        try {
            addProducts(products);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addProducts(Product... products) {
        for (Product product : products) {
            if (product.getName().equals("Не указано") || product.getWeight() == 0.0 || product.getCost() == 0.0) {
                throw new RuntimeException("Заполните карточку товара полностью!");
            } else if (productList.contains(product)) {
                throw new RuntimeException("Данный товар уже есть в корзине");
            } else productList.add(product);
        }
    }

    public void checkProduct(Product product) {
        if (productList.contains(product)) {
            System.out.println("Данный товар уже куплен");
        } else System.out.println("Данный товар еще не куплен");
    }

    public void deleteProduct(Product product) {
        if (productList.contains(product)) {
            productList.remove(product);
        } else System.out.println("Данного продукта нет в списке");
    }

    public double calculateSummaryCost() {
        double summaryCost = 0D;
        for (Product product : productList) {
            summaryCost = summaryCost + product.getCost();
        }
        return summaryCost;
    }

    public void represent() {
        System.out.println("Список продуктов: ");
        for (Product product : productList) {
            System.out.println(product.getName());
        }
    }

    public static String checkNulity(String value, String replace) {

        if (value == null || value.equals("")) {
            value = replace;
        }
        return value;
    }

    public static double checkZero(double value, double replace) {
        if (value > 0.0) {
            return value;
        } else return replace;
    }
}
