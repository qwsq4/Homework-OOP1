package Cooking;

import java.util.HashSet;
import java.util.Set;

public class Recipe{

    public static class RecipeBook {
        private static Set<Recipe> recipeBook = new HashSet<>();

        public RecipeBook(Recipe... recipes) {
            try {
                addRecipe(recipes);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }

        public static void addRecipe(Recipe... recipes) {
            for (Recipe recipe : recipes) {
                if (checkSameName(recipe.getName())) {
                    throw new RuntimeException("Данный рецепт уже есть в книге");
                } else recipeBook.add(recipe);
            }
        }

        public static boolean checkSameName(String name) {
            for (Recipe recipe : recipeBook) {
                if (recipe.getName().equals(name)) {
                    return true;
                }
            }
            return false;
        }

        public void represent() {
            System.out.println("Книга рецептов. Содержание: ");
            for (Recipe recipe : recipeBook) {
                System.out.println(recipe.getName());
            }
        }
    }
    private String name;
    private ProductList productList;
    private double summaryCost;

    public Recipe(String name, ProductList productList) {
        this.name = checkNulity(name, "Не указано");

        this.productList = productList;

        this.summaryCost = productList.calculateSummaryCost();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public double getSummaryCost() {
        return summaryCost;
    }

    public void represent() {
        System.out.println("Рецепт " + getName());
        System.out.println("Стоимость продуктов - " + getSummaryCost() + " руб");
        productList.represent();
    }

    @Override
    public String toString() {
        return name + " - " + productList.toString() + ", суммарная стоимость продуктов - " + summaryCost;
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
