package ru.netology.productManager;

public class Repository {

    private Product[] items = new Product[0];

    public void save(Product product) {
        Product[] tmp = new Product[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = product;
        items = tmp;
    }

    public Product[] findAll() {
        return items;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : items) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        items = tmp;
    }
}
