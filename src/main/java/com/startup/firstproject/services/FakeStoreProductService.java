package com.startup.firstproject.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.startup.firstproject.dtos.FakeStoreProductDto;
import com.startup.firstproject.model.Category;
import com.startup.firstproject.model.Product;

		/*this class is implementing a interface of ProductService hence this class object 
		 * will be created because spring will look for any class with @service bean and 
		 * will create object of that*/
@Service
public class FakeStoreProductService implements ProductService {

	RestTemplate restTemplate;

	/*
	 * now when spring will make fakestore object it will automatically create
	 * object of restTemplate and whenever required it will give. 
	 */
	
	/*
	 * and do you know that why did we used fakestore controller? 
	 * we used FakeStoreProductService constuctor because rest template obj will be injected through this.
	 * this is process called depenedency injection
	 */
	public FakeStoreProductService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Product getSingleProducts(Long id) {
		/*
		 * now what this will do is it will call rest template and whatever response
		 * comes it will do 1-1 mapping of this with format/dto what we want as defined
		 * in dto class which is specified in after comma as 2nd parameter 
		 * the .class will tell in which dto format data has to be converted
		 */
		FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject("https://fakestoreapi.com/products/" + id,
				FakeStoreProductDto.class);
		
		//returning nowconverted product
		return convertFakeStoreProductToProduct(fakeStoreProductDto);

		//return new Product();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Product convertFakeStoreProductToProduct(FakeStoreProductDto fakeStoreProductDto) {
		//converting fakestore to product 
				Product product = new Product();
				product.setId(fakeStoreProductDto.getId());
				product.setTitle(fakeStoreProductDto.getTitle());
				product.setPrice(fakeStoreProductDto.getPrice());
				
				Category category = new Category();
				category.setDesc(fakeStoreProductDto.getCategory());
				product.setCategory(category);
		return product;
	}

}
