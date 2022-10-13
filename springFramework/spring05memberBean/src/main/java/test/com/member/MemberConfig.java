package test.com.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberConfig {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(MemberConfig.class);

	
	@Bean
	public Pen pen() {
		logger.info("bean pen()....");
		Pen p = new Pen();
		p.setColor("red");
		p.setPrice(300);
		return p;
	}
	@Bean
	public Note note() {
		logger.info("bean note()....");
		Note n = new Note();
		n.setModel("monami");
		n.setSize(220);
		return n;
	}
	@Bean
	public Bag bag(Pen pen,Note note) {
		logger.info("bean bag()....");
		Bag b = new Bag();
		b.setPen(pen);
		b.setNote(note);
		return b;
	}

}
