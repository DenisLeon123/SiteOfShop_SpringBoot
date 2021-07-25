package ru.danL.shop.surf.sqlquery;

public class sqlQuery {
    private String fillInProductType = "insert into `product_type` (`id`, `name`) VALUES \n" +
            "(1, 'New products'),\n" +
            "(2, 'Top products'),\n" +
            "(3, 'Sale products');";

    private String fillInProduct = "insert into `product` (`id`, `description`, `hot_product`, `image`, `name`, `new_product`, `old_price`, `price`, `product_type_id`) VALUES \n" +
            "(1, 'This products zbs', 1, '1.jpg', 'Sone', 1, 0, 1000, 1),\n" +
            "(2, 'Top products',1, '2.jpg', 'Ski', 0, 0, 6900, 2),\n" +
            "(3, 'Sale products ahuenna',0 , '3.jpg', 'Snowboard', 0, 9000, 5500, 3);";
}
