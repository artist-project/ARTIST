package eu.artist.migration.modernization.util;

import org.agoncal.application.petstore.domain.Address;
import org.agoncal.application.petstore.domain.Category;
import org.agoncal.application.petstore.domain.Customer;
import org.agoncal.application.petstore.domain.Item;
import org.agoncal.application.petstore.domain.Product;
import org.agoncal.application.petstore.service.CategoryService;
import org.agoncal.application.petstore.service.CustomerService;
import org.agoncal.application.petstore.service.ItemService;
import org.agoncal.application.petstore.service.ProductService;

public class DataStorePopulator {

    private CategoryService categoryService = new CategoryService();
    private CustomerService customerService = new CustomerService();
    private ProductService productService = new ProductService();
    private ItemService itemService = new ItemService();

    // ======================================
    // =          Lifecycle Methods         =
    // ======================================

    public void populateDS() {
        initCatalog();
        initCustomers();
    }

    private void initCatalog() {
        // Categories
        Category fish = new Category();
        fish.setName("Fish");
        fish.setDescription("Any of numerous cold-blooded aquatic vertebrates characteristically having fins, gills, and a streamlined body");
        Category dog = new Category();
        dog.setName("Dogs");
        dog.setDescription("A domesticated carnivorous mammal related to the foxes and wolves and raised in a wide variety of breeds");
        Category reptile = new Category();
        reptile.setName("Reptiles");
        reptile.setDescription("Any of various cold-blooded, usually egg-laying vertebrates, such as a snake, lizard, crocodile, turtle");
        Category cat = new Category();
        cat.setName("Cats");
        cat.setDescription("Small carnivorous mammal domesticated since early times as a catcher of rats and mice and as a pet and existing in several distinctive breeds and varieties");
        Category bird = new Category();
        bird.setName("Birds");
        bird.setDescription("Any of the class Aves of warm-blooded, egg-laying, feathered vertebrates with forelimbs modified to form wings");
        
        categoryService.createCategory(fish);
        categoryService.createCategory(dog);
        categoryService.createCategory(reptile);
        categoryService.createCategory(cat);
        categoryService.createCategory(bird);
        
        // Products
        Product angelfish = new Product();
        angelfish.setName("Angelfish");
        angelfish.setDescription("Saltwater fish from Australia");
        angelfish.setCategory(fish);
        Product tigerShark = new Product();
        tigerShark.setName("Tiger Shark");
        tigerShark.setDescription("Saltwater fish from Australia");
        tigerShark.setCategory(fish);
        Product koi = new Product();
        koi.setName("Koi");
        koi.setDescription("Freshwater fish from Japan");
        koi.setCategory(fish);
        Product goldfish = new Product();
        goldfish.setName("Goldfish");
        goldfish.setDescription("Freshwater fish from China");
        goldfish.setCategory(fish);
        
        productService.createProduct(angelfish);
        productService.createProduct(tigerShark);
        productService.createProduct(koi);
        productService.createProduct(goldfish);
        
        fish.addProducts(angelfish);
        fish.addProducts(tigerShark);
        fish.addProducts(koi);
        fish.addProducts(goldfish);
        
        categoryService.updateCategory(fish);

        Product bulldog = new Product();
        bulldog.setName("Bulldog");
        bulldog.setDescription("Friendly dog from England");
        bulldog.setCategory(dog);
        Product poodle = new Product();
        poodle.setName("Poodle");
        poodle.setDescription("Cute dog from France");
        poodle.setCategory(dog);
        Product dalmation = new Product();
        dalmation.setName("Dalmation");
        dalmation.setDescription("Great dog for a fire station");
        dalmation.setCategory(dog);
        Product goldenRetriever = new Product();
        goldenRetriever.setName("Golden Retriever");
        goldenRetriever.setDescription("Great family dog");
        goldenRetriever.setCategory(dog);
        Product labradorRetriever = new Product();
        labradorRetriever.setName("Labrador Retriever");
        labradorRetriever.setDescription("Great hunting dog");
        labradorRetriever.setCategory(dog);
        Product chihuahua = new Product();
        chihuahua.setName("Chihuahua");
        chihuahua.setDescription("Great companion dog");
        chihuahua.setCategory(dog);
        
        productService.createProduct(bulldog);
        productService.createProduct(poodle);
        productService.createProduct(dalmation);
        productService.createProduct(goldenRetriever);
        productService.createProduct(labradorRetriever);
        productService.createProduct(chihuahua);
        
        dog.addProducts(bulldog);
        dog.addProducts(poodle);
        dog.addProducts(dalmation);
        dog.addProducts(goldenRetriever);
        dog.addProducts(labradorRetriever);
        dog.addProducts(chihuahua);
        
        categoryService.updateCategory(dog);

        Product rattlesnake = new Product();
        rattlesnake.setName("Rattlesnake");
        rattlesnake.setDescription("Doubles as a watch dog");
        rattlesnake.setCategory(reptile);
        Product iguana = new Product();
        iguana.setName("Iguana");
        iguana.setDescription("Friendly green friend");
        iguana.setCategory(reptile);
        
        productService.createProduct(rattlesnake);
        productService.createProduct(iguana);
        
        reptile.addProducts(rattlesnake);
        reptile.addProducts(iguana);
        
        categoryService.updateCategory(reptile);

        Product manx = new Product();
        manx.setName("Manx");
        manx.setDescription("Great for reducing mouse populations");
        manx.setCategory(cat);
        Product persian = new Product();
        persian.setName("Persian");
        persian.setDescription("Friendly house cat, doubles as a princess");
        persian.setCategory(cat);
        
        productService.createProduct(manx);
        productService.createProduct(persian);       
        
        cat.addProducts(manx);
        cat.addProducts(persian);   
        
        categoryService.updateCategory(cat);

        Product amazonParrot = new Product();
        amazonParrot.setName("Amazon Parrot");
        amazonParrot.setDescription("Great companion for up to 75 years");
        amazonParrot.setCategory(bird);
        Product finch = new Product();
        finch.setName("Finch");
        finch.setDescription("Great stress reliever");
        finch.setCategory(bird);
        
        productService.createProduct(amazonParrot);
        productService.createProduct(finch);
        
        bird.addProducts(amazonParrot);
        bird.addProducts(finch);
        
        categoryService.updateCategory(bird);

        // Items
        Item largeAngelfish = new Item(); 
        largeAngelfish.setName("Large");
        largeAngelfish.setUnitCost(10.00f);
        // largeAngelfish.setImagePath("fish1.jpg");
        largeAngelfish.setProduct(labradorRetriever);
        largeAngelfish.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item thootlessAngelfish = new Item(); 
        thootlessAngelfish.setName("Thootless");
        thootlessAngelfish.setUnitCost(10.00f);
        // thootlessAngelfish.setImagePath("fish1.jpg");
        thootlessAngelfish.setProduct(labradorRetriever);
        thootlessAngelfish.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(largeAngelfish);
        itemService.createItem(thootlessAngelfish);
        
        angelfish.addItems(largeAngelfish);
        angelfish.addItems(thootlessAngelfish);
        
        productService.updateProduct(angelfish);
        
        Item spottedTigerShark = new Item(); 
        spottedTigerShark.setName("Spotted");
        spottedTigerShark.setUnitCost(10.00f);
        // spottedTigerShark.setImagePath("fish4.jpg");
        spottedTigerShark.setProduct(labradorRetriever);
        spottedTigerShark.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item spotlessTigerShark = new Item(); 
        spotlessTigerShark.setName("Spotless");
        spotlessTigerShark.setUnitCost(10.00f);
        // spotlessTigerShark.setImagePath("fish4.jpg");
        spotlessTigerShark.setProduct(labradorRetriever);
        spotlessTigerShark.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(spottedTigerShark);
        itemService.createItem(spotlessTigerShark);
        
        tigerShark.addItems(spottedTigerShark);
        tigerShark.addItems(spotlessTigerShark);
        
        productService.updateProduct(tigerShark);
        
        Item maleKoi = new Item(); 
        maleKoi.setName("Male Adult");
        maleKoi.setUnitCost(12.00f);
        // tailessLabradorRetriever.setImagePath("fish3.jpg");
        maleKoi.setProduct(labradorRetriever);
        maleKoi.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item femaleKoi = new Item(); 
        femaleKoi.setName("Female Adult");
        femaleKoi.setUnitCost(12.00f);
        // femaleKoi.setImagePath("fish3.jpg");
        femaleKoi.setProduct(labradorRetriever);
        femaleKoi.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(maleKoi);
        itemService.createItem(femaleKoi);
        
        koi.addItems(maleKoi);
        koi.addItems(femaleKoi);
        
        productService.updateProduct(koi);
        
        Item maleGoldfish = new Item(); 
        maleGoldfish.setName("Male Puppy");
        maleGoldfish.setUnitCost(12.00f);
        // maleGoldfish.setImagePath("fish2.jpg");
        maleGoldfish.setProduct(labradorRetriever);
        maleGoldfish.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item femaleGoldfish = new Item(); 
        femaleGoldfish.setName("Female Puppy");
        femaleGoldfish.setUnitCost(21.00f);
        // femaleGoldfish.setImagePath("dog5.jpg");
        femaleGoldfish.setProduct(labradorRetriever);
        femaleGoldfish.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(maleGoldfish);
        itemService.createItem(femaleGoldfish);
        
        goldfish.addItems(maleGoldfish);
        goldfish.addItems(femaleGoldfish);
        
        productService.updateProduct(goldfish);

        Item maleBulldog = new Item(); 
        maleBulldog.setName("Spotless Male Puppy");
        maleBulldog.setUnitCost(22.00f);
        // maleBulldog.setImagePath("dog1.jpg");
        maleBulldog.setProduct(labradorRetriever);
        maleBulldog.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item femaleBulldog = new Item(); 
        femaleBulldog.setName("Spotless Female Puppy");
        femaleBulldog.setUnitCost(22.00f);
        // femaleBulldog.setImagePath("dog1.jpg");
        femaleBulldog.setProduct(labradorRetriever);
        femaleBulldog.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(maleBulldog);
        itemService.createItem(femaleBulldog);
        
        bulldog.addItems(maleBulldog);
        bulldog.addItems(femaleBulldog);
        
        productService.updateProduct(bulldog);
        
        Item malePoodle = new Item();
        malePoodle.setName("Spotted Male Puppy");
        malePoodle.setUnitCost(32.00f);
        // malePoodle.setImagePath("dog2.jpg");
        malePoodle.setProduct(poodle);
        malePoodle.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item femalePoodle = new Item();
        femalePoodle.setName("Spotted Female Puppy");
        femalePoodle.setUnitCost(23.00f);
        // femalePoodle.setImagePath("dog2.jpg");
        femalePoodle.setProduct(poodle);
        femalePoodle.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(malePoodle);
        itemService.createItem(femalePoodle);
        
        poodle.addItems(malePoodle);
        poodle.addItems(femalePoodle);
        
        productService.updateProduct(poodle);
        
        Item tailedDalmation = new Item(); 
        tailedDalmation.setName("Tailed");
        tailedDalmation.setUnitCost(62.00f);
        // tailedDalmation.setImagePath("dog3.jpg");
        tailedDalmation.setProduct(dalmation);
        tailedDalmation.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item tailessDalmation = new Item(); 
        tailessDalmation.setName("Tailless");
        tailessDalmation.setUnitCost(100.00f);
        // tailessDalmation.setImagePath("dog3.jpg");
        tailessDalmation.setProduct(dalmation);
        tailessDalmation.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(tailedDalmation);
        itemService.createItem(tailessDalmation);
        
        dalmation.addItems(tailedDalmation);
        dalmation.addItems(tailessDalmation);
        
        productService.updateProduct(dalmation);
        
        Item tailedGoldenRetriever = new Item(); 
        tailedGoldenRetriever.setName("Tailed");
        tailedGoldenRetriever.setUnitCost(82.00f);
        // tailedGoldenRetriever.setImagePath("dog4.jpg");
        tailedGoldenRetriever.setProduct(goldenRetriever);
        tailedGoldenRetriever.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        Item tailessGoldenRetriever = new Item(); 
        tailessGoldenRetriever.setName("Tailless");
        tailessGoldenRetriever.setUnitCost(82.00f);
        // tailessGoldenRetriever.setImagePath("dog4.jpg");
        tailessGoldenRetriever.setProduct(goldenRetriever);
        tailessGoldenRetriever.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        
        itemService.createItem(tailedGoldenRetriever);
        itemService.createItem(tailessGoldenRetriever);
        
        goldenRetriever.addItems(tailedGoldenRetriever);
        goldenRetriever.addItems(tailessGoldenRetriever);
        
        productService.updateProduct(goldenRetriever);
        
        Item tailedLabradorRetriever = new Item();
        tailedLabradorRetriever.setName("Tailed");
        tailedLabradorRetriever.setUnitCost(100.00f);
        // tailedLabradorRetriever.setImagePath("dog5.jpg");
        tailedLabradorRetriever.setProduct(labradorRetriever);
        tailedLabradorRetriever.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        Item tailessLabradorRetriever = new Item();
        tailessLabradorRetriever.setName("Tailless");
        tailessLabradorRetriever.setUnitCost(100.00f);
        // tailessLabradorRetriever.setImagePath("dog5.jpg");
        tailessLabradorRetriever.setProduct(labradorRetriever);
        tailessLabradorRetriever.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        
        itemService.createItem(tailedLabradorRetriever);
        itemService.createItem(tailessLabradorRetriever);
        
        labradorRetriever.addItems(tailedLabradorRetriever);
        labradorRetriever.addItems(tailessLabradorRetriever);
        
        productService.updateProduct(labradorRetriever);
        
        Item maleChihuahua = new Item();
        maleChihuahua.setName("Male Adult");
        maleChihuahua.setUnitCost(100.00f);
        // maleChihuahua.setImagePath("dog6.jpg");
        maleChihuahua.setProduct(chihuahua);
        maleChihuahua.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");

        Item femaleChihuahua = new Item();
        femaleChihuahua.setName("Female Adult");
        femaleChihuahua.setUnitCost(100.00f);
        // femaleChihuahua.setImagePath("dog6.jpg");
        femaleChihuahua.setProduct(chihuahua);
        femaleChihuahua.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere porta risus, a bibendum enim pellentesque sit amet. Mauris imperdiet suscipit lectus, sed molestie orci posuere a. Fusce eleifend interdum nisi, nec vulputate velit rutrum ut. Nulla turpis ligula, fermentum ac tincidunt at, porttitor sit amet sem. Curabitur eget eros.");
        
        itemService.createItem(maleChihuahua);
        itemService.createItem(femaleChihuahua);
        
        chihuahua.addItems(maleChihuahua);
        chihuahua.addItems(femaleChihuahua);
        
        productService.updateProduct(chihuahua);
//
//        Item femaleRattlesnake = new Item("Female Adult", 20.00f, "reptile1.jpg", rattlesnake, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent lobortis ante et nunc scelerisque aliquet. Phasellus sed auctor purus. Cras tempus lacus eget felis viverra scelerisque. Sed ac tellus vitae nisl vehicula feugiat ac vitae dolor. Duis interdum lorem quis risus ullamcorper id cursus magna pharetra. Sed et nisi odio.");
//        Item maleRattlesnake = new Item("Male Adult", 20.00f, "reptile1.jpg", rattlesnake, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris pharetra tempus vulputate. Proin at nibh at felis feugiat fringilla. Fusce suscipit malesuada urna posuere suscipit. Integer non quam orci, vel adipiscing odio. Aenean at turpis nisi, a ullamcorper massa. Integer consectetur libero a lorem blandit pretium. Curabitur a sodales justo.");
//        rattlesnake.addItem(femaleRattlesnake);
//        rattlesnake.addItem(maleRattlesnake);
//        Item femaleIguana = new Item("Female Adult", 150.00f, "lizard1.jpg", iguana, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin dictum, nisi vitae fringilla ultrices, est ipsum faucibus ipsum, sit amet dapibus erat ipsum et arcu. Sed euismod, mauris suscipit placerat semper, tortor magna cursus nulla, id elementum dui dolor sit amet nunc. Pellentesque a interdum lectus. Mauris in augue eu.");
//        Item maleIguana = new Item("Male Adult", 160.00f, "lizard1.jpg", iguana, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus at dapibus arcu. Nunc at dui sem, in fringilla velit. Suspendisse mauris felis, molestie scelerisque viverra sit amet, dapibus eu diam. Curabitur egestas lectus et ligula pharetra in sollicitudin neque tristique. Nunc suscipit scelerisque nunc, vitae consectetur justo sodales ullamcorper. Nulla.");
//        iguana.addItem(femaleIguana);
//        iguana.addItem(maleIguana);
//
//        Item maleManx = new Item("Male Adult", 120.00f, "cat1.jpg", manx, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed convallis scelerisque urna. Sed id nunc quis nisl scelerisque scelerisque sit amet id lorem. Sed rutrum arcu sed sem semper id eleifend nulla feugiat. Praesent faucibus dignissim lectus tincidunt lacinia. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per.");
//        Item femaleManx = new Item("Female Adult", 120.00f, "cat1.jpg", manx, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus viverra nunc vitae libero ultricies lobortis. Duis magna nunc, tincidunt sit amet sagittis et, lobortis volutpat risus. Sed gravida turpis sit amet arcu tincidunt convallis. Nunc vulputate commodo mi non blandit. Etiam eu libero id libero aliquet pretium. Lorem ipsum dolor.");
//        manx.addItem(maleManx);
//        manx.addItem(femaleManx);
//        Item malePersian = new Item("Male Adult", 70.00f, "cat2.jpg", persian, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut sed est in tortor pharetra fermentum. Pellentesque nulla augue, venenatis ut viverra vel, dignissim sit amet ante. Aliquam erat volutpat. Aenean lectus odio, blandit aliquam sollicitudin a, pulvinar a felis. Phasellus vitae libero et lacus volutpat tristique. Aliquam tortor lacus, pulvinar.");
//        Item femalePersian = new Item("Female Adult", 90.00f, "cat2.jpg", persian, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam fringilla iaculis nunc et hendrerit. Curabitur malesuada felis non velit ultrices lacinia. Vivamus hendrerit tortor et tortor faucibus vehicula. Pellentesque pellentesque, quam at viverra tristique, lacus nibh euismod erat, vel vestibulum purus turpis eget nisi. Donec suscipit ligula tortor, a suscipit.");
//        persian.addItem(malePersian);
//        persian.addItem(femalePersian);
//
//        Item maleAmazonParrot = new Item("Male Adult", 120.00f, "bird2.jpg", amazonParrot, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In justo ligula, volutpat ut adipiscing sed, lobortis vel lacus. Etiam commodo aliquet libero, sit amet pretium risus scelerisque luctus. Suspendisse sit amet nulla nibh, in mollis risus. Curabitur convallis mattis felis, non malesuada justo pretium sed. Nam vestibulum, urna in consequat.");
//        Item femaleAmazonParrot = new Item("Female Adult", 120.00f, "bird2.jpg", amazonParrot, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse vitae turpis ut erat hendrerit sollicitudin. Curabitur auctor neque a enim scelerisque mattis. Mauris in mi nibh, et placerat lorem. Nunc semper, quam vitae semper condimentum, odio arcu sagittis ligula, eu posuere arcu nibh a quam. Aliquam porta dictum eros auctor.");
//        amazonParrot.addItem(maleAmazonParrot);
//        amazonParrot.addItem(femaleAmazonParrot);
//        Item maleFinch = new Item("Male Adult", 75.00f, "bird1.jpg", finch, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum quis lectus sit amet augue mattis malesuada. Maecenas justo justo, auctor sed consectetur et, pulvinar et diam. Nam felis mi, auctor ornare accumsan sed, pharetra nec arcu. Aliquam tincidunt nisi feugiat dui commodo dapibus. Nullam eget augue odio. Duis mauris nibh.");
//        Item femaleFinch = new Item("Female Adult", 80.00f, "bird1.jpg", finch, "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus dignissim vehicula tellus. Vestibulum id diam eros. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam sit amet sem at ligula pretium fermentum. Suspendisse potenti. Phasellus rhoncus consequat augue, ac feugiat felis gravida nec. Aliquam at.");
//        finch.addItem(maleFinch);
//        finch.addItem(femaleFinch);
    }

    private void initCustomers() {
        Customer marc = new Customer();
        marc.setFirstname("Marc");
        marc.setLastname("Fleury");
        marc.setPassword("marc");
        marc.setLogin("marc");
        Address marcAddress = new Address();
        marcAddress.setCity("Los Angeles");
        marcAddress.setCountry("USA");
        marcAddress.setStreet1("65 Ritherdon Road");
        marcAddress.setZipcode("56421");
        marc.setHomeAddress(marcAddress);
        
        customerService.createCustomer(marc);
        
//        Customer bill = new Customer("Bill", "Gates", "bill", "bill", "bill.gates@microsoft.com", new Address("27 West Side", "Alhabama", "8401", "USA"));
//        Customer steve = new Customer("Steve", "Jobs", "jobs", "jobs", "steve.jobs@apple.com", new Address("154 Star Boulevard", "San Francisco", "5455", "USA"));
//        Customer user = new Customer("User", "User", "user", "user", "user@petstore.org", new Address("Petstore", "Land", "666", "Nowhere"));
//        Customer admin = new Customer("Admin", "Admin", "admin", "admin", "admin@petstore.org", new Address("Petstore", "Land", "666", "Nowhere"));
//        
//        customerService.createCustomer(bill);
//        customerService.createCustomer(steve);
//        customerService.createCustomer(user);
//        customerService.createCustomer(admin);
    }

}
