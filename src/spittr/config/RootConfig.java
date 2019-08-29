package spittr.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spittr.Spitter;
import spittr.Spittle;
import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;

@Configuration
@ComponentScan(basePackages={"spitter"},excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})
public class RootConfig {
	@Bean
	public SpittleRepository spittleRepository(){
		return new SpittleRepository() {
			@Override
			public List<Spittle> findSpittles(long max, int count) {
				List<Spittle> list = new ArrayList<Spittle>();
				for(int i =0;i<20;i++){
					list.add(new Spittle(i+"", new Date()));
				}
				return list;
			}
		};
		
	}
	@Bean
	public SpitterRepository spitterRepository(){
		return new SpitterRepository() {
			
			@Override
			public void save(Spitter spitter) {
				System.out.println("###############");
				
			}
		};
	}
	
	
	    
	
	
}
