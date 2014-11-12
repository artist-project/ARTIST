/**
 * 
 */
package eu.artist.migration.modernization.util;

import org.agoncal.application.petstore.domain.Category;
import org.agoncal.application.petstore.domain.Customer;
import org.agoncal.application.petstore.domain.Item;
import org.agoncal.application.petstore.domain.Order;
import org.agoncal.application.petstore.domain.OrderLine;
import org.agoncal.application.petstore.domain.Product;

import com.googlecode.objectify.ObjectifyService;

/**
 * @author
 *
 */
public class EntityRegistry {
	
	public static void registerEntities() {
		// Register the entities ...
		ObjectifyService.register(Category.class);
		ObjectifyService.register(Customer.class);
		ObjectifyService.register(Item.class);
		ObjectifyService.register(Order.class);
		ObjectifyService.register(OrderLine.class);
		ObjectifyService.register(Product.class);
	}
}
