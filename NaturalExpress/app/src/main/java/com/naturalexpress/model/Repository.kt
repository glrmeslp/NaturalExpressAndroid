package com.naturalexpress.model

object Repository {
    var order = Order()
    var orders: ArrayList<Order> = arrayListOf()
    var address = ""
    var categories: ArrayList<Category> = arrayListOf(
            Category(1,"Legumes",arrayListOf(
                    Product(1,"https://i.imgur.com/njB0vYz.jpg","Batata",7.99),
                    Product(2,"https://i.imgur.com/gS90u2z.png","Beterraba",5.76),
                    Product(3,"https://i.imgur.com/tq8NWUz.jpg","Cebola",4.00),
                    Product(4,"https://i.imgur.com/jNVcYBe.png","Cenoura",8.32),
                    Product(5,"https://i.imgur.com/BYWbyz3.jpg","Tomate",7.00),
                    Product(6,"https://i.imgur.com/pFt4Oad.jpg","Pepino",5.76),
                    Product(7,"https://i.imgur.com/HWZ1nhB.jpg","Pimenta",30.00),

                    )),
            Category(2,"Verduras", arrayListOf(
                    Product(8,"https://i.imgur.com/k0tiy3j.jpg","Alface",3.52),
                    Product(9,"https://i.imgur.com/xQHre5S.png","Brocolis",6.40),
                    Product(10,"https://i.imgur.com/dE4BJ0l.png","Couve-flor",5.00),
                    Product(11,"https://i.imgur.com/hlK7eZH.jpg","Coentro",16.70),
                    Product(12,"https://i.imgur.com/gaJWi7a.png","Repolho",3.76),
                    Product(13,"https://i.imgur.com/GPldvpQ.jpg","Hibisco",28.16),
                    Product(14,"https://i.imgur.com/lipHyzK.jpg","Salsa",5.88),
            )),
            Category(3,"Frutas",arrayListOf(
                    Product(15,"https://i.imgur.com/HRpz2EW.jpg","Abacate",3.52),
                    Product(16,"https://i.imgur.com/evJ2hxd.jpg","Melancia",3.00),
                    Product(17,"https://i.imgur.com/gS8MuKr.png","Morango",9.52),
                    Product(18,"https://i.imgur.com/akGXwds.jpg","Uva verde",18.79),
                    Product(19,"https://i.imgur.com/x6uu1VW.png","Uva roxa",5.00),
                    Product(20,"https://i.imgur.com/I8CavOQ.png","Mirtilo",51.00),
                    Product(21,"https://i.imgur.com/VmWyyIL.jpg","Maracuja",5.10),
                    )),
    )
    var banners: ArrayList<Banner> = arrayListOf(
            Banner(1,"https://i.imgur.com/5zCaQkL.jpg"),
            Banner(2,"https://i.imgur.com/ykFyhUC.jpg"),
            Banner(3,"https://i.imgur.com/p91JZD8.jpg"),
    )
}