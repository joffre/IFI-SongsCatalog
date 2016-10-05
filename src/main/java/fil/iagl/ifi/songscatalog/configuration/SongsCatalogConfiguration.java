package fil.iagl.ifi.songscatalog.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "fil.iagl.ifi.songscatalog")
public class SongsCatalogConfiguration {}