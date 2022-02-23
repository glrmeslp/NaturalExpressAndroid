package com.naturalexpress.model

object Repository {
    var order = Order()
    var orders: ArrayList<Order> = arrayListOf()
    var address = ""
    var categories: ArrayList<Category> = arrayListOf(
            Category(1,"Legumes",arrayListOf(
                    Product(1,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/01b2f427-aeb5-469a-9ef0-ecc928493934/batata.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014419Z&X-Amz-Expires=86400&X-Amz-Signature=693f2105a8da2018def2c8ea07267d4dcf219accd9d07b0f5ca0d0ed259cefd4&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22batata.jpg%22&x-id=GetObject","Batata",7.99),
                    Product(2,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/42e38c12-2a11-483a-abb6-801d65372011/beterraba.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013648Z&X-Amz-Expires=86400&X-Amz-Signature=dd25d65055d98bf8e7548c7e3100ad16a5d348b8381641c7cc2e75be3e92e6dc&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22beterraba.png%22&x-id=GetObject","Beterraba",5.76),
                    Product(3,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/89a7e989-e29f-4345-9dfa-0d8874e8c249/cebola.webp?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013628Z&X-Amz-Expires=86400&X-Amz-Signature=d4afaae46f4dafdd91b30ef710b25a13943419a8d53c924d26510e943637b7d8&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22cebola.webp%22&x-id=GetObject","Cebola",4.00),
                    Product(4,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6014960e-1a9a-408d-98e2-dba2f23c29ad/cenoura.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013834Z&X-Amz-Expires=86400&X-Amz-Signature=100b74afd845caf8320702244a4358242404dafed5c80eeeeaf5bc8d358ba97f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22cenoura.png%22&x-id=GetObject","Cenoura",8.32),
                    Product(5,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/666bc376-ab1f-45e3-9de8-4d66668684ed/tomate.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013903Z&X-Amz-Expires=86400&X-Amz-Signature=8283c509e7145a35cd1e0fae1be267c2726c98240f6cc576e3ca43601fa4db8e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22tomate.jpg%22&x-id=GetObject","Tomate",7.00),
                    Product(6,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/fa214b27-4f2b-42dc-a958-a63f085c1999/pepino.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013915Z&X-Amz-Expires=86400&X-Amz-Signature=46e067714b8e70e1bc31d981295e45b7713610d1f5db894384e1830c90cfd26e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22pepino.png%22&x-id=GetObject","Pepino",5.76),
                    Product(7,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d230f394-7de1-4bae-a980-9ea33c774b40/pimenta.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013924Z&X-Amz-Expires=86400&X-Amz-Signature=087414908d2ae37e04b4cadfd572a97177940d4485ce84d544c47741abcbd243&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22pimenta.jpg%22&x-id=GetObject","Pimenta",30.00),

                    )),
            Category(2,"Verduras", arrayListOf(
                    Product(8,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3e29ee0c-0767-4356-89d4-1c01de0009da/alface.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014358Z&X-Amz-Expires=86400&X-Amz-Signature=defd790ace248a17a705bc4580004ecc137cb6e5136e8963fbf822a6a290c56e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22alface.jpg%22&x-id=GetObject","Alface",3.52),
                    Product(9,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4392cb2e-a5e7-4cf4-83df-1e216e303540/brocolis.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013817Z&X-Amz-Expires=86400&X-Amz-Signature=fead06c5f4cedee732c2649cd3c8289f0a7c85890fae53943c337181dbdb0897&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22brocolis.png%22&x-id=GetObject","Brocolis",6.40),
                    Product(10,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/95ecf468-eadd-4a09-abec-a2d795d2a31d/couve-flor.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T013803Z&X-Amz-Expires=86400&X-Amz-Signature=d5f23fdf9d9c8c190b66d5b6ef210d8c290fc38587d8dd40fc174d8814b8535f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22couve-flor.png%22&x-id=GetObject","Couve-flor",5.00),
                    Product(11,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/743a4284-c4ae-4054-8646-aa5e55e586ba/coentro.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014411Z&X-Amz-Expires=86400&X-Amz-Signature=960f74396ba7c1ac69d0a9ceff164266641437914333a5af02cdba61a321ca44&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22coentro.jpg%22&x-id=GetObject","Coentro",16,70),
                    Product(12,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5b7bfafc-6987-4305-a523-799368876b4c/repolho.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T011946Z&X-Amz-Expires=86400&X-Amz-Signature=d34f3ec705822070080ff3ea098efb056d9ac8940346d2ce388ee04f6214fcd7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22repolho.png%22&x-id=GetObject","Repolho",3.76),
                    Product(13,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/5040ac66-f964-4e0d-8ebe-14cebac855da/hibisco.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014043Z&X-Amz-Expires=86400&X-Amz-Signature=ed35b66e589804c0dafa0d806af39040084fd6d49ef63d0cb48b5ee13f0fc7c9&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22hibisco.jpg%22&x-id=GetObject","Hibisco",28.16),
                    Product(14,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f615e448-c255-4702-a774-c48ba95d4e4d/salsa.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014032Z&X-Amz-Expires=86400&X-Amz-Signature=d73fe9a6c1c08290572fa98748642fe210558bff14dfe7fe39f479ba0ad35742&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22salsa.jpg%22&x-id=GetObject","Salsa",5.88),
            )),
            Category(3,"Frutas",arrayListOf(
                    Product(15,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4fa66f15-98f9-480f-9a40-435596c97c47/abacate.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014204Z&X-Amz-Expires=86400&X-Amz-Signature=48101d5f3f627715e7933a650789a273707e621886c71b93fb99118b4c7dee0a&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22abacate.jpg%22&x-id=GetObject","Abacate",3.52),
                    Product(16,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/30ff8d5a-576b-4511-92d6-d62ad7076406/melancia.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014155Z&X-Amz-Expires=86400&X-Amz-Signature=c87bf9b0e129cfa13f6b893b2b44d9382aea6f812063a1986851e81305b322da&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22melancia.jpg%22&x-id=GetObject","Melancia",3.00),
                    Product(17,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/e8b76e58-570f-4816-b9e0-8b499202e516/morango.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014142Z&X-Amz-Expires=86400&X-Amz-Signature=69c1dd9369688d90d1daab660c8408f35166569237a347a18a54e10eda6562e8&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22morango.png%22&x-id=GetObject","Morango",9.52),
                    Product(18,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/1cd7ee30-860d-4179-b176-ede06a77c606/uva-verde.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014103Z&X-Amz-Expires=86400&X-Amz-Signature=7342aa36795c2aaf59496a8b340a2f33f2d30da4faa3aec7aa0954b41843b1b4&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22uva-verde.jpg%22&x-id=GetObject","Uva verde",18.79),
                    Product(19,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/65e91c6b-d83a-4928-9d0e-dac6504b0fbf/uva-roxa.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014135Z&X-Amz-Expires=86400&X-Amz-Signature=8e388f2d1a6770517d40eb6bfeca3881b2a1c79646019104a6356c684acba7db&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22uva-roxa.png%22&x-id=GetObject","Uva roxa",5.00),
                    Product(20,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/3679b3da-72f9-4335-ae26-ab2bed974b3f/mirtilo.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014124Z&X-Amz-Expires=86400&X-Amz-Signature=127afd0f8997fc59841a37cf44f6c282bf56a600667357dcf6bd22675ac3480e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22mirtilo.png%22&x-id=GetObject","Mirtilo",51.00),
                    Product(21,"https://s3.us-west-2.amazonaws.com/secure.notion-static.com/54dc7053-28a8-4ea2-a1ad-92484203ae23/maracuja.jpg?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220223%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220223T014112Z&X-Amz-Expires=86400&X-Amz-Signature=f51e678cc61eeaac264df53df09cab1a9c090e679b5606bf42778b4fc1d86d48&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22maracuja.jpg%22&x-id=GetObject","Maracuja",5.10),
            )),
    )

}